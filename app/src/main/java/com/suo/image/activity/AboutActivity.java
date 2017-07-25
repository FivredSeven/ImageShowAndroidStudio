package com.suo.image.activity;

import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;

import com.suo.demo.R;
import com.suo.image.bean.AboutBean;
import com.suo.image.util.Log;
import com.suo.image.util.Preference;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AboutActivity extends BaseActivity {

	private Button btn_back;
	private TextView tv_my;
	private TextView tv_about_3_0;
	private TextView tv_about_3_1;
	private TextView tv_about_3_2;
	private TextView tv_about_3_3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		
		btn_back = (Button) findViewById(R.id.btn_back);
		tv_my = (TextView) findViewById(R.id.tv_my);
		tv_about_3_0 = (TextView) findViewById(R.id.tv_about_3_0);
		tv_about_3_1 = (TextView) findViewById(R.id.tv_about_3_1);
		tv_about_3_2 = (TextView) findViewById(R.id.tv_about_3_2);
		tv_about_3_3 = (TextView) findViewById(R.id.tv_about_3_3);
		btn_back.setOnClickListener(this);
		
		tv_about_3_0.setText("1.主界面改版\n2.添加闪屏页面\n3.增加分类查看\n4.图册里的文字可以复制到剪贴板\n5.增加网络缓存，浏览过的图片文字下次加载无需消耗流量！\n2014-10-16");
		tv_about_3_1.setText("1.去除所有形式的广告\n2.增加图片的页码显示\n3.增加图片的点赞功能\n4.由于目前app无需注册登录，所以暂不好增加评论功能，敬请期待下次改版，谢谢！\n2014-11-25");
		tv_about_3_2.setText("1.首页增加一个浮动小窗口进入热门图片功能(按照点赞的次数由多至少排序,大家赶紧来点赞吧)\n2.增加应用内更新app功能\n3.增加分享图文给QQ好友和微信好友及朋友圈 \n2015-01-07");
		tv_about_3_3.setText("1.新增QQ登录,注销功能\n2.新增个人主页功能,可以查看自己和别人的个人收藏及上传的图片\n3.图片加载方式变更,极大优化了加载效率\n4.修复之前的一些bug\n2015-02-10");
		
		String text = getString("about", "");
		if (!TextUtils.isEmpty(text)){
			tv_my.setText(text);
		}
		queryAbout();
	}
	
	private void queryAbout(){
		BmobQuery<AboutBean> bmobQuery = new BmobQuery<AboutBean>();
		bmobQuery.order("-updatedAt");
		bmobQuery.findObjects(new FindListener<AboutBean>() {
			@Override
			public void done(List<AboutBean> list, BmobException e) {
				if (e == null) {
					if (list != null && list.size()>0){
						Preference.putString("about", list.get(0).getAboutText());
						tv_my.setText(""+list.get(0).getAboutText());
					}
				}
			}
		});
	}

	@Override
	public void onClick(View v) {
		super.onClick(v);
		switch (v.getId()) {
		case R.id.btn_back:
			finish();
			break;

		default:
			break;
		}
	}


}
