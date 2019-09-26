package test.dao;

import java.util.List;

import org.junit.Test;

import cn.jishi.cloud_note.dao.CollectionDao;
import cn.jishi.cloud_note.entity.Book;
import cn.jishi.cloud_note.entity.User;

import test.service.BaseTest;

public class TestCollectionDao extends BaseTest{
	@Test
	public void test2(){
		CollectionDao dao = ac.getBean(
		"collectionDao",CollectionDao.class);
		List<User> list = dao.findAllUser();
		for(User user:list){
			//将用户笔记本名拼一个字符串
			String bookNames = "";
			for(Book book:user.getBooks()){
				bookNames+=book.getCn_notebook_name();
				bookNames+=",";
			}
			//打印用户名,笔记本数量,笔记本名
			System.out.println(
				user.getName()+" "
				+user.getBooks().size()+""
				+bookNames);
		}
	}
	
	@Test
	public void test1(){
		CollectionDao dao = ac.getBean(
		"collectionDao",CollectionDao.class);
		User user = dao.findById(
			"ea09d9b1-ede7-4bd8-b43d-a546680df00b");
		System.out.println(
			"用户名:"+user.getName());
		System.out.println("拥有的笔记本");
		for(Book book:user.getBooks()){
			System.out.println(
				"=="+book.getCn_notebook_name());
		}
	}
	
}
