package cn.bdqn.dao;

import java.util.List;

import cn.bdqn.entity.User;

public interface UserDao {

	// 分页模糊查询
	List<User> findAllUser();
	
	User findById(Integer id);

}
