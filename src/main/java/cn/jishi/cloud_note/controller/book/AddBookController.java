package cn.jishi.cloud_note.controller.book;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jishi.cloud_note.service.BookService;
import cn.jishi.cloud_note.util.NoteResult;

@Controller
public class AddBookController {
	@Resource
	private BookService bookService;
	
	@RequestMapping("/book/add")
	@ResponseBody
	public NoteResult execute(
		String userId,String name){
		NoteResult result = 
			bookService.addBook(userId, name);
		return result;
	}
	
}
