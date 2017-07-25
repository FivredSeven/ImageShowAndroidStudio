package com.suo.image.img;

import java.util.HashMap;
import java.util.Map;

import com.suo.image.activity.BaseActivity;
import com.suo.image.util.Pub;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;

/***
 * ͼƬ������ �����첽�����������š����͵Ⱥܶ�ط���ͼƬ
 * 
 * @author hshi ˵�� 1���̶��������̳߳��ɷ��߳�����ͼƬ 2����ImageCache��ϣ������ػ��档 3��Singletonģʽ
 *         4��ͨ��Callback����������Ժ���ʾͼƬ
 */
public class AsyncImageLoader {
	private static AsyncImageLoader _instance = new AsyncImageLoader();
	private BaseActivity context;

	public synchronized static AsyncImageLoader getInstance() {
		return _instance;
	}

	public interface ImageLoaderCallback {
		void refresh(String url, Drawable drawable);
	}

	public Drawable get(BaseActivity context, String url, ImageLoaderCallback createImageViewCallback) {
		Drawable drawable = null;
		this.context = context;
		drawable = Pub.getLocalDrawable(context, url);
		if (drawable != null) {
			return drawable;
		} else {
			WorkQueueManager.getInstance().getImageDownloadTaskQueue()
					.push(new DownImgRunnable(context, url, createImageViewCallback));
		}
		return null;
	}

	class DownImgRunnable implements Runnable {
		private String url;
		private ImageLoaderCallback createImageViewCallback;
		private BaseActivity context;

		public DownImgRunnable(BaseActivity context, String url,
				ImageLoaderCallback createImageViewCallback) {
			this.url = url;
			this.createImageViewCallback = createImageViewCallback;
			this.context = context;
		}

		public void run() {
			boolean isSuc = Pub.downloadDrawableByUrl(context, url);
			if (isSuc) {
				Message msg = handler.obtainMessage();
				if(createImageViewCallback == null){
					return;
				}
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("url", url);
				map.put("callback", createImageViewCallback);
				msg.obj = map;
				msg.sendToTarget();
			}
		}
	}

	Handler handler = new Handler() {
		@SuppressWarnings("unchecked")
		public void handleMessage(Message msg) {
			super.handleMessage(msg);
			Map<String, Object> map = (Map<String, Object>) msg.obj;
			String url = (String) map.get("url");
			ImageLoaderCallback createImageViewCallback = (ImageLoaderCallback) map
					.get("callback");
			Drawable drawable = Pub.getLocalDrawable(context, url);
			if (drawable != null) {
				createImageViewCallback.refresh(url, drawable);
			}

		}

	};
}
