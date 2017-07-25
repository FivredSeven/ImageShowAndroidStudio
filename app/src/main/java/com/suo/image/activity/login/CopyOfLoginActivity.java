package com.suo.image.activity.login;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.suo.demo.R;
import com.suo.image.activity.BaseActivity;
import com.suo.image.bean.QQBean;
import com.suo.image.share.QQUtil;
import com.suo.image.util.Log;
import com.suo.image.util.Preference;
import com.tencent.connect.UserInfo;
import com.tencent.connect.common.Constants;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.LinearLayout;

public class CopyOfLoginActivity extends BaseActivity {

    private LinearLayout ll_layout;
    private LinearLayout ll_edit_layout;
    private Button btn_login;
    private Button btn_qq;
    private Button btn_sina;
    private Animation moveUp;
    private int i = 0;
    public Tencent mTencent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        prepareData();
        initLayout();

    }

    private void prepareData() {
        mTencent = Tencent.createInstance(QQUtil.appId, this);
    }

    private void initLayout() {
        ll_layout = (LinearLayout) findViewById(R.id.ll_layout);
        ll_edit_layout = (LinearLayout) findViewById(R.id.ll_edit_layout);
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_qq = (Button) findViewById(R.id.btn_qq);
        btn_sina = (Button) findViewById(R.id.btn_sina);

        ll_layout.setVisibility(View.VISIBLE);
        ViewTreeObserver vto1 = ll_layout.getViewTreeObserver();
        vto1.addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                ll_layout.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                int height = ll_layout.getHeight();
                moveUp = new TranslateAnimation(0.0f, 0.0f, height, 0.0f);
                moveUp.setDuration(1500);
                ll_layout.startAnimation(moveUp);//
            }
        });

        btn_login.setOnClickListener(this);
        btn_qq.setOnClickListener(this);
        btn_sina.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()) {
            case R.id.btn_login:
                if (i == 0) {
                    ll_edit_layout.setVisibility(View.VISIBLE);
                    i = 1;
                } else {
                    // launch(MainActivity.class);
                    finish();
                }

                break;
            case R.id.btn_qq:
                if (!mTencent.isSessionValid()){
                    doLogin();
                }
                break;
            case R.id.btn_sina:

                break;

            default:
                break;
        }
    }

    private IUiListener listener;
    private static final int ON_COMPLETE = 0;
    private static final int ON_ERROR = 1;
    private static final int ON_CANCEL = 2;
    private static final int ON_IMAGE = 4;
    private void doLogin() {
        listener = new BaseUiListener() {
            @Override
            protected void doComplete(JSONObject values) {
                initOpenidAndToken(values);
            }
        };
        mTencent.login(this, "all", listener);
    }
    
    public void initOpenidAndToken(JSONObject jsonObject) {
        try {
            String token = jsonObject.getString(Constants.PARAM_ACCESS_TOKEN);
            String expires = jsonObject.getString(Constants.PARAM_EXPIRES_IN);
            String openId = jsonObject.getString(Constants.PARAM_OPEN_ID);
            if (!TextUtils.isEmpty(token) && !TextUtils.isEmpty(expires)
                    && !TextUtils.isEmpty(openId)) {
                Preference.putString("token", token);
                Preference.putString("expires", expires);
                Preference.putString("openId", openId);
                mTencent.setAccessToken(token, expires);
                mTencent.setOpenId(openId);
                UserInfo mInfo = new UserInfo(CopyOfLoginActivity.this, mTencent.getQQToken());
                mInfo.getUserInfo(infoListener/*new BaseUIListener(LoginActivity.this,"get_simple_userinfo")*/);
            }
        } catch(Exception e) {
        }
    }
    
    IUiListener infoListener = new BaseUiListener(){
        @Override
        public void onComplete(final Object response) {
            super.onComplete(response);
            Message msg = new Message();
            msg.obj = response;
            msg.what = ON_COMPLETE;
            mHandler.sendMessage(msg);
        }
    };
    
    Handler mHandler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            if (msg.what == ON_COMPLETE) {
                JSONObject response = (JSONObject) msg.obj;
                Preference.putString("qqinfo", response.toString());
                finish();
            }else if (msg.what == ON_ERROR){
                Log.e("返回为空,登录失败");
            }
        }

    };

    private class BaseUiListener implements IUiListener {

        @Override
        public void onComplete(Object response) {
            if (null == response) {
                showToast("返回为空,登录失败");
                return;
            }
            JSONObject jsonResponse = (JSONObject) response;
            if (null != jsonResponse && jsonResponse.length() == 0) {
                showToast("返回为空,登录失败");
                return;
            }
//            Log.e("登录成功"+response.toString());
//            showToast(response.toString() + "登录成功");
            doComplete((JSONObject)response);
        }

        protected void doComplete(JSONObject values) {
            
        }

        @Override
        public void onError(UiError e) {
            showToast("onError: " + e.errorDetail);
        }

        @Override
        public void onCancel() {
            showToast("onCancel: ");
        }
    }
}
