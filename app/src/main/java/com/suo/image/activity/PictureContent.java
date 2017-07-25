package com.suo.image.activity;//package com.suo.image.activity;
//
//import java.io.BufferedOutputStream;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import net.tsz.afinal.FinalBitmap;
//import com.sina.weibo.sdk.api.share.BaseResponse;
//import com.sina.weibo.sdk.api.share.IWeiboHandler;
//import com.sina.weibo.sdk.api.share.IWeiboShareAPI;
//import com.sina.weibo.sdk.constant.WBConstants;
//import com.suo.demo.R;
//import com.suo.image.adapter.MyGalleryAdapter;
//import com.suo.image.img.ImageUrl;
//import com.suo.image.share.QQZoneUtil;
//import com.suo.image.share.WeiboUtil;
//import com.suo.image.util.Log;
//import com.suo.image.util.Pub;
//import com.suo.image.view.MyGallery;
//import android.annotation.SuppressLint;
//import android.app.Activity;
//import android.app.Dialog;
//import android.app.ProgressDialog;
//import android.app.WallpaperManager;
//import android.content.Intent;
//import android.graphics.Bitmap;
//import android.graphics.Canvas;
//import android.graphics.PixelFormat;
//import android.graphics.drawable.BitmapDrawable;
//import android.graphics.drawable.Drawable;
//import android.os.Bundle;
//import android.os.Environment;
//import android.os.Handler;
//import android.os.Message;
//import android.view.Gravity;
//import android.view.View;
//import android.view.Window;
//import android.view.WindowManager;
//import android.view.View.OnClickListener;
//import android.widget.AdapterView;
//import android.widget.ImageButton;
//import android.widget.LinearLayout;
//import android.widget.RelativeLayout;
//import android.widget.TextView;
//import android.widget.Toast;
//import android.widget.AdapterView.OnItemClickListener;
//import android.widget.AdapterView.OnItemSelectedListener;
//
//public class PictureContent extends BaseActivity implements IWeiboHandler.Response 
//{
//
//	private MyGallery gallery;
//
//	private MyGalleryAdapter adapter;
//	
//	private int position = 0;
//	
////	private String[] urlList = new String[5];
//	private List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();
//	
//	private ImageUrl data;
//	
//	private RelativeLayout layoutHeader;
//	private ImageButton back;
//	private ImageButton image_share;
//	private TextView newsContent;
//	private TextView top_title;
//	private String title ="";
//	private boolean click = true;
//	private Dialog dialog;
//	private static final int TV = 0, TV1 = 1, TV2 = 2, TV3 = 3, TV4 = 4;
//	private ProgressDialog progressDialog;
//	private FinalBitmap fb;
//	
//	private boolean isShow = false;
//	
//	private String text;
//	
//	private WeiboUtil weiboUtil;
//	private QQZoneUtil qqZoneUtil;
//    
//	@Override
//	protected void onCreate(Bundle savedInstanceState)
//	{
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.news_picture);
//		findViews();
//		init();
//		if (savedInstanceState != null) {
//            weiboUtil.handleWeiboResponse(getIntent(), this);
//        }
//	}
//
//	private void findViews()
//	{
//		gallery = (MyGallery) findViewById(R.id.picGallery);
//	}
//
//	private void init()
//	{
//		//初始化微博 
//		weiboUtil = new WeiboUtil(this);
//		//初始化qq空间
//		qqZoneUtil = new QQZoneUtil(this);
////		AppConnect.getInstance(this).initPopAd(this);
//		fb = FinalBitmap.create(this);
//		fb.configLoadingImage(R.drawable.default_image);
//		position = getIntent().getIntExtra("position", 0);
//		title = getIntent().getStringExtra("title");
//		data = new ImageUrl(this);
//		listItems = data.getImageObj2(position);
//		
//		layoutHeader = (RelativeLayout) findViewById(R.id.layoutHeader);
//		back = (ImageButton) findViewById(R.id.back);
//		image_share = (ImageButton) findViewById(R.id.share);
//		newsContent = (TextView) findViewById(R.id.newsContent);
//		top_title = (TextView) findViewById(R.id.text);
//		top_title.setText(""+title);
//		newsContent.setText(""+title);
//		back.setOnClickListener(new OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				finish();
//			}
//		});
//		
//		image_share.setOnClickListener(new OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				choseNewsDialog();
//			}
//		});
//		
//		gallery.setOnItemClickListener(new OnItemClickListener() {
//			@Override
//			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
//					long arg3) {
//				if(click){
//					layoutHeader.setVisibility(View.GONE);
//					newsContent.setVisibility(View.GONE);
//				}else{
//					layoutHeader.setVisibility(View.VISIBLE);
//					newsContent.setVisibility(View.VISIBLE);
//				}
//				click = !click;
//			}
//		});
//		gallery.setOnItemSelectedListener(new OnItemSelectedListener()
//		{
//			@Override
//			public void onItemSelected(AdapterView<?> arg0, View arg1,
//					int arg2, long arg3) {
//				position = arg2;
//				text = (String) listItems.get(arg2).get("text");
//				newsContent.setText("		"+text);
////				if (Pub.isWifi(PictureContent.this)){
////					if(arg2 == (listItems.size()-1) && !isShow)
////					{
////						AppConnect.getInstance(PictureContent.this).showPopAd(PictureContent.this);
////						isShow = true;
////					}
////				}
//				Log.e("position:" + position);
//			}
//			@Override
//			public void onNothingSelected(AdapterView<?> arg0) {
//				
//			}
//		});
//		adapter = new MyGalleryAdapter(this, listItems, fb);
//		gallery.setAdapter(adapter);
//	}
//	
//	private void choseNewsDialog() {
//		dialog = new Dialog(this, R.style.KADialog1);
//
//		dialog.setContentView(R.layout.share);
//		dialog.setCanceledOnTouchOutside(true);
//		Window window = dialog.getWindow();
//		window.setBackgroundDrawableResource(R.color.dialog_transparent);
//		window.setGravity(Gravity.TOP);
//		WindowManager.LayoutParams params = window.getAttributes();
//		params.width = MainActivity.width * 2 / 5;
//		params.x = MainActivity.width / 2 - params.width / 2 - 2;// ����x���
//		window.setAttributes(params);
//
//		LinearLayout tv, tv1, tv2, tv3, tv4;
//		tv = (LinearLayout) dialog.findViewById(R.id.tv);
//		tv.setOnClickListener(new ChoseNewsClick2(TV));
//
//		tv1 = (LinearLayout) dialog.findViewById(R.id.tv1);
//		tv1.setVisibility(View.GONE);
//		tv1.setOnClickListener(new ChoseNewsClick2(TV1));
//		
//		tv2 = (LinearLayout) dialog.findViewById(R.id.tv2);
//		tv2.setVisibility(View.VISIBLE);
//		tv2.setOnClickListener(new ChoseNewsClick2(TV2));
//		
//		tv3 = (LinearLayout) dialog.findViewById(R.id.tv3);
//		tv3.setVisibility(View.VISIBLE);
//		tv3.setOnClickListener(new ChoseNewsClick2(TV3));
//		
//		tv4 = (LinearLayout) dialog.findViewById(R.id.tv4);
//		tv4.setVisibility(View.VISIBLE);
//		tv4.setOnClickListener(new ChoseNewsClick2(TV4));
//		
//		dialog.show();
//	}
//
//	class ChoseNewsClick2 implements OnClickListener {
//		private int what;
//
//		public ChoseNewsClick2(int what) {
//			this.what = what;
//		}
//
//		public void onClick(View v) {
//
//			switch (what) {
//			case TV:
//				dialog.dismiss();
//				return;
//			case TV1:
//				progressDialog = new ProgressDialog(PictureContent.this);
//				progressDialog.setTitle("提示");
//				progressDialog.setMessage("请稍候");
//				progressDialog.show();
//				new Thread(){
//					public void run()
//				    {
//						Drawable d = Pub.getLocalDrawable(PictureContent.this, (String)listItems.get(position).get("url"));
//						Bitmap bmp = drawableToBitmap(d);
//						putWallpaper(bmp);
//				    }
//				}.start();
//				break;
//			case TV2:
//				//����
//				int position = gallery.getSelectedItemPosition();
//				String url = (String) listItems.get(position).get("url");
//				Drawable drawable;
//				if (url != null && !url.equals("")) {
//					Pub.downloadDrawableByUrl(PictureContent.this, url);
//					drawable = Pub.getLocalDrawable(PictureContent.this, url);
//					BitmapDrawable bd = (BitmapDrawable) drawable;
//					if(bd != null){
//						Bitmap bm = bd.getBitmap();
//						try {
//							saveFile(bm, "" + System.currentTimeMillis());
//						} catch (IOException e) {
//							e.printStackTrace();
//						}
//					}
//				}
//				break;
//			case TV3:
//                weiboUtil.registerApp();
//                if (weiboUtil.checkEnvironment(true))
//                {
//                	int position2 = gallery.getSelectedItemPosition();
//            		String url2 = (String) listItems.get(position2).get("url");
//                	weiboUtil.sendMessage(true, true, text, url2);
//                }
//				break;
//				
//			case TV4:
//				int position3 = gallery.getSelectedItemPosition();
//        		String url3 = (String) listItems.get(position3).get("url");
//				qqZoneUtil.doShareToQzone(text, url3);
//				break;
//			}
//
//			dialog.dismiss();
//		}
//	}
//	
//	/**
//     * 接收微客户端博请求的数据。
//     * 当微博客户端唤起当前应用并进行分享时，该方法被调用。
//     * 
//     * @param baseRequest 微博请求数据对象
//     * @see {@link IWeiboShareAPI#handleWeiboRequest}
//     */
//    @Override
//    public void onResponse(BaseResponse baseResp) {
//        switch (baseResp.errCode) {
//        case WBConstants.ErrorCode.ERR_OK:
//            Toast.makeText(this, R.string.weibosdk_demo_toast_share_success, Toast.LENGTH_LONG).show();
//            break;
//        case WBConstants.ErrorCode.ERR_CANCEL:
//            Toast.makeText(this, R.string.weibosdk_demo_toast_share_canceled, Toast.LENGTH_LONG).show();
//            break;
//        case WBConstants.ErrorCode.ERR_FAIL:
//            Toast.makeText(this, 
//                    getString(R.string.weibosdk_demo_toast_share_failed) + "Error Message: " + baseResp.errMsg, 
//                    Toast.LENGTH_LONG).show();
//            break;
//        }
//    }
//    
//    /**
//     * @see {@link Activity#onNewIntent}
//     */	
//    @Override
//    protected void onNewIntent(Intent intent) {
//        super.onNewIntent(intent);
//        
//        // 从当前应用唤起微博并进行分享后，返回到当前应用时，需要在此处调用该函数
//        // 来接收微博客户端返回的数据；执行成功，返回 true，并调用
//        // {@link IWeiboHandler.Response#onResponse}；失败返回 false，不调用上述回调
//        weiboUtil.handleWeiboResponse(intent, this);
//    }
//	
//	
//	
//	public static Bitmap drawableToBitmap(Drawable drawable) {  
//        // ȡ drawable �ĳ���  
//        int w = drawable.getIntrinsicWidth();  
//        int h = drawable.getIntrinsicHeight();  
//  
//        // ȡ drawable ����ɫ��ʽ  
//        Bitmap.Config config = drawable.getOpacity() != PixelFormat.OPAQUE ? Bitmap.Config.ARGB_8888  
//                : Bitmap.Config.RGB_565;  
//        // ������Ӧ bitmap  
//        Bitmap bitmap = Bitmap.createBitmap(w, h, config);  
//        // ������Ӧ bitmap �Ļ���  
//        Canvas canvas = new Canvas(bitmap);  
//        drawable.setBounds(0, 0, w, h);  
//        // �� drawable ���ݻ���������  
//        drawable.draw(canvas);  
//        return bitmap;  
//    }  
//	
//	/**
//	 * �������汳��
//	 */
//	private void putWallpaper(Bitmap bitmap)
//	{
//		try
//		{
//			/*
//			 * int width = getWindowManager().getDefaultDisplay().getWidth();
//			 * int height = getWindowManager().getDefaultDisplay().getHeight();
//			 * bitmap = Bitmap.createScaledBitmap(bitmap, width,
//			 * bitmap.getHeight(), true);
//			 */
//			WallpaperManager wallpaperManager = WallpaperManager
//					.getInstance(this);
//			wallpaperManager.setBitmap(bitmap);
//			progressDialog.dismiss();
//			handler.sendEmptyMessage(1);
//		} catch (IOException e)
//		{
//			e.printStackTrace();
//		}
//	}
//	
//	//state 2���� 3����
//	public void saveFile(Bitmap bm, String fileName) throws IOException { 
//        String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/imageshow/";
//        File dirFile = new File(path);  
//        if(!dirFile.exists()){ 
//            dirFile.mkdir();  
//        }  
//        File myCaptureFile = new File(path + fileName + ".JPEG");  
//        
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(myCaptureFile));  
//        bm.compress(Bitmap.CompressFormat.JPEG, 80, bos);  
//        bos.flush();  
//        bos.close(); 
//        Toast.makeText(this, "图片保存成功至/sdcard/imageshow/", Toast.LENGTH_LONG).show();
//        
//    }
//	
//    @SuppressLint("HandlerLeak")
//	private Handler handler = new Handler()
//	{
//		@Override
//		public void handleMessage(Message msg)
//		{
//			switch (msg.what)
//			{
//			case 1:
//				Toast.makeText(PictureContent.this, "设置桌面背景成功", Toast.LENGTH_LONG).show();
//				break;
//			default:
//				break;
//			}
//			super.handleMessage(msg);
//		}
//	};
//
//}
