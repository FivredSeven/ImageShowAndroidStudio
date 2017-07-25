package com.suo.image.util;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.suo.image.ImageApp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class PubUtils {

    // public static Typeface helveticaType =
    // Typeface.createFromAsset(SaoPauloApp.getInstance().getAssets(),
    // "fonts/Helvetica.Ttf");

    public static Map<String, String> fileFormatMap = new HashMap<String, String>();
    static {
        fileFormatMap.put("art", "image/x-jg");
        fileFormatMap.put("bmp", "image/bmp");
        fileFormatMap.put("gif", "image/gif");
        fileFormatMap.put("jpe", "image/jpeg");
        fileFormatMap.put("jpeg", "image/jpeg");
        fileFormatMap.put("jpg", "image/jpeg");
        fileFormatMap.put("png", "image/png");
    }

    public static String getImgRealMimeType(String imgFormat) {
        String mineType = fileFormatMap.get(imgFormat);
        if (TextUtils.isEmpty(mineType)) {
            mineType = "image/jpeg"; // 默认为jpg
        }
        return mineType;
    }

    /**
     * 对话框提示
     * 
     * @param context
     * @param msg
     */
    public static void showTipDialog(Context context, String msg) {
        if (context instanceof Activity) {
            Activity ac = ((Activity) context);
            if (!ac.isFinishing()) {
                // TipDialog tipDialog = new TipDialog(context);
                // tipDialog.showTip(msg);
            }
        }

    }

    public static void showTipDialog(Context context, int msg) {
        showTipDialog(context, context.getString(msg));
    }

    /**
     * 返回中间删除线的文本
     */
    public static SpannableString getDeleteStr(String content) {
        SpannableString sps = new SpannableString(content);
        sps.setSpan(new StrikethroughSpan(), 0, content.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        return sps;
    }

    /**
     * 设置文字的底部下划线文本
     * 
     * @param tv
     * @param str
     */
    public static void setUnderlineStr(TextView tv, String str) {
        tv.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        tv.setText(str);
    }

    /**
     * 返回指定颜色的文本
     */
    public static SpannableString getColorStr(String content, int color) {

        SpannableString sps = new SpannableString(content); // 更换字体颜色
        sps.setSpan(new ForegroundColorSpan(color), 0, content.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        return sps;
    }

    /**
     * 设置TextView的字体风格
     * 
     * @param tv
     * @param tf
     */
    public static void setTextViewFont(TextView tv, Typeface tf) {
        tv.setTypeface(tf);
    }

    /**
     * 设置字体为 默认冬青黑体样式
     * 
     * @param tv
     */
    public static void setDefaultTvFont(TextView tv) {
        // setTextViewFont(tv, helveticaType);
    }

    /**
     * 返回图片适配的高度
     * 
     * @param picWidth
     * @param picHeight
     * @param desWidth
     * @return
     */
    public static int getRealHeight(int picWidth, int picHeight, int desWidth) {
        return (picHeight * desWidth) / picWidth;
    }

    /**
     * 根据图片应用在满屏的适配的高度
     * 
     * @param picWidth
     * @param picHeight
     * @return
     */
    public static int getDefScreenRealHeight(int picWidth, int picHeight) {
        int sceenWidth = Density.getSceenWidth(ImageApp.getInstance());
        return getRealHeight(picWidth, picHeight, sceenWidth);
    }

    // 正则表达式验证
    public static boolean checkString(String s, String regex) {
        return s.matches(regex);
    }

    /**
     * 弹吐司
     * 
     * @param ctx
     * @param txt
     */
    public static void popTipOrWarn(Context ctx, String txt) {
        Toast.makeText(ctx, txt, Toast.LENGTH_SHORT).show();
    }

    public static void popTipOrWarn(Context ctx, int txt) {
        Toast.makeText(ctx, txt, Toast.LENGTH_SHORT).show();
    }

    /**
     * 返回当前程序版本名
     */
    public static int getAppVersionCode(Context context) {
        int versionCode = 0;
        try {
            PackageManager pm = context.getPackageManager();
            PackageInfo pi = pm.getPackageInfo(context.getPackageName(), 0);
            versionCode = pi.versionCode;
            // versionName = pi.versionName;
        } catch (Exception e) {
            Log.e("VersionInfo", "Exception", e);
        }
        return versionCode;
    }

    /**
     * 返回当前程序版本名
     */
    public static String getAppVersionName(Context context) {
        String versionName = "1.0";
        try {
            PackageManager pm = context.getPackageManager();
            PackageInfo pi = pm.getPackageInfo(context.getPackageName(), 0);
            versionName = pi.versionName;
            // versionName = pi.versionName;
        } catch (Exception e) {
            Log.e("VersionInfo", "Exception", e);
        }
        return versionName;
    }

    public static String addFileBegin(String path) {
        if (path.startsWith("file://"))
            return path;
        return "file://" + path;
    }

    public static String getFileName(String path) {
        if (path == null) {
            return "";
        }
        int i = path.lastIndexOf("\\");
        if (i < 0) {
            i = path.lastIndexOf("/");
        }
        if (i < 0) {
            return path;
        }
        return path.substring(i + 1);
    }

    public static String getFileFormat(String path) {
        if (path == null) {
            return "";
        }
        int i = path.lastIndexOf(".");
        if (i < 0) {
            return path;
        }
        return path.substring(i + 1);
    }

    /**
     * 去掉小月份前面的0，譬如07月变成7月，12月不变。
     * 
     * @param month
     * @return
     */
    public static String tranMonth(String month) {
        if ("0".equals(month.substring(0, 1))) {
            month = month.substring(1, 2);
        }
        return month;
    }

    /**
     * 产生唯一的ID号
     * 
     * @return
     */
    public static String getUUId() {
        return UUID.randomUUID().toString();
    }

    public static String getCookie(List<String> cookies) {

        StringBuffer sb = new StringBuffer();
        int j = 0;
        String strCookies = cookies.toString();
        strCookies = strCookies.replace("[", "");
        strCookies = strCookies.replace("]", "");
        String[] arrayCookies = strCookies.split(",");
        if (arrayCookies != null & arrayCookies.length > 0) {
            // String arrayItems = arrayCookies
            for (int i = 0; i < arrayCookies.length; i++) {
                String strItems = arrayCookies[i];
                String[] strArrayItems = strItems.split(";");
                if (strArrayItems != null && strArrayItems.length > 0) {
                    if (j > 0) {
                        sb.append(";");
                    }
                    sb.append(strArrayItems[0]);
                    j++;
                }
            }
        }
        String cookie = sb.toString();
        return cookie;

        /*
         * String strCookies = cookies.toString(); strCookies = strCookies.replace("[", ""); strCookies =
         * strCookies.replace("]", ""); return strCookies;
         */
    }

    public static final String getMoneyAmount(String payAmount) {
        Double douAmount = Double.valueOf(payAmount);
        int intAmount = douAmount.intValue();
        return ("¥" + intAmount / 100);
    }

    public static String getNowDatetimeStr() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.CHINA);
        Date date = new Date();
        return sdf.format(date);
    }

    public static String getTomDatetimeStr() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.CHINA);
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, 1);
        return sdf.format(cal.getTime());
    }

    /**
     * type 0 代表 取奇数，1代表 取 偶数
     * 
     * @param src
     * @param type
     * @return
     */
    public static String getOddOrEvenString(String src, int type) {
        if (src == null || src.length() <= 0) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < src.length(); i++) {
            if (i % 2 == type) {
                sb.append(src.charAt(i));
            }
        }
        return sb.toString();
    }

    /**
     * 判断选择服务日期时间 是否早于手机当前时间 <一句话功能简述> <功能详细描述>
     * 
     * @return
     * @see [类、类#方法、类#成员]
     */
    public static boolean compare_date(String time) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            Date dt1 = df.parse(time);
            Date dt2 = new Date();
            if (dt1.getTime() > (dt2.getTime() + 60 * 60 * 1000)) {
                // System.out.println("dt1 在dt2前");
                return true;
            } else if (dt1.getTime() < dt2.getTime()) {
                // System.out.println("dt1在dt2后");
                return false;
            } else {
                return false;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return false;
    }

    public static String selectTime(String begin, String select, String end) {
        DateFormat df = new SimpleDateFormat("HH:mm");
        Date d1;
        Date d2;
        Date d3;
        try {
            d1 = df.parse(begin);
            d2 = df.parse(select);
            d3 = df.parse(end);
            System.out.println("d1:" + d1.getTime());
            System.out.println("d2:" + d2.getTime());
            if ((d2.getTime() - d1.getTime()) < 0) {
                return "您所选的时间早于商家的营业时间，请重新选择";
            }
            if (d3.getTime() - d2.getTime() < 0) {
                return "您所选的时间晚于商家的营业时间，请重新选择";
            }
            if (d3.getTime() - d2.getTime() < 1000 * 60 * 60) {
                return "您所选的时间不能晚于商家的营业截止时间1小时之内，请重新选择";
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 正则表达式 判断电话号是否正确
     */
    public static boolean isPhoneHomeNum(String num) {
        Pattern p = Pattern
                .compile("^(((13[0-9])|(15([0-3]|[5-9])|170)|(18[0,5-9]))\\d{8})|(0\\d{2}-\\d{8})|(0\\d{3}-\\d{8})$");
        Matcher m = p.matcher(num);
        return m.matches();
    }

    /**
     * 正则表达式 判断手机号是否正确
     */
    public static boolean isPhoneNum(String num) {
        Pattern p = Pattern.compile("^(((13[0-9])|(15[0-9])|(18[0-9])|(147)|(177))\\d{8})$");
        Matcher m = p.matcher(num);
        return m.matches();
    }

    /* 时间戳转换成字符窜 */
    public static String getDateToString(String time) {
        Date d = new Date(Long.parseLong(time));
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        return sf.format(d);
    }

    /* 时间戳转换成字符窜 */
    public static String getDateToFormat(long time) {
        Date d = new Date(time);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return sf.format(d);
    }

    /* 时间戳转换成字符窜 */
    public static String getDateToFormat1(long time) {
        Date d = new Date(time);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        return sf.format(d);
    }

    /**
     * 获取时间
     */
    public static String getTimeFromat(long time) {
        Date d = new Date(time);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        String returnTime = "";
        if (getDateGap(time) == -1) {
            returnTime = "昨天";
        } else if (getDateGap(time) < -1) {
            returnTime = getDateToFormat1(time);
        } else {
            long nowTime = System.currentTimeMillis();
            // if (nowTime - time < 60 * 60 * 1000) {
            // long minutes = ((nowTime - time) % (1000 * 60 * 60))
            // / (1000 * 60);
            // returnTime = minutes + "分前";
            // } else {
            if (calendar.get(Calendar.AM_PM) == Calendar.AM) {
                returnTime = "上午 " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE);
            } else if (calendar.get(Calendar.AM_PM) == Calendar.PM) {
                returnTime = "下午 " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE);
                // }
            }
        }
        return returnTime;
    }

    /**
     * 获取给定的时间和当前系统时间的间隔天数
     * 
     * @return 0：今天，1：明天， 2：后天，-1:昨天，-2：前天
     */
    public static int getDateGap(long time) {
        int gap = -10;
        try {
            Calendar calendarNow = Calendar.getInstance();
            Calendar calendarTime = Calendar.getInstance();
            calendarNow.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
            calendarTime.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
            calendarTime.setTimeInMillis(time);

            calendarNow.set(Calendar.HOUR_OF_DAY, 12);
            calendarNow.set(Calendar.MINUTE, 0);
            calendarNow.set(Calendar.SECOND, 0);
            calendarNow.set(Calendar.MILLISECOND, 0);

            calendarTime.set(Calendar.HOUR_OF_DAY, 12);
            calendarTime.set(Calendar.MINUTE, 0);
            calendarTime.set(Calendar.SECOND, 0);
            calendarTime.set(Calendar.MILLISECOND, 0);

            gap = (int) ((calendarTime.getTimeInMillis() - calendarNow.getTimeInMillis()) / (24 * 60 * 60 * 1000));

        } catch (Exception e) {
            e.printStackTrace();
        }

        return gap;
    }

    /**
     * 判断字符串是否为空
     * 
     * @param str
     * @return
     */
    public static boolean isNullOrEmpty(String str) {
        if (str != null && !str.equals("") && !str.trim().equals("") && !str.equals("null"))
            return false;
        else
            return true;
    }

    /**
     * 时间戳转换成字符窜 "yyyy-MM-dd"
     */

    public static String getDateToString(String time, String pattern) {
        Date d = new Date(Long.parseLong(time));
        SimpleDateFormat sf = new SimpleDateFormat(pattern);
        return sf.format(d);
    }

    /**
     * 距离m转化为km
     * 
     * @param meterStr 距离(m)
     * @return
     */
    public static String getStringMeter2KM(int meterStr) {
        if (meterStr <= 1000) {
            return meterStr + "m";
        } else {
            int limit = 50 * 1000;
            if (meterStr <= limit) {
                DecimalFormat df = new DecimalFormat("0.0");
                Double floatDistance = (Double) (meterStr / 1000.00);
                return df.format(floatDistance) + "km";
            } else {
                return meterStr / 1000 + "km";
            }

        }
    }

    public static String getDo(String str) {
        if (!TextUtils.isEmpty(str)) {
            double abc = Double.parseDouble(str);
            DecimalFormat df = new DecimalFormat("#.#");
            return df.format(abc);
        }
        return str;
    }

    public static String getTime(long l) {
        String str_d;
        String str_h;
        String str_m;
        String str_s;
        int day = (int) (l / (24 * 60 * 60 * 1000));
        int hour = (int) ((l - ((long)day * 24 * 60 * 60 * 1000)) / (60 * 60 * 1000));
        int minute = (int) ((l - ((long)day * 24 * 60 * 60 * 1000) - ((long)hour * 60 * 60 * 1000)) / (60 * 1000));
        int second = (int) ((l - ((long)day * 24 * 60 * 60 * 1000) - ((long)hour * 60 * 60 * 1000) - ((long)minute * 60 * 1000)) / 1000);
        if (day>0){
            str_d = day + "天";
        }else{
            str_d = "";
        }
        if (hour > 10) {
            str_h = "" + hour + "小时";
        } else if (hour > 0) {
            str_h = "0" + hour + "小时";
        } else {
            str_h = "";
        }
        if (minute > 10) {
            str_m = "" + minute + "分";
        } else if (minute > 0) {
            str_m = "0" + minute + "分";
        } else {
            str_m = "";
        }
        if (second > 10) {
            str_s = "" + second + "秒";
        } else if (second > 0) {
            str_s = "0" + second + "秒";
        } else {
            str_s = "";
        }
        return str_d + str_h + str_m + str_s;
    }

    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     */
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    public static boolean isNetworkAvailable(Activity activity) {
        Context context = activity.getApplicationContext();
        // 获取手机所有连接管理对象（包括对wi-fi,net等连接的管理）
        ConnectivityManager connectivityManager = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);

        if (connectivityManager == null) {
            return false;
        } else {
            // 获取NetworkInfo对象
            NetworkInfo[] networkInfo = connectivityManager.getAllNetworkInfo();

            if (networkInfo != null && networkInfo.length > 0) {
                for (int i = 0; i < networkInfo.length; i++) {
                    System.out.println(i + "===状态===" + networkInfo[i].getState());
                    System.out.println(i + "===类型===" + networkInfo[i].getTypeName());
                    // 判断当前网络状态是否为连接状态
                    if (networkInfo[i].getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
