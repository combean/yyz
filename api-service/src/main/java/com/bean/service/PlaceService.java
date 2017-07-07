package com.bean.service;

import com.bean.model.Place;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface PlaceService {
    /**
     * 添加考试地点
     * @param place 考试地点对象
     * @return 插入条数
     *
     * 插入数据主键 Place.getPlaceId();
     */
    int insert(Place place) throws SQLException;

    /**
     * 编辑/删除考试地点
     * @param place 考试地点对象
     * @return
     *
     * 删除时 setDel(0)
     */
    Integer update(Place place) throws SQLException;

    /**
     * 根据传入的map信息获取考试地点对象
     * @param map key 为 Place 属性
     * @return 考试地点对象
     */
    Place getByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据传入的map信息获取考试地点List
     * @param map key 为 Place 属性
     * @return List<Place>
     */
    List<Place> getListByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据条件获取考试地点数量
     * @param map key 为 Place 属性
     * @return 考试地点数量
     */
    Integer getCountByMap(Map<String, Object> map) throws SQLException;

    Place getById(Integer id) throws SQLException;
}
