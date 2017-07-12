package com.bean.service;


import com.bean.model.Subject;
import com.bean.model.SubjectKnowledge;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface SubjectService {
    /**
     * 添加科目
     * @param subject 科目对象
     * @return 插入条数
     *
     * 插入数据主键 Subject.getSubjectId();
     */
    int insert(Subject subject) throws SQLException;

    /**
     * 编辑/删除科目
     * @param subject 科目对象
     * @return
     *
     * 删除时 setDel(0)
     */
    Integer update(Subject subject) throws SQLException;

    /**
     * 根据传入的map信息获取科目对象
     * @param map key 为 Subject 属性
     * @return 科目对象
     */
    Subject getByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据传入的map信息获取科目List
     * @param map key 为 Subject 属性
     * @return List<Subject>
     */
    List<Subject> getListByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据条件获取科目数量
     * @param map key 为 Subject 属性
     * @return 科目数量
     */
    Integer getCountByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据主键ID 获取科目对象
     * @param id 主键ID
     * @return
     * @throws SQLException
     */
    Subject getById(int id) throws SQLException;

    /**
     * 插入科目和科目与知识点对应关系
     * @param subject 科目对象
     * @param subjectKnowledges 科目和知识点关系对象
     * @return
     * @throws SQLException
     */
    @Transactional
    int insertSubjectKnowledge(Subject subject, List<SubjectKnowledge> subjectKnowledges) throws SQLException;

    /**
     * 更新科目和科目与知识点对应关系
     * @param subject 科目对象
     * @param subjectKnowledges 科目和知识点关系对象
     * @return
     * @throws SQLException
     */
    @Transactional
    int updateSubjectKnowledge(Subject subject, List<SubjectKnowledge> subjectKnowledges) throws SQLException;
}
