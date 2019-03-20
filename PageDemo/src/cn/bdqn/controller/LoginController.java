package cn.bdqn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.bdqn.entity.User;
import cn.bdqn.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService UserService;

	@ResponseBody
	@RequestMapping("/index.action")
	public Object index(Model model, @RequestParam(value = "pageNo", required = false) String pageNostr) {
		int pageNo = 1;
		int pageSize = 3;
		if (pageNostr != null) {
			pageNo = Integer.parseInt(pageNostr);
		}
		PageHelper.startPage(pageNo, pageSize);
		List<User> userlist = UserService.findAllUser();
		PageInfo<User> page = new PageInfo<User>(userlist);
		return page;
	}

	@ResponseBody
	@RequestMapping("/findById.action")
	public Object findById(@RequestParam(value = "id", required = false) String id) {
		System.out.println("========"+id);
		Integer uid = Integer.parseInt(id);
		User user = UserService.findById(uid);
		return user;

	}

}
