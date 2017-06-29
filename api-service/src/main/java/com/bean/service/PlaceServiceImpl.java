package com.bean.service;

import com.bean.dao.PlaceMapper;
import com.bean.model.Place;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Service("placeService")
public class PlaceServiceImpl implements PlaceService {

    @Autowired
    private PlaceMapper placeMapper;

    private MyLogger LOGGER = new MyLogger(PlaceServiceImpl.class);


    @Override
    public int insert(Place place) throws SQLException {
        return placeMapper.insert(place);
    }

    @Override
    public Integer update(Place place) throws SQLException {
        return placeMapper.update(place);
    }

    @Override
    public Place getByMap(Map<String, Object> map) throws SQLException {
        return placeMapper.getByMap(map);
    }

    @Override
    public List<Place> getListByMap(Map<String, Object> map) throws SQLException {
        return placeMapper.getListByMap(map);
    }

    @Override
    public Integer getCountByMap(Map<String, Object> map) throws SQLException {
        return placeMapper.getCountByMap(map);
    }

    @Override
    public Place getById(Integer id) throws SQLException {
        return placeMapper.getById(id);
    }
}
