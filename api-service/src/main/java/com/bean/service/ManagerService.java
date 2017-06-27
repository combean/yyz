package com.bean.service;

import com.bean.model.Manager;
import java.util.List;
import java.util.Map;

public interface ManagerService {
    /**
     * 添加管理员
     * @param manager 管理员对象
     * @return 插入条数
     *
     * 插入数据的主键 Manager.getManagerId();
     */
    int insertManager(Manager manager);

    /**
     * 编辑/删除管理员
     * @param manager 管理员对象
     * @return boolean
     *
     * 删除时 setDel(0)
     */
    Integer updateManager(Manager manager);

    /**
     * 根据传入的map信息获取管理员对象
     * @param map key 为Manager属性
     * @return 管理员对象
     */
    Manager getManagerByInfo(Map<String, String> map);

    /**
     * 根据传入的map信息获取管理员List
     * @param map key 为Manager属性
     * @return List<Manager>
     */
    List<Manager> getManagerListByInfo(Map<String, String> map);

    /**
     * 根据条件获取管理员数量
     * @param map key 为Manager属性
     * @return
     */
    Integer getManagerCountByInfo(Map<String, String> map);
}
