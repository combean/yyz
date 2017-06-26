package com.bean.service;

import com.bean.dao.ManagerMapper;
import com.bean.model.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.util.List;
import java.util.Map;

@Service("managerService")
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerMapper managerMapper;

    private MyLogger LOGGER = new MyLogger(ManagerServiceImpl.class);


    @Override
    public int insertManager(Manager manager) {
        return managerMapper.insert(manager);
    }

    @Override
    public Integer updateManager(Manager manager) {
        return managerMapper.update(manager);
    }

    @Override
    public Manager getManagerByInfo(Map<String, String> map) {
        return managerMapper.getManagerByInfo(map);
    }

    @Override
    public List<Manager> getManagerListByInfo(Map<String, String> map) {
        return managerMapper.getManagerListByInfo(map);
    }

    @Override
    public Integer getManagerCountByInfo(Map<String, String> map) {
        return managerMapper.getManagerCount(map);
    }
}
