package com.bean.dao;

import com.bean.model.Paper;
import com.bean.model.PaperExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface PaperMapper {
    int insert(Paper paper);

    Integer update(Paper paper);

    Paper getPaperByInfo(Map<String,String> map);

    List<Paper> getPaperListByInfo(Map<String,String> map);

    Integer getPaperCountByInfo(Map<String,String> map);
}