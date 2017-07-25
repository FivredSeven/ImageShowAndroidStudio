package com.suo.image.bean;

import cn.bmob.v3.BmobObject;

public class UploadBean extends BmobObject {

	private String path;
	private String text;
	private String userinfo;
	private String userId;
	private String userHeadPhoto;
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getUserinfo() {
		return userinfo;
	}
	public void setUserinfo(String userinfo) {
		this.userinfo = userinfo;
	}
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserHeadPhoto() {
        return userHeadPhoto;
    }
    public void setUserHeadPhoto(String userHeadPhoto) {
        this.userHeadPhoto = userHeadPhoto;
    }

}
