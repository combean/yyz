package com.bean.springboot;

import com.bean.model.Role;
import com.bean.service.UClassService;
import com.bean.service.RoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleApplicationTests {

	@Autowired
	private RoleService roleService;


	@Test
	public void insert() throws  Exception{
		Role role = new Role();
		role.setRoleName("超级管理员");
		role.setRoleKey("role_admin");
		role.setMemo("超级管理员备注");
		role.setAddname("zhaoyan");
		role.setAddtime(new Date());
		role.setAddid(1);
		Integer i = roleService.insert(role);

		Role role1 = new Role();
		role1.setRoleName("教师");
		role1.setRoleKey("role_teacher");
		role1.setMemo("教师管理员备注");
		role1.setAddname("zhaoyan");
		role1.setAddtime(new Date());
		role1.setAddid(1);
		Integer i1 = roleService.insert(role1);
	}

	@Test
	public void update() throws Exception{
		Role role = new Role();
		role.setRoleName("超级管理员update");
		role.setRoleKey("role_admin");
		role.setMemo("超级管理员备注update");
		role.setRoleId(1);
		role.setDel(0);
		role.setEditname("zhaoyan");
		role.setEdittime(new Date());
		role.setEditid(1);
		roleService.update(role);
	}

	@Test
	public void getRoleObj() throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("roleName","超级管理员update");
		Role roleSelect = roleService.getByMap(map);
		System.out.println(roleSelect);
	}

	@Test
	public void getRoleList() throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("roleName","超级管理员");
		List<Role> roleSelect = roleService.getListByMap(map);
		System.out.println(roleSelect);
	}

	@Test
	public void getCountByMap() throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("roleName","超级管理员");
		int count = roleService.getCountByMap(map);
	}
}
