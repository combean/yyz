package com.bean.springboot;

import com.bean.model.User;
import com.bean.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	public void insertUser() throws  Exception{
		User user = new User();
		user.setUserUsername("duhongda");
		user.setUserPassword("666666666");
		user.setUserClassId(1);
		user.setAddname("zhaoyan");
		user.setAddtime(new Date());
		user.setAddid(1);
		userService.insertUser(user);
	}

	@Test
	public void updateUser() throws Exception{
		User user = new User();
		user.setUserPassword("7777777");
		user.setUserId(2);
		user.setUserClassId(1);
		user.setDel(0);
		user.setEditname("zhaoyan");
		user.setEdittime(new Date());
		user.setEditid(1);
		userService.editUserById(user);
	}

}
