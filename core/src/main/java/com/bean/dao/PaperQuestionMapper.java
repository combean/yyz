package com.bean.dao;

import com.bean.model.PaperQuestion;
import com.bean.model.RoleMenu;
import mybatis.basemapper.BaseMapper;

public interface PaperQuestionMapper extends BaseMapper<PaperQuestion> {

    Integer deleteByPaperId(Integer paperId);

}