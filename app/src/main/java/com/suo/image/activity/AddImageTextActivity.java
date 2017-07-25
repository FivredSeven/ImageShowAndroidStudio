package com.suo.image.activity;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.datatype.BmobFile;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.listener.UpdateListener;
import cn.bmob.v3.listener.UploadFileListener;

import com.suo.demo.R;
import com.suo.image.ImageApp;
import com.suo.image.activity.login.LoginActivity;
import com.suo.image.bean.ContentBean;
import com.suo.image.bean.UploadBean;
import com.suo.image.bean.UserInfo;
import com.suo.image.util.ImageUtils;
import com.suo.image.util.Log;
import com.suo.image.view.TipDialog;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class AddImageTextActivity extends BaseActivity {

	private EditText et_text;
	private TextView btn_back;
	private TextView btn_save;
	private ImageView iv_photo1;
	private ImageView iv_delete;

	private Dialog dialog;

	/* 头像名称 */
	private static final String IMAGE_FILE_NAME = "faceImage.jpg";
	/* 请求码 */
	private static final int IMAGE_REQUEST_CODE = 0;
	private static final int CAMERA_REQUEST_CODE = 1;
	@SuppressWarnings("unused")
	private static final int RESULT_REQUEST_CODE = 2;
	private String path;
	private TelephonyManager tm;
	private ProgressDialog proDialog;
	
	int count = 1;
	
	private UserInfo user;
	private ArrayList<ContentBean> listBeans;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_image_text);

		prepareData();

		initLayout();
	}
	
	@Override
    protected void onResume() {
        super.onResume();
        user = ImageApp.getInstance().getUserinfo();
    }

    private void prepareData() {
	    user = ImageApp.getInstance().getUserinfo();
	    if (user != null){
	        listBeans = user.getUploadIds();
	    }
		proDialog = new ProgressDialog(this);
		proDialog.setMessage("上传图文中..");
		tm = (TelephonyManager) this
				.getSystemService(Context.TELEPHONY_SERVICE);
	}

	private void initLayout() {
		et_text = (EditText) findViewById(R.id.et_text);
		btn_back = (TextView) findViewById(R.id.btn_back);
		btn_save = (TextView) findViewById(R.id.btn_save);
		iv_photo1 = (ImageView) findViewById(R.id.iv_photo1);
		iv_delete = (ImageView) findViewById(R.id.iv_delete);

		btn_back.setOnClickListener(this);
		btn_save.setOnClickListener(this);
		iv_photo1.setOnClickListener(this);
		iv_delete.setOnClickListener(this);
//		add();
//		uploadWords();
//		change();
		guanlian();
	}
	ArrayList<ContentBean> list;
//    private void change() {
//        list = new ArrayList<ContentBean>();
//        
//        BmobQuery<ContentBean> bmobQuery = new BmobQuery<ContentBean>();
//        bmobQuery.setLimit(1000);
//        bmobQuery.setSkip(2000);
//        bmobQuery.order("-id");
//        bmobQuery.findObjects(this, new FindListener<ContentBean>() {
//            @Override
//            public void onSuccess(List<ContentBean> object) {
//                list = (ArrayList<ContentBean>) object;
//                for (int i=0;i<list.size();i++){
//                    ContentBean bean = new ContentBean();
//                    bean = list.get(i);
//                    if (!TextUtils.isEmpty(bean.getZanCount())){
//                        bean.setZan(Integer.parseInt(bean.getZanCount()));
//                    }else{
//                        bean.setZan(0);
//                    }
//                    
//                    bean.update(AddImageTextActivity.this, bean.getObjectId(), new UpdateListener() {
//                        @Override
//                        public void onSuccess() {
//                            Log.e(""+count);
//                            count = count + 1;
//                        }
//                        
//                        @Override
//                        public void onFailure(int arg0, String arg1) {
//                            
//                        }
//                    });
//                }
//                
//            }
//
//            @Override
//            public void onError(int code, String msg) {
//                Log.e("查询失败：" + msg);
//            }
//        });
//    }

    @Override
	public void onClick(View v) {
		super.onClick(v);
		switch (v.getId()) {
		case R.id.iv_photo1:
			showUploadDialog();
			break;
		case R.id.btn_back:
			finish();
			break;
		case R.id.btn_save:
		    if (user == null){
		        launch(LoginActivity.class);
		        return;
		    }
			if (TextUtils.isEmpty(et_text.getText().toString())){
				showToast("加上点文字吧!");
				return;
			}
			if (TextUtils.isEmpty(path)){
				showToast("请添加图片吧!");
				return;
			}
			proDialog.show();
			Bitmap bmp = ImageUtils.decodeImage(path, AddImageTextActivity.this);
			try {
				String newPath = ImageUtils.saveBitmapToFile(bmp, path, ""+System.currentTimeMillis());
				if (!TextUtils.isEmpty(newPath)){
					path = newPath;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			uploadImage();
			break;
		case R.id.iv_delete:
			iv_photo1.setImageResource(R.drawable.upload_add_bg);
			iv_delete.setVisibility(View.GONE);
			break;

		default:
			break;
		}
	}
    
    //上传图片
    private void uploadImage(){
        final BmobFile bmobFile = new BmobFile(new File(path));
        bmobFile.uploadblock(new UploadFileListener() {
			@Override
			public void done(BmobException e) {
				if (e == null) {
					Log.e("上传图文成功:" + bmobFile.getFileUrl());
					insertUploadBean(bmobFile);
				} else {
					if (proDialog.isShowing()){
						proDialog.dismiss();
					}
					TipDialog tipDialog = new TipDialog(AddImageTextActivity.this);
					tipDialog.showTip("上传失败,请检查网络是否稳定.");
				}
			}
        });
    }

    //在UploadBean表中插入数据
    private void insertUploadBean(final BmobFile bmobFile){
        UploadBean upBean = new UploadBean();
        if (user != null){
            upBean.setUserId(user.getUserId());
            upBean.setUserHeadPhoto(user.getHeadPhoto());
        }
        upBean.setPath("" + bmobFile.getFileUrl());
        upBean.setText("" + et_text.getText().toString());
        upBean.setUserinfo("手机号：" + tm.getLine1Number() + "|手机型号:"
                + android.os.Build.MODEL + "|系统版本:"
                + android.os.Build.VERSION.RELEASE + "|手机串号IMEI:"
                + tm.getSimSerialNumber());
        upBean.save(new SaveListener<String>() {
			@Override
			public void done(String o, BmobException e) {
				if (e == null) {
					if (proDialog.isShowing()){
						proDialog.dismiss();
					}
					if (user != null){
						updateUserInfo(bmobFile);
					}
				} else {
					// 添加失败
					if (proDialog.isShowing()){
						proDialog.dismiss();
					}
					TipDialog tipDialog = new TipDialog(AddImageTextActivity.this);
					tipDialog.showTip("上传失败,请检查网络是否稳定.");
				}
			}
        });
    }
    
    //更新userinfo表中数据
    private void updateUserInfo(BmobFile bmobFile){
        if (listBeans == null){
            listBeans = new ArrayList<ContentBean>();
        }
        ContentBean bean = new ContentBean();
        bean.setContentText(""+et_text.getText().toString());
        bean.setContentUrl(""+bmobFile.getFileUrl());
        listBeans.add(bean);
        
        user.setUploadIds(listBeans);
        user.update(user.getObjectId(), new UpdateListener() {
			@Override
			public void done(BmobException e) {
				if (e == null) {
					ImageApp.getInstance().setUserinfo(user);
					TipDialog tipDialog = new TipDialog(AddImageTextActivity.this);
					tipDialog.showTip("上传成功啦,现在可以去个人主页查看已上传的图片咯.请耐心等待审核后即可让其他人看见哟.");
					tipDialog.setOnDismissListener(new OnDismissListener() {
						@Override
						public void onDismiss(DialogInterface dialog) {
							finish();
						}
					});
				} else {
					if (proDialog.isShowing()){
						proDialog.dismiss();
					}
					TipDialog tipDialog = new TipDialog(AddImageTextActivity.this);
					tipDialog.showTip("上传失败,请检查网络是否稳定.");
				}
			}
        });
    }
    
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
//				path = getPath(data.getData());
				path = ImageUtils.getPath(this, data.getData());
				iv_photo1.setImageBitmap(ImageUtils.getBitmapFromPath(path));
				iv_delete.setVisibility(View.VISIBLE);
				
				break;
			case CAMERA_REQUEST_CODE:
				File tempFile = new File(
						Environment.getExternalStorageDirectory(),
						IMAGE_FILE_NAME);
				path = tempFile.toString();
				iv_photo1.setImageBitmap(ImageUtils.getBitmapFromPath(path));
				iv_delete.setVisibility(View.VISIBLE);
				break;
			}
		}
	}

	@SuppressWarnings("deprecation")
	public String getPath(Uri uri) {
		String[] projection = { MediaStore.Images.Media.DATA };
		Cursor cursor = AddImageTextActivity.this.managedQuery(uri, projection,
				null, null, null);
		int column_index = cursor
				.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
		cursor.moveToFirst();
		return cursor.getString(column_index);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		if (proDialog.isShowing()){
    		proDialog.dismiss();
    	}
	}
	
	private void add(){
//	    ImageBean imageBean = new ImageBean();
//	    imageBean.setImageId(247);
//	    imageBean.setImageUrl("http://file.bmob.cn/M00/DB/C3/oYYBAFSNepSAYnqoAABaySdz31I888.jpg");
//	    imageBean.setImageText("向来缘浅，奈何情深");
//	    imageBean.setType("2");
//	    imageBean.save(AddImageTextActivity.this, new SaveListener() {
//            @Override
//            public void onSuccess() {
//                showToast("上传图文成功");
//                if (proDialog.isShowing()){
//                    proDialog.dismiss();
//                }
//            }
//            @Override
//            public void onFailure(int code, String arg0) {
//                showToast("上传图文失败");
//                if (proDialog.isShowing()){
//                    proDialog.dismiss();
//                }
//            }
//        });
	    
	    ContentBean contentBean = new ContentBean();
	    contentBean.setImageId(247);
	    contentBean.setContentId(10);
	    contentBean.setContentUrl("http://file.bmob.cn/M00/DB/D5/oYYBAFSOL6KAfP2TAARMbwDjuwE679.jpg");
	    contentBean.setContentText("       和你在一起再多黑暗都是阳光");
	    contentBean.setId(1002450);
	    contentBean.setZanCount("0");
	    contentBean.save(new SaveListener<String>() {
			@Override
			public void done(String o, BmobException e) {
				if (e == null) {
					showToast("上传图文成功");
					if (proDialog.isShowing()){
						proDialog.dismiss();
					}
					finish();
				} else {
					showToast("上传图文失败");
					if (proDialog.isShowing()){
						proDialog.dismiss();
					}
				}
			}
        });
	}
	
	@SuppressWarnings("unused")
	private void uploadWords(){
		String path2 = ImageUtils.image_path + "是否会想起.txt";
		final BmobFile bmobFile = new BmobFile(new File(path2));
		bmobFile.uploadblock(new UploadFileListener() {
			@Override
			public void done(BmobException e) {
				if (e == null) {
					UploadBean upBean = new UploadBean();
					upBean.setPath("" + bmobFile.getFileUrl());
					upBean.save(new SaveListener<String>() {
						@Override
						public void done(String o, BmobException e) {
							if (e == null) {
								showToast("上传图文成功");
								finish();
							} else {
								// 添加失败
								showToast("上传图文失败");
							}
						}

					});
				} else {
					showToast("上传图文失败：" + e.getMessage());
				}
			}
		});
	}
	
	ArrayList<UserInfo> userList = new ArrayList<UserInfo>();
	ArrayList<ContentBean> cbList = new ArrayList<ContentBean>();
	int i=0;
	int j=0;
	private void guanlian(){
		BmobQuery<UserInfo> query = new BmobQuery<UserInfo>();
		query.setLimit(2);
		query.addWhereExists("uploadIds");
		query.order("-updatedAt");
		query.findObjects(new FindListener<UserInfo>() {
			@Override
			public void done(List<UserInfo> list, BmobException e) {
				if (e == null) {
					userList = (ArrayList<UserInfo>) list;
					for (;i<list.size();i++){
						cbList = list.get(i).getUploadIds();

						set(i,0);
					}
				}
			}
		});
	}
	
	private void set(final int i, final int pos){
		BmobQuery<ContentBean> bq = new BmobQuery<ContentBean>();
		bq.setLimit(1);
		bq.addWhereEqualTo("contentUrl", cbList.get(j).getContentUrl());
		bq.findObjects(new FindListener<ContentBean>() {
			@Override
			public void done(List<ContentBean> list, BmobException e) {
				if (e == null) {
					if(list!=null && list.size()>0){
						cbList.get(pos).setImageId(list.get(0).getImageId());
						cbList.get(pos).setContentId(list.get(0).getContentId());
						cbList.get(pos).setId(list.get(0).getId());
						cbList.get(pos).setZan(list.get(0).getZan());
						cbList.get(pos).setUserId(list.get(0).getUserId());
						userList.get(i).setUploadIds(cbList);
						userList.get(i).update(new UpdateListener() {
							@Override
							public void done(BmobException e) {
								if (e == null) {
									Log.e("处理成功");
									while(pos < (cbList.size()-1)){
										set(i, pos+1);
									}
								}
							}
						});
					}else{
						Log.e("未查到数据，可能还未通过审核");
					}
				}
			}
		});
	}

}
