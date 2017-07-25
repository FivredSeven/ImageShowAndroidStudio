package com.suo.image.activity;//package com.suo.image.activity;
//
//import java.io.File;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.Timer;
//import java.util.TimerTask;
//
//import net.tsz.afinal.FinalBitmap;
//import cn.bmob.v3.BmobQuery;
//import cn.bmob.v3.listener.FindListener;
//
//import com.suo.demo.R;
//import com.suo.image.adapter.ImageGridViewAdapter;
//import com.suo.image.bean.ImageBean;
//import com.suo.image.img.ImageUrl;
//import com.suo.image.util.Log;
//import com.suo.image.util.Pub;
//import com.suo.image.view.MyGridView;
//
//import android.os.Bundle;
//import android.app.AlertDialog;
//import android.app.ProgressDialog;
//import android.content.DialogInterface;
//import android.content.Intent;
//import android.util.DisplayMetrics;
//import android.view.KeyEvent;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.View;
//import android.view.View.OnClickListener;
//import android.widget.AdapterView;
//import android.widget.AdapterView.OnItemClickListener;
//import android.widget.Button;
//import android.widget.LinearLayout;
//import android.widget.Toast;
//
//public class MainActivity extends BaseActivity {
//
//	private List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();
//
//	private MyGridView imageGridView;
//	private Button more;
//	private ImageGridViewAdapter adapter;
//	private Button user_add;
//
//	public static int width, height;
//	private int page = 9;
//	private ImageUrl data;
//	private ProgressDialog progressDialog;
//	private FinalBitmap fb;
//
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
//
//		findViews();
//		getScreenSize();
//		setLayoutParams();
//
//		data = new ImageUrl(this);
//		listItems = data.getImageObj(page);
//		page--;
//		fb = FinalBitmap.create(this);
//		fb.configLoadingImage(R.drawable.default_image);
//		adapter = new ImageGridViewAdapter(this, listItems, fb);
//		imageGridView.setAdapter(adapter);
//
//		// BmobQuery<ImageBean> bmobQuery = new BmobQuery<ImageBean>();
//		// bmobQuery.findObjects(this, new FindListener<ImageBean>() {
//		// @Override
//		// public void onSuccess(List<ImageBean> object) {
//		// Log.e("查询成功：共"+object.size()+"条数据。");
//		// }
//		//
//		// @Override
//		// public void onError(int code, String msg) {
//		// Log.e("查询失败："+msg);
//		// }
//		// });
//	}
//
//	private void findViews() {
//		user_add = (Button) findViewById(R.id.user_add);
//		user_add.setText("网络差");
//		user_add.setOnClickListener(new OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				if (android.os.Build.VERSION.SDK_INT > 10) {
//					// 3.0以上打开设置界面，也可以直接用ACTION_WIRELESS_SETTINGS打开到wifi界面
//					startActivity(new Intent(
//							android.provider.Settings.ACTION_SETTINGS));
//				} else {
//					startActivity(new Intent(
//							android.provider.Settings.ACTION_WIRELESS_SETTINGS));
//				}
//			}
//		});
//		imageGridView = (MyGridView) findViewById(R.id.imageGridView);
//		more = (Button) findViewById(R.id.more);
//		more.setOnClickListener(new OnClickListener() {
//			@Override
//			public void onClick(View arg0) {
//				List<Map<String, Object>> templist = new ArrayList<Map<String, Object>>();
//				if (page > 0) {
//					templist = data.getImageObj(page);
//					if (templist != null) {
//						for (int i = 0; i < ImageUrl.SIZE_OF_PAGE; i++) {
//							listItems.add(templist.get(i));
//						}
//						adapter.notifyDataSetChanged();
//						page--;
//					} else {
//						Toast.makeText(MainActivity.this, "no more",
//								Toast.LENGTH_SHORT).show();
//					}
//				} else {
//					Toast.makeText(MainActivity.this, "no more",
//							Toast.LENGTH_SHORT).show();
//				}
//
//			}
//		});
//		imageGridView.setOnItemClickListener(new OnItemClickListener() {
//			@Override
//			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
//					long arg3) {
//				Intent intent = new Intent(MainActivity.this,
//						PictureContent.class);
//				intent.putExtra("position", arg2);
//				intent.putExtra("title", listItems.get(arg2).get("text")
//						.toString());
//				startActivity(intent);
//			}
//		});
//	}
//
//	private void getScreenSize() {
//		DisplayMetrics dm = new DisplayMetrics();
//		getWindowManager().getDefaultDisplay().getMetrics(dm);
//		width = dm.widthPixels;
//		height = dm.heightPixels;
//	}
//
//	private void setLayoutParams() {
//		LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) imageGridView
//				.getLayoutParams();
//		lp.setMargins(width / 60, width / 60, width / 60, width / 60);
//		imageGridView.setLayoutParams(lp);
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
//			progressDialog = new ProgressDialog(MainActivity.this);
//			progressDialog.setMessage("正在清除,请稍后..");
//			progressDialog.show();
//			File file = new File(Pub.getBaseDir() + "image/");
//			clearData(file);
//			mEditor.clear();
//			mEditor.commit();
//			progressDialog.dismiss();
//			Toast.makeText(MainActivity.this, "清除成功..", Toast.LENGTH_LONG)
//					.show();
//			break;
//		case R.id.menu_settings2:
////			AppConnect.getInstance(MainActivity.this).showOffers(
////					MainActivity.this);
//			break;
//		case R.id.menu_settings3:
////			AppConnect.getInstance(MainActivity.this).showFeedback(
////					MainActivity.this);
//			break;
//		case R.id.menu_settings4:
//			new AlertDialog.Builder(MainActivity.this)
//					.setTitle("关于")
//					.setMessage(
//							"		" + "我只是一个普通的个人开发者，用业余时间来更新这个app，如果你喜欢这个app，"
//									+ "可以来访问我的百度贴吧————<吴鸿琦吧>。希望你会喜欢，谢谢！")
//					.create().show();
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
//	@Override
//	public boolean onKeyDown(int keyCode, KeyEvent event) {
//		System.out.println("TabHost_Index.java onKeyDown");
//		new AlertDialog.Builder(MainActivity.this).setTitle("提示")
//				.setMessage("您真的要退出美图Show吗?")
//				.setPositiveButton("确定", new DialogInterface.OnClickListener() {
//					@Override
//					public void onClick(DialogInterface dialog, int which) {
//						dialog.dismiss();
//						finish();
//						System.exit(0);
//					}
//				})
//				.setNegativeButton("取消", new DialogInterface.OnClickListener() {
//					@Override
//					public void onClick(DialogInterface dialog, int which) {
//						dialog.dismiss();
//					}
//				}).create().show();
//		return false;
//	}
//
//}
