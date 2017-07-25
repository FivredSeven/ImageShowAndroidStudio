package com.suo.image.bean;

import java.io.Serializable;

import cn.bmob.v3.BmobObject;

public class ImageBean extends BmobObject implements Serializable{
	private Number imageId;
	private String imageUrl;
	private String imageText;
	private String wordUrl;
	private String type;
	public Number getImageId() {
		return imageId;
	}
	public void setImageId(Number imageId) {
		this.imageId = imageId;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getImageText() {
		return imageText;
	}
	public void setImageText(String imageText) {
		this.imageText = imageText;
	}
	public String getWordUrl() {
		return wordUrl;
	}
	public void setWordUrl(String wordUrl) {
		this.wordUrl = wordUrl;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
