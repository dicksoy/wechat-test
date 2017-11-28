package com.dicksoy.wechat.auth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dicksoy.wechat.util.CheckUtil;

@Controller
@RequestMapping("/")
public class Authentication {

	/**
	 * 微信连接方式
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	@RequestMapping(value = "authentication", method = RequestMethod.GET)
	public void connectTest(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String signature = req.getParameter("signature");
		String timestamp = req.getParameter("timestamp");
		String nonce = req.getParameter("nonce");
		String echostr = req.getParameter("echostr");
		System.out.println("signature : "+signature);
		System.out.println("timestamp : "+timestamp);
		System.out.println("nonce : "+nonce);
		PrintWriter out = resp.getWriter();
		if(CheckUtil.checkSignature(signature, timestamp, nonce)){
			out.print(echostr);
		}
	}
	
	@RequestMapping(value = "index", method = RequestMethod.GET)
	@ResponseBody
	public String index() {
		System.out.println("index");
		return "index";
	}
}
