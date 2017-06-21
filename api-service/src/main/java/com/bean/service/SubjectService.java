package com.bean.service;


import com.bean.model.Subject;

import java.util.List;
import java.util.Map;

public interface SubjectService {
    /**
     * 添加班级
     * @param subject 班级对象
     * @return 添加班级的 id
     */
    int insertSubject(Subject subject);

    /**
     * 编辑/删除班级
     * @param subject 班级对象
     * @return
     *
     * 删除时 setDel(0)
     */
    boolean updateSubject(Subject subject);

    /**
     * 根据传入的map信息获取班级对象
     * @param map key 为 Subject 属性
     * @return 班级对象
     */
    Subject getSubjectByInfo(Map<String, String> map);

    /**
     * 根据传入的map信息获取班级List
     * @param map key 为 Subject 属性
     * @return List<Subject>
     */
    List<Subject> getSubjectListByInfo(Map<String, String> map);

    /**
     * 根据条件获取班级数量
     * @param map key 为 Subject 属性
     * @return 班级数量
     */
    Integer getSubjectCountByInfo(Map<String, String> map);
}
