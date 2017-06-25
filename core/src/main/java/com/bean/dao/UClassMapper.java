package com.bean.dao;

import com.bean.model.UClass;
import java.util.List;
import java.util.Map;

public interface UClassMapper {

    int insert(UClass uClass);

    Integer update(UClass uClass);

    UClass getUClassByInfo(Map<String,String> map);

    List<UClass> getUClassListByInfo(Map<String,String> map);

    Integer getUClassCountByInfo(Map<String,String> map);
}