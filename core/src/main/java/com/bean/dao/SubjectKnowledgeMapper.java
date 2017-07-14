package com.bean.dao;

import com.bean.model.SubjectKnowledge;
import mybatis.basemapper.BaseMapper;

import java.util.List;

public interface SubjectKnowledgeMapper extends BaseMapper<SubjectKnowledge> {

    int deleteBySubjectId(Integer subjectId);

    List<SubjectKnowledge> getListBySubjectId(Integer subjectId);

}