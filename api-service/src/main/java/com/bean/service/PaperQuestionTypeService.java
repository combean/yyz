package com.bean.service;

import com.bean.model.PaperQuestionType;

import java.util.List;

public interface PaperQuestionTypeService {

    /**
     * 添加考卷与试题分类关系
     * @param paperQuestionType 添加考卷与试题分类关系对象
     * @return 添加条数
     */
    int insertPaperQuestionType(PaperQuestionType paperQuestionType);

    /**
     * 添加考卷与试题分类关系
     * @param paperQuestionType 添加考卷与试题分类关系List
     * @return 添加条数
     */
    int insertPaperQuestionTypeList(List<PaperQuestionType> paperQuestionType);

    /**
     * 编辑考卷与试题分类关系
     * @param paperId 考卷ID
     * @return
     */
    Integer deleteByPaperId(Integer paperId);

    /**
     * 根据试题ID获取考卷与试题分类对应关系List
     * @param paperQuestionType
     * @return 考卷与试题分类对应关系List
     */
    List<PaperQuestionType> getPaperQuestionTypeListByInfo(PaperQuestionType paperQuestionType);

    /**
     * 根据主键ID删除考卷与试题分类对应关系
     * @param paperQuestionTypeId
     * @return
     */
    Integer deleteByPaperQuestionTypeId(Integer paperQuestionTypeId);

    /**
     * 获取考卷与试题分类对应关系数量
     * @param paperQuestionType 考卷与试题分类对应关系 对象
     * @return
     */
    Integer getCountByInfo(PaperQuestionType paperQuestionType);
}
