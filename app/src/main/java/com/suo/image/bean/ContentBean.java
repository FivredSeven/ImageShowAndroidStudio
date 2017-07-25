package com.suo.image.bean;

import cn.bmob.v3.BmobObject;

public class ContentBean extends BmobObject {

	private Number contentId;
	private String contentUrl;
	private String contentText;
	private Number imageId;
	private Number id;
	private String zanCount;
	private Number zan;
	private String userId;
	private String userHeadPhoto;
	
	public Number getContentId() {
		return contentId;
	}
	public void setContentId(Number contentId) {
		this.contentId = contentId;
	}
	public String getContentUrl() {
		return contentUrl;
	}
	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}
	public String getContentText() {
		return contentText;
	}
	public void setContentText(String contentText) {
		this.contentText = contentText;
	}
	public Number getImageId() {
		return imageId;
	}
	public void setImageId(Number imageId) {
		this.imageId = imageId;
	}
    public Number getId() {
        return id;
    }
    public void setId(Number id) {
        this.id = id;
    }
    public String getZanCount() {
        return zanCount;
    }
    public void setZanCount(String zanCount) {
        this.zanCount = zanCount;
    }
    public Number getZan() {
        return zan;
    }
    public void setZan(Number zan) {
        this.zan = zan;
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
