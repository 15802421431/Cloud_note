package cn.jishi.cloud_note.controller.note;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jishi.cloud_note.service.NoteService;
import cn.jishi.cloud_note.util.NoteResult;

@Controller
public class SearchNotesController {
	@Resource
	private NoteService noteService;
	@RequestMapping("/note/hight_search.do")
	@ResponseBody
	public NoteResult execute(
		String title,String status,
		String begin,String end){
		NoteResult result = 
			noteService.searchNotes(
			title, status, begin, end);
		return result;
	}
	
}
