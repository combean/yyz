package com.bean.springboot;

import com.bean.model.UClass;
import com.bean.service.UClassService;
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
public class ClassApplicationTests {
	@Autowired
	private UClassService uClassService;

	@Test
	public void insertClass() throws  Exception{
		UClass uClass = new UClass();
		uClass.setClassName("测试班级2");
		uClass.setMemo("测试备注内容2");
		uClass.setAddname("zhaoyan");
		uClass.setAddid(1);
		uClass.setAddtime(new Date());

		uClassService.insertUClass(uClass);
	}

	@Test
	public void updateUClass() throws Exception{
		UClass uClass = new UClass();
		uClass.setClassId(1);
		uClass.setClassName("测试班级2");
		uClass.setMemo("测试班级备注2");
		uClass.setDel(0);
		uClass.setEditid(1);
		uClass.setEditname("zhaoyan");
		uClass.setEdittime(new Date());

		uClassService.updateUClass(uClass);
	}

	@Test
	public void getUClassByInfo() throws Exception{
		Map<String,String> map = new HashMap<>();
		map.put("className","测试班级");

		UClass u=uClassService.getUClassByInfo(map);
		System.out.println(u);
	}

	@Test
	public void getUClassListByInfo() throws Exception{
		Map<String,String> map = new HashMap<>();
		map.put("className","测试班级");

		List<UClass> u = uClassService.getUClassListByInfo(map);
		System.out.println(u);
	}

	@Test
	public void getUClassCountByInfo() throws Exception{
		Map<String,String> map = new HashMap<>();
		map.put("className","测试班级");
		Integer count = uClassService.getUClassCountByInfo(map);
		System.out.print(count);
	}
}
