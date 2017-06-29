package com.bean.springboot;

import com.bean.model.Subject;
import com.bean.service.SubjectService;
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
public class SubjectApplicationTests {
	@Autowired
	private SubjectService subjectService;

	@Test
	public void insert() throws  Exception{
		Subject subject=new Subject();
		subject.setSubjectName("测试班级");
		subject.setMemo("测试班级备注");

		subjectService.insert(subject);

		Subject subject1=new Subject();
		subject1.setSubjectName("测试班级1");
		subject1.setMemo("测试班级备注1");
		subject1.setParentId(0);

		subjectService.insert(subject1);

		Subject subject2=new Subject();
		subject2.setSubjectName("测试子班级");
		subject2.setMemo("测试子班级备注1");
		subject2.setParentId(1);

		subjectService.insert(subject2);
	}

	@Test
	public void update() throws Exception{
		Subject subject=new Subject();
		subject.setSubjectName("测试班级修");
		subject.setSubjectId(1);
		subject.setMemo("测试班级备注修改修改");
		subject.setEditid(2);
		subject.setEditname("duhongda");
		subject.setEdittime(new Date());

		subjectService.update(subject);
	}

	@Test
	public void getByMap() throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("subjectId","1");
		Subject subject=subjectService.getByMap(map);
		System.out.println(subject);
	}

	@Test
	public void getListByMap() throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("subjectName","测试");
		List<Subject> subject=subjectService.getListByMap(map);
		System.out.println(subject);
	}

	@Test
	public void getCountByMap() throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("subjectName","测试");
		Integer subject=subjectService.getCountByMap(map);
		System.out.println(subject);
	}

	@Test
	public void getById() throws Exception{
		Subject subject = subjectService.getById(1);
	}
}
