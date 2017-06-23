package com.bean.service;

import com.bean.dao.PlaceMapper;
import com.bean.model.Place;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;
import java.util.List;
import java.util.Map;


@Service("placeService")
public class PlaceServiceImpl implements PlaceService {

    @Autowired
    private PlaceMapper placeMapper;

    private MyLogger LOGGER = new MyLogger(PlaceServiceImpl.class);


    @Override
    public int insertPlace(Place place) {
        return placeMapper.insert(place);
    }

    @Override
    public Integer updatePlace(Place place) {
        return placeMapper.update(place);
    }

    @Override
    public Place getPlaceByInfo(Map<String, String> map) {
        return placeMapper.getPlaceByInfo(map);
    }

    @Override
    public List<Place> getPlaceListByInfo(Map<String, String> map) {
        return placeMapper.getPlaceListByInfo(map);
    }

    @Override
    public Integer getPlaceCountByInfo(Map<String, String> map) {
        return placeMapper.getPlaceCountByInfo(map);
    }
}
