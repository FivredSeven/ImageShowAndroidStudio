package com.suo.image.util;

import java.io.File;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DecodeFormat;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.ImageLoadingListener;
import com.nostra13.universalimageloader.core.assist.SimpleImageLoadingListener;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;
import com.nostra13.universalimageloader.utils.L;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.suo.demo.R;
import com.suo.image.ImageApp;

import android.graphics.Bitmap;
import android.os.Environment;
import android.view.View;
import android.widget.ImageView;

/**
 * ImageLoader简单工具类
 * 
 * @author chensf5
 */
public class ImageLoaderUtil {

	private static ImageLoader imageLoader = ImageLoader.getInstance();

	private static DisplayImageOptions options;

	private static AnimateFirstDisplayListener animateFirstListener = new AnimateFirstDisplayListener();

	// SD卡挂载时，图片缓存在sd卡的路径
	public static final String SDCARD_IMG_PATH = Environment
			.getExternalStorageDirectory().getPath() + "/imageshow/images/";

	// SD卡没有挂载时，图片缓存在手机缓存路径
	public static final String CACHE_IMG_PATH = Environment
			.getDownloadCacheDirectory().getPath() + "/imageshow/images/";

	private String imagePath;
	private int resId;// 默认图片

	public int getResId() {
		return resId;
	}

	public void setResId(int resId) {
		this.resId = resId;
	}

	private static ImageLoaderUtil imageLoaderUtil = new ImageLoaderUtil();

	private static class AnimateFirstDisplayListener extends
			SimpleImageLoadingListener {

		static final List<String> displayedImages = Collections
				.synchronizedList(new LinkedList<String>());

		@Override
		public void onLoadingComplete(String imageUri, View view,
				Bitmap loadedImage) {
			if (loadedImage != null) {
				L.e("ImageLoaderUtil>>>>>", "imageUri::" + imageUri);
				ImageView imageView = (ImageView) view;
				imageView.setImageBitmap(loadedImage);
				boolean firstDisplay = !displayedImages.contains(imageUri);
				if (firstDisplay) {
					FadeInBitmapDisplayer.animate(imageView, 500);
					displayedImages.add(imageUri);
				}
			}
		}
	}

	public ImageLoaderUtil() {
		File sdcardImgPath = new File(SDCARD_IMG_PATH);
		if (!sdcardImgPath.exists()) { // 路径不存在
			sdcardImgPath.mkdirs();
		}
		imagePath = getImgPath();
	}

	public static ImageLoaderUtil getInstance() {
		return imageLoaderUtil;
	}

	public static String getImgPath() {
		if (Environment.getExternalStorageState().equals(
				Environment.MEDIA_MOUNTED)) {
			return SDCARD_IMG_PATH;
		} else {
			return CACHE_IMG_PATH;
		}
	}

	public void displayImage(String uri, ImageView image, int defaultImage) {
		// imageLoader.displayImage(uri, image, getDisplayImageOptions(),
		// animateFirstListener);
		if (getResId() == 0) {
			image.setImageResource(defaultImage);
		} else {
			image.setImageResource(getResId());
			setResId(0);
		}
//		image.setImageResource(R.drawable.wb_default_photo);
		File picFile = new File(imagePath + PubUtils.getFileName(uri));
		if (picFile.exists()) {
			uri = PubUtils.addFileBegin(picFile.getAbsolutePath());
		}
		imageLoader.displayImage(uri, image, getDisplayImageOptions(), null);
		return;
	}
	
	public void displayImage(String uri, ImageView image) {
        // imageLoader.displayImage(uri, image, getDisplayImageOptions(),
        // animateFirstListener);
        if (getResId() == 0) {
            image.setImageResource(R.drawable.default_image2);
        } else {
            image.setImageResource(getResId());
            setResId(0);
        }
        // image.setImageResource(R.drawable.wb_default_photo);
        File picFile = new File(imagePath + PubUtils.getFileName(uri));
        if (picFile.exists()) {
            uri = PubUtils.addFileBegin(picFile.getAbsolutePath());
        }
        imageLoader.displayImage(uri, image, getDisplayImageOptions(), null);
        return;
    }

	public void displayImage(String uri, ImageView image,
			DisplayImageOptions options) {
		// imageLoader.displayImage(uri, image, options, animateFirstListener);
		imageLoader.displayImage(uri, image, options, null);

		// imageLoader.displayImage(uri, imageAware)
	}

	public void loadImage(String uri,
			final ImageLoaderCompleteListener imageLoaderCompleteListener) {
		File picFile = new File(imagePath + PubUtils.getFileName(uri));
		if (picFile.exists()) {
			uri = PubUtils.addFileBegin(picFile.getAbsolutePath());
			// uri ="file://" +picFile.getAbsolutePath();
			// L.v("file exist= "+uri);
		}
		imageLoader.loadImage(uri, getDisplayImageOptions(),
				new ImageLoadingListener() {

					@Override
					public void onLoadingStarted(String imageUri, View view) {
						// TODO Auto-generated method stub

					}

					@Override
					public void onLoadingFailed(String imageUri, View view,
							FailReason failReason) {
						// TODO Auto-generated method stub

					}

					@Override
					public void onLoadingComplete(String imageUri, View view,
							Bitmap loadedImage) {
						L.e("imageLoader.loadImage---->>>onLoadingComplete 000000000",
								"loadedImage::" + loadedImage.toString());
						imageLoaderCompleteListener
								.onCompleteImageLoader(loadedImage);
					}

					@Override
					public void onLoadingCancelled(String imageUri, View view) {
						// TODO Auto-generated method stub

					}
				});
	}

	public synchronized static DisplayImageOptions getDisplayImageOptions() {
		if (null == options) {
			options = new DisplayImageOptions.Builder()
			// .showImageOnLoading(R.drawable.ic_stub)
			// .showImageForEmptyUri(R.drawable.ic_empty)
			// .showImageOnFail(R.drawable.ic_error)
					.cacheInMemory(true).cacheOnDisc(true)
					// .imageScaleType(ImageScaleType.EXACTLY)
					.bitmapConfig(Bitmap.Config.RGB_565)
					// .displayer(new FadeInBitmapDisplayer(300))
					.build();
		}
		return options;
	}

	public synchronized static DisplayImageOptions getDisplayImageOptions(
			int imageOnLoading) {
		if (null == options) {
			options = new DisplayImageOptions.Builder()
			// .showImageOnLoading(imageOnLoading)
			// .showImageForEmptyUri(R.drawable.ic_empty)
			// .showImageOnFail(R.drawable.ic_error)
					.cacheInMemory(true).cacheOnDisc(true)
					// .considerExifParams(true)
					// .imageScaleType(ImageScaleType.EXACTLY)
					.bitmapConfig(Bitmap.Config.RGB_565)
					// .displayer(new FadeInBitmapDisplayer(300))
					.build();
		}
		return options;
	}

	public interface ImageLoaderCompleteListener {
		public void onCompleteImageLoader(Bitmap bitmap);
	}

	public void loadImageByGlide(String url, ImageView imageView, int resId) {
		if (imageView.getScaleType() == ImageView.ScaleType.FIT_CENTER) {
			if (imageView.getWidth() < Density.getSceenWidth(ImageApp.getAppContext()) / 2) {
				Glide.with(ImageApp.getAppContext()).load(url).asBitmap().format(DecodeFormat.PREFER_RGB_565).fitCenter().placeholder(resId).into(imageView);
			} else {
				Glide.with(ImageApp.getAppContext()).load(url).asBitmap().fitCenter().placeholder(resId).into(imageView);
			}

		} else {
			if (imageView.getWidth() < Density.getSceenWidth(ImageApp.getAppContext()) / 2) {
				Glide.with(ImageApp.getAppContext()).load(url).asBitmap().format(DecodeFormat.PREFER_RGB_565).centerCrop().placeholder(resId).into(imageView);
			} else {
				Glide.with(ImageApp.getAppContext()).load(url).asBitmap().centerCrop().placeholder(resId).into(imageView);
			}


		}
	}
}
