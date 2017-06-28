package com.bean.service;

import com.bean.model.Paper;

import java.util.List;
import java.util.Map;

public interface PaperService {
    /**
     * 添加考卷
     * @param paper 考卷对象
     * @return 插入条数
     *
     * 插入数据主键 Paper.getClassId();
     */
    int insertPaper(Paper paper);

    /**
     * 编辑/删除考卷
     * @param paper 考卷对象
     * @return
     *
     * 删除时 setDel(0)
     */
    Integer updatePaper(Paper paper);

    /**
     * 根据传入的map信息获取考卷对象
     * @param map key 为 Paper 属性
     * @return 考卷对象
     */
    Paper getPaperByInfo(Map<String, String> map);

    /**
     * 根据传入的map信息获取考卷List
     * @param map key 为 Paper 属性
     * @return List<Paper>
     */
    List<Paper> getPaperListByInfo(Map<String, String> map);

    /**
     * 根据条件获取考卷数量
     * @param map key 为 Paper 属性
     * @return 考卷数量
     */
    Integer getPaperCountByInfo(Map<String, String> map);
}
