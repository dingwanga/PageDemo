package cn.bdqn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bdqn.dao.UserDao;
import cn.bdqn.entity.User;
import cn.bdqn.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public List<User> findAllUser() {
		
		return userDao.findAllUser();
	}

	@Override
	public User findById(Integer id) {
		
		return userDao.findById(id);
	}

}
