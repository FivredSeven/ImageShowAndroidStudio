package com.suo.image.activity;//package com.suo.image.activity;
//
//import java.io.File;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Timer;
//import java.util.TimerTask;
//import net.tsz.afinal.FinalBitmap;
//import cn.bmob.v3.BmobQuery;
//import cn.bmob.v3.listener.FindListener;
//import com.suo.demo.R;
//import com.suo.image.adapter.ArrayListAdapter;
//import com.suo.image.adapter.ViewHolder;
//import com.suo.image.bean.AboutBean;
//import com.suo.image.bean.ImageBean;
//import com.suo.image.util.Density;
//import com.suo.image.util.Log;
//import com.suo.image.util.Pub;
//import com.suo.image.view.MyGridView;
//import android.app.AlertDialog;
//import android.app.ProgressDialog;
//import android.content.Intent;
//import android.os.Bundle;
//import android.text.TextUtils;
//import android.view.KeyEvent;
//import android.view.LayoutInflater;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.AdapterView;
//import android.widget.AdapterView.OnItemClickListener;
//import android.widget.Button;
//import android.widget.FrameLayout;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//import android.widget.ListView;
//import android.widget.TextView;
//import android.widget.Toast;
//
//public class MainNetActivity extends BaseActivity {
//
//	private MyGridView imageGridView;
//	private Button more;
//	private Button user_add;
//	private Button btn_refresh;
//
//	private ArrayList<ImageBean> list;
//	private ProgressDialog progressDialog;
//	private ImageAdapter adapter;
//
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
//
//		prepareData();
//
//		initLayout();
//
//		queryData(true);
//		queryAbout();
//	}
//
//	private void prepareData() {
//		
//		list = new ArrayList<ImageBean>();
//		adapter = new ImageAdapter(this);
////		AppConnect.getInstance(this).initUninstallAd(this);
////		AppConnect.getInstance(this).setCrashReport(false);//默认值 true 开启，设置 false 关闭 
//	}
//
//	private void initLayout() {
//		imageGridView = (MyGridView) findViewById(R.id.imageGridView);
//		more = (Button) findViewById(R.id.more);
//		btn_refresh = (Button) findViewById(R.id.btn_refresh);
//		user_add = (Button) findViewById(R.id.user_add);
//		user_add.setText("添加");
//		int width = Density.getSceenWidth(this);
//		LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) imageGridView.getLayoutParams();
//		lp.setMargins(width / 60, width / 60, width / 60, width / 60);
//		imageGridView.setLayoutParams(lp);
//		
//		imageGridView.setOnItemClickListener(new OnItemClickListener() {
//			@Override
//			public void onItemClick(AdapterView<?> parent, View view,
//					int position, long id) {
//				if (TextUtils.isEmpty(list.get(position).getWordUrl())){
//					Intent intent = new Intent(MainNetActivity.this, PictureNetContentActivity.class);
//					intent.putExtra("imageBean", list.get(position));
//					startActivity(intent);
//				}else{
//					Intent intent = new Intent(MainNetActivity.this, WordsActivity.class);
//					intent.putExtra("imageBean", list.get(position));
//					startActivity(intent);
//				}
//				
//			}
//		});
//		
//		user_add.setOnClickListener(this);
//		more.setOnClickListener(this);
//		btn_refresh.setOnClickListener(this);
//	}
//
//	private void queryData(boolean top) {
//		if (list != null && top){
//			list.clear();
//			adapter.setList(list);
//			imageGridView.setAdapter(adapter);
//		}
//		BmobQuery<ImageBean> bmobQuery = new BmobQuery<ImageBean>();
////		bmobQuery.addWhereEqualTo("age", 25);
////		bmobQuery.addWhereNotEqualTo("age", 25);
////		bmobQuery.addQueryKeys("objectId");
//		bmobQuery.setLimit(10);
//		bmobQuery.setSkip(list.size());
//		bmobQuery.order("-imageId");
////		bmobQuery.setCachePolicy(CachePolicy.CACHE_ELSE_NETWORK);	// 先从缓存取数据，如果没有的话，再从网络取。
//		bmobQuery.findObjects(this, new FindListener<ImageBean>() {
//			@Override
//			public void onSuccess(List<ImageBean> object) {
////				Log.e("查询成功：共" + object.size() + "条数据。");
//				if (object != null && object.size()>0){
//					list.addAll(object);
//					adapter.setList(list);
//					imageGridView.setAdapter(adapter);
//				}else{
//					showToast("已无更多数据啦.");
//				}
//				
//			}
//
//			@Override
//			public void onError(int code, String msg) {
//				Log.e("查询失败：" + msg);
//				startActivity(new Intent(MainNetActivity.this, MainActivity.class));
//				finish();
//			}
//		});
//	}
//	
//	private void queryAbout(){
//		BmobQuery<AboutBean> bmobQuery = new BmobQuery<AboutBean>();
//		bmobQuery.order("-updatedAt");
//		bmobQuery.findObjects(this, new FindListener<AboutBean>() {
//			@Override
//			public void onSuccess(List<AboutBean> object) {
////				Log.e("查询成功：共" + object.size() + "条数据。");
//				if (object != null && object.size()>0){
//					putString("about", object.get(0).getAboutText(), true);
//				}
//				
//			}
//
//			@Override
//			public void onError(int code, String msg) {
//				Log.e("查询失败：" + msg);
//			}
//		});
//	}
//	
//	class ImageAdapter extends ArrayListAdapter<ImageBean>{
//
//		private BaseActivity context;
//		private FinalBitmap fb;
//		
//		public ImageAdapter(BaseActivity context) {
//			super(context);
//			this.context = context;
//		}
//		
//		public ImageAdapter(BaseActivity context, ListView listView) {
//			super(context, listView);
//			this.context = context;
//		}
//
//		@Override
//		public View getView(int position, View convertView, ViewGroup parent) {
//			if (convertView == null) {
//				convertView = LayoutInflater.from(context).inflate(
//						R.layout.image_gridview, parent, false);
//			}
//			
//			ImageView image_grid = ViewHolder.get(convertView, R.id.image_grid);
//			TextView text_grid = ViewHolder.get(convertView, R.id.text_grid);
//			ImageView iv_words_tag = ViewHolder.get(convertView, R.id.iv_words_tag);
//			
//			final ImageBean bean = (ImageBean)getItem(position);
//			
//			fb = FinalBitmap.create(context);
//			fb.configLoadingImage(R.drawable.default_image);
//			fb.display(image_grid, bean.getImageUrl());
////			SimpleImageLoader.display(context, viewHolder.image, url, R.drawable.default_image);
//			FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) image_grid.getLayoutParams();
//			lp.height = Density.getSceenHeight(context)/4;
//			image_grid.setLayoutParams(lp);
//			text_grid.setText(bean.getImageText());
//			
//			
//			if (bean.getImageUrl().contains("http://file.bmob.cn")){
//				iv_words_tag.setVisibility(View.VISIBLE);
//				iv_words_tag.setImageResource(R.drawable.words_tag_green);
//			}else{
//				
//				if (!TextUtils.isEmpty(bean.getWordUrl())){
//					iv_words_tag.setVisibility(View.VISIBLE);
//					iv_words_tag.setImageResource(R.drawable.words_tag);
//				}else{
//					iv_words_tag.setVisibility(View.GONE);
//				}
//			}
//			
//			return convertView;
//		}
//		
//	}
//
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.activity_main, menu);
//		return true;
//	}
//
//	@Override
//	public boolean onOptionsItemSelected(MenuItem item) {
//		switch (item.getItemId()) {
//		case R.id.menu_settings:
//			progressDialog = new ProgressDialog(MainNetActivity.this);
//			progressDialog.setMessage("正在清除,请稍后..");
//			progressDialog.show();
//			File file = new File(Pub.getBaseDir() + "image/");
//			clearData(file);
//			mEditor.clear();
//			mEditor.commit();
//			progressDialog.dismiss();
//			Toast.makeText(MainNetActivity.this, "清除成功..", Toast.LENGTH_LONG)
//					.show();
//			break;
//		case R.id.menu_settings2:
////			AppConnect.getInstance(MainNetActivity.this).showOffers(
////					MainNetActivity.this);
//			break;
//		case R.id.menu_settings3:
////			AppConnect.getInstance(MainNetActivity.this).showFeedback(
////					MainNetActivity.this);
//			break;
//		case R.id.menu_settings4:
//			String text = getString("about", "");
//			if (!TextUtils.isEmpty(text)){
//				new AlertDialog.Builder(MainNetActivity.this)
//				.setTitle("关于")
//				.setMessage(text)
//				.create().show();
//			}else{
//				new AlertDialog.Builder(MainNetActivity.this)
//				.setTitle("关于")
//				.setMessage(
//						"		" + "我只是一个普通的个人开发者，用业余时间来更新这个app，如果你喜欢这个app，"
//								+ "可以来访问我的百度贴吧————<吴鸿琦吧>。希望你会喜欢，谢谢！")
//				.create().show();
//			}
//			
//			break;
//		default:
//			break;
//		}
//
//		return super.onOptionsItemSelected(item);
//	}
//
//	private void clearData(File file) {
//		if (file.exists()) { // �ж��ļ��Ƿ����
//			if (file.isFile()) { // �ж��Ƿ����ļ�
//				file.delete(); // delete()���� ��Ӧ��֪�� ��ɾ�����˼;
//			} else if (file.isDirectory()) { // �����������һ��Ŀ¼
//				File files[] = file.listFiles(); // ����Ŀ¼�����е��ļ� files[];
//				for (int i = 0; i < files.length; i++) { // ����Ŀ¼�����е��ļ�
//					this.clearData(files[i]); // ��ÿ���ļ� ������������е��
//				}
//			}
//			file.delete();
//		} else {
//
//		}
//	}
//
//	private static Boolean isExit = false;
//	private static Boolean hasTask = false;
//	Timer tExit = new Timer();
//	TimerTask task = new TimerTask() {
//		@Override
//		public void run() {
//			isExit = false;
//			hasTask = true;
//		}
//	};
//
//	@Override
//	public boolean onKeyDown(int keyCode, KeyEvent event) {
//		System.out.println("TabHost_Index.java onKeyDown");
//		if (keyCode == KeyEvent.KEYCODE_BACK) {
//			if (isExit == false) {
//				isExit = true;
//				Toast.makeText(this, "再按一次后退键退出应用程序", Toast.LENGTH_SHORT)
//						.show();
//				if (!hasTask) {
//					tExit.schedule(task, 2000);
//				}
//			} else {
//				finish();
//				System.exit(0);
//			}
//		}
//		return false;
//	}
//
//	@Override
//	public void onClick(View v) {
//		super.onClick(v);
//		switch (v.getId()) {
//		case R.id.more:
//			queryData(false);
//			break;
//		case R.id.user_add:
//			launch(AddImageTextActivity.class);
//			break;
//		case R.id.btn_refresh:
//			queryData(true);
//			break;
//
//		default:
//			break;
//		}
//	}
//	
//	
//
//}
