package com.jw.controller;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jw.bean.ResponseEntity;
import com.jw.bean.User;
import com.jw.entity.BussinessException;
import com.jw.entity.UserVO;
import com.jw.service.UserService;

@Controller
@ComponentScan
public class LoginController {
	
	private static final Logger logger = LogManager.getLogger(LoginController.class);
	
	@Autowired
	private UserService userService;
	
	private static int a = 0;
	/*
	 * 常用的两种前端数据封装：1.map，2.entity.
	 */
//	@RequestMapping(value = "/login" , method = RequestMethod.GET)
//	@ResponseBody
//	public ResponseEntity login(User request) {
////		result
////		request.getParameterMap();
////		Map<String, Object> map = CommonUtil.getParameterMap(request);
//		return null;
//		
//	}
	
	@RequestMapping(value = "/test" , method = RequestMethod.GET)
	@ResponseBody
	public String test() {
		System.out.println("ok");
		return "ok";
	}
	
	@RequestMapping(value = "/" , method = RequestMethod.GET)
	String home() {
		return "Hello World!";
	}
	
	@RequestMapping(value = "/create" , method = RequestMethod.POST)
	public @ResponseBody ResponseEntity signUp(@RequestBody User user) {
		
		ResponseEntity responseEntity = new ResponseEntity();
		UserVO userVO = null;
		try {
			userVO = userService.createUser(user);
			logger.info("[created user:" + userVO.toString() + "]");
			responseEntity.setStatusCode(400);
			responseEntity.setObject(userVO);
		} catch (BussinessException e) {
			responseEntity.setMessage(e.getMessage());
		}
		return responseEntity;
	}


}
