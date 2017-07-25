package com.suo.image.activity.login;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.BmobUser.BmobThirdUserAuth;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.LogInListener;
import cn.bmob.v3.listener.SaveListener;
import com.suo.demo.R;
import com.suo.image.ImageApp;
import com.suo.image.activity.BaseActivity;
import com.suo.image.activity.Main_new;
import com.suo.image.bean.UserInfo;
import com.suo.image.share.QQUtil;
import com.suo.image.util.Log;
import com.suo.image.util.Preference;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class LoginActivity extends BaseActivity {

    private LinearLayout ll_layout;
    private LinearLayout ll_edit_layout;
    private Button btn_login;
    private Button btn_qq;
    private Button btn_sina;
    private Animation moveUp;
    private EditText et_login_username;
    private EditText et_login_password;
    private int i = 0;
    public Tencent mTencent;
    private String username;
    private String password;

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
        et_login_username = (EditText) findViewById(R.id.et_login_username);
        et_login_password = (EditText) findViewById(R.id.et_login_password);
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
        
        String name = Preference.getString("username");
        if (!TextUtils.isEmpty(name)){
            et_login_username.setText(name);
        }
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
                    username = et_login_username.getText().toString().trim();
                    password = et_login_password.getText().toString().trim();
                    if(username.equals("")){
                        showToast("请输入您的用户名");
                        return;
                    }
                    
                    if(password.equals("")){
                        showToast("请输入您的密码");
                        return;
                    }
                    BmobUser user = new BmobUser();
                    user.setUsername(username);
                    user.setPassword(password);
                    user.login(new SaveListener<String>() {
                        @Override
                        public void done(String s, BmobException e) {
                            if (e == null) {
                                Preference.putString("username", username);
                                Preference.putString("password", password);
                                finish();
//                            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
//                            startActivity(intent);
                            } else {
                                showToast("登陆失败："+e.getMessage());
                            }
                        }
                    });
                }

                break;
            case R.id.btn_qq:
                qqAuthorize();
                break;
            case R.id.btn_sina:
                showToast("暂不支持微博登录噢！");
                break;

            default:
                break;
        }
    }

    private void qqAuthorize(){
        if(mTencent==null){
            mTencent = Tencent.createInstance(QQUtil.appId, getApplicationContext());
        }
        mTencent.logout(this);
        mTencent.login(this, "all", new IUiListener() {
            
            @Override
            public void onComplete(Object arg0) {
                // TODO Auto-generated method stub
                if(arg0!=null){
                    JSONObject jsonObject = (JSONObject) arg0;
                    try {
                        String token = jsonObject.getString(com.tencent.connect.common.Constants.PARAM_ACCESS_TOKEN);
                        String expires = jsonObject.getString(com.tencent.connect.common.Constants.PARAM_EXPIRES_IN);
                        String openId = jsonObject.getString(com.tencent.connect.common.Constants.PARAM_OPEN_ID);
                        BmobThirdUserAuth authInfo = new BmobThirdUserAuth(BmobThirdUserAuth.SNS_TYPE_QQ,token, expires,openId);
                        loginWithAuth(authInfo);
                    } catch (JSONException e) {
                    }
                }
            }
            
            @Override
            public void onError(UiError arg0) {
                showToast("QQ授权出错："+arg0.errorCode+"--"+arg0.errorDetail);
            }
            
            @Override
            public void onCancel() {
                showToast("取消qq授权");
            }
        });
    }
    
    /**  
     * @method loginWithAuth 
     * @param authInfo
     * @return void  
     * @exception   
     */
    public void loginWithAuth(final BmobThirdUserAuth authInfo){
        BmobUser.loginWithAuthData(authInfo, new LogInListener<JSONObject>() {

            @Override
            public void done(final JSONObject userAuth, BmobException e) {
                if (e == null) {
                    if(userAuth != null){
                        Log.i("login", "QQ登陆成功返回:"+userAuth.toString());
                        BmobQuery<UserInfo> query = new BmobQuery<UserInfo>();
                        query.addWhereEqualTo("userId", BmobUser.getCurrentUser().getObjectId());
                        query.findObjects(new FindListener<UserInfo>() {
                            @Override
                            public void done(List<UserInfo> list, BmobException e) {
                                if (e == null) {
                                    if (list!=null && list.size()>0){
                                        showToast("登录成功");
                                        ImageApp.getInstance().setUserinfo(list.get(0));
                                        launch(Main_new.class);
                                        finish();
                                    }else{
                                        Intent intent = new Intent(LoginActivity.this, LoginBindActivity.class);
                                        intent.putExtra("userAuth", userAuth.toString());
                                        intent.putExtra("tokenAuth", authInfo.toJSONObject().toString());
                                        launch(intent);
                                        finish();
                                    }
                                }
                            }
                        });
                    }
//                // TODO Auto-generated method stub
//                Log.i("smile",authInfo.getSnsType()+"登陆成功返回:"+userAuth);
//                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
//                intent.putExtra("json", userAuth.toString());
//                intent.putExtra("from", authInfo.getSnsType());
//                startActivity(intent);
                } else {
                    showToast("第三方登陆失败："+e.getMessage());
                }
            }
        });
    }
}
