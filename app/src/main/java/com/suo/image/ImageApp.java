package com.suo.image;

import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;
import com.suo.image.bean.UserInfo;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;

public class ImageApp extends Application {

    private static ImageApp instance;
	private UserInfo userinfo;

	public static Context mContext;
	public static DisplayImageOptions options;
    public static DisplayImageOptions optionsLarge;
	
	public static Context getAppContext(){
		return mContext;
	}
	

	@Override
	public void onCreate() {
		super.onCreate();
		mContext = this.getApplicationContext();
		instance = this;
		initImageLoader(getApplicationContext());
//		ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(getApplicationContext()).build();
//		ImageLoader.getInstance().init(config);
	}
	
	private void initImageLoader(Context context) {
        // This configuration tuning is custom. You can tune every option, you
        // may tune some of them,
        // or you can create default configuration by
        // ImageLoaderConfiguration.createDefault(this);
        // method.
        options = new DisplayImageOptions.Builder().cacheInMemory(true)
                .displayer(new RoundedBitmapDisplayer(20))
                .cacheOnDisc(true).build();
        
        optionsLarge =new DisplayImageOptions.Builder()
                .resetViewBeforeLoading(true).cacheOnDisc(true)
                .cacheInMemory(true).resetViewBeforeLoading(true)
                .imageScaleType(ImageScaleType.EXACTLY)
                .bitmapConfig(Bitmap.Config.RGB_565).considerExifParams(true)
                .displayer(new RoundedBitmapDisplayer(20)).build();

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(
                context).threadPoolSize(3)
                .threadPriority(Thread.NORM_PRIORITY - 2)
                .denyCacheImageMultipleSizesInMemory()
                .discCacheFileNameGenerator(new Md5FileNameGenerator())
                .tasksProcessingOrder(QueueProcessingType.LIFO)
                .writeDebugLogs() // Remove for release app
                .build();
        // Initialize ImageLoader with configuration.
        ImageLoader.getInstance().init(config);
    }
	
	public static ImageApp getInstance(){
        return instance;
    }

    public UserInfo getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(UserInfo userinfo) {
        this.userinfo = userinfo;
    }
	
}
