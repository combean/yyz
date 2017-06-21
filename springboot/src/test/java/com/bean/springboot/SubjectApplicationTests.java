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
	public void insertSubject() throws  Exception{
		Subject subject=new Subject();
		subject.setSubjectName("测试班级3");
		subject.setParentId(1);
		subject.setMemo("测试班级3备注");

		subjectService.insertSubject(subject);
	}

	@Test
	public void updateSubject() throws Exception{
		Subject subject=new Subject();
		subject.setSubjectName("测试班级修改修改");
		subject.setSubjectId(1);
		subject.setMemo("测试班级备注修改修改");
		subject.setEditid(2);
		subject.setEditname("duhongda");
		subject.setEdittime(new Date());

		subjectService.updateSubject(subject);
	}

	@Test
	public void getSubjectByInfo() throws Exception{
		Map<String,String> map = new HashMap<>();
		map.put("subjectId","1");
		Subject subject=subjectService.getSubjectByInfo(map);
		System.out.println(subject);
	}

	@Test
	public void getSubjectListByInfo() throws Exception{
		Map<String,String> map = new HashMap<>();
		map.put("subjectName","测子");
		List<Subject> subject=subjectService.getSubjectListByInfo(map);
		System.out.println(subject);
	}

	@Test
	public void getSubjectCountByInfo() throws Exception{
		Map<String,String> map = new HashMap<>();
		map.put("subjectName","测子");
		Integer subject=subjectService.getSubjectCountByInfo(map);
		System.out.println(subject);
	}
}
