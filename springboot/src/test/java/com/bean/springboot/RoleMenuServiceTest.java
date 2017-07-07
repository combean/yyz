package com.bean.springboot;

import com.bean.model.RoleMenu;
import com.bean.service.RoleMenuService;
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
public class RoleMenuServiceTest {

    @Autowired
    private RoleMenuService roleMenuService;

    @Test
    public void insertenu() throws Exception {
        List<RoleMenu> list = new ArrayList<>();
        RoleMenu roleMenu = new RoleMenu();
        roleMenu.setRoleId(1);
        roleMenu.setMenuId(1);;
        list.add(roleMenu);

        RoleMenu roleMenu1 = new RoleMenu();
        roleMenu1.setRoleId(2);
        roleMenu1.setMenuId(2);
        list.add(roleMenu1);

        RoleMenu roleMenu2 = new RoleMenu();
        roleMenu2.setRoleId(1);
        roleMenu2.setMenuId(2);
        list.add(roleMenu2);

        RoleMenu roleMenu3 = new RoleMenu();
        roleMenu3.setRoleId(1);
        roleMenu3.setMenuId(3);
        list.add(roleMenu3);

        roleMenuService.insertList(list);
    }

    @Test
    public void insertList() throws Exception {
        RoleMenu roleMenu = new RoleMenu();
        roleMenu.setRoleId(2);
        roleMenu.setMenuId(2);
        roleMenuService.insert(roleMenu);
    }

    @Test
    public void deleteByRoleId() throws Exception {
        Integer i=roleMenuService.deleteByRoleId(1);
    }

    @Test
    public void getListByMap() throws Exception {
//        RoleMenu roleMenu = new RoleMenu();
//        roleMenu.setRoleId(2);
        Map<String,Object> map = new HashMap<>();
        map.put("roleId",2);
        List<RoleMenu> list=roleMenuService.getListByMap(map);
    }

    @Test
    public void deleteByRoleMenuId() throws Exception {
        Integer i = roleMenuService.deleteById(5);
    }

    @Test
    public void getCountByMap() throws Exception {
//        RoleMenu roleMenu = new RoleMenu();
//        roleMenu.setRoleId(2);
        Map<String,Object> map = new HashMap<>();
        map.put("roleId",2);
        Integer i = roleMenuService.getCountByMap(map);
    }

}