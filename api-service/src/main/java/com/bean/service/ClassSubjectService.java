package com.bean.service;

import com.bean.model.ClassSubject;
import java.util.List;

public interface ClassSubjectService {
    /**
     * 添加班级科目关系
     * @param classsubject 添加班级科目关系对象
     * @return 添加添加班级科目关系 id
     */
    void insertClassSubject(List<ClassSubject> classsubject);

    /**
     * 编辑班级科目关系
     * @param classId 班级ID
     * @return
     */
    Integer deleteByClassId(Integer classId);

    /**
     * 根据班级ID获取班级科目对应关系List
     * @param classId 班级ID
     * @return 班级科目对应关系List
     */
    List<ClassSubject> getClassSubjectListByClassId(Integer classId);

    /**
     * 根据主键ID删除班级科目对应关系
     * @param classId
     * @return
     */
    Integer deleteByClassSubjectId(Integer classId);
}
