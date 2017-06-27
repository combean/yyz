package com.bean.service;

import com.bean.model.ManagerRole;
import java.util.List;

public interface ManagerRoleService {

    /**
     * 添加管理员角色关系
     * @param managerRole 添加管理员角色关系对象
     * @return 添加条数
     */
    int insertManagerRole(ManagerRole managerRole);

    /**
     * 添加管理员角色关系
     * @param managerRole 添加管理员角色关系List
     * @return 添加条数
     */
    int insertManagerRoleList(List<ManagerRole> managerRole);

    /**
     * 编辑管理员角色关系
     * @param managerId 管理员ID
     * @return
     */
    Integer deleteByManagerId(Integer managerId);

    /**
     * 根据管理员ID获取管理员角色对应关系List
     * @param managerRole 管理员ID
     * @return 管理员角色对应关系List
     */
    List<ManagerRole> getManagerRoleListByInfo(ManagerRole managerRole);

    /**
     * 根据主键ID删除管理员角色对应关系
     * @param managerRoleId
     * @return
     */
    Integer deleteByManagerRoleId(Integer managerRoleId);

    /**
     * 获取管理员角色对应关系数量
     * @param managerRole 管理员角色对应关系 对象
     * @return
     */
    Integer getCountByInfo(ManagerRole managerRole);
}
