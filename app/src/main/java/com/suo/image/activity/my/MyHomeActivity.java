/*
 * Copyright (C), 2014-2015, 联创车盟汽车服务有限公司
 * FileName: MyHomeActivity.java
 * Author:   wuhq
 * Date:     2015年1月28日 上午9:42:05
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.suo.image.activity.my;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import net.tsz.afinal.FinalBitmap;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnDismissListener;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.text.TextUtils;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;

import com.bumptech.glide.Glide;
import com.suo.demo.R;
import com.suo.image.ImageApp;
import com.suo.image.activity.AddImageTextActivity;
import com.suo.image.activity.BaseActivity;
import com.suo.image.activity.HotContentActivity;
import com.suo.image.activity.Main_new;
import com.suo.image.adapter.ArrayListAdapter;
import com.suo.image.adapter.ViewHolder;
import com.suo.image.bean.ContentBean;
import com.suo.image.bean.UserInfo;
import com.suo.image.util.Density;
import com.suo.image.util.ImageLoaderUtil;
import com.suo.image.util.ImageUtils;
import com.suo.image.util.Log;
import com.suo.image.util.Preference;
import com.suo.image.view.RoundImageView;
import com.suo.image.view.TipDialog;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobFile;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.UpdateListener;
import cn.bmob.v3.listener.UploadFileListener;

/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author wuhq
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class MyHomeActivity extends BaseActivity {

    private Button btn_back;
    private Button btn_logout;
    private TextView tv_uploads;
    private TextView tv_likes;
    private TextView tv_nickname;
    private RoundImageView iv_head;
    private ViewPager mPager;// 页卡内容
    private List<View> listViews; // Tab页面列表
    private int curPositon = 0;
    
    private ImageView cursor;// 动画图片
    private int offset = 0;// 动画图片偏移量
    private int currIndex = 0;// 当前页卡编号
    private int bmpW;// 动画图片宽度
    
    private UploadAdapter adapter;
    private LikeAdapter adapter2;
    private UserInfo user;
    private int uploadSize = 0;
    private int likeSize = 0;
    private String type;
    private String userId;
    
    private ArrayList<ContentBean> uploadList;
    private ArrayList<ContentBean> likeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_home);
        
        initLayout();
        prepareData();
        
    }
    
    private void initLayout(){
        btn_back = (Button) findViewById(R.id.btn_back);
        btn_logout = (Button) findViewById(R.id.btn_logout);
        tv_uploads = (TextView) findViewById(R.id.tv_uploads);
        tv_likes = (TextView) findViewById(R.id.tv_likes);
        iv_head = (RoundImageView) findViewById(R.id.iv_head);
        tv_nickname = (TextView) findViewById(R.id.tv_nickname);
        btn_back.setOnClickListener(this);
        btn_logout.setOnClickListener(this);
        tv_uploads.setOnClickListener(this);
        tv_likes.setOnClickListener(this);
        iv_head.setOnClickListener(this);
        tv_nickname.setOnClickListener(this);
    }
    
    private void prepareData() {
        adapter = new UploadAdapter(this);
        adapter2 = new LikeAdapter(this);
        
        type = getIntent().getStringExtra("type");
        userId = getIntent().getStringExtra("userId");
        if (!TextUtils.isEmpty(type) && type.equals("others")){
            btn_logout.setVisibility(View.GONE);
            tv_uploads.setText("上传");
            tv_likes.setText("收藏");
            BmobQuery<UserInfo> query = new BmobQuery<UserInfo>();
            query.addWhereEqualTo("userId", userId);
            query.findObjects(new FindListener<UserInfo>() {
                @Override
                public void done(List<UserInfo> list, BmobException e) {
                    if (e == null && list!=null && list.size()>0){
                        user = list.get(0);
                        tv_nickname.setText(""+list.get(0).getNickname());
//                        ImageLoaderUtil.getInstance().displayImage(list.get(0).getHeadPhoto(), iv_head, R.drawable.default_headphoto);
                        ImageLoaderUtil.getInstance().loadImageByGlide(list.get(0).getHeadPhoto(), iv_head, R.drawable.default_headphoto);
                        if (user !=null ){
                            uploadList = user.getUploadIds();
                            likeList = user.getLikeIds();
                            if (uploadList!=null && uploadList.size()>0){
                                uploadSize = uploadList.size();
                            }
                            if (likeList!=null && likeList.size()>0){
                                likeSize = likeList.size();
                            }
                        }
                        InitImageView();
                        InitViewPager();
                    }
                }
            });
        }else{
            user = ImageApp.getInstance().getUserinfo();
            uploadList = user.getUploadIds();
        	likeList = user.getLikeIds();
            if (user !=null ){
                if (uploadList!=null && uploadList.size()>0){
                    uploadSize = uploadList.size();
                }
                if (likeList!=null && likeList.size()>0){
                    likeSize = likeList.size();
                }
            }
            if (!TextUtils.isEmpty(user.getHeadPhoto())){
                ImageLoaderUtil.getInstance().loadImageByGlide(user.getHeadPhoto(), iv_head, R.drawable.icon);
//                ImageLoaderUtil.getInstance().displayImage(user.getHeadPhoto(), iv_head, R.drawable.icon);
            }
            tv_nickname.setText(""+user.getNickname());
            InitImageView();
            InitViewPager();
        }
    }

    /**
     * 初始化动画
     */
    private void InitImageView() {
        cursor = (ImageView) findViewById(R.id.cursor);
        cursor.setLayoutParams(new LayoutParams(Density.getSceenWidth(this) / 2, LayoutParams.WRAP_CONTENT));
        bmpW = BitmapFactory.decodeResource(getResources(),
                R.drawable.my_home_line).getWidth();// 获取图片宽度
        offset = (Density.getSceenWidth(this) / 2 - bmpW) / 2;// 计算偏移量
        Matrix matrix = new Matrix();
        matrix.postTranslate(offset, 0);
        cursor.setImageMatrix(matrix);// 设置动画初始位置
    }

    private void InitViewPager() {
        mPager = (ViewPager) findViewById(R.id.vPager);
        listViews = new ArrayList<View>();
        LayoutInflater mInflater = getLayoutInflater();
        listViews.add(mInflater.inflate(R.layout.my_viewpager_upload, null));
        listViews.add(mInflater.inflate(R.layout.my_viewpager_like, null));
        mPager.setAdapter(new MyPagerAdapter(listViews));
        mPager.setOnPageChangeListener(new MyOnPageChangeListener());
        mPager.setCurrentItem(0);
    }
    
    /**
     * ViewPager适配器
     */
    public class MyPagerAdapter extends PagerAdapter {
        public List<View> mListViews;
        public int mCount;

        public MyPagerAdapter(List<View> mListViews) {
            this.mListViews = mListViews;
            mCount = mListViews.size();
        }

        public void destroyItem(View collection, int position, Object arg2) {
            ((ViewPager) collection).removeView(mListViews.get(position));
        }

        public void finishUpdate(View arg0) {
        }

        public int getCount() {
            return mListViews.size();
        }

        public Object instantiateItem(View collection, int position) {
            try {
                ((ViewPager) collection).addView(mListViews.get(position), 0);
            } catch (Exception e) {
            }
            
            if (position == 0){
                GridView gv_pic = (GridView)collection.findViewById(R.id.gv_pic);
                
                if (user!=null && uploadList!= null && uploadList.size()>0){
                    if (uploadSize >=4){
                        gv_pic.setNumColumns(4);
                    }else{
                        gv_pic.setNumColumns(uploadSize);
                    }
                    
                    adapter.setList(uploadList);
                    gv_pic.setAdapter(adapter);
                }
            }else if (position == 1){
                GridView gv_pic = (GridView)collection.findViewById(R.id.gv_pic);
                
                if (user!=null && likeList!= null && likeList.size()>0){
                    if (likeSize >=4){
                        gv_pic.setNumColumns(4);
                    }else{
                        gv_pic.setNumColumns(likeSize);
                    }
                    
                    adapter2.setList(likeList);
                    gv_pic.setAdapter(adapter2);
                }
            }
            
            

            return mListViews.get(position);
        }

        public boolean isViewFromObject(View arg0, Object arg1) {
            return arg0 == (arg1);
        }

        public void restoreState(Parcelable arg0, ClassLoader arg1) {
        }

        public Parcelable saveState() {
            return null;
        }

        public void startUpdate(View arg0) {
        }
    }

    /**
     * 页卡切换监听
     */
    public class MyOnPageChangeListener implements OnPageChangeListener {

        public void onPageSelected(int arg0) {
            int one = offset * 2 + bmpW;// 页卡1 -> 页卡2 偏移量
            int two = one * 2;// 页卡1 -> 页卡3 偏移量
            Animation animation = null;

            switch (arg0) {
            case 0:
                curPositon = 0;
                if (currIndex == 1) {
                    animation = new TranslateAnimation(one, 0, 0, 0);
                } 
                break;
            case 1:
                curPositon = 1;
                if (currIndex == 0) {
                    animation = new TranslateAnimation(offset, one, 0, 0);
                } 
                break;
            }
            currIndex = arg0;
            animation.setFillAfter(true);// True:图片停在动画结束位置
            animation.setDuration(300);
            cursor.startAnimation(animation);

        }

        public void onPageScrolled(int arg0, float arg1, int arg2) {
        }

        public void onPageScrollStateChanged(int arg0) {
        }
    }
    
    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()) {
            case R.id.btn_back:
                finish();
                break;
            case R.id.tv_uploads:
                mPager.setCurrentItem(0);
                break;
            case R.id.tv_likes:
                mPager.setCurrentItem(1);
                break;
            case R.id.btn_logout:
                new AlertDialog.Builder(this).setTitle("提示").setMessage("确定要注销吗?").setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        BmobUser.logOut();
                        ImageApp.getInstance().setUserinfo(null);
                        Preference.putString("password", "");
                        Preference.putString("about", "");
                        Preference.putString("token", "");
                        Preference.putString("expires", "");
                        Preference.putString("openId", "");
                        Preference.putString("qqinfo", "");
                        finish();
                    }
                }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).show();
                
                break;
            case R.id.tv_nickname:
            	final EditText et = new EditText(this);
            	new AlertDialog.Builder(this).setMessage("确定要修改你的昵称么?")
            		.setView(et)
            		.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String input = et.getText().toString();  
                        if (!TextUtils.isEmpty(input)) {  
                        	dialog.dismiss();
                        	updateUserName(input, "");
                        } 
                    }
                }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).show();
            	break;
            case R.id.iv_head:
            	showUploadDialog();
            	break;
            default:
                break;
        }
    }

    class UploadAdapter extends ArrayListAdapter<ContentBean> {

        private BaseActivity context;

        public UploadAdapter(BaseActivity context) {
            super(context);
            this.context = context;
        }

        public UploadAdapter(BaseActivity context, ListView listView) {
            super(context, listView);
            this.context = context;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(context).inflate(R.layout.my_upload_item, parent, false);
            }

            ImageView image_grid = ViewHolder.get(convertView, R.id.image_grid);

            if (uploadSize>=4){
                int width = Density.getSceenWidth(MyHomeActivity.this)/4;
                image_grid.setLayoutParams(new LayoutParams(width, width));
            }else{
                int width = Density.getSceenWidth(MyHomeActivity.this)/uploadSize;
                image_grid.setLayoutParams(new LayoutParams(width, width));
            }
            
            final ContentBean bean = (ContentBean) getItem(position);
            ImageLoaderUtil.getInstance().loadImageByGlide(bean.getContentUrl(), image_grid, R.drawable.default_image);
//            fb.display(image_grid, bean.getContentUrl());
            
            image_grid.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MyHomeActivity.this, HotContentActivity.class);
                    intent.putExtra("position", position);
                    intent.putExtra("contentBean", bean);
                    intent.putExtra("contentBeanList", uploadList);
                    intent.putExtra("type", "myUploads");
                    launch(intent);
                }
            });
            //自己的主页
            if (TextUtils.isEmpty(type)){
            	image_grid.setOnLongClickListener(new OnLongClickListener() {
    				@Override
    				public boolean onLongClick(View v) {
    					new AlertDialog.Builder(context).setMessage("确定要删除么？").setPositiveButton("确定", new DialogInterface.OnClickListener() {
    						@Override
    						public void onClick(DialogInterface dialog, int which) {
    							dialog.dismiss();
    							uploadList.remove(position);
    							user.setUploadIds(uploadList);
    							user.update(user.getObjectId(), new UpdateListener() {
                                    @Override
                                    public void done(BmobException e) {
                                        if (e == null) {
                                            ImageApp.getInstance().setUserinfo(user);
                                            prepareData();
                                        }
                                    }
    					        });
    						}
    					}).setNegativeButton("取消", new DialogInterface.OnClickListener() {
    						@Override
    						public void onClick(DialogInterface dialog, int which) {
    							dialog.dismiss();
    						}
    					}).show();
    					return false;
    				}
    			});
            }
            return convertView;
        }

    }
    
    class LikeAdapter extends ArrayListAdapter<ContentBean> {

        private BaseActivity context;

        public LikeAdapter(BaseActivity context) {
            super(context);
            this.context = context;
        }

        public LikeAdapter(BaseActivity context, ListView listView) {
            super(context, listView);
            this.context = context;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(context).inflate(R.layout.my_upload_item, parent, false);
            }

            ImageView image_grid = ViewHolder.get(convertView, R.id.image_grid);

            if (likeSize>=4){
                int width = Density.getSceenWidth(MyHomeActivity.this)/4;
                image_grid.setLayoutParams(new LayoutParams(width, width));
            }else{
                int width = Density.getSceenWidth(MyHomeActivity.this)/likeSize;
                image_grid.setLayoutParams(new LayoutParams(width, width));
            }
            
            final ContentBean bean = (ContentBean) getItem(position);
            ImageLoaderUtil.getInstance().loadImageByGlide(bean.getContentUrl(), image_grid, R.drawable.default_image);
            image_grid.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MyHomeActivity.this, HotContentActivity.class);
                    intent.putExtra("position", position);
                    intent.putExtra("contentBean", bean);
                    intent.putExtra("contentBeanList", likeList);
                    intent.putExtra("type", "myLikes");
                    launch(intent);
                }
            });
            return convertView;
        }

    }
    
    private void updateUserName(String name, String headPhoto) {
    	if (!TextUtils.isEmpty(name)) {
    		user.setNickname(name);
    	}
    	
    	if (!TextUtils.isEmpty(headPhoto)) {
    		user.setHeadPhoto(headPhoto);
    	}
    	
    	user.update(user.getObjectId(), new UpdateListener() {
            @Override
            public void done(BmobException e) {
                if (e == null) {
                    if (proDialog.isShowing()){
                        proDialog.dismiss();
                    }
                    tv_nickname.setText(user.getNickname());
                    ImageApp.getInstance().setUserinfo(user);
                    showToast("修改成功");
                } else {
                    if (proDialog.isShowing()){
                        proDialog.dismiss();
                    }
                    showToast("修改失败,请检查网络是否稳定.");
                }
            }
        });
    }
    
    private Dialog dialog;
    /* 头像名称 */
	private static final String IMAGE_FILE_NAME = "faceImage.jpg";
	/* 请求码 */
	private static final int IMAGE_REQUEST_CODE = 0;
	private static final int CAMERA_REQUEST_CODE = 1;
	@SuppressWarnings("unused")
	private static final int RESULT_REQUEST_CODE = 2;
	private String path;
	private ProgressDialog proDialog;
    
    @SuppressWarnings("deprecation")
	private void showUploadDialog() {
		LayoutInflater inflater = LayoutInflater.from(this);
		View view = inflater.inflate(R.layout.upload_picture, null);
		TextView upload_camera = (TextView) view
				.findViewById(R.id.upload_camera);
		TextView upload_image = (TextView) view.findViewById(R.id.upload_image);
		TextView upload_cancel = (TextView) view
				.findViewById(R.id.upload_cancel);
		dialog = new Dialog(this, R.style.upload_dialog);
		dialog.setCanceledOnTouchOutside(true);
		dialog.setContentView(view);
		dialog.show();
		WindowManager windowManager = getWindowManager();
		Display display = windowManager.getDefaultDisplay();
		WindowManager.LayoutParams lp = dialog.getWindow().getAttributes();
		lp.width = (int) (display.getWidth()); // 设置宽度
		dialog.getWindow().setAttributes(lp);
		upload_cancel.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				dialog.dismiss();
			}
		});
		upload_camera.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				dialog.dismiss();
				Intent intentFromCapture = new Intent(
						MediaStore.ACTION_IMAGE_CAPTURE);
				intentFromCapture.putExtra(
						MediaStore.EXTRA_OUTPUT,
						Uri.fromFile(new File(Environment
								.getExternalStorageDirectory(), IMAGE_FILE_NAME)));
				startActivityForResult(intentFromCapture, CAMERA_REQUEST_CODE);
			}
		});
		upload_image.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				dialog.dismiss();
				Intent intentFromGallery = new Intent();
				intentFromGallery.setType("image/*"); // 设置文件类型
				intentFromGallery.setAction(Intent.ACTION_GET_CONTENT);
				startActivityForResult(intentFromGallery, IMAGE_REQUEST_CODE);
			}
		});
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		// 结果码不等于取消时候
		if (resultCode != 0) {
			switch (requestCode) {
			case IMAGE_REQUEST_CODE:
				path = getPath(data.getData());
				break;
			case CAMERA_REQUEST_CODE:
				File tempFile = new File(
						Environment.getExternalStorageDirectory(),
						IMAGE_FILE_NAME);
				path = tempFile.toString();
				break;
			}
			proDialog = new ProgressDialog(this);
			proDialog.setMessage("修改头像中..");
			proDialog.show();
			Bitmap bmp = ImageUtils.decodeImage(path, MyHomeActivity.this);
			try {
				String newPath = ImageUtils.saveBitmapToFile(bmp, path, ""+System.currentTimeMillis());
				if (!TextUtils.isEmpty(newPath)){
					path = newPath;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			uploadImage();
		}
	}

	@SuppressWarnings("deprecation")
	public String getPath(Uri uri) {
		String[] projection = { MediaStore.Images.Media.DATA };
		Cursor cursor = MyHomeActivity.this.managedQuery(uri, projection,
				null, null, null);
		int column_index = cursor
				.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
		cursor.moveToFirst();
		return cursor.getString(column_index);
	}
	
	//上传图片
    private void uploadImage(){
        final BmobFile bmobFile = new BmobFile(new File(path));
        bmobFile.uploadblock(new UploadFileListener() {
            @Override
            public void done(BmobException e) {
                if (e == null) {
                    Log.e("上传图文成功:" + bmobFile.getFileUrl());
                    iv_head.setImageBitmap(ImageUtils.getBitmapFromPath(path));
                    updateUserName("", bmobFile.getFileUrl());
                } else {
                    if (proDialog.isShowing()){
                        proDialog.dismiss();
                    }
                    TipDialog tipDialog = new TipDialog(MyHomeActivity.this);
                    tipDialog.showTip("上传失败,请检查网络是否稳定.");
                }
            }
        });
    }
}
