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
    public void insertManager() throws Exception {
        Manager manager = new Manager();
        manager.setManagerUsername("zhaoyan");
        manager.setManagerPassword("1234567");
        manager.setManagerName("赵岩111");
        manager.setManagerMobile("15021464551");
        manager.setAddname("zhaoyan");
        manager.setAddtime(new Date());
        manager.setAddid(1);
        Integer i = managerService.insertManager(manager);

        Manager manager1 = new Manager();
        manager1.setManagerUsername("duhongda");
        manager1.setManagerPassword("666666");
        manager1.setManagerName("杜宏达");
        manager1.setManagerMobile("15021464552");
        manager1.setAddname("zhaoyan");
        manager1.setAddtime(new Date());
        manager1.setAddid(1);
        Integer i1 = managerService.insertManager(manager1);
    }

    @Test
    public void updateManager() throws Exception {
        Manager manager = new Manager();
        manager.setManagerPassword("7777777");
        manager.setManagerId(1);
        manager.setManagerName("杜小贱");
        manager.setDel(0);
        manager.setEditname("zhaoyan");
        manager.setEdittime(new Date());
        manager.setEditid(1);
        managerService.updateManager(manager);
    }

    @Test
    public void getManagerByInfo() throws Exception {
        Map<String,String> map = new HashMap<>();
        map.put("managerId","1");
        Manager m = managerService.getManagerByInfo(map);
        System.out.print(m);
    }

    @Test
    public void getManagerListByInfo() throws Exception {
        Map<String,String> map = new HashMap<>();
        map.put("managerName","杜宏");
        List<Manager> m = managerService.getManagerListByInfo(map);
        System.out.print(m);
    }

    @Test
    public void getManagerCountByInfo() throws Exception {
        Map<String,String> map = new HashMap<>();
        map.put("managerName","杜宏");
        int count = managerService.getManagerCountByInfo(map);
    }

}