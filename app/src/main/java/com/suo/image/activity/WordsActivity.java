package com.suo.image.activity;

import java.io.File;
import java.io.FileInputStream;

import net.tsz.afinal.FinalBitmap;

import org.apache.http.util.EncodingUtils;

import com.bumptech.glide.Glide;
import com.suo.demo.R;
import com.suo.image.bean.ImageBean;
import com.suo.image.img.SimpleImageLoader;
import com.suo.image.util.Density;
import com.suo.image.util.FileUtil;
import com.suo.image.util.ImageLoaderUtil;
import com.suo.image.util.ImageUtils;
import com.suo.image.view.MyScrollView;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

@SuppressLint("HandlerLeak")
public class WordsActivity extends BaseActivity {

	private MyScrollView myScrollView;
	private TextView btn_back;
	private TextView text;
	private TextView tv_words;
	private ImageView iv_word_pic;
	private ImageBean bean;

	@SuppressWarnings("unused")
	private Handler handler;
	private String words = "";
	private boolean isShow = false;
	private boolean isFirst = false;
//	private FinalBitmap fb;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.news_word);

		prepareData();

		initLayout();

	}

	private void prepareData() {
		bean = (ImageBean) getIntent().getSerializableExtra("imageBean");
//		fb = FinalBitmap.create(this);
//		AppConnect.getInstance(this).initPopAd(this);
	}

	private void initLayout() {
		btn_back = (TextView) findViewById(R.id.btn_back);
		text = (TextView) findViewById(R.id.text);
		tv_words = (TextView) findViewById(R.id.tv_words);
		iv_word_pic = (ImageView) findViewById(R.id.iv_word_pic);
		myScrollView = (MyScrollView) findViewById(R.id.myScrollView);
		myScrollView.setContext(this);

		text.setText("" + bean.getImageText());
		File file = new File(ImageUtils.image_path + bean.getImageText()+".txt");
		if (file.exists()) {
		    isFirst = false;
			readWords();
		} else {
		    isFirst = true;
			downloadWords();
		}
		int height = Density.getSceenWidth(this) * 2 / 3;
		iv_word_pic.setLayoutParams(new LayoutParams(
				LayoutParams.MATCH_PARENT, height));
		ImageLoaderUtil.getInstance().loadImageByGlide(bean.getImageUrl(), iv_word_pic, R.drawable.default_image);
//		Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.default_image2);
//        fb.display(iv_word_pic, bean.getImageUrl(), bm);
//		SimpleImageLoader.display(this, iv_word_pic, bean.getImageUrl(),
//				R.drawable.default_image2);
		btn_back.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		super.onClick(v);
		switch (v.getId()) {
		case R.id.btn_back:
			finish();
			break;

		default:
			break;
		}
	}

	// 读在/sdcard/目录下面的文件
	public void readWords() {

		try {
			FileInputStream fin = new FileInputStream(ImageUtils.image_path
					+ bean.getImageText() + ".txt");
			int length = fin.available();
			byte[] buffer = new byte[length];
			fin.read(buffer);
			words = EncodingUtils.getString(buffer, "GBK");
			fin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		Message message = new Message();
		message.what = 0;
		mHandler.sendMessage(message);
	}

	private void downloadWords() {
		new Thread() {
			public void run() {
				FileUtil file = new FileUtil();
				int msg = file.downFile(bean.getWordUrl(),
						ImageUtils.image_path, bean.getImageText());
				if (msg == 0) {
					readWords();
				} else {
//					showToast("加载失败");
				}
			}
		}.start();
	}

	private Handler mHandler = new Handler() {
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case 0:
				tv_words.setText("" + words);
				if (isFirst){
//				    showToast("文章下载至:" + ImageUtils.image_path);
				}
				break;
			}
			super.handleMessage(msg);
		}
	};

	public void showAd() {
//		if (!isShow){
//			AppConnect.getInstance(WordsActivity.this).showPopAd(WordsActivity.this);
//			isShow = true;
//		}
	}
}
