package com.suo.image.share;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.suo.image.activity.BaseActivity;
import com.tencent.connect.share.QzoneShare;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;

public class QQZoneUtil {
	private BaseActivity context;
	
	private Tencent tencent;
	
	private String appId = "101117511";
	//QZone分享， SHARE_TO_QQ_TYPE_DEFAULT 图文，SHARE_TO_QQ_TYPE_IMAGE 纯图
    private int shareType = QzoneShare.SHARE_TO_QZONE_TYPE_IMAGE_TEXT;
    
	public QQZoneUtil(BaseActivity context)
	{
		this.context = context;
		initQQZone();
	}
	
	private void initQQZone()
	{
		tencent = Tencent.createInstance(appId, context);
	}
	
	public void doShareToQzone(String text, String url)
	{
		final Bundle params = new Bundle();
        params.putInt(QzoneShare.SHARE_TO_QZONE_KEY_TYPE, shareType);
        params.putString(QzoneShare.SHARE_TO_QQ_TITLE, text);
//        params.putString(QzoneShare.SHARE_TO_QQ_SUMMARY, text);
        params.putString(QzoneShare.SHARE_TO_QQ_TARGET_URL, url);
        
        // 支持传多个imageUrl
        ArrayList<String> imageUrls = new ArrayList<String>();
        imageUrls.add(url);
        params.putStringArrayList(QzoneShare.SHARE_TO_QQ_IMAGE_URL, imageUrls);
        
        final Activity activity = context;
        new Thread(new Runnable() {
            @Override
            public void run() {
            	tencent.shareToQzone(activity, params, new IUiListener() {
                    @Override
                    public void onCancel() {
                    	context.showToast( "onCancel: ");
                    }

                    @Override
                    public void onError(UiError e) {
                    	context.showToast("onError: " + e.errorMessage);
                    }

					@Override
					public void onComplete(Object response) {
//						context.showToast("onComplete: " + response.toString());
					}
                });
            }
        }).start();
	}
}
