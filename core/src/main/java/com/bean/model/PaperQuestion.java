package com.bean.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class PaperQuestion implements Serializable {
    private Integer paperQuestionId;

    /**
     * 用户ID
     */
    private Integer paperId;

    /**
     * 考卷ID
     */
    private Integer questionId;

    /**
     * 题目标题
     */
    private String questionTitle;

    /**
     * 题目类型 0:单选 1:多选 2:填空 3:问答 4:分析 5:判断
     */
    private Integer questionType;

    /**
     * 题目难易等级 0:易 1:中 2:难
     */
    private Integer questionLevel;

    /**
     * 备注
     */
    private String memo;

    public Integer getPaperQuestionId() {
        return paperQuestionId;
    }

    public void setPaperQuestionId(Integer paperQuestionId) {
        this.paperQuestionId = paperQuestionId;
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public Integer getQuestionType() {
        return questionType;
    }

    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    public Integer getQuestionLevel() {
        return questionLevel;
    }

    public void setQuestionLevel(Integer questionLevel) {
        this.questionLevel = questionLevel;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}