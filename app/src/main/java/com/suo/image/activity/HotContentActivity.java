package com.suo.image.activity;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import net.tsz.afinal.FinalBitmap;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.BmobQuery.CachePolicy;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.UpdateListener;

import com.bumptech.glide.Glide;
import com.sina.weibo.sdk.api.share.BaseResponse;
import com.sina.weibo.sdk.api.share.IWeiboHandler;
import com.sina.weibo.sdk.api.share.IWeiboShareAPI;
import com.sina.weibo.sdk.constant.WBConstants;
import com.suo.demo.R;
import com.suo.image.ImageApp;
import com.suo.image.activity.login.LoginActivity;
import com.suo.image.activity.my.MyHomeActivity;
import com.suo.image.adapter.ArrayListAdapter;
import com.suo.image.adapter.ViewHolder;
import com.suo.image.bean.ContentBean;
import com.suo.image.bean.ImageBean;
import com.suo.image.bean.UserInfo;
import com.suo.image.img.SimpleImageLoader;
import com.suo.image.share.QQUtil;
import com.suo.image.share.QQZoneUtil;
import com.suo.image.share.WeiboUtil;
import com.suo.image.share.WeixinUtil;
import com.suo.image.util.Density;
import com.suo.image.util.ImageLoaderUtil;
import com.suo.image.util.ImageUtils;
import com.suo.image.util.Log;
import com.suo.image.util.Preference;
import com.suo.image.util.Pub;
import com.suo.image.view.MyGallery;
import com.suo.image.view.TipDialog;
import com.tencent.connect.common.Constants;
import com.tencent.connect.share.QQShare;
import com.tencent.mm.sdk.openapi.BaseReq;
import com.tencent.mm.sdk.openapi.BaseResp;
import com.tencent.mm.sdk.openapi.ConstantsAPI;
import com.tencent.mm.sdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.sdk.openapi.SendMessageToWX;
import com.tencent.mm.sdk.openapi.ShowMessageFromWX;
import com.tencent.mm.sdk.openapi.WXAppExtendObject;
import com.tencent.mm.sdk.openapi.WXImageObject;
import com.tencent.mm.sdk.openapi.WXMediaMessage;
import com.tencent.mm.sdk.openapi.WXWebpageObject;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.WallpaperManager;
import android.content.ClipboardManager;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PixelFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;

@SuppressLint("HandlerLeak")
public class HotContentActivity extends BaseActivity implements IWXAPIEventHandler, IWeiboHandler.Response {

    private MyGallery gallery;
    private TextView tv_page;
    private LinearLayout ll_zan;
    private TextView tv_zan;
    private ImageView iv_zan;
    private ImageView iv_head;

    private ContentAdapter adapter;
    private ContentBean bean;
    private ArrayList<ContentBean> list;

    private int position = 0;
    private RelativeLayout layoutHeader;
    private ImageButton back;
    private LinearLayout ll_menu;
    private LinearLayout menu_save;
    private TextView newsContent;
    private TextView top_title;
    private LinearLayout ll_view;
    private boolean click = true;
    private Dialog dialog;
    private ProgressDialog progressDialog;
    private boolean isShow = false;
    private String text;
    private ArrayList<ContentBean> contentList;

    private WeiboUtil weiboUtil;
    private QQZoneUtil qqZoneUtil;
    private QQUtil qqUtil;
    private WeixinUtil weixinUtil;

    private int[] zanList;
    private ContentBean cb;

    int c_color = 1;// 文字颜色
    private String type;
    private UserInfo user;
    private ArrayList<ContentBean> likeIds;
    
    private String saveUrl;
    private ProgressDialog mSaveDialog = null;
    private Bitmap saveBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_picture);
        prepareData();
        findViews();
        init();
        if (savedInstanceState != null) {
            weiboUtil.handleWeiboResponse(getIntent(), this);
        }
    }

    @SuppressWarnings("unchecked")
    private void prepareData() {
        user = ImageApp.getInstance().getUserinfo();
        if (user != null) {
            if (user.getLikeIds() != null && user.getLikeIds().size() > 0) {
                likeIds = user.getLikeIds();
            } else {
                likeIds = new ArrayList<ContentBean>();
            }

        }
        type = getIntent().getStringExtra("type");
        position = getIntent().getIntExtra("position", 0);
        bean = (ContentBean) getIntent().getSerializableExtra("contentBean");
        list = (ArrayList<ContentBean>) getIntent().getSerializableExtra("contentBeanList");
        contentList = new ArrayList<ContentBean>();
        adapter = new ContentAdapter(this);
        c_color = Preference.getInt("color");
    }

    private void findViews() {
        gallery = (MyGallery) findViewById(R.id.picGallery);
        layoutHeader = (RelativeLayout) findViewById(R.id.layoutHeader);
        back = (ImageButton) findViewById(R.id.back);
        ll_menu = (LinearLayout) findViewById(R.id.menu_more);
        newsContent = (TextView) findViewById(R.id.newsContent);
        ll_view = (LinearLayout) findViewById(R.id.ll_view);
        top_title = (TextView) findViewById(R.id.text);
        tv_page = (TextView) findViewById(R.id.tv_page);
        ll_zan = (LinearLayout) findViewById(R.id.ll_zan);
        tv_zan = (TextView) findViewById(R.id.tv_zan);
        iv_zan = (ImageView) findViewById(R.id.iv_zan);
        iv_head = (ImageView) findViewById(R.id.iv_head);
        menu_save = (LinearLayout) findViewById(R.id.menu_save);
    }

    private void init() {
        // 初始化微博
        weiboUtil = new WeiboUtil(this);
        // 初始化qq空间
        qqZoneUtil = new QQZoneUtil(this);
        weixinUtil = new WeixinUtil(this);
        qqUtil = new QQUtil(this);
        WeixinUtil.api.handleIntent(getIntent(), this);
        // AppConnect.getInstance(this).initPopAd(this);

        top_title.setText("" + bean.getContentText());
        newsContent.setText("" + bean.getContentText());
        contentList.addAll(list);
        adapter.setList(contentList);
        gallery.setAdapter(adapter);
        gallery.setSelection(position);
        if (contentList.get(position).getId() != null ) {
        	setContentRead(contentList.get(position).getId().intValue());
        }
        // 用来判断是否在当前页赞过的数组
        zanList = new int[contentList.size()];
        //type为空意味着是从个人主页跳来的 就不需要展示赞的数据
        if (TextUtils.isEmpty(type)){
            if (user != null && likeIds != null && likeIds.size() > 0) {
                for (int i = 0; i < contentList.size(); i++) {
                    for (int j = 0; j < likeIds.size(); j++) {
                        if (contentList.get(i).getId().intValue() == likeIds.get(j).getId().intValue()) {
                            zanList[i] = 1;
                        }else{
                            if (zanList[i] == 1){
                                
                            }else{
                                zanList[i] = 0;
                            }
                        }
                    }
                }
            }else{
                for (int i = 0; i < contentList.size(); i++) {
                    zanList[i] = 0;
                }
            }
        }
        
        if (c_color == 1) {
            newsContent.setTextColor(getResources().getColor(R.color.white));
        } else if (c_color == 2) {
            newsContent.setTextColor(getResources().getColor(R.color.orange));
        } else if (c_color == 3) {
            newsContent.setTextColor(getResources().getColor(R.color.light_blue));
        } else if (c_color == 4) {
            newsContent.setTextColor(getResources().getColor(R.color.text_color_gray));
        }

        back.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ll_menu.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                showMenuDialog();
            }
        });
        
        menu_save.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = gallery.getSelectedItemPosition();
                saveUrl = contentList.get(position).getContentUrl();
                        if (!TextUtils.isEmpty(saveUrl)) {
                            mSaveDialog = ProgressDialog.show(HotContentActivity.this, "保存图片", "图片正在保存中，请稍等...", true);  
                            new Thread(connectNet).start();  
                        }
            }
        });

        gallery.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                if (click) {
                    layoutHeader.setVisibility(View.GONE);
                    ll_view.setVisibility(View.GONE);
                    tv_page.setVisibility(View.GONE);
                    ll_zan.setVisibility(View.GONE);
                    if (!TextUtils.isEmpty(contentList.get(arg2).getUserHeadPhoto())){
                        iv_head.setVisibility(View.GONE);
                    }
                } else {
                    layoutHeader.setVisibility(View.VISIBLE);
                    ll_view.setVisibility(View.VISIBLE);
                    tv_page.setVisibility(View.VISIBLE);
                    ll_zan.setVisibility(View.VISIBLE);
                    if (!TextUtils.isEmpty(contentList.get(arg2).getUserHeadPhoto())){
                        iv_head.setVisibility(View.VISIBLE);
                    }
                }
                click = !click;
            }
        });

        gallery.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, final int arg2, long arg3) {
                position = arg2;
                text = contentList.get(arg2).getContentText();
                newsContent.setText("		" + text);
                top_title.setText("" + text);
                tv_page.setText((arg2 + 1) + "/" + contentList.size());
                if (contentList.get(arg2).getId() != null ) {
                	setContentRead(contentList.get(arg2).getId().intValue());
                }
                if (!TextUtils.isEmpty(contentList.get(arg2).getUserHeadPhoto())){
                    iv_head.setVisibility(View.VISIBLE);
                    ImageLoaderUtil.getInstance().loadImageByGlide(contentList.get(arg2).getUserHeadPhoto(), iv_head, R.drawable.default_headphoto);
                    iv_head.setOnClickListener(new OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (BmobUser.getCurrentUser()!=null){
                                Intent intent = new Intent(HotContentActivity.this, MyHomeActivity.class);
                                intent.putExtra("type", "others");
                                intent.putExtra("userId", contentList.get(arg2).getUserId());
                                launch(intent);
                            }else{
                                Intent intent = new Intent(HotContentActivity.this, LoginActivity.class);
                                launch(intent);
                            }
                        }
                    });
                }else{
                    iv_head.setVisibility(View.GONE);
                }
                
                if (!TextUtils.isEmpty(type)){
                    tv_zan.setVisibility(View.GONE);
                    iv_zan.setVisibility(View.GONE);
                }else{
                    if (contentList.get(arg2).getZan().intValue() == 0) {
                        tv_zan.setText("0人喜欢");
                    } else {
                        tv_zan.setText(contentList.get(arg2).getZan().intValue() + "人喜欢");
                    }

                    if (zanList[position] == 1) {
                        iv_zan.setBackgroundResource(R.drawable.zan_selected);
                    } else {
                        iv_zan.setBackgroundResource(R.drawable.zan_normal);
                    }
                    ll_zan.setOnClickListener(new OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ll_zan.setClickable(false);
                            if (zanList[position] == 1) {
                                zanPic(arg2, true);
                            } else {
                                zanPic(arg2, false);
                            }
                        }
                    });
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });
        
        gallery.setOnItemLongClickListener(new OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                showMenuDialog();
                return false;
            }
        });

    }

    private void zanPic(final int pos, final boolean isZan) {
        cb = new ContentBean();
        BmobQuery<ContentBean> query = new BmobQuery<ContentBean>();
        query.addWhereEqualTo("id", contentList.get(pos).getId());
        query.setLimit(1);
        query.findObjects(new FindListener<ContentBean>() {
            @Override
            public void done(List<ContentBean> list, BmobException e) {
                if (e == null) {
                    if (list != null && list.size() > 0) {
                        cb = list.get(0);
                    }
                    int count;
                    if (cb.getZan().intValue() == 0) {
                        count = 0;
                    } else {
                        count = cb.getZan().intValue();
                    }

                    if (isZan) {
                        cb.setZan(count - 1);
                    } else {
                        cb.setZan(count + 1);
                    }
                    cb.update(cb.getObjectId(), new UpdateListener() {
                        @Override
                        public void done(BmobException e) {
                            if (e == null) {
                                if (isZan) {
                                    final TipDialog tipDialog = new TipDialog(HotContentActivity.this);
                                    if (user!=null){
                                        int id = contentList.get(pos).getId().intValue();
                                        for (int i=0;i<likeIds.size();i++){
                                            if (id == likeIds.get(i).getId().intValue()){
                                                likeIds.remove(i);
                                                user.setLikeIds(likeIds);
                                                user.update(user.getObjectId(), new UpdateListener() {
                                                    @Override
                                                    public void done(BmobException e) {
                                                        if (e == null) {
                                                            tipDialog.showTip("取消收藏成功了。");
                                                            ImageApp.getInstance().setUserinfo(user);
                                                        } else {
                                                            tipDialog.showTip("取消收藏成功了。");
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                    }else{
                                        tipDialog.showTip("取消赞成功啦");
                                    }
                                    zanList[pos] = 0;
                                    iv_zan.setBackgroundResource(R.drawable.zan_normal);
                                } else {
                                    final TipDialog tipDialog = new TipDialog(HotContentActivity.this);
                                    if (user!=null){
                                        tipDialog.showTip("收藏成功啦,现在可以去个人主页查看已收藏的图片咯");
                                        likeIds.add(contentList.get(pos));
                                        user.setLikeIds(likeIds);
                                        user.update(user.getObjectId(), new UpdateListener() {
                                            @Override
                                            public void done(BmobException e) {
                                                if (e == null) {
                                                    tipDialog.showTip("收藏成功啦,现在可以去个人主页查看已收藏的图片咯");
                                                    ImageApp.getInstance().setUserinfo(user);
                                                } else {
                                                    tipDialog.showTip("点赞成功啦");
                                                }
                                            }
                                        });
                                    }else{
                                        tipDialog.showTip("点赞成功啦");
                                    }
                                    zanList[pos] = 1;
                                    iv_zan.setBackgroundResource(R.drawable.zan_selected);
                                }
                                contentList.get(pos).setZan(cb.getZan().intValue());
                                tv_zan.setText(contentList.get(pos).getZan().intValue() + "人喜欢");
                                ll_zan.setClickable(true);
                            } else {
                                showToast("网络异常");
                                ll_zan.setClickable(true);
                            }
                        }
                    });
                } else {
                    showToast("网络异常");
                    iv_zan.setClickable(true);
                }
            }
        });
    }
    
    private void showMenuDialog() {
        dialog = new Dialog(this, R.style.KADialog1);
        dialog.setContentView(R.layout.common_menu_dialog);
        dialog.setCanceledOnTouchOutside(true);
        Window window = dialog.getWindow();
        window.setBackgroundDrawableResource(R.color.transparent);
        window.setGravity(Gravity.CENTER);
        WindowManager.LayoutParams lp = dialog.getWindow().getAttributes();
        lp.width = (int) (Density.getSceenWidth(this)); // 设置宽度
        dialog.getWindow().setAttributes(lp);
        dialog.show();
        
        TextView tv_share = (TextView) dialog.findViewById(R.id.tv_share);
        TextView tv_copy = (TextView) dialog.findViewById(R.id.tv_copy);
        TextView tv_color = (TextView) dialog.findViewById(R.id.tv_color);
        tv_share.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                share();
            }
        });
        tv_copy.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                copy(text);
            }
        });
        tv_color.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor();
            }
        });
    }

    
    private void changeColor(int c_color){
        Preference.putInt("color", c_color);
        if (c_color == 1) {
            newsContent.setTextColor(getResources().getColor(R.color.white));
        } else if (c_color == 2) {
            newsContent.setTextColor(getResources().getColor(R.color.orange));
        } else if (c_color == 3) {
            newsContent.setTextColor(getResources().getColor(R.color.light_blue));
        } else if (c_color == 4) {
            newsContent.setTextColor(getResources().getColor(R.color.text_color_gray));
        }
    }

    /**
     * 实现文本复制功能
     * 
     * @param content
     */
    @SuppressLint("NewApi")
    @SuppressWarnings("deprecation")
    public void copy(String content) {
        ClipboardManager cbm = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        cbm.setText(content);
        showToast("已复制至剪贴板..");
    }
    
    /* 
     * 连接网络 
     * 由于在4.0中不允许在主线程中访问网络，所以需要在子线程中访问 
     */  
    private Runnable connectNet = new Runnable(){  
        @Override  
        public void run() {  
            try {  
                //以下是取得图片的两种方法  
                //////////////// 方法1：取得的是byte数组, 从byte数组生成bitmap  
                byte[] data = getImage(saveUrl);  
                if(data!=null){  
                    saveBitmap = BitmapFactory.decodeByteArray(data, 0, data.length);// bitmap  
                }else{  
                    if (mSaveDialog.isShowing()){
                        mSaveDialog.dismiss();
                    }
                }  
                ////////////////////////////////////////////////////////  
  
                //******** 方法2：取得的是InputStream，直接从InputStream生成bitmap ***********/  
//                mBitmap = BitmapFactory.decodeStream(getImageStream(filePath));  
                //********************************************************************/  
  
                // 发送消息，通知handler在主线程中更新UI  
                connectHanlder.sendEmptyMessage(0);  
            } catch (Exception e) {  
                if (mSaveDialog.isShowing()){
                    mSaveDialog.dismiss();
                }
                e.printStackTrace();  
            }  
  
        }  
  
    };  
    
    private Handler connectHanlder = new Handler() {  
        @Override  
        public void handleMessage(Message msg) {  
            // 更新UI，显示图片  
            if (saveBitmap != null) {  
                try {
                    saveFile(saveBitmap, ""+System.currentTimeMillis());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }  
        }  
    }; 
    
    /** 
     * Get image from newwork 
     * @param path The path of image 
     * @return byte[] 
     * @throws Exception 
     */  
    public byte[] getImage(String path) throws Exception{  
        URL url = new URL(path);  
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();  
        conn.setConnectTimeout(5 * 1000);  
        conn.setRequestMethod("GET");  
        InputStream inStream = conn.getInputStream();  
        if(conn.getResponseCode() == HttpURLConnection.HTTP_OK){  
            return readStream(inStream);  
        }  
        return null;  
    }
    
    /** 
     * Get data from stream 
     * @param inStream 
     * @return byte[] 
     * @throws Exception 
     */  
    public static byte[] readStream(InputStream inStream) throws Exception{  
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();  
        byte[] buffer = new byte[1024];  
        int len = 0;  
        while( (len=inStream.read(buffer)) != -1){  
            outStream.write(buffer, 0, len);  
        }  
        outStream.close();  
        inStream.close();  
        return outStream.toByteArray();  
    }  

    /**
     * 接收微客户端博请求的数据。 当微博客户端唤起当前应用并进行分享时，该方法被调用。
     * 
     * @param baseResp 微博请求数据对象
     * @see {@link IWeiboShareAPI#handleWeiboRequest}
     */
    @Override
    public void onResponse(BaseResponse baseResp) {
        switch (baseResp.errCode) {
            case WBConstants.ErrorCode.ERR_OK:
                Toast.makeText(this, R.string.weibosdk_demo_toast_share_success, Toast.LENGTH_LONG).show();
                break;
            case WBConstants.ErrorCode.ERR_CANCEL:
                Toast.makeText(this, R.string.weibosdk_demo_toast_share_canceled, Toast.LENGTH_LONG).show();
                break;
            case WBConstants.ErrorCode.ERR_FAIL:
                Toast.makeText(this,
                        getString(R.string.weibosdk_demo_toast_share_failed) + "Error Message: " + baseResp.errMsg,
                        Toast.LENGTH_LONG).show();
                break;
        }
    }

    /**
     * @see {@link Activity#onNewIntent}
     */
    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        // 从当前应用唤起微博并进行分享后，返回到当前应用时，需要在此处调用该函数
        // 来接收微博客户端返回的数据；执行成功，返回 true，并调用
        // {@link IWeiboHandler.Response#onResponse}；失败返回 false，不调用上述回调
        weiboUtil.handleWeiboResponse(intent, this);

        setIntent(intent);
        WeixinUtil.api.handleIntent(intent, this);
    }

    public static Bitmap drawableToBitmap(Drawable drawable) {
        // ȡ drawable �ĳ���
        int w = drawable.getIntrinsicWidth();
        int h = drawable.getIntrinsicHeight();

        // ȡ drawable ����ɫ��ʽ
        Bitmap.Config config = drawable.getOpacity() != PixelFormat.OPAQUE ? Bitmap.Config.ARGB_8888
                : Bitmap.Config.RGB_565;
        // ������Ӧ bitmap
        Bitmap bitmap = Bitmap.createBitmap(w, h, config);
        // ������Ӧ bitmap �Ļ���
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, w, h);
        // �� drawable ���ݻ���������
        drawable.draw(canvas);
        return bitmap;
    }

    /**
     * �������汳��
     */
    private void putWallpaper(Bitmap bitmap) {
        try {
            /*
             * int width = getWindowManager().getDefaultDisplay().getWidth(); int height =
             * getWindowManager().getDefaultDisplay().getHeight(); bitmap = Bitmap.createScaledBitmap(bitmap, width,
             * bitmap.getHeight(), true);
             */
            WallpaperManager wallpaperManager = WallpaperManager.getInstance(this);
            wallpaperManager.setBitmap(bitmap);
            progressDialog.dismiss();
            handler.sendEmptyMessage(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

 // state 2���� 3����
    public void saveFile(Bitmap bm, String fileName) throws IOException {
        String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/imageshow/images/";
        File dirFile = new File(path);
        if (!dirFile.exists()) {
            dirFile.mkdir();
        }
        File myCaptureFile = new File(path + fileName + ".jpg");

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(myCaptureFile));
        bm.compress(Bitmap.CompressFormat.JPEG, 80, bos);
        bos.flush();
        bos.close();
        if (mSaveDialog.isShowing()){
            mSaveDialog.dismiss();
        }
        if (getInt("isShowDownloadDialog", 0) == 0) {
            TipDialog tipDialog = new TipDialog(HotContentActivity.this);
            tipDialog.showTip("图片保存成功至/sdcard/imageshow/images");
            putInt("isShowDownloadDialog", 1, true);
        } else {
            showToastLong("已保存");
        }
//        Toast.makeText(this, "图片保存成功至/sdcard/imageshow/", Toast.LENGTH_LONG).show();
        fileScan(path + fileName + ".jpg");
    }

    // 保存图片后进行手动刷新 不然在SD卡中不展示
    public void fileScan(String filePath) {
        Uri data = Uri.parse("file://" + filePath);
        sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, data));
    }

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    Toast.makeText(HotContentActivity.this, "设置桌面背景成功", Toast.LENGTH_LONG).show();
                    break;
                default:
                    break;
            }
            super.handleMessage(msg);
        }
    };

    class ContentAdapter extends ArrayListAdapter<ContentBean> {

        private BaseActivity context;
//        private FinalBitmap fb;
//        private Bitmap bm;

        public ContentAdapter(BaseActivity context) {
            super(context);
            this.context = context;
//            fb = FinalBitmap.create(context);
//            bm = BitmapFactory.decodeResource(getResources(), R.drawable.default_image);
        }

        public ContentAdapter(BaseActivity context, ListView listView) {
            super(context, listView);
            this.context = context;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(context).inflate(R.layout.picture_list_gallery_item, parent, false);
            }

            ImageView image = ViewHolder.get(convertView, R.id.galleryPicView);

            final ContentBean contentBean = (ContentBean) getItem(position);
            String url = contentBean.getContentUrl();
            ImageLoaderUtil.getInstance().loadImageByGlide(url, image, R.drawable.default_image);
//            fb.display(image, url, bm);
//            SimpleImageLoader.display(context, image, url, R.drawable.default_image);
            return convertView;
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == Constants.REQUEST_QQ_SHARE) {
            if (resultCode == Constants.ACTIVITY_OK) {
                Tencent.handleResultData(data, qqShareListener);
            }
        }
    }

    IUiListener qqShareListener = new IUiListener() {
        @Override
        public void onCancel() {
            // showToast("onCancel: ");
        }

        @Override
        public void onComplete(Object response) {
            // showToast("onComplete: " + response.toString());
        }

        @Override
        public void onError(UiError e) {
            // showToast("onError: " + e.errorMessage);
        }
    };

    // 微信发送请求到第三方应用时，会回调到该方法
    @Override
    public void onReq(BaseReq req) {
        switch (req.getType()) {
//            case ConstantsAPI.COMMAND_GETMESSAGE_FROM_WX:
//                goToGetMsg();
//                break;
//            case ConstantsAPI.COMMAND_SHOWMESSAGE_FROM_WX:
//                goToShowMsg((ShowMessageFromWX.Req) req);
//                break;
            default:
                break;
        }
    }

    // 第三方应用发送到微信的请求处理后的响应结果，会回调到该方法
    @Override
    public void onResp(BaseResp resp) {
        int result = 0;

        switch (resp.errCode) {
//            case BaseResp.ErrCode.ERR_OK:
//                result = R.string.errcode_success;
//                break;
//            case BaseResp.ErrCode.ERR_USER_CANCEL:
//                result = R.string.errcode_cancel;
//                break;
//            case BaseResp.ErrCode.ERR_AUTH_DENIED:
//                result = R.string.errcode_deny;
//                break;
//            default:
//                result = R.string.errcode_unknown;
//                break;
        }
        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
    }
    
    private void share(){
        dialog.dismiss();
        View view = LayoutInflater.from(HotContentActivity.this).inflate(R.layout.dialog_share, null);
        final Dialog d_dialog = new Dialog(HotContentActivity.this, R.style.upload_dialog);
        d_dialog.setContentView(view);
        Window window = d_dialog.getWindow();
        window.setBackgroundDrawableResource(R.color.transparent);
        window.setGravity(Gravity.TOP);
        WindowManager.LayoutParams lp = d_dialog.getWindow().getAttributes();
        lp.width = (int) (Density.getSceenWidth(HotContentActivity.this) * 3 / 4); // 设置宽度
        lp.y = (int) (Density.getSceenHeight(HotContentActivity.this) * 1 / 3);
        d_dialog.getWindow().setAttributes(lp);
        d_dialog.show();
        ImageView iv_weibo = (ImageView) view.findViewById(R.id.iv_weibo);
        ImageView iv_qq = (ImageView) view.findViewById(R.id.iv_qq);
        ImageView iv_qzone = (ImageView) view.findViewById(R.id.iv_qzone);
        ImageView iv_weixin = (ImageView) view.findViewById(R.id.iv_weixin);
        ImageView iv_circle = (ImageView) view.findViewById(R.id.iv_circle);

        iv_weibo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                d_dialog.dismiss();
                weiboUtil.registerApp();
                if (weiboUtil.checkEnvironment(true)) {
                    int position2 = gallery.getSelectedItemPosition();
                    String url2 = contentList.get(position2).getContentUrl();
                    weiboUtil.sendMessage(true, true, text, url2);
                }
            }
        });
        iv_qq.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                d_dialog.dismiss();
                int position3 = gallery.getSelectedItemPosition();
                String url3 = contentList.get(position3).getContentUrl();
                final Bundle params = new Bundle();
                params.putString(QQShare.SHARE_TO_QQ_IMAGE_URL, url3);
                params.putString(QQShare.SHARE_TO_QQ_TARGET_URL, "http://a.app.qq.com/o/simple.jsp?pkgname=com.suo.demo");
                params.putString(QQShare.SHARE_TO_QQ_APP_NAME, "美图Show");
                params.putString(QQShare.SHARE_TO_QQ_SUMMARY, text);
                params.putString(QQShare.SHARE_TO_QQ_TITLE, "美图Show");
                qqUtil.doShareToQQ(params, qqShareListener);
            }
        });
        iv_qzone.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                d_dialog.dismiss();
                int position3 = gallery.getSelectedItemPosition();
                String url3 = contentList.get(position3).getContentUrl();
                qqZoneUtil.doShareToQzone(text, url3);
            }
        });
        iv_weixin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                d_dialog.dismiss();
                int position3 = gallery.getSelectedItemPosition();
                final String url3 = contentList.get(position3).getContentUrl();
                new Thread(){
                    public void run(){
                        try{
//                            WXImageObject imgObj = new WXImageObject();
//                            imgObj.imageUrl = url3;
//                            
//                            WXMediaMessage msg = new WXMediaMessage();
//                            msg.mediaObject = imgObj;
//                            msg.description = text;
//                            msg.title = text;
//
//                            Bitmap bmp = BitmapFactory.decodeStream(new URL(url3).openStream());
//                            Bitmap thumbBmp = Bitmap.createScaledBitmap(bmp, 150, 150, true);
//                            bmp.recycle();
//                            msg.thumbData = ImageUtils.bmpToByteArray(thumbBmp, true);
//                            
//                            SendMessageToWX.Req req = new SendMessageToWX.Req();
//                            req.transaction = "img"+System.currentTimeMillis();
//                            req.message = msg;
//                            
//                            WeixinUtil.api.sendReq(req);
                            WXWebpageObject webpage = new WXWebpageObject();
                            webpage.webpageUrl = url3;

                            WXMediaMessage msg = new WXMediaMessage();
                            msg.mediaObject = webpage;
                            msg.description = "来自美图Show";
                            msg.title = text;

                            Bitmap bmp = BitmapFactory.decodeStream(new URL(url3).openStream());
                            Bitmap thumbBmp = Bitmap.createScaledBitmap(bmp, 150, 150, true);
                            bmp.recycle();
                            msg.thumbData = ImageUtils.bmpToByteArray(thumbBmp, true);

                            SendMessageToWX.Req req = new SendMessageToWX.Req();
                            req.transaction = "webpage";
                            req.message = msg;

                            WeixinUtil.api.sendReq(req);
                        } catch(Exception e) {
                            e.printStackTrace();
                        } 
                    }
                }.start();
            }
        });
        
        iv_circle.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                d_dialog.dismiss();
                int position3 = gallery.getSelectedItemPosition();
                final String url3 = contentList.get(position3).getContentUrl();
                new Thread(){
                    public void run(){
                        try{
//                            WXImageObject imgObj = new WXImageObject();
//                            imgObj.imageUrl = url3;
//                            
//                            WXMediaMessage msg = new WXMediaMessage();
//                            msg.mediaObject = imgObj;
//                            msg.description = text;
//                            msg.title = text;
//
//                            Bitmap bmp = BitmapFactory.decodeStream(new URL(url3).openStream());
//                            Bitmap thumbBmp = Bitmap.createScaledBitmap(bmp, 150, 150, true);
//                            bmp.recycle();
//                            msg.thumbData = ImageUtils.bmpToByteArray(thumbBmp, true);
//                            
//                            SendMessageToWX.Req req = new SendMessageToWX.Req();
//                            req.transaction = "img"+System.currentTimeMillis();
//                            req.message = msg;
//                            req.scene = SendMessageToWX.Req.WXSceneTimeline;
//                            WeixinUtil.api.sendReq(req);
                            WXWebpageObject webpage = new WXWebpageObject();
                            webpage.webpageUrl = url3;

                            WXMediaMessage msg = new WXMediaMessage();
                            msg.mediaObject = webpage;
                            msg.description = "来自美图Show";
                            msg.title = text;

                            Bitmap bmp = BitmapFactory.decodeStream(new URL(url3).openStream());
                            Bitmap thumbBmp = Bitmap.createScaledBitmap(bmp, 150, 150, true);
                            bmp.recycle();
                            msg.thumbData = ImageUtils.bmpToByteArray(thumbBmp, true);

                            SendMessageToWX.Req req = new SendMessageToWX.Req();
                            req.transaction = "webpage";
                            req.message = msg;
                            req.scene = SendMessageToWX.Req.WXSceneTimeline;
                            WeixinUtil.api.sendReq(req);
                        } catch(Exception e) {
                            e.printStackTrace();
                        } 
                    }
                }.start();
                
            }
        });
    }
    
    private void changeColor() {
        dialog.dismiss();
        View view = LayoutInflater.from(HotContentActivity.this).inflate(
                R.layout.dialog_choose_text_color, null);
        final Dialog d_dialog = new Dialog(HotContentActivity.this, R.style.upload_dialog);
        d_dialog.setContentView(view);
        Window window = d_dialog.getWindow();
        window.setBackgroundDrawableResource(R.color.transparent);
        window.setGravity(Gravity.TOP);
        WindowManager.LayoutParams lp = d_dialog.getWindow().getAttributes();
        lp.width = (int) (Density.getSceenWidth(HotContentActivity.this) * 3 / 4); // 设置宽度
        lp.y = (int) (Density.getSceenHeight(HotContentActivity.this) * 1 / 3);
        d_dialog.getWindow().setAttributes(lp);
        d_dialog.show();
        final TextView tv_text = (TextView) view.findViewById(R.id.tv_text);
        final TextView tv_color1 = (TextView) view.findViewById(R.id.tv_color1);
        final TextView tv_color2 = (TextView) view.findViewById(R.id.tv_color2);
        final TextView tv_color3 = (TextView) view.findViewById(R.id.tv_color3);
        final TextView tv_color4 = (TextView) view.findViewById(R.id.tv_color4);
        final TextView tv_ok = (TextView) view.findViewById(R.id.tv_ok);
        final TextView tv_cancel = (TextView) view.findViewById(R.id.tv_cancel);
        tv_color1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                c_color = 1;
                changeColor(c_color);
                d_dialog.dismiss();
//                tv_text.setTextColor(getResources().getColor(R.color.white));
            }
        });
        tv_color2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                c_color = 2;
                changeColor(c_color);
                d_dialog.dismiss();
//                tv_text.setTextColor(getResources().getColor(R.color.orange));
            }
        });
        tv_color3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                c_color = 3;
                changeColor(c_color);
                d_dialog.dismiss();
//                tv_text.setTextColor(getResources().getColor(R.color.light_blue));
            }
        });
        tv_color4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                c_color = 4;
                changeColor(c_color);
                d_dialog.dismiss();
//                tv_text.setTextColor(getResources().getColor(R.color.text_color_gray));
            }
        });
        tv_ok.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                d_dialog.dismiss();
                Preference.putInt("color", c_color);
                if (c_color == 1) {
                    newsContent.setTextColor(getResources().getColor(R.color.white));
                } else if (c_color == 2) {
                    newsContent.setTextColor(getResources().getColor(R.color.orange));
                } else if (c_color == 3) {
                    newsContent.setTextColor(getResources().getColor(R.color.light_blue));
                } else if (c_color == 4) {
                    newsContent.setTextColor(getResources().getColor(R.color.text_color_gray));
                }

            }
        });
        tv_cancel.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                d_dialog.dismiss();
            }
        });
    }
    
}
