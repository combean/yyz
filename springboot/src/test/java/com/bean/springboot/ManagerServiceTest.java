package com.bean.springboot;

import com.bean.model.Manager;
import com.bean.service.ManagerService;
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
public class ManagerServiceTest {

    @Autowired
    private ManagerService managerService;

    @Test
    public void insert() throws Exception {
        Manager manager = new Manager();
        manager.setManagerUsername("zhaoyan");
        manager.setManagerPassword("1234567");
        manager.setManagerName("赵岩111");
        manager.setManagerMobile("15021464551");
        manager.setAddname("zhaoyan");
        manager.setAddtime(new Date());
        manager.setAddid(1);
        Integer i = managerService.insert(manager);

        Manager manager1 = new Manager();
        manager1.setManagerUsername("duhongda");
        manager1.setManagerPassword("666666");
        manager1.setManagerName("杜宏达");
        manager1.setManagerMobile("15021464552");
        manager1.setAddname("zhaoyan");
        manager1.setAddtime(new Date());
        manager1.setAddid(1);
        Integer i1 = managerService.insert(manager1);
    }

    @Test
    public void update() throws Exception {
        Manager manager = new Manager();
        manager.setManagerPassword("7777777");
        manager.setManagerId(1);
        manager.setManagerName("杜小贱");
        manager.setDel(0);
        manager.setEditname("zhaoyan");
        manager.setEdittime(new Date());
        manager.setEditid(1);
        managerService.update(manager);
    }

    @Test
    public void getByMap() throws Exception {
        Map<String,Object> map = new HashMap<>();
        map.put("managerId","1");
        Manager m = managerService.getByMap(map);
        System.out.print(m);
    }

    @Test
    public void getListByMap() throws Exception {
        Map<String,Object> map = new HashMap<>();
        map.put("managerName","杜宏");
        List<Manager> m = managerService.getListByMap(map);
        System.out.print(m);
    }

    @Test
    public void getCountByMap() throws Exception {
        Map<String,Object> map = new HashMap<>();
        map.put("managerName","杜宏");
        int count = managerService.getCountByMap(map);
    }

}