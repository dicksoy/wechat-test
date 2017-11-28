package com.dicksoy.wechat.util;

import java.io.IOException;

import org.apache.http.ParseException;

import com.alibaba.fastjson.JSONObject;
import com.dicksoy.wechat.po.AccessToken;

public class WechatUtil {

	/**
	 * appID: wxac40e65a3c3e1adb
	 */
	public static final String APPID = "wxac40e65a3c3e1adb";
	/**
	 * appsecret: 3046dabf20310f379f6473b102d0b9b2
	 */
	public static final String APPSECRET = "3046dabf20310f379f6473b102d0b9b2";
	
	public static AccessToken getAccessToken() throws ParseException, IOException{
		AccessToken token = new AccessToken();
		String url = WechatAPI.ACCESS_TOKEN_URL.replace("APPID", APPID).replace("APPSECRET", APPSECRET);
		JSONObject responseData = RequestUtil.doGetStr(url);
		if(responseData != null){
			token.setToken(responseData.getString("access_token"));
			token.setExpiresIn(responseData.getIntValue("expires_in"));
		}
		return token;
	}
	
}
