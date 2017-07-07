package com.bean.springboot;

import com.bean.model.UClass;
import com.bean.model.User;
import com.bean.service.UClassService;
import com.bean.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	public void insertUser() throws  Exception{
		User user = new User();
		user.setUserUsername("zhaoyan");
		user.setUserPassword("1234567");
		user.setUserName("赵岩");
		user.setUserMobile("15021464551");
		user.setUserClassId(1);
		user.setAddname("zhaoyan");
		user.setAddtime(new Date());
		user.setAddid(1);
		Integer i = userService.insert(user);

		User user1 = new User();
		user1.setUserUsername("duxiaoda");
		user1.setUserPassword("6666666");
		user1.setUserName("杜晓达");
		user1.setUserMobile("15021464111");
		user1.setUserClassId(1);
		user1.setAddname("zhaoyan");
		user1.setAddtime(new Date());
		user1.setAddid(1);
		Integer ii = userService.insert(user1);
	}

	@Test
	public void updateUser() throws Exception{
		User user = new User();
		user.setUserPassword("7777777");
		user.setUserId(2);
		user.setUserName("杜小贱");
		user.setUserClassId(1);
		user.setDel(0);
		user.setEditname("zhaoyan");
		user.setEdittime(new Date());
		user.setEditid(1);
		userService.update(user);
	}

	@Test
	public void getUserObj() throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("userUsername","zhaoyan");
//		map.put("userMobile","15021464551");
		User userSelect = userService.getByMap(map);
		System.out.println(userSelect);
	}

	@Test
	public void getUserList() throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("userClassId","1");
		List<User> userSelect = userService.getListByMap(map);
		System.out.println(userSelect);
	}

	@Test
	public void getUserCountByInfo() throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("userClassId","1");
		int count = userService.getCountByMap(map);
	}

	@Test
	public void getById() throws Exception{
		User user = userService.getById(1);
	}
}
