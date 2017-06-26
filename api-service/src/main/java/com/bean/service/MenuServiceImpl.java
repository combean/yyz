package com.bean.service;

import com.bean.dao.MenuMapper;
import com.bean.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.util.List;
import java.util.Map;


@Service("menuService")
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    private MyLogger LOGGER = new MyLogger(MenuServiceImpl.class);


    @Override
    public int insertMenu(Menu menu) {
        return menuMapper.insert(menu);
    }

    @Override
    public Integer updateMenu(Menu menu) {
        return menuMapper.update(menu);
    }

    @Override
    public Menu getMenuByInfo(Map<String, String> map) {
        return menuMapper.getMenuByInfo(map);
    }

    @Override
    public List<Menu> getMenuListByInfo(Map<String, String> map) {
        return menuMapper.getMenuListByInfo(map);
    }

    @Override
    public Integer getMenuCountByInfo(Map<String, String> map) {
        return menuMapper.getMenuCountByInfo(map);
    }
}
