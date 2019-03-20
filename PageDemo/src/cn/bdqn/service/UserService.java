package cn.bdqn.service;

import java.util.List;

import cn.bdqn.entity.User;

public interface UserService {

	List<User> findAllUser();
	
	User findById(Integer id);
}
