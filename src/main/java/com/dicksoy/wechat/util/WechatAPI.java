package com.dicksoy.wechat.util;

/**
 * 微信官方Api
 * 使用Post，UTF-8编码格式
 */
public class WechatAPI {

	/**
	 * 如果第三方不使用中控服务器，而是选择各个业务逻辑点各自去刷新access_token，那么就可能会产生冲突，导致服务不稳定。
	 */
	public static final String ACCESS_TOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
	
	/**
	 * 查询门店列表
	 */
	public static final String FIND_ALL_SHOP = "https://api.weixin.qq.com/cgi-bin/poi/getpoilist?access_token=TOKEN";
	
	/**
	 * 查询门店信息
	 */
	public static final String FIND_SHOP_BY_POI_ID = "http://api.weixin.qq.com/cgi-bin/poi/getpoi?access_token=TOKEN";

	/**
	 * 修改门店信息
	 */
	public static final String UPDATE_SHOP_INFO = "https://api.weixin.qq.com/cgi-bin/poi/updatepoi?access_token=TOKEN";
	
	/**
	 * 删除门店信息
	 */
	public static final String DELETE_SHOP_BY_POI_ID = "https://api.weixin.qq.com/cgi-bin/poi/delpoi?access_token=TOKEN";
	
	/**
	 * 创建卡券
	 */
	public static final String CREATE_CARD = "https://api.weixin.qq.com/card/create?access_token=ACCESS_TOKEN";

	/**
	 * 设置买单接口
	 */
	public static final String SET_PAY_WAY = "URL:https://api.weixin.qq.com/card/paycell/set?access_token=TOKEN";
	
	/**
	 * 设置自助核销接口
	 */
	public static final String SET_AUTO_AUDIT = "https://api.weixin.qq.com/card/selfconsumecell/set?access_token=TOKEN";

	/**
	 * 创建门店
	 */
	public static final String TEMPLATE_MESSAGE = "http://api.weixin.qq.com/cgi-bin/poi/addpoi?access_token=TOKEN";
}
