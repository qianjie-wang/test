package com.jw.service;

import org.springframework.stereotype.Component;

import com.jw.bean.User;
import com.jw.entity.BussinessException;
import com.jw.entity.UserVO;

@Component
public interface UserService {

	UserVO createUser(User userVO) throws BussinessException;
	
	boolean checkUserExist(User userVO);
}
