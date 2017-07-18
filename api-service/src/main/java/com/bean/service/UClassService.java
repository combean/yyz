package com.bean.service;

import com.bean.model.ClassSubject;
import com.bean.model.UClass;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface UClassService {
    /**
     * 添加班级
     * @param uClass 班级对象
     * @return 插入条数
     *
     * 插入数据主键 UClass.getClassId();
     */
    int insert(UClass uClass) throws SQLException;

    /**
     * 编辑/删除班级
     * @param uClass 班级对象
     * @return
     *
     * 删除时 setDel(0)
     */
    int update(UClass uClass) throws SQLException;

    /**
     * 根据传入的map信息获取班级对象
     * @param map key 为 UClass 属性
     * @return 班级对象
     */
    UClass getByMap(Map<String,Object> map) throws SQLException;

    /**
     * 根据传入的map信息获取班级List
     * @param map key 为 UClass 属性
     * @return List<UClass>
     */
    List<UClass> getListByMap(Map<String,Object> map) throws SQLException;

    /**
     * 根据条件获取班级数量
     * @param map key 为 UClass 属性
     * @return 班级数量
     */
    int getCountByMap(Map<String,Object> map) throws SQLException;

    /**
     * 根据ID获取班级对象
     * @param id 班级ID
     * @return
     */
    UClass getById(int id) throws SQLException;

    @Transactional
    int insertClassSubject(UClass uClass, List<ClassSubject> classSubjects) throws SQLException;

    @Transactional
    int updateClassSubject(UClass uClass, List<ClassSubject> classSubjects) throws SQLException;
}
