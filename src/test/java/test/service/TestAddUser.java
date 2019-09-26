package test.service;

import org.junit.Test;

import cn.jishi.cloud_note.service.UserService;
import cn.jishi.cloud_note.util.NoteResult;

public class TestAddUser extends BaseTest{

	@Test
	public void test1(){
		UserService service = ac.getBean(
		"userService",UserService.class);
		NoteResult result = 
		service.addUser("demo1", "demo1", "123123");
		System.out.println(result.getStatus());
		System.out.println(result.getMsg());
		System.out.println(result.getData());
	}
	
}
