package com.suo.image.bean;

import java.util.ArrayList;

import cn.bmob.v3.BmobObject;

public class UserInfo extends BmobObject {
    private String userId;
    private String username;
    private String password;
    private String nickname;
    private String headPhoto;
    private String city;
    private String sex;
    private String tokenAuth;
    private ArrayList<ContentBean> uploadIds;
    private ArrayList<ContentBean> likeIds;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getHeadPhoto() {
        return headPhoto;
    }
    public void setHeadPhoto(String headPhoto) {
        this.headPhoto = headPhoto;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public ArrayList<ContentBean> getLikeIds() {
        return likeIds;
    }
    public void setLikeIds(ArrayList<ContentBean> likeIds) {
        this.likeIds = likeIds;
    }
    public ArrayList<ContentBean> getUploadIds() {
        return uploadIds;
    }
    public void setUploadIds(ArrayList<ContentBean> uploadIds) {
        this.uploadIds = uploadIds;
    }
    public String getTokenAuth() {
        return tokenAuth;
    }
    public void setTokenAuth(String tokenAuth) {
        this.tokenAuth = tokenAuth;
    }
}
