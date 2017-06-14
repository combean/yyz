package com.bean.dao;

import com.bean.model.CourseKnowlege;
import com.bean.model.CourseKnowlegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseKnowlegeMapper {
    long countByExample(CourseKnowlegeExample example);

    int deleteByExample(CourseKnowlegeExample example);

    int deleteByPrimaryKey(Integer courseKnowlegeId);

    int insert(CourseKnowlege record);

    int insertSelective(CourseKnowlege record);

    List<CourseKnowlege> selectByExample(CourseKnowlegeExample example);

    CourseKnowlege selectByPrimaryKey(Integer courseKnowlegeId);

    int updateByExampleSelective(@Param("record") CourseKnowlege record, @Param("example") CourseKnowlegeExample example);

    int updateByExample(@Param("record") CourseKnowlege record, @Param("example") CourseKnowlegeExample example);

    int updateByPrimaryKeySelective(CourseKnowlege record);

    int updateByPrimaryKey(CourseKnowlege record);
}