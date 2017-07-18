package com.bean.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class ExamPaper implements Serializable {
    private Integer examPaperId;

    private Integer examId;

    private Integer paperId;

    /**
     * 考卷名称
     */
    private String paperName;

    /**
     * 考卷类型 0:练习考试 1:正式考试 2:练习正式均可
     */
    private Integer paperType;

    /**
     * 考试时长
     */
    private Integer examMinutes;

    /**
     * 开始时间 不填随时开始
     */
    private Date startTime;

    /**
     * 结束(失效)时间 不填永久有效
     */
    private Date endTime;

    private String placeName;

    private String placeInfo;

    private String subjectName;

    private static final long serialVersionUID = 1L;

    public Integer getExamPaperId() {
        return examPaperId;
    }

    public void setExamPaperId(Integer examPaperId) {
        this.examPaperId = examPaperId;
    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public Integer getPaperType() {
        return paperType;
    }

    public void setPaperType(Integer paperType) {
        this.paperType = paperType;
    }

    public Integer getExamMinutes() {
        return examMinutes;
    }

    public void setExamMinutes(Integer examMinutes) {
        this.examMinutes = examMinutes;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceInfo() {
        return placeInfo;
    }

    public void setPlaceInfo(String placeInfo) {
        this.placeInfo = placeInfo;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}