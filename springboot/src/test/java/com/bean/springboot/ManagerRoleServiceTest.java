package com.bean.springboot;

import com.bean.model.ManagerRole;
import com.bean.service.ManagerRoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

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
    public void insertManagerRoleList() throws Exception {
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

        managerRoleService.insertManagerRoleList(list);
    }

    @Test
    public void insertManager() throws Exception {
        ManagerRole managerRole = new ManagerRole();
        managerRole.setManagerId(2);
        managerRole.setRoleId(2);
        managerRoleService.insertManagerRole(managerRole);
    }

    @Test
    public void deleteByManagerId() throws Exception {
        Integer i=managerRoleService.deleteByManagerId(1);
    }

    @Test
    public void getManagerRoleListByInfo() throws Exception {
        ManagerRole managerRole = new ManagerRole();
        managerRole.setManagerId(2);
        List<ManagerRole> list=managerRoleService.getManagerRoleListByInfo(managerRole);
    }

    @Test
    public void deleteByManagerRoleId() throws Exception {
        Integer i = managerRoleService.deleteByManagerRoleId(5);
    }

    @Test
    public void getCountByInfo() throws Exception{
        ManagerRole managerRole = new ManagerRole();
        managerRole.setManagerId(2);
        Integer i = managerRoleService.getCountByInfo(managerRole);
    }

}