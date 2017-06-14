package com.bean.service;

import com.bean.model.User;

/**
 * Created by bean on 2016/6/22.
 */
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
     * 删除时 user.setDel(0)
     */
    boolean editUserById(User user);
}
