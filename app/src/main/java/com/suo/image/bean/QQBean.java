package com.suo.image.bean;

import cn.bmob.v3.BmobObject;
/*
 * {
    "ret": 0,
    "pay_token": "6BF5FDEB524B2B26EFDDCDA2F7874DCD",
    "pf": "desktop_m_qq-10000144-android-2002-",
    "query_authority_cost": 2691,
    "authority_cost": -28953005,
    "openid": "6B7AC87AB89310B8AA6C926B340ADACE",
    "expires_in": 7776000,
    "pfkey": "e5c1c6deebc8e26f97270fa0f34e93fc",
    "msg": "",
    "access_token": "5691B1914866A8D349F28919EF49240B",
    "login_cost": 1038
    
    
    {
    "is_yellow_year_vip": "0",
    "ret": 0,
    "figureurl_qq_1": "http:\/\/q.qlogo.cn\/qqapp\/101117511\/6B7AC87AB89310B8AA6C926B340ADACE\/40",
    "figureurl_qq_2": "http:\/\/q.qlogo.cn\/qqapp\/101117511\/6B7AC87AB89310B8AA6C926B340ADACE\/100",
    "nickname": "布鲁克林乔",
    "yellow_vip_level": "0",
    "is_lost": 0,
    "msg": "",
    "city": "南京",
    "figureurl_1": "http:\/\/qzapp.qlogo.cn\/qzapp\/101117511\/6B7AC87AB89310B8AA6C926B340ADACE\/50",
    "vip": "0",
    "level": "0",
    "figureurl_2": "http:\/\/qzapp.qlogo.cn\/qzapp\/101117511\/6B7AC87AB89310B8AA6C926B340ADACE\/100",
    "province": "江苏",
    "is_yellow_vip": "0",
    "gender": "男",
    "figureurl": "http:\/\/qzapp.qlogo.cn\/qzapp\/101117511\/6B7AC87AB89310B8AA6C926B340ADACE\/30"
}
}
 */
public class QQBean{
    private String nickname;
    private String figureurl_qq_2;
    private String city;
    private String gender;
    private String access_token;
    private String expires_in;
    private String openid;
    
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getFigureurl_qq_2() {
        return figureurl_qq_2;
    }
    public void setFigureurl_qq_2(String figureurl_qq_2) {
        this.figureurl_qq_2 = figureurl_qq_2;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAccess_token() {
        return access_token;
    }
    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }
    public String getExpires_in() {
        return expires_in;
    }
    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }
    public String getOpenid() {
        return openid;
    }
    public void setOpenid(String openid) {
        this.openid = openid;
    }
}
