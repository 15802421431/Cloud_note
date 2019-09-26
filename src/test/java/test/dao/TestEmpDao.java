package test.dao;

import org.junit.Test;

import cn.jishi.cloud_note.dao.EmpDao;
import cn.jishi.cloud_note.entity.Emp;

import test.service.BaseTest;

public class TestEmpDao extends BaseTest{
	@Test
	public void test1(){
		EmpDao dao = ac.getBean(
			"empDao",EmpDao.class);
		Emp emp = new Emp();
		emp.setName("rose");
		dao.save(emp);
		//获取记录的no值
		int no = emp.getNo();
		System.out.println("主键值："+no);
	}
	
}
