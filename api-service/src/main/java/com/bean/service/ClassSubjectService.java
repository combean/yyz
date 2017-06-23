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
    boolean deleteByClassId(Integer classId);

}
