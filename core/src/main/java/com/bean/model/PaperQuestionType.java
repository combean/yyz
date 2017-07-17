package com.bean.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author 
 */
public class PaperQuestionType implements Serializable {
    private Integer paperQuestionTypeId;

    /**
     * 分类排序
     */
    private Integer typeSequence;

    /**
     * 题目类型 0:单选 1:多选 2:填空 3:问答 4:分析 5:判断
     */
    private Integer typeId;

    /**
     * 考卷ID
     */
    private Integer paperId;

    /**
     * 题目难易等级 0:易 1:中 2:难
     */
    private Integer questionLevel;

    /**
     * 题目数量
     */
    private Integer questionNums;

    /**
     * 每题分数
     */
    private Integer questionRawScore;

    /**
     * 分类对应题目列表
     */
    private List<Question> questions;

    private static final long serialVersionUID = 1L;

    public Integer getPaperQuestionTypeId() {
        return paperQuestionTypeId;
    }

    public void setPaperQuestionTypeId(Integer paperQuestionTypeId) {
        this.paperQuestionTypeId = paperQuestionTypeId;
    }

    public Integer getTypeSequence() {
        return typeSequence;
    }

    public void setTypeSequence(Integer typeSequence) {
        this.typeSequence = typeSequence;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public Integer getQuestionLevel() {
        return questionLevel;
    }

    public void setQuestionLevel(Integer questionLevel) {
        this.questionLevel = questionLevel;
    }

    public Integer getQuestionNums() {
        return questionNums;
    }

    public void setQuestionNums(Integer questionNums) {
        this.questionNums = questionNums;
    }

    public Integer getQuestionRawScore() {
        return questionRawScore;
    }

    public void setQuestionRawScore(Integer questionRawScore) {
        this.questionRawScore = questionRawScore;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}