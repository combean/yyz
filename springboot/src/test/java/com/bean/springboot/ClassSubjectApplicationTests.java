package com.bean.springboot;

import com.bean.model.ClassSubject;
import com.bean.service.ClassSubjectService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassSubjectApplicationTests {
	@Autowired
	private ClassSubjectService classSubjectService;

	@Test
	public void insertList() throws  Exception{
		List<ClassSubject> list = new ArrayList<ClassSubject>();
		ClassSubject classSubject = new ClassSubject();
		classSubject.setClassId(1);
		classSubject.setSubjectId(1);
		list.add(classSubject);

//		ClassSubject classSubject1 = new ClassSubject();
//		classSubject1.setClassId(2);
//		classSubject1.setSubjectId(2);
//		list.add(classSubject1);

		ClassSubject classSubject2 = new ClassSubject();
		classSubject2.setClassId(1);
		classSubject2.setSubjectId(2);
		list.add(classSubject2);

		ClassSubject classSubject3 = new ClassSubject();
		classSubject3.setClassId(1);
		classSubject3.setSubjectId(3);
		list.add(classSubject3);

		classSubjectService.insertList(list);
	}

	@Test
	public void insert() throws Exception{
		ClassSubject classSubject = new ClassSubject();
		classSubject.setClassId(1);
		classSubject.setSubjectId(4);

		classSubjectService.insert(classSubject);
	}

	@Test
	public void deleteByClassId() throws Exception{
		Integer i=classSubjectService.deleteByClassId(1);
	}

	@Test
	public void getListByMap() throws Exception{
		Map<String, Object> map = new HashMap<>();
		map.put("classId",1);
		List<ClassSubject> list=classSubjectService.getListByMap(map);
	}

	@Test
	public void deleteByClassSubjectId() throws Exception{
		Integer i = classSubjectService.deleteById(2);
	}

	@Test
	public void getCountByMap() throws Exception{
		Map<String, Object> map = new HashMap<>();
		map.put("classId",1);
		int i = classSubjectService.getCountByMap(map);
	}
}
