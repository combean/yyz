package com.pxjx.dao;

import com.pxjx.model.ClassSubject;
import com.pxjx.model.ClassSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassSubjectMapper {
    long countByExample(ClassSubjectExample example);

    int deleteByExample(ClassSubjectExample example);

    int deleteByPrimaryKey(Integer classSubjectId);

    int insert(ClassSubject record);

    int insertSelective(ClassSubject record);

    List<ClassSubject> selectByExample(ClassSubjectExample example);

    ClassSubject selectByPrimaryKey(Integer classSubjectId);

    int updateByExampleSelective(@Param("record") ClassSubject record, @Param("example") ClassSubjectExample example);

    int updateByExample(@Param("record") ClassSubject record, @Param("example") ClassSubjectExample example);

    int updateByPrimaryKeySelective(ClassSubject record);

    int updateByPrimaryKey(ClassSubject record);
}