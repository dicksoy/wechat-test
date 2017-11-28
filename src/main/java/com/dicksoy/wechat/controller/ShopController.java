package com.dicksoy.wechat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dicksoy.wechat.base.BaseController;
import com.dicksoy.wechat.po.AccessToken;

import redis.clients.jedis.Jedis;

@Controller
@RequestMapping("wechatShop")
public class ShopController extends BaseController {

	@RequestMapping("createShop")
	@ResponseBody
	public Object createShop() {
		AccessToken token = getAccessToken();
		return token;
	}
}
