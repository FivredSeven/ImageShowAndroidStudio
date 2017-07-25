package com.suo.image.activity;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.tsz.afinal.FinalBitmap;
import cn.bmob.push.BmobPush;
import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobInstallation;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.BmobQuery.CachePolicy;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.QueryListener;
import cn.bmob.v3.update.BmobUpdateAgent;

import com.bumptech.glide.Glide;
import com.nineoldandroids.view.ViewHelper;
import com.suo.demo.R;
import com.suo.image.ImageApp;
import com.suo.image.activity.login.LoginActivity;
import com.suo.image.activity.my.MyHomeActivity;
import com.suo.image.adapter.ArrayListAdapter;
import com.suo.image.adapter.ViewHolder;
import com.suo.image.bean.AboutBean;
import com.suo.image.bean.ImageBean;
import com.suo.image.bean.UserInfo;
import com.suo.image.img.SimpleImageLoader;
import com.suo.image.share.QQUtil;
import com.suo.image.util.Density;
import com.suo.image.util.ImageLoaderUtil;
import com.suo.image.util.Log;
import com.suo.image.util.Preference;
import com.suo.image.util.Util;
import com.suo.image.view.CircleImageView;
import com.suo.image.view.DragLayout;
import com.suo.image.view.ImgViewPager;
import com.suo.image.view.ImgViewPager.OnImgClickListener;
import com.suo.image.view.TipDialog;
import com.suo.image.view.DragLayout.Status;
import com.suo.image.view.MyGridView;
import com.suo.image.view.DragLayout.DragListener;
import com.suo.image.view.RoundImageView;
import com.tencent.connect.common.Constants;
import com.tencent.tauth.Tencent;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class Main_new extends BaseActivity {

    private DragLayout main_dl;
    private RoundImageView btn_icon;
    private RoundImageView iv_bottom;
    private TextView tv_home;
    private TextView tv_upload;
    private TextView tv_friend;
    private TextView tv_word;
    private TextView tv_tuijian;
    private TextView tv_fankui;
    private TextView tv_about;

    private MyGridView imageGridView;
    private Button more;
    private Button btn_refresh;
    private ImageView iv_hot;
    private TextView tv_nickname;

    private ArrayList<ImageBean> list;
    private ProgressDialog progressDialog;
    private ImageAdapter adapter;

    private int currType = 1;
//    private int count = 1;

    private float x = 0;
    private float y = 0;
    
    public Tencent mTencent;
//    private FinalBitmap finalB;
    private UserInfo userinfo;
    
    private ImgViewPager ivp_ad;
    private ArrayList<ImageBean> mAdDatas;
    
    public static final String readImage = "readImage";
    public static final String readContent = "readContent";
    public static String alreadyReadImage;
    public static String alreadyReadContents;
    public static List<String> readIds;
    public static List<String> readIds2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_new);

        initBmob();
        initDragLayout();
        initView();
        initAd();
        initAlreadyRead();

        prepareData();

        initLayout();

        queryData(true, currType);
        BmobUpdateAgent.setUpdateOnlyWifi(false);
        BmobUpdateAgent.update(this);
        queryAbout();
    }
    
    private void initBmob() {
    	mShared = this.getSharedPreferences(imageShare, 0);
		mEditor = mShared.edit();
		Bmob.initialize(this, APPID);
        // 使用推送服务时的初始化操作
        BmobInstallation.getCurrentInstallation().save();
        // 启动推送服务
        BmobPush.startWork(this);
    }

    private void initAlreadyRead() {
        readIds = new ArrayList<String>();
        readIds2 = new ArrayList<String>();
        alreadyReadImage = getString(readImage, "");
        alreadyReadContents = getString(readContent, "");
        if (!TextUtils.isEmpty(alreadyReadImage)) {
            String[] array = alreadyReadImage.split(",");
            for(int i=0;i<array.length;i++) {
                readIds.add(array[i]);
            }
        }
        
        if (!TextUtils.isEmpty(alreadyReadContents)) {
            String[] array = alreadyReadContents.split(",");
            for(int i=0;i<array.length;i++) {
                readIds2.add(array[i]);
            }
        }
    }
    
    private void prepareData() {

        list = new ArrayList<ImageBean>();
        adapter = new ImageAdapter(this);
//        finalB = FinalBitmap.create(this);
        // AppConnect.getInstance(this).initUninstallAd(this);
        // AppConnect.getInstance(this).setCrashReport(false);// 默认值 true 开启，设置
        // false 关闭
        mTencent = Tencent.createInstance(QQUtil.appId, this);
        String token = Preference.getString(Constants.PARAM_ACCESS_TOKEN);
        String expires = Preference.getString(Constants.PARAM_EXPIRES_IN);
        String openId = Preference.getString(Constants.PARAM_OPEN_ID);
        
        if (!TextUtils.isEmpty(token) && !TextUtils.isEmpty(expires)
                && !TextUtils.isEmpty(openId)) {
            mTencent.setAccessToken(token, expires);
            mTencent.setOpenId(openId);
        }
        
    }

//    private void updateQQUser() {
//        String qqinfo = Preference.getString("qqinfo");
//        if (!TextUtils.isEmpty(qqinfo)){
//            Gson gson = new Gson();
//            String str = qqinfo.replace("\\\\", "");
//            Log.e("str:" + str);
//            QQBean bean = gson.fromJson(str, QQBean.class);
//            if (bean != null){
//                if (!TextUtils.isEmpty(bean.getNickname())) {
//                    tv_nickname.setText(""+bean.getNickname());
//                }
//                if (!TextUtils.isEmpty(bean.getFigureurl_qq_2())){
//                    finalB.display(iv_bottom, bean.getFigureurl_qq_2());
//                }
//            }
//        }
//    }



    private void initLayout() {
        imageGridView = (MyGridView) findViewById(R.id.imageGridView);
        more = (Button) findViewById(R.id.more);
        btn_refresh = (Button) findViewById(R.id.btn_refresh);
        iv_hot = (ImageView) findViewById(R.id.iv_hot);
        iv_hot.setVisibility(View.GONE);
        tv_nickname = (TextView) findViewById(R.id.tv_nickname);
        int width = Density.getSceenWidth(this);
        LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) imageGridView.getLayoutParams();
        lp.setMargins(width / 60, width / 60, width / 60, width / 60);
        imageGridView.setLayoutParams(lp);

//        updateQQUser();
        imageGridView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (TextUtils.isEmpty(list.get(position).getWordUrl())) {
                    Intent intent = new Intent(Main_new.this, PictureNetContentActivity.class);
                    intent.putExtra("imageBean", list.get(position));
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(Main_new.this, WordsActivity.class);
                    intent.putExtra("imageBean", list.get(position));
                    startActivity(intent);
                }
                setImageRead(list.get(position).getImageId().intValue());
            }
        });
        
        more.setOnClickListener(this);
        btn_refresh.setOnClickListener(this);
        tv_nickname.setOnClickListener(this);
        
        iv_hot.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                launch(HotPicActivity.class);
            }
        });
        iv_hot.setOnTouchListener(new OnTouchListener() {
            int lastX, lastY;
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int ea = event.getAction();
                switch (ea) {
                    case MotionEvent.ACTION_DOWN:
                        iv_hot.setClickable(true);
                        lastX = (int) event.getRawX();
                        x = (int) event.getRawX();
                        lastY = (int) event.getRawY();
                        y = (int) event.getRawY();
                        break;
                    /**
                     * layout(l,t,r,b) l Left position, relative to parent t Top position, relative to parent r Right
                     * position, relative to parent b Bottom position, relative to parent
                     * */
                    case MotionEvent.ACTION_MOVE:
                        int dx = (int) event.getRawX() - lastX;
                        int dy = (int) event.getRawY() - lastY;

                        int left = v.getLeft()/* + dx*/;
                        int top = v.getTop() + dy;
                        int right = v.getRight()/* + dx*/;
                        int bottom = v.getBottom() + dy;

                        if (left < 0) {
                            left = 0;
                            right = left + v.getWidth();
                        }

                        if (right > Density.getSceenWidth(Main_new.this)) {
                            right = Density.getSceenWidth(Main_new.this);
                            left = right - v.getWidth();
                        }

                        if (top < 0) {
                            top = 0;
                            bottom = top + v.getHeight();
                        }

                        if (bottom > (Density.getSceenHeight(Main_new.this) - 50)) {
                            bottom = Density.getSceenHeight(Main_new.this) - 50;
                            top = bottom - v.getHeight();
                        }

                        v.layout(left, top, right, bottom);

                        lastX = (int) event.getRawX();
                        lastY = (int) event.getRawY();

                        break;
                    case MotionEvent.ACTION_UP:
                        Log.e("suo", "lastX:" + lastX + "|x:" + x + "|lastY:" + lastY + "|y:" + y);
                        if (lastX - x < 5 && lastY - y < 5) {
                            iv_hot.setClickable(true);
                        } else {
                            iv_hot.setClickable(false);
                        }
                        break;
                }
                return false;
            }
        });
    }

    private void queryData(boolean top, int type) {
        if (list != null && top) {
            list.clear();
            adapter.setList(list);
            imageGridView.setAdapter(adapter);
        }
        BmobQuery<ImageBean> bmobQuery = new BmobQuery<ImageBean>();
        // bmobQuery.addWhereEqualTo("age", 25);
        // bmobQuery.addWhereNotEqualTo("age", 25);
        // bmobQuery.addQueryKeys("objectId");
        if (type == 1) {
            bmobQuery.addWhereEqualTo("type", "1");
        } else if (type == 2) {
            bmobQuery.addWhereEqualTo("type", "2");
        } else if (type == 3) {
            bmobQuery.addWhereEqualTo("type", "3");
        }
        int limit = getInt("maxsize", 20);
        bmobQuery.setLimit(limit);
        bmobQuery.setSkip(list.size());
        bmobQuery.order("-imageId");
//        bmobQuery.setCachePolicy(CachePolicy.CACHE_THEN_NETWORK); // 先从缓存取数据，无论结果如何都会再次从网络获取数据。也就是说会产生2次调用。
                                                                  // 通常的用法是先快速取出缓存数据展示view，然后再后台连接网络取得最新数据，取到后用来自网络服务器的最新数据更新view。
        bmobQuery.findObjects(new FindListener<ImageBean>() {
            @Override
            public void done(List<ImageBean> tempList, BmobException e) {
                if (e == null) {
                    Log.e("查询成功：共" + tempList.size() + "条数据。");
                    if (tempList != null && tempList.size() > 0) {
                        list.addAll(tempList);
                        adapter.setList(list);
                        imageGridView.setAdapter(adapter);
                        putInt("maxsize", list.size(), true);
//                        count = 2;
                    } else {
                        showToast("已无更多数据啦.");
                    }
                } else {
                    Log.e("查询失败 :" + e.getMessage());
                }
            }
        });

        BmobQuery<ImageBean> query = new BmobQuery<>();
        query.getObject("4jpB6AAC", new QueryListener<ImageBean>() {
            @Override
            public void done(ImageBean imageBean, BmobException e) {
                if (e == null) {
                    if (imageBean != null) {
                        Log.e("查询成功 imageBean:" + imageBean.getImageUrl());
                    }
                }
            }
        });
    }

    class ImageAdapter extends ArrayListAdapter<ImageBean> {

        private BaseActivity context;
//        private FinalBitmap fb;

        public ImageAdapter(BaseActivity context) {
            super(context);
            this.context = context;
        }

        public ImageAdapter(BaseActivity context, ListView listView) {
            super(context, listView);
            this.context = context;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(context).inflate(R.layout.image_gridview, parent, false);
            }

            ImageView image_grid = ViewHolder.get(convertView, R.id.image_grid);
            TextView text_grid = ViewHolder.get(convertView, R.id.text_grid);
            ImageView iv_words_tag = ViewHolder.get(convertView, R.id.iv_words_tag);

            final ImageBean bean = (ImageBean) getItem(position);

//            fb = FinalBitmap.create(context);
//            fb.display(image_grid, bean.getImageUrl());
            ImageLoaderUtil.getInstance().loadImageByGlide(bean.getImageUrl(), image_grid, R.drawable.default_image);
            // SimpleImageLoader.display(context, viewHolder.image, url, R.drawable.default_image);
            FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) image_grid.getLayoutParams();
            lp.height = Density.getSceenHeight(context) / 4;
            image_grid.setLayoutParams(lp);
            text_grid.setText(bean.getImageText());
            if (readIds.contains(""+bean.getImageId().intValue())) {
                text_grid.setTextColor(context.getResources().getColor(R.color.gray_line));
            } else {
                text_grid.setTextColor(context.getResources().getColor(R.color.image_black_text));
            }

            if (bean.getImageUrl().contains("http://file.bmob.cn")) {
                iv_words_tag.setVisibility(View.VISIBLE);
                iv_words_tag.setImageResource(R.drawable.words_tag_green);
            } else {

                if (!TextUtils.isEmpty(bean.getWordUrl())) {
                    iv_words_tag.setVisibility(View.VISIBLE);
                    iv_words_tag.setImageResource(R.drawable.words_tag);
                } else {
                    iv_words_tag.setVisibility(View.GONE);
                }
            }

            return convertView;
        }

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        System.out.println("TabHost_Index.java onKeyDown");
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (main_dl.getStatus() == Status.Open) {
                new AlertDialog.Builder(Main_new.this).setTitle("提示").setMessage("您真的要退出美图Show吗?")
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                finish();
                                System.exit(0);
                            }
                        }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).create().show();
            } else {
                main_dl.open();
            }

        }
        return false;
    }

    private void initDragLayout() {
        main_dl = (DragLayout) findViewById(R.id.main_dl);
        main_dl.setDragListener(new DragListener() {
            @Override
            public void onOpen() {
                // lv.smoothScrollToPosition(new Random().nextInt(30));
            }

            @Override
            public void onClose() {
            }

            @Override
            public void onDrag(float percent) {
                animate(percent);
            }
        });
    }

    private void initView() {
        btn_icon = (RoundImageView) findViewById(R.id.btn_icon);
        iv_bottom = (RoundImageView) findViewById(R.id.iv_bottom);
        tv_home = (TextView) findViewById(R.id.tv_home);
        tv_upload = (TextView) findViewById(R.id.tv_upload);
        tv_friend = (TextView) findViewById(R.id.tv_friend);
        tv_word = (TextView) findViewById(R.id.tv_word);
        tv_tuijian = (TextView) findViewById(R.id.tv_tuijian);
        tv_fankui = (TextView) findViewById(R.id.tv_fankui);
        tv_about = (TextView) findViewById(R.id.tv_about);

        btn_icon.setOnClickListener(this);
        tv_home.setOnClickListener(this);
        tv_friend.setOnClickListener(this);
        tv_word.setOnClickListener(this);
        tv_upload.setOnClickListener(this);
        tv_tuijian.setOnClickListener(this);
        tv_fankui.setOnClickListener(this);
        tv_about.setOnClickListener(this);
        iv_bottom.setOnClickListener(this);
    }
    
    private void initAd() {
        if (mAdDatas == null) {
            mAdDatas = new ArrayList<ImageBean>();
            BmobQuery<ImageBean> bmobQuery = new BmobQuery<ImageBean>();
            bmobQuery.addWhereEqualTo("type", "9");
            bmobQuery.setLimit(5);
            bmobQuery.order("-imageId");

            bmobQuery.findObjects(new FindListener<ImageBean>() {
                @Override
                public void done(List<ImageBean> list, BmobException e) {
                    if (e == null) {
                        if (list != null && list.size() > 0) {
                            List<String> urls = new ArrayList<String>();
                            List<String> des = new ArrayList<String>();
                            for(ImageBean bean : list) {
                                urls.add(bean.getImageUrl());
                                des.add(bean.getImageText());
                            }
                            ivp_ad.setPicUrls(urls);
                            ivp_ad.setImageDescriptions(des);
                            ivp_ad.show(Main_new.this);
                            if (currType == 1)
                                ivp_ad.setVisibility(View.VISIBLE);
                            else
                                ivp_ad.setVisibility(View.GONE);
                        }
                    }
                }
            });
        }
        int[] imageIds = new int[1];
        ArrayList<String> imgDes = new ArrayList<String>();
        for(int i=0;i<1;i++){
            imgDes.add("imgDes");
            imageIds[i] = R.drawable.default_image;
        }
        ivp_ad = (ImgViewPager) findViewById(R.id.ivp_ad);
        ivp_ad.setFlag(ImgViewPager.FLAG_IMG_NOLIMIT_LOOP | ImgViewPager.FLAG_SHOW_BOTTOM_DOT_VIEW);
        int defScreenRealHeight = Util.getDefScreenRealHeight(this, 1024, 500);
        ivp_ad.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, defScreenRealHeight));
        ivp_ad.setOnImgClickListener(new OnImgClickListener() {
            @Override
            public void onImgClick(int position) {
                launch(HotPicActivity.class);                
            }
        });
//        ivp_ad.setImageIds(imageIds);
//        ivp_ad.setImageDescriptions(imgDes);
//        ivp_ad.show(this);
    }

    private void animate(float percent) {
        ViewGroup vg_left = main_dl.getVg_left();
        ViewGroup vg_main = main_dl.getVg_main();

        float f1 = 1 - percent * 0.3f;
        ViewHelper.setScaleX(vg_main, f1);
        ViewHelper.setScaleY(vg_main, f1);
        ViewHelper.setTranslationX(vg_left, -vg_left.getWidth() / 2.2f + vg_left.getWidth() / 2.2f * percent);
        ViewHelper.setScaleX(vg_left, 0.5f + 0.5f * percent);
        ViewHelper.setScaleY(vg_left, 0.5f + 0.5f * percent);
        ViewHelper.setAlpha(vg_left, percent);
        ViewHelper.setAlpha(btn_icon, 1 - percent);

        int color = (Integer) evaluate(percent, Color.parseColor("#ff000000"), Color.parseColor("#00000000"));
        main_dl.getBackground().setColorFilter(color, Mode.SRC_OVER);
    }

    public Object evaluate(float fraction, Object startValue, Object endValue) {
        int startInt = (Integer) startValue;
        int startA = (startInt >> 24) & 0xff;
        int startR = (startInt >> 16) & 0xff;
        int startG = (startInt >> 8) & 0xff;
        int startB = startInt & 0xff;
        int endInt = (Integer) endValue;
        int endA = (endInt >> 24) & 0xff;
        int endR = (endInt >> 16) & 0xff;
        int endG = (endInt >> 8) & 0xff;
        int endB = endInt & 0xff;
        return (int) ((startA + (int) (fraction * (endA - startA))) << 24)
                | (int) ((startR + (int) (fraction * (endR - startR))) << 16)
                | (int) ((startG + (int) (fraction * (endG - startG))) << 8)
                | (int) ((startB + (int) (fraction * (endB - startB))));
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()) {
            case R.id.more:
                queryData(false, currType);
                break;
            case R.id.btn_refresh:
                queryData(true, currType);
                break;
            case R.id.btn_icon:
                main_dl.open();
                break;
            case R.id.tv_home:
                setbg(1);
                if (currType != 1) {
                    currType = 1;
                    ivp_ad.setVisibility(View.VISIBLE);
                    queryData(true, currType);
                }
                main_dl.close();
                break;
            case R.id.tv_friend:
                setbg(2);
                if (currType != 2) {
                    currType = 2;
                    ivp_ad.setVisibility(View.GONE);
                    queryData(true, currType);
                }
                main_dl.close();
                break;
            case R.id.tv_word:
                setbg(3);
                if (currType != 3) {
                    currType = 3;
                    ivp_ad.setVisibility(View.GONE);
                    queryData(true, currType);
                }
                main_dl.close();
                break;
            case R.id.tv_upload:
                setbg(6);
                launch(AddImageTextActivity.class);
                break;
            case R.id.tv_tuijian:
                // AppConnect.getInstance(Main_new.this).showOffers(
                // Main_new.this);
                break;
            case R.id.tv_fankui:
                setbg(4);
                launch(FeedbackActivity.class);
                break;
            case R.id.tv_about:
                setbg(5);
                launch(AboutActivity.class);
                break;
                //个人主页
            case R.id.tv_nickname:
            case R.id.iv_bottom:
                BmobUser user = BmobUser.getCurrentUser();
                if(user!=null){
                    launch(MyHomeActivity.class);
//                    Intent intent = new Intent(Main_new.this, MainActivity.class);
//                    startActivity(intent);
                }else{
                    launch(LoginActivity.class);
                }
                break;
            default:
                break;
        }
    }

    //改变背景色
    private void setbg(int pos){
        tv_home.setBackgroundColor(getResources().getColor(R.color.transparent));
        tv_friend.setBackgroundColor(getResources().getColor(R.color.transparent));
        tv_word.setBackgroundColor(getResources().getColor(R.color.transparent));
        tv_fankui.setBackgroundColor(getResources().getColor(R.color.transparent));
        tv_about.setBackgroundColor(getResources().getColor(R.color.transparent));
        tv_upload.setBackgroundColor(getResources().getColor(R.color.transparent));
        switch (pos) {
            case 1:
                tv_home.setBackgroundResource(R.drawable.shape_main_textbg);
                break;
            case 2:
                tv_friend.setBackgroundResource(R.drawable.shape_main_textbg);
                break;
            case 3:
                tv_word.setBackgroundResource(R.drawable.shape_main_textbg);
                break;
            case 4:
                tv_fankui.setBackgroundResource(R.drawable.shape_main_textbg);
                break;
            case 5:
                tv_about.setBackgroundResource(R.drawable.shape_main_textbg);
                break;
            case 6:
                tv_upload.setBackgroundResource(R.drawable.shape_main_textbg);
                break;
            default:
                break;
        }
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        startAnim();
//        updateQQUser();
        userinfo = ImageApp.getInstance().getUserinfo();
        if (userinfo != null){
            tv_nickname.setText(""+userinfo.getNickname());
//            finalB.display(iv_bottom, ""+userinfo.getHeadPhoto());
            ImageLoaderUtil.getInstance().loadImageByGlide(userinfo.getHeadPhoto(), iv_bottom, R.drawable.default_headphoto);
            ImageLoaderUtil.getInstance().loadImageByGlide(userinfo.getHeadPhoto(), btn_icon, R.drawable.default_headphoto);
//            SimpleImageLoader.display(this, iv_bottom, userinfo.getHeadPhoto(), R.drawable.default_image);
        }else if (BmobUser.getCurrentUser()!=null){
            BmobQuery<UserInfo> query = new BmobQuery<UserInfo>();
            query.addWhereEqualTo("userId", BmobUser.getCurrentUser().getObjectId());
            query.findObjects(new FindListener<UserInfo>() {
                @Override
                public void done(List<UserInfo> list, BmobException e) {
                    if (e == null) {
                        if (list!=null && list.size()>0){
                            ImageApp.getInstance().setUserinfo(list.get(0));
                            tv_nickname.setText(""+list.get(0).getNickname());
                            ImageLoaderUtil.getInstance().loadImageByGlide(list.get(0).getHeadPhoto(), iv_bottom, R.drawable.default_headphoto);
                            ImageLoaderUtil.getInstance().loadImageByGlide(list.get(0).getHeadPhoto(), btn_icon, R.drawable.default_headphoto);
//                            finalB.display(iv_bottom, ""+object.get(0).getHeadPhoto());
//                            SimpleImageLoader.display(Main_new.this, iv_bottom, object.get(0).getHeadPhoto(), R.drawable.default_image);
                        }
                    }
                }
            });
        }else{
            iv_bottom.setImageResource(R.drawable.default_headphoto);
            btn_icon.setImageResource(R.drawable.default_headphoto);
            tv_nickname.setText("美图Show");
        }
    }

    private void startAnim() {
        btn_icon.startAnimation(AnimationUtils.loadAnimation(this, R.anim.shake));
    }
    
    //获取最新关于
    private void queryAbout(){
        BmobQuery<AboutBean> bmobQuery = new BmobQuery<AboutBean>();
        bmobQuery.order("-updatedAt");
        bmobQuery.findObjects(new FindListener<AboutBean>() {
            @Override
            public void done(List<AboutBean> list, BmobException e) {
                if (e == null) {
                    if (list != null && list.size()>0){
                        String about = Preference.getString("about");
                        if (TextUtils.isEmpty(about) || !about.equals(list.get(0).getAboutText())){
                            Preference.putString("about", list.get(0).getAboutText());
                            TipDialog tipDialog = new TipDialog(Main_new.this);
                            tipDialog.showTip(""+list.get(0).getAboutText());
                        }
                    }
                }
            }
        });
    }

}
