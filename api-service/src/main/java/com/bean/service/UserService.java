package com.bean.service;

import com.bean.model.User;
import java.util.List;
import java.util.Map;

public interface UserService {
    /**
     * 添加用户
     * @param user 用户对象
     * @return 添加用户的 id
     */
    int insertUser(User user);

    /**
     * 编辑/删除用户
     * @param user 用户对象
     * @return boolean
     *
     * 删除时 setDel(0)
     */
    Integer updateUser(User user);

    /**
     * 根据传入的map信息获取用户对象
     * @param map key 为User属性
     * @return 用户对象
     */
    User getUserByInfo(Map<String,String> map);

    /**
     * 根据传入的map信息获取用户List
     * @param map key 为User属性
     * @return List<User>
     */
    List<User> getUserListByInfo(Map<String,String> map);

    /**
     * 根据条件获取用户数量
     * @param map key 为User属性
     * @return
     */
    Integer getUserCountByInfo(Map<String,String> map);
}
