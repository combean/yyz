package com.bean.dao;

import com.bean.model.Menu;
import java.util.List;
import java.util.Map;

public interface MenuMapper {
    int insert(Menu menu);

    Integer update(Menu menu);

    Menu getMenuByInfo(Map<String,String> map);

    List<Menu> getMenuListByInfo(Map<String,String> map);

    Integer getMenuCountByInfo(Map<String,String> map);
}