package com.suo.image.share;

import com.suo.image.activity.BaseActivity;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.WXAPIFactory;

public class WeixinUtil {
    private BaseActivity context;

    private String APP_ID = "wx9324dce3c4422e26";

    public static IWXAPI api;

    public WeixinUtil(BaseActivity context) {
        this.context = context;
        initWeixin();
    }

    private void initWeixin() {
        // 通过WXAPIFactory工厂，获取IWXAPI的实例
        api = WXAPIFactory.createWXAPI(context, APP_ID, false);
        // 将该app注册到微信
        api.registerApp(APP_ID);
    }
}
