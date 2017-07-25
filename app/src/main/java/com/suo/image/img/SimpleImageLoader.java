package com.suo.image.img;

import com.suo.image.activity.BaseActivity;
import com.suo.image.img.AsyncImageLoader.ImageLoaderCallback;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;


public class SimpleImageLoader {

	/**
	 * @param imageView
	 * @param url
	 * @param defaultImg Ĭ��ͼƬ��ԴID
	 */
	public static synchronized void display(BaseActivity context, final ImageView imageView, String url, int defaultImg) {
		imageView.setTag(url);
		Drawable drawable = AsyncImageLoader.getInstance().get(context, url,
				createImageViewCallback(imageView, url));
		if (drawable != null) {
			imageView.setImageDrawable(drawable);
		}else{
			imageView.setImageResource(defaultImg);
		}
		
	}

	public static synchronized void display(BaseActivity context, final ImageView imageView, String url) {
		imageView.setTag(url);
		Drawable drawable = AsyncImageLoader.getInstance().get(context, url,
				createImageViewCallback(imageView, url));
		if (drawable != null) {
			imageView.setImageDrawable(drawable);
		}
		
	}
	
	public static ImageLoaderCallback createImageViewCallback(
			final ImageView imageView, String url) {
		return new ImageLoaderCallback() {
			public void refresh(String url, Drawable drawable) {
				if (url.equals(imageView.getTag())) {
					imageView.setImageDrawable(drawable);
				}
			}
		};
	}
}
