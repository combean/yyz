package com.bean.service;

import com.bean.model.Place;
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
    int insertPlace(Place place);

    /**
     * 编辑/删除考试地点
     * @param place 考试地点对象
     * @return
     *
     * 删除时 setDel(0)
     */
    Integer updatePlace(Place place);

    /**
     * 根据传入的map信息获取考试地点对象
     * @param map key 为 Place 属性
     * @return 考试地点对象
     */
    Place getPlaceByInfo(Map<String, String> map);

    /**
     * 根据传入的map信息获取考试地点List
     * @param map key 为 Place 属性
     * @return List<Place>
     */
    List<Place> getPlaceListByInfo(Map<String, String> map);

    /**
     * 根据条件获取考试地点数量
     * @param map key 为 Place 属性
     * @return 考试地点数量
     */
    Integer getPlaceCountByInfo(Map<String, String> map);
}
