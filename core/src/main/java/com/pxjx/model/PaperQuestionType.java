package com.pxjx.model;

import java.io.Serializable;

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
}