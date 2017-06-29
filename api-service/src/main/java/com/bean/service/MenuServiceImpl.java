package com.bean.service;

import com.bean.dao.MenuMapper;
import com.bean.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Service("menuService")
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    private MyLogger LOGGER = new MyLogger(MenuServiceImpl.class);


    @Override
    public int insert(Menu menu) throws SQLException {
        return menuMapper.insert(menu);
    }

    @Override
    public Integer update(Menu menu) throws SQLException {
        return menuMapper.update(menu);
    }

    @Override
    public Menu getByMap(Map<String, Object> map) throws SQLException {
        return menuMapper.getByMap(map);
    }

    @Override
    public List<Menu> getListByMap(Map<String, Object> map) throws SQLException {
        return menuMapper.getListByMap(map);
    }

    @Override
    public Integer getCountByMap(Map<String, Object> map) throws SQLException {
        return menuMapper.getCountByMap(map);
    }

    @Override
    public Menu getById(Integer id) throws SQLException {
        return menuMapper.getById(id);
    }
}
