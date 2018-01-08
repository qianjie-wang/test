package com.jw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jw.bean.User;
import com.jw.entity.BussinessException;
import com.jw.entity.UserVO;
import com.jw.repsitory.UserRepository;

@Component
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserVO createUser(User user) throws BussinessException {
		
		UserVO userVO = new UserVO();
		userVO.setSex(user.getSex());
		userVO.setPassword(user.getPassword());
		userVO.setName(user.getName());
		userVO.setAge(user.getAge());
		
		UserVO userPO = null;
		if(!checkUserExist(user)) {
			userPO = userRepository.save(userVO);
//			if (userPO == null) {
//				return null;
//			}
		}else {
			throw new BussinessException("001" , "user exists!");
		}
		
		return userPO;
		
	}

	@Override
	public boolean checkUserExist(User user) {

		UserVO userVO = new UserVO();
//		userVO.setSex(user.getSex());
//		userVO.setPassword(user.getPassword());
		userVO.setName(user.getName());
//		userVO.setAge(user.getAge());
		
		UserVO userPO = userRepository.findByName(userVO.getName());
		
		if(null == userPO){
			return false;
		}
		return true;
	}

}
