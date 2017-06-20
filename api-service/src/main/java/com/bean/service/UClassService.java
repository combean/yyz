package com.bean.service;

import com.bean.model.UClass;
import java.util.List;
import java.util.Map;

public interface UClassService {
    /**
     * 添加班级
     * @param uClass 班级对象
     * @return 添加班级的 id
     */
    int insertUClass(UClass uClass);

    /**
     * 编辑/删除班级
     * @param uClass 班级对象
     * @return
     *
     * 删除时 setDel(0)
     */
    boolean updateUClass(UClass uClass);

    /**
     * 根据传入的map信息获取班级对象
     * @param map key 为 UClass 属性
     * @return 班级对象
     */
    UClass getUClassByInfo(Map<String,String> map);

    /**
     * 根据传入的map信息获取班级List
     * @param map key 为 UClass 属性
     * @return List<UClass>
     */
    List<UClass> getUClassListByInfo(Map<String,String> map);

    /**
     * 根据条件获取班级数量
     * @param map key 为 UClass 属性
     * @return 班级数量
     */
    Integer getUClassCountByInfo(Map<String,String> map);
}
