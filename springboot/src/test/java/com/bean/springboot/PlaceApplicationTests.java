package com.bean.springboot;

import com.bean.model.Place;
import com.bean.service.PlaceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlaceApplicationTests {
	@Autowired
	private PlaceService placeService;

	@Test
	public void insert() throws  Exception{
		Place place=new Place();
		place.setPlaceType(1);
		place.setMemo("测试考场地点备注2");
		place.setPlaceName("测试考场地点名称1");
		place.setAddname("duxiaoda");
		place.setAddid(2);
		place.setAddtime(new Date());
		placeService.insert(place);
	}

	@Test
	public void update() throws Exception{
		Place place=new Place();
		place.setPlaceName("测试考试地点名称修改");
		place.setPlaceId(1);
		place.setMemo("测试考试地点备注修改");
		place.setEditname("zhaoyan");
		place.setEditid(1);
		place.setEdittime(new Date());
		placeService.update(place);
	}

	@Test
	public void getByMap() throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("placeName","测试考试地点名称修改");
		Place place=placeService.getByMap(map);
		System.out.print(place);
	}

	@Test
	public void getListByMap() throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("placeName","测试");
		List<Place> place=placeService.getListByMap(map);
		System.out.print(place);
	}

	@Test
	public void getCountByMap() throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("placeName","测试");
		Integer place=placeService.getCountByMap(map);
	}
}
