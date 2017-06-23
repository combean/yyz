package com.bean.dao;

import com.bean.model.Place;
import java.util.List;
import java.util.Map;

public interface PlaceMapper {
    int insert(Place place);

    Integer update(Place place);

    Place getPlaceByInfo(Map<String,String> map);

    List<Place> getPlaceListByInfo(Map<String,String> map);

    Integer getPlaceCountByInfo(Map<String,String> map);
}