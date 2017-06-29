package com.bean.springboot;

import com.bean.model.Menu;
import com.bean.service.MenuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by PVer on 2017/6/26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MenuServiceTest {

    @Autowired
    private MenuService menuService;

    @Test
    public void insert() throws Exception {
        Menu menu = new Menu();
        menu.setMenuName("顶级菜单");
        menu.setMenuLevel(0);
        menu.setMenuKey("top_menu");
        menu.setAddid(1);
        menu.setAddname("zhaoyan");
        menu.setAddtime(new Date());
        menuService.insert(menu);

        Menu menu1 = new Menu();
        menu1.setMenuName("二级菜单");
        menu1.setMenuLevel(2);
        menu1.setMenuKey("second_menu");
        menu1.setMenuParentId(1);
        menu1.setAddid(1);
        menu1.setAddname("zhaoyan");
        menu1.setAddtime(new Date());
        menuService.insert(menu1);

        Menu menu2 = new Menu();
        menu2.setMenuName("二级菜单1");
        menu2.setMenuLevel(2);
        menu2.setMenuKey("second_menu");
        menu2.setMenuParentId(1);
        menu2.setAddid(1);
        menu2.setAddname("zhaoyan");
        menu2.setAddtime(new Date());
        menuService.insert(menu2);
    }

    @Test
    public void update() throws Exception {
        Menu menu = new Menu();
        menu.setMenuName("顶级菜单修改");
        menu.setMenuId(1);
        menu.setMenuKey("top_menu_update");
        menu.setEditid(1);
        menu.setEditname("zhaoyan");
        menu.setEdittime(new Date());
        menuService.update(menu);
    }

    @Test
    public void getByMap() throws Exception {
        Map<String,Object> map = new HashMap<>();
        map.put("menuName","顶级菜单修改");
        Menu u=menuService.getByMap(map);
        System.out.println(u);
    }

    @Test
    public void getListByMap() throws Exception {
        Map<String,Object> map = new HashMap<>();
        List<Menu> m = menuService.getListByMap(map);
        System.out.print(m);
    }

    @Test
    public void getCountByMap() throws Exception {
        Map<String,Object> map = new HashMap<>();
        Integer i = menuService.getCountByMap(map);
    }

}