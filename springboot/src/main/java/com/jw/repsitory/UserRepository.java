package com.jw.repsitory;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jw.entity.UserVO;

@Repository
public interface UserRepository extends JpaRepository<UserVO , Integer>{
	
	UserVO findByName(String name);
	
	UserVO save(UserVO userVO);

}
