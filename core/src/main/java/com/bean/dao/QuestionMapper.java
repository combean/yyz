package com.bean.dao;

import com.bean.model.Question;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface QuestionMapper {
    int insert(Question question);

    Integer update(Question question);

    Question getQuestionByInfo(Map<String,String> map);

    List<Question> getQuestionListByInfo(Map<String,String> map);

    Integer getQuestionCount(Map<String,String> map);
}