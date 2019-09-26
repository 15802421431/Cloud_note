package cn.jishi.cloud_note.controller.book;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jishi.cloud_note.service.BookService;
import cn.jishi.cloud_note.util.NoteResult;

@Controller
public class LoadBooksController {
	@Resource
	private BookService bookService;
	
	@RequestMapping("/book/loadbooks.do")
	@ResponseBody
	public NoteResult execute(String userId){
		NoteResult result = 
		bookService.loadUserBooks(userId);
		return result;
	}
	
}
