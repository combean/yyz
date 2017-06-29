package com.bean.springboot;

import com.bean.model.ManagerRole;
import com.bean.service.ManagerRoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by PVer on 2017/6/26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ManagerRoleServiceTest {

    @Autowired
    private ManagerRoleService managerRoleService;

    @Test
    public void insertList() throws Exception {
        List<ManagerRole> list = new ArrayList<>();
        ManagerRole managerRole = new ManagerRole();
        managerRole.setManagerId(1);
        managerRole.setRoleId(1);
        list.add(managerRole);

		ManagerRole managerRole1 = new ManagerRole();
		managerRole1.setManagerId(2);
		managerRole1.setRoleId(2);
		list.add(managerRole1);

        ManagerRole managerRole2 = new ManagerRole();
        managerRole2.setManagerId(1);
        managerRole2.setRoleId(2);
        list.add(managerRole2);

        ManagerRole managerRole3 = new ManagerRole();
        managerRole3.setManagerId(1);
        managerRole3.setRoleId(3);
        list.add(managerRole3);

        managerRoleService.insertList(list);
    }

    @Test
    public void insert() throws Exception {
        ManagerRole managerRole = new ManagerRole();
        managerRole.setManagerId(2);
        managerRole.setRoleId(2);
        managerRoleService.insert(managerRole);
    }

    @Test
    public void deleteByManagerId() throws Exception {
        Integer i=managerRoleService.deleteByManagerId(1);
    }

    @Test
    public void getListByMap() throws Exception {
//        ManagerRole managerRole = new ManagerRole();
//        managerRole.setManagerId(2);
        Map<String, Object> map = new HashMap<>();
        map.put("managerId",2);
        List<ManagerRole> list=managerRoleService.getListByMap(map);
    }

    @Test
    public void deleteByManagerRoleId() throws Exception {
        Integer i = managerRoleService.deleteById(5);
    }

    @Test
    public void getCountByMap() throws Exception{
//        ManagerRole managerRole = new ManagerRole();
//        managerRole.setManagerId(2);
        Map<String, Object> map = new HashMap<>();
        map.put("managerId",2);
        Integer i = managerRoleService.getCountByMap(map);
    }

}