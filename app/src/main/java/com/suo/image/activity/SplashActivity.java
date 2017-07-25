package com.suo.image.activity;

import java.util.List;

import org.json.JSONObject;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.BmobUser.BmobThirdUserAuth;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.LogInListener;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.listener.FindListener;

import com.google.gson.Gson;
import com.suo.demo.R;
import com.suo.image.ImageApp;
import com.suo.image.activity.login.LoginActivity;
import com.suo.image.activity.login.LoginBindActivity;
import com.suo.image.bean.UserInfo;
import com.suo.image.util.Log;
import com.suo.image.util.Preference;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;

public class SplashActivity extends BaseActivity {

    private String username;
    private String password;
    private String tokenAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Bmob.initialize(this, APPID);
        username = Preference.getString("username");
        password = Preference.getString("password");
        tokenAuth = Preference.getString("tokenAuth");
        
        if (BmobUser.getCurrentUser() != null) {
            BmobQuery<UserInfo> query = new BmobQuery<UserInfo>();
            query.addWhereEqualTo("userId", BmobUser.getCurrentUser().getObjectId());
            query.findObjects(new FindListener<UserInfo>() {
                @Override
                public void done(List<UserInfo> list, BmobException e) {
                    if (e == null) {
                        if (list!=null && list.size()>0){
                            Log.e("查询到用户信息数据");
                            ImageApp.getInstance().setUserinfo(list.get(0));
                            launch(Main_new.class);
                            finish();
                        }
                    } else {
                        Log.e("BmobUser.getCurrentUser(this)不为空，但是查询用户信息数据失败后进入主页面");
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                launch(Main_new.class);
                                finish();
                            }
                        }, 2000);
                    }
                }

            });
        } else {
            if (!TextUtils.isEmpty(username) && !TextUtils.isEmpty(password)) {
                final BmobUser user = new BmobUser();
                user.setUsername(username);
                user.setPassword(password);
                user.login(new SaveListener<String>() {
                    @Override
                    public void done(String s, BmobException e) {
                        if (e == null) {
                            Log.e("登录成功");
                            getUserInfo(user);
                        } else {
                            Log.e("登录失败后进入主界面");
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    launch(Main_new.class);
                                    finish();
                                }
                            }, 2000);
                        }
                    }
                });
            } else {
                if (!TextUtils.isEmpty(tokenAuth)) {
                    Gson gson = new Gson();
                    BmobThirdUserAuth auth = gson.fromJson(tokenAuth, BmobThirdUserAuth.class);
                    BmobUser.loginWithAuthData(auth, new LogInListener<JSONObject>() {
                        @Override
                        public void done(JSONObject userAuth, BmobException e) {
                            if (e == null) {
                                if(userAuth != null){
                                    Log.i("login", "QQ登陆成功返回:"+userAuth.toString());
                                    getUserInfo(null);
                                }
                            } else {
                                showToast("第三方登陆失败："+e.getMessage());
                            }
                        }

                    });
                }
                Log.e("没有username和password的用户直接进入主页");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        launch(Main_new.class);
                        finish();
                    }
                }, 2000);
            }
        }

    }
    
    private void getUserInfo(BmobUser user) {
        BmobUser bmobuser = BmobUser.getCurrentUser();
        if (bmobuser != null) {
            BmobQuery<UserInfo> query = new BmobQuery<UserInfo>();
            if (user!=null) {
                query.addWhereEqualTo("userId", user.getObjectId());
            } else {
                query.addWhereEqualTo("userId", bmobuser.getObjectId());
            }
            
            query.findObjects(new FindListener<UserInfo>() {
                @Override
                public void done(List<UserInfo> list, BmobException e) {
                    if (e == null) {
                        if (list != null && list.size() > 0) {
                            Log.e("登录成功后，查询到用户信息数据");
                            ImageApp.getInstance().setUserinfo(list.get(0));
                            launch(Main_new.class);
                            finish();
                        }
                    } else {
                        Log.e("登录成功，获取用户信息失败后进入主界面");
                        launch(Main_new.class);
                        finish();
                    }
                }
            });
        }
    }

}
