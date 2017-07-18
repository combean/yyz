package com.bean.springboot.controller;

import com.bean.RSTFul.RSTFulBody;
import com.bean.model.Place;
import com.bean.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by PVer on 2017/7/18.
 */
@RestController
@RequestMapping("/place")
public class PlaceContorller {

    @Autowired
    private PlaceService placeService;

    @RequestMapping("/add")
    public RSTFulBody add(Place place, HttpServletRequest request) throws SQLException {
        RSTFulBody resObject = new RSTFulBody();
        place.setAddname(request.getSession().getAttribute("userName")+"");
        place.setAddid(Integer.parseInt(request.getSession().getAttribute("userId")+""));
        place.setAddtime(new Date());

        int i = placeService.insert(place);
        if(i>0) resObject.setCode(1);
        else resObject.setCode(0);

        return resObject;
    }

    @RequestMapping("edit")
    public RSTFulBody edit(Place place, HttpServletRequest request) throws SQLException {
        RSTFulBody resObject = new RSTFulBody();
        place.setEditname(request.getSession().getAttribute("userName")+"");
        place.setEditid(Integer.parseInt(request.getSession().getAttribute("userId")+""));
        place.setEdittime(new Date());

        int i = placeService.update(place);

        if(i>0) resObject.setCode(1);
        else resObject.setCode(0);
        return resObject;
    }

    @RequestMapping("/del")
    public RSTFulBody del(Place place, HttpServletRequest request) throws SQLException {
        RSTFulBody resObject = new RSTFulBody();
        place.setDel(0);
        place.setEditname(request.getSession().getAttribute("userName")+"");
        place.setEditid(Integer.parseInt(request.getSession().getAttribute("userId")+""));
        place.setEdittime(new Date());
        placeService.update(place);
        resObject.setCode(1);
        return resObject;
    }

    @RequestMapping("/getAllPlace")
    public List<Place> getAllPlace(Place place) throws SQLException {
        //搜索条件
        Map<String, Object> map = new HashMap<>();
        map.put("del",1);
        if(place.getPlaceName() !=null && place.getPlaceName() !="") map.put("placeName",place.getPlaceName());
        if(place.getPlaceId() != null) map.put("placeId",place.getPlaceId());
        if(place.getPlaceType() != null) map.put("placeType",place.getPlaceType());
        List<Place> places = placeService.getListByMap(map);
        return places;
    }
}
