package com.suo.image.share;

import android.graphics.Bitmap;
import android.os.Bundle;

import com.suo.image.activity.BaseActivity;
import com.tencent.connect.share.QQShare;
import com.tencent.connect.share.QzoneShare;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;

public class QQUtil {
    private BaseActivity context;
    private Tencent tencent;

    public static String appId = "101117511";
    // QZone分享， SHARE_TO_QQ_TYPE_DEFAULT 图文，SHARE_TO_QQ_TYPE_IMAGE 纯图
    private int shareType = QzoneShare.SHARE_TO_QZONE_TYPE_IMAGE_TEXT;

    public QQUtil(BaseActivity context) {
        this.context = context;
        initQQ();
    }

    private void initQQ() {
        tencent = Tencent.createInstance(appId, context);
    }
    
    public void doShareToQQ(final Bundle params, IUiListener qqShareListener) {
        params.putInt(QQShare.SHARE_TO_QQ_KEY_TYPE, shareType);
        tencent.shareToQQ(context, params, qqShareListener);    
    }
}
