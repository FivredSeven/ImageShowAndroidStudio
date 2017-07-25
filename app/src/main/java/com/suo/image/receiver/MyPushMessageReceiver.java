package com.suo.image.receiver;

import com.google.gson.Gson;
import com.suo.demo.R;
import com.suo.image.ImageApp;
import com.suo.image.activity.Main_new;
import com.suo.image.activity.PictureNetContentActivity;
import com.suo.image.util.Log;

import cn.bmob.push.PushConstants;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;

public class MyPushMessageReceiver extends BroadcastReceiver {
	public static final String NOTIFICATION_SERVICE = "notification";
	public NotificationManager mNotificationManager;
	/** Notification������ */
	NotificationCompat.Builder mBuilder;
	/** Notification��ID */
	int notifyId = 100;
	
	public MyPushMessageReceiver() {
		if (mBuilder == null) {
			initNotify();
		}
	}
	@Override
	public void onReceive(Context context, Intent intent) {
		if(intent.getAction().equals(PushConstants.ACTION_MESSAGE)){
            Log.d("bmob", "客户端收到推送内容："+intent.getStringExtra(PushConstants.EXTRA_PUSH_MESSAGE_STRING));
            showIntentActivityNotify(intent.getStringExtra(PushConstants.EXTRA_PUSH_MESSAGE_STRING));
        }
	}

	public PendingIntent getDefalutIntent(int flags){
		PendingIntent pendingIntent= PendingIntent.getActivity(ImageApp.getAppContext(), 1, new Intent(), flags);
		return pendingIntent;
	}
	
	private void initNotify(){
		mNotificationManager = (NotificationManager) ImageApp.getAppContext().getSystemService(Context.NOTIFICATION_SERVICE);
		mBuilder = new NotificationCompat.Builder(ImageApp.getAppContext());
		mBuilder.setContentTitle("美图show")
				.setContentText("美图show")
				.setContentIntent(getDefalutIntent(Notification.FLAG_AUTO_CANCEL))
//				.setNumber(number)//��ʾ����
				.setTicker("美图show")
				.setWhen(System.currentTimeMillis())//֪ͨ�����ʱ�䣬����֪ͨ��Ϣ����ʾ
				.setPriority(Notification.PRIORITY_DEFAULT)//���ø�֪ͨ���ȼ�
//				.setAutoCancel(true)//���������־���û��������Ϳ�����֪ͨ���Զ�ȡ��  
				.setOngoing(false)//ture��������Ϊһ�����ڽ��е�֪ͨ������ͨ����������ʾһ����̨����,�û������(�粥������)����ĳ�ַ�ʽ���ڵȴ�,���ռ���豸(��һ���ļ�����,ͬ������,������������)
				.setDefaults(Notification.DEFAULT_VIBRATE)//��֪ͨ������������ƺ���Ч�����򵥡���һ�µķ�ʽ��ʹ�õ�ǰ���û�Ĭ�����ã�ʹ��defaults���ԣ�������ϣ�
				//Notification.DEFAULT_ALL  Notification.DEFAULT_SOUND ������� // requires VIBRATE permission
				.setSmallIcon(R.drawable.icon);
	}
	
	public void showIntentActivityNotify(String json){
		if (TextUtils.isEmpty(json)) {
			return;
		}
		Gson gson = new Gson();
		NotifyBean bean = gson.fromJson(json, NotifyBean.class);
		
		mBuilder.setAutoCancel(true)//�������֪ͨ����ʧ  
				.setContentTitle(""+bean.title)
				.setContentText(""+bean.content)
				.setTicker(""+bean.content);
		Intent resultIntent = new Intent(ImageApp.getAppContext(), PictureNetContentActivity.class);
		resultIntent.putExtra("imageid", bean.id);
		resultIntent.putExtra("imagetext", bean.title);
		resultIntent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
		PendingIntent pendingIntent = PendingIntent.getActivity(ImageApp.getAppContext(), 0,resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);
		mBuilder.setContentIntent(pendingIntent);
		mNotificationManager.notify(notifyId, mBuilder.build());
	}
	
	class NotifyBean {
		public String id;
		public String title;
		public String content;
	}
}
