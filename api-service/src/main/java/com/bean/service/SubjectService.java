package com.bean.service;


import com.bean.model.Subject;

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
    int insertSubject(Subject subject);

    /**
     * 编辑/删除科目
     * @param subject 科目对象
     * @return
     *
     * 删除时 setDel(0)
     */
    Integer updateSubject(Subject subject);

    /**
     * 根据传入的map信息获取科目对象
     * @param map key 为 Subject 属性
     * @return 科目对象
     */
    Subject getSubjectByInfo(Map<String, String> map);

    /**
     * 根据传入的map信息获取科目List
     * @param map key 为 Subject 属性
     * @return List<Subject>
     */
    List<Subject> getSubjectListByInfo(Map<String, String> map);

    /**
     * 根据条件获取科目数量
     * @param map key 为 Subject 属性
     * @return 科目数量
     */
    Integer getSubjectCountByInfo(Map<String, String> map);
}
