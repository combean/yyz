package com.bean.service;

import com.bean.model.Exam;
import com.bean.model.ExamPaper;
import com.bean.model.UserExam;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface ExamService {
    /**
     * 添加考试
     * @param exam 考试对象
     * @return 插入条数
     *
     * 插入数据主键 Exam.getExamId();
     */
    int insert(Exam exam) throws SQLException;

    /**
     * 编辑/删除考试
     * @param exam 考试对象
     * @return
     *
     * 删除时 setDel(0)
     */
    Integer update(Exam exam) throws SQLException;

    /**
     * 根据传入的map信息获取考试对象
     * @param map key 为 Exam 属性
     * @return 考试对象
     */
    Exam getByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据传入的map信息获取考试List
     * @param map key 为 Exam 属性
     * @return List<Exam>
     */
    List<Exam> getListByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据条件获取考试数量
     * @param map key 为 Exam 属性
     * @return 考试数量
     */
    Integer getCountByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据主键ID获取考试对象
     * @param id 主键ID
     * @return
     * @throws SQLException
     */
    Exam getById(Integer id) throws SQLException;

    /**
     * 根据对象属性获取考试对象
     * @param exam 考试对象
     * @return 考试对象
     * @throws SQLException
     */
    Exam getByObj(Exam exam) throws SQLException;

    @Transactional
    int insertExamPaper(Exam exam, List<ExamPaper> examPapers, List<UserExam> userExams) throws SQLException;

    @Transactional
    int updateExamPaper(Exam exam, List<ExamPaper> examPapers, List<UserExam> userExams) throws SQLException;
}
