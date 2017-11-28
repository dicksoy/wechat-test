package com.dicksoy.wechat.base;

import java.io.IOException;

import org.apache.http.ParseException;

import com.dicksoy.wechat.po.AccessToken;
import com.dicksoy.wechat.util.WechatUtil;

import redis.clients.jedis.Jedis;

public class BaseController {

	protected Jedis jedis = new Jedis("192.168.11.131", 6379);;
	
	protected AccessToken getAccessToken(){
		this.jedis.auth("Dicksoy89757");
		AccessToken token = new AccessToken();
		try {
			boolean exist = jedis.exists("access_token");
			if(exist){
				token.setToken(jedis.get("access_token"));
			}else{
				token = WechatUtil.getAccessToken();
				jedis.set("access_token", token.getToken());
				//设置redis存储的时间（单位秒）
				jedis.expire("access_token", 3600);
			}
		} catch (ParseException | IOException e) {
			e.printStackTrace();
		}
		return token;
	}
}
