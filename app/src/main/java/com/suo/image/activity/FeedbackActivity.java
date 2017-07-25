package com.suo.image.activity;

import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

import com.suo.demo.R;
import com.suo.image.ImageApp;
import com.suo.image.bean.Feedback;
import com.suo.image.bean.UserInfo;
import com.suo.image.view.TipDialog;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FeedbackActivity extends BaseActivity {

	private EditText et_text;
	private TextView btn_back;
	private TextView btn_save;

	private TelephonyManager tm;
	private ProgressDialog proDialog;
	private UserInfo user;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.feedback);

		prepareData();

		initLayout();
	}

	private void prepareData() {
	    user = ImageApp.getInstance().getUserinfo();
		proDialog = new ProgressDialog(this);
		proDialog.setMessage("正在提交反馈建议..");
		tm = (TelephonyManager) this
				.getSystemService(Context.TELEPHONY_SERVICE);
	}

	private void initLayout() {
		et_text = (EditText) findViewById(R.id.et_text);
		btn_back = (TextView) findViewById(R.id.btn_back);
		btn_save = (TextView) findViewById(R.id.btn_save);

		btn_back.setOnClickListener(this);
		btn_save.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		super.onClick(v);
		switch (v.getId()) {
		case R.id.btn_back:
			finish();
			break;
		case R.id.btn_save:
			if (TextUtils.isEmpty(et_text.getText().toString())) {
				showToast("加上点文字吧!");
				return;
			}
			proDialog.show();
			Feedback feedback = new Feedback();
			feedback.setText("" + et_text.getText().toString());
			feedback.setPhone("" + tm.getLine1Number());
			feedback.setImei("" + tm.getSimSerialNumber());
			if (user != null){
			    feedback.setUserId(user.getUserId());
			}
			
			feedback.save(new SaveListener<String>() {
				@Override
				public void done(String o, BmobException e) {
					if (e == null) {
						if (proDialog.isShowing()) {
							proDialog.dismiss();
						}
						TipDialog tipDialog = new TipDialog(FeedbackActivity.this);
						tipDialog.showTip("提交成功,小编每一条建议都会仔细看的,谢谢啦！");
						tipDialog.setOnDismissListener(new OnDismissListener() {
							@Override
							public void onDismiss(DialogInterface dialog) {
								finish();
							}
						});
					} else {
						// 添加失败
						showToast("提交反馈建议失败");
						if (proDialog.isShowing()) {
							proDialog.dismiss();
						}
					}
				}

			});
			break;
		default:
			break;
		}
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		if (proDialog.isShowing()) {
			proDialog.dismiss();
		}
	}

}
