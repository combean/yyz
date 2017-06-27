package com.bean.service;

import com.bean.model.Content;

import java.util.List;
import java.util.Map;

public interface ContentService {
    /**
     * 添加课程内容/课件
     * @param content 课程内容/课件对象
     * @return 插入条数
     *
     * 插入数据主键 Content.getClassId();
     */
    int insertContent(Content content);

    /**
     * 编辑/删除课程内容/课件
     * @param content 课程内容/课件对象
     * @return
     *
     * 删除时 setDel(0)
     */
    Integer updateContent(Content content);

    /**
     * 根据传入的map信息获取课程内容/课件对象
     * @param map key 为 Content 属性
     * @return 课程内容/课件对象
     */
    Content getContentByInfo(Map<String, String> map);

    /**
     * 根据传入的map信息获取课程内容/课件List
     * @param map key 为 Content 属性
     * @return List<Content>
     */
    List<Content> getContentListByInfo(Map<String, String> map);

    /**
     * 根据条件获取课程内容/课件数量
     * @param map key 为 Content 属性
     * @return 课程内容/课件数量
     */
    Integer getContentCountByInfo(Map<String, String> map);
}
