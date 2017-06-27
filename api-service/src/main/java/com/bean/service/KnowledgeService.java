package com.bean.service;

import com.bean.model.Knowledge;

import java.util.List;
import java.util.Map;

public interface KnowledgeService {
    /**
     * 添加知识点
     * @param knowledge 知识点对象
     * @return 插入条数
     *
     * 插入数据主键 Knowledge.getClassId();
     */
    int insertKnowledge(Knowledge knowledge);

    /**
     * 编辑/删除知识点
     * @param knowledge 知识点对象
     * @return
     *
     * 删除时 setDel(0)
     */
    Integer updateKnowledge(Knowledge knowledge);

    /**
     * 根据传入的map信息获取知识点对象
     * @param map key 为 Knowledge 属性
     * @return 知识点对象
     */
    Knowledge getKnowledgeByInfo(Map<String, String> map);

    /**
     * 根据传入的map信息获取知识点List
     * @param map key 为 Knowledge 属性
     * @return List<Knowledge>
     */
    List<Knowledge> getKnowledgeListByInfo(Map<String, String> map);

    /**
     * 根据条件获取知识点数量
     * @param map key 为 Knowledge 属性
     * @return 知识点数量
     */
    Integer getKnowledgeCountByInfo(Map<String, String> map);
}
