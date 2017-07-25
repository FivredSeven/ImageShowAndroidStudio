package com.suo.image.activity.login;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.listener.UpdateListener;

import com.google.gson.Gson;
import com.suo.demo.R;
import com.suo.image.ImageApp;
import com.suo.image.activity.BaseActivity;
import com.suo.image.bean.QQBean;
import com.suo.image.bean.QQTokenBean;
import com.suo.image.bean.UserInfo;
import com.suo.image.share.QQUtil;
import com.suo.image.util.Log;
import com.suo.image.util.Preference;
import com.tencent.connect.common.Constants;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;

public class LoginBindActivity extends BaseActivity {

    private EditText et_username;
    private EditText et_password;
    private EditText et_nickname;
    private Button btn_bind;
    private String userAuth;
    private String tokenAuth;
    private JSONObject userObject;
    public Tencent mTencent;
    private QQBean qqbean;
    private ProgressDialog proDialog;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_bind);
        
        prepareData();
        initLayout();
    }

    private void prepareData() {
        userAuth = getIntent().getStringExtra("userAuth");
        tokenAuth = getIntent().getStringExtra("tokenAuth");
        try {
            userObject = new JSONObject(userAuth);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Log.e("userAuth:" + userAuth);
        mTencent = Tencent.createInstance(QQUtil.appId, this);
        if (userObject !=  null){
            Log.e("userObject:" + userObject);
            initOpenidAndToken(userObject);
        }
        
        proDialog = new ProgressDialog(this);
        proDialog.setMessage("绑定账号中,请稍等..");
    }

    private void initLayout() {
        et_username = (EditText) findViewById(R.id.et_username);
        et_password = (EditText) findViewById(R.id.et_password);
        et_nickname = (EditText) findViewById(R.id.et_nickname);
        btn_bind = (Button) findViewById(R.id.btn_bind);
        
        btn_bind.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()) {
            case R.id.btn_bind:
                if (TextUtils.isEmpty(et_username.getText().toString())){
                    showToast("请输入用户名");
                    return;
                }
                if (TextUtils.isEmpty(et_password.getText().toString())){
                    showToast("请输入密码");
                    return;
                }else{
                    int length = et_password.getText().toString().length();
                    if(length > 20 || length < 6){
                        showToast("密码为6-20位,请重新输入");
                        return;
                    }
                }
                if (TextUtils.isEmpty(et_nickname.getText().toString())){
                    showToast("请输入昵称");
                    return;
                }
                proDialog.show();
                associateUser();
                break;

            default:
                break;
        }
    }
    
    public void initOpenidAndToken(JSONObject jsonObject) {
        try {
            Log.e("jsonObject:" + jsonObject);
            Gson gson = new Gson();
            QQTokenBean bean = gson.fromJson(userAuth, QQTokenBean.class);
            String token = bean.getQq().getAccess_token();
            String expires = bean.getQq().getExpires_in();
            String openId = bean.getQq().getOpenid();
            Log.e("token:" + token + "|expirs:" + expires + "|openId:" + openId);
            if (!TextUtils.isEmpty(token) && !TextUtils.isEmpty(expires)
                    && !TextUtils.isEmpty(openId)) {
                Preference.putString("token", token);
                Preference.putString("expires", expires);
                Preference.putString("openId", openId);
                mTencent.setAccessToken(token, expires);
                mTencent.setOpenId(openId);
                com.tencent.connect.UserInfo mInfo = new com.tencent.connect.UserInfo(LoginBindActivity.this, mTencent.getQQToken());
                mInfo.getUserInfo(infoListener/*new BaseUIListener(LoginActivity.this,"get_simple_userinfo")*/);
            }
        } catch(Exception e) {
        }
    }
    
    /**
     * 关联到当前用户用户
     * 
     * @Title: associateUser
     * @Description: TODO
     * @param
     * @return void
     * @throws
     */
    private void associateUser() {
        if (userObject != null){
            final BmobUser user = BmobUser.getCurrentUser();
            if (user != null){
                user.setUsername(""+et_username.getText().toString());
                user.setPassword(""+et_password.getText().toString());
                user.update(user.getObjectId(), new UpdateListener() {
                    @Override
                    public void done(BmobException e) {
                        if (e == null) {
                            Preference.putString("username", et_username.getText().toString());
                            Preference.putString("password", et_password.getText().toString());

//                        BmobUser.associateWithAuthDate(LoginBindActivity.this, user, userObject,
//                                new UpdateListener() {
//                                    @Override
//                                    public void onSuccess() {
//                                        showToast("关联成功");
                            final UserInfo info = new UserInfo();
                            info.setUserId(user.getObjectId());
                            info.setTokenAuth(tokenAuth);
//                                        info.setUsername(user.getUsername());
//                                        info.setPassword(user.getPassword());
                            info.setNickname(""+et_nickname.getText().toString());
                            if (qqbean!=null){
                                info.setHeadPhoto(qqbean.getFigureurl_qq_2());
                                info.setCity(qqbean.getCity());
                                info.setSex(qqbean.getGender());
                            }
                            info.save(new SaveListener<String>() {
                                @Override
                                public void done(String s, BmobException e) {
                                    if (e == null) {
                                        if (proDialog.isShowing()){
                                            proDialog.dismiss();
                                        }
                                        Preference.putString("tokenAuth", tokenAuth);
                                        showToast("登录并绑定账号成功");
                                        ImageApp.getInstance().setUserinfo(info);
                                        finish();
                                    } else {
                                        if (proDialog.isShowing()){
                                            proDialog.dismiss();
                                        }
                                    }
                                }

                            });

//                                    }
//
//                                    @Override
//                                    public void onFailure(int code, String msg) {
//                                        Log.e("关联失败：code =" + code + ",msg = " + msg);
//                                        if (proDialog.isShowing()){
//                                            proDialog.dismiss();
//                                        }
//                                    }
//
//                                });
                        } else {
                            if (proDialog.isShowing()){
                                proDialog.dismiss();
                            }
                        }
                    }
                });
            }
        }
    }

    IUiListener infoListener = new BaseUiListener(){
        @Override
        public void onComplete(final Object response) {
            super.onComplete(response);
            Log.e("onComplete");
            Message msg = new Message();
            msg.obj = response;
            msg.what = 0;
            mHandler.sendMessage(msg);
        }

        @Override
        public void onError(UiError e) {
            super.onError(e);
            BmobUser user = BmobUser.getCurrentUser();
            UserInfo info = new UserInfo();
            info.setUserId(user.getObjectId());
            info.setTokenAuth(Preference.getString("tokenAuth"));
            showToast("登录并绑定账号成功");
            ImageApp.getInstance().setUserinfo(info);
            finish();
        }

        @Override
        protected void doComplete(JSONObject values) {
            super.doComplete(values);
            Log.e("doComplete");
            Message msg = new Message();
            msg.obj = values;
            msg.what = 0;
            mHandler.sendMessage(msg);
        }
    };
    
    Handler mHandler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            if (msg.what == 0) {
                JSONObject response = (JSONObject) msg.obj;
                Preference.putString("qqinfo", response.toString());
                Log.e("response.toString():" + response.toString());
                if (!TextUtils.isEmpty(response.toString())){
                    Gson gson = new Gson();
                    String str = response.toString().replace("\\\\", "");
                    Log.e("str:" + str);
                    qqbean = gson.fromJson(str, QQBean.class);
                    et_nickname.setText(""+qqbean.getNickname());
                    associateUser();
                }
            }
        }

    };

    private class BaseUiListener implements IUiListener {

        @Override
        public void onComplete(Object response) {
            if (null == response) {
                return;
            }
            JSONObject jsonResponse = (JSONObject) response;
            if (null != jsonResponse && jsonResponse.length() == 0) {
                return;
            }
            Log.e("doComplete");
            doComplete((JSONObject)response);
        }

        protected void doComplete(JSONObject values) {
            
        }

        @Override
        public void onError(UiError e) {
//            showToast("onError: " + e.errorDetail);
        }

        @Override
        public void onCancel() {
//            showToast("onCancel: ");
        }
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (proDialog.isShowing()){
            proDialog.dismiss();
        }
    }
}
