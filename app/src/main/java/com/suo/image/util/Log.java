package com.suo.image.util;

public class Log {

	private static boolean isOpenLog = true;
	//private static boolean isOpenLog = false;

	public static void v(String msg) {
		if (isOpenLog)
			android.util.Log.v("com.suo.demo", msg);
	}

	public static void d(String msg) {
		if (isOpenLog)
			android.util.Log.d("com.suo.demo", msg);
	}

	public static void d(Object msg) {
		if (isOpenLog)
			android.util.Log.d("com.suo.demo", msg.toString());
	}

	public static void i(String msg) {
		if (isOpenLog)
			android.util.Log.i("com.suo.demo", msg);
	}

	public static void w(String msg) {
		if (isOpenLog)
			android.util.Log.w("com.suo.demo", msg);
	}

	public static void e(String msg) {
		if (isOpenLog)
			android.util.Log.e("com.suo.demo", msg);
	}

	public static void v(String tag, String msg) {
		if (isOpenLog)
			android.util.Log.v(tag, msg);
	}

	public static void d(String tag, String msg) {
		if (isOpenLog)
			android.util.Log.d(tag, msg);
	}

	public static void d(String tag, Object msg) {
		if (isOpenLog)
			android.util.Log.d(tag, msg.toString());
	}

	public static void i(String tag, String msg) {
		if (isOpenLog)
			android.util.Log.i(tag, msg);
	}

	public static void w(String tag, String msg) {
		if (isOpenLog)
			android.util.Log.w(tag, msg);
	}

	public static void e(String tag, String msg) {
		if (isOpenLog)
			android.util.Log.e(tag, msg);
	}
}

