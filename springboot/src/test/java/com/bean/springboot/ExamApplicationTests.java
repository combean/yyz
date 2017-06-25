package com.bean.springboot;

import com.bean.model.Exam;
import com.bean.service.ExamService;
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
public class ExamApplicationTests {
	@Autowired
	private ExamService examService;

	@Test
	public void insertExam() throws  Exception{
		Exam exam=new Exam();
		exam.setExamName("测试考试名称3");
		exam.setPlaceId(2);
		exam.setSubjectId(1);
		exam.setStartTime(new Date());
		exam.setEndTime(new Date());
		exam.setExamMinutes(60);
		exam.setExamType(1);
		exam.setOptionTheory(0);
		exam.setMemo("测试考试备注3");
		exam.setAddname("zhaoyan");
		exam.setAddid(1);
		exam.setAddtime(new Date());
		examService.insertExam(exam);
	}

	@Test
	public void updateExam() throws Exception{
		Exam exam=new Exam();
		exam.setExamName("测试考试名称修改");
		exam.setExamId(1);
		exam.setPlaceId(2);
		exam.setSubjectId(1);
		exam.setStartTime(new Date());
		exam.setEndTime(new Date());
		exam.setExamMinutes(60);
		exam.setExamType(1);
		exam.setOptionTheory(0);
		exam.setMemo("测试考试备注修改");
		exam.setEditname("zhaoyan");
		exam.setEditid(1);
		exam.setEdittime(new Date());
		examService.updateExam(exam);
	}

	@Test
	public void getExamByInfo() throws Exception{
		Map<String,String> map = new HashMap<>();
		map.put("examName","测试考试名称修改");
		Exam exam=examService.getExamByInfo(map);
		System.out.print(exam);
	}

	@Test
	public void getExamListByInfo() throws Exception{
		Map<String,String> map = new HashMap<>();
		map.put("examName","测试");
		List<Exam> exam=examService.getExamListByInfo(map);
		System.out.print(exam);
	}

	@Test
	public void getExamCountByInfo() throws Exception{
		Map<String,String> map = new HashMap<>();
		map.put("examName","测试");
		Integer exam=examService.getExamCountByInfo(map);
		System.out.print(exam);
	}
}
