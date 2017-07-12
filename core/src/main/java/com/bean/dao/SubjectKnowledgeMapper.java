package com.bean.dao;

import com.bean.model.SubjectKnowledge;
import mybatis.basemapper.BaseMapper;

public interface SubjectKnowledgeMapper extends BaseMapper<SubjectKnowledge> {

    int deleteBySubjectId(Integer subjectId);

}