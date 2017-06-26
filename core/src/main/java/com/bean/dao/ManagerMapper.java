package com.bean.dao;

import java.util.List;
import java.util.Map;
import com.bean.model.Manager;
import org.apache.ibatis.annotations.Param;

public interface ManagerMapper {
    int insert(Manager manager);

    Integer update(Manager manager);

    Manager getManagerByInfo(Map<String,String> map);

    List<Manager> getManagerListByInfo(Map<String,String> map);

    Integer getManagerCount(Map<String,String> map);
}