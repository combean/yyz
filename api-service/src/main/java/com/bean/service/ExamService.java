package com.bean.service;

import com.bean.model.Exam;
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
    int insertExam(Exam exam);

    /**
     * 编辑/删除考试
     * @param exam 考试对象
     * @return
     *
     * 删除时 setDel(0)
     */
    Integer updateExam(Exam exam);

    /**
     * 根据传入的map信息获取考试对象
     * @param map key 为 Exam 属性
     * @return 考试对象
     */
    Exam getExamByInfo(Map<String, String> map);

    /**
     * 根据传入的map信息获取考试List
     * @param map key 为 Exam 属性
     * @return List<Exam>
     */
    List<Exam> getExamListByInfo(Map<String, String> map);

    /**
     * 根据条件获取考试数量
     * @param map key 为 Exam 属性
     * @return 考试数量
     */
    Integer getExamCountByInfo(Map<String, String> map);
}
