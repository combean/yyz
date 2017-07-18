package com.bean.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author 
 */
public class Paper implements Serializable {
    /**
     * 考卷ID
     */
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
     * 考卷关联科目
     */
    private Integer subjectId;

    /**
     * 科目名称
     */
    private String subjectName;

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

    /**
     * 0:理论考试 1:实际操作考试
     */
    private Integer optionTheory;

    /**
     * 选题方式 0:随机选题 1:手动选题
     */
    private Integer selectQuestionType;

    /**
     * 考题分类List
     */
    private List<PaperQuestionType> paperQuestionTypes;

    private Integer placeId;

    private String placeName;

    /**
     * 备注
     */
    private String memo;

    /**
     * 1正常 0删除
     */
    private Integer del;

    /**
     * 添加人
     */
    private String addname;

    /**
     * 添加人的ID
     */
    private Integer addid;

    /**
     * 添加时间
     */
    private Date addtime;

    /**
     * 编辑人用户名
     */
    private String editname;

    /**
     * 编辑ID
     */
    private Integer editid;

    /**
     * 编辑时间
     */
    private Date edittime;

    private static final long serialVersionUID = 1L;

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

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
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

    public Integer getOptionTheory() {
        return optionTheory;
    }

    public void setOptionTheory(Integer optionTheory) {
        this.optionTheory = optionTheory;
    }

    public Integer getSelectQuestionType() {
        return selectQuestionType;
    }

    public void setSelectQuestionType(Integer selectQuestionType) {
        this.selectQuestionType = selectQuestionType;
    }

    public List<PaperQuestionType> getPaperQuestionTypes() {
        return paperQuestionTypes;
    }

    public void setPaperQuestionTypes(List<PaperQuestionType> paperQuestionTypes) {
        this.paperQuestionTypes = paperQuestionTypes;
    }

    public Integer getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    public String getAddname() {
        return addname;
    }

    public void setAddname(String addname) {
        this.addname = addname;
    }

    public Integer getAddid() {
        return addid;
    }

    public void setAddid(Integer addid) {
        this.addid = addid;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getEditname() {
        return editname;
    }

    public void setEditname(String editname) {
        this.editname = editname;
    }

    public Integer getEditid() {
        return editid;
    }

    public void setEditid(Integer editid) {
        this.editid = editid;
    }

    public Date getEdittime() {
        return edittime;
    }

    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }
}