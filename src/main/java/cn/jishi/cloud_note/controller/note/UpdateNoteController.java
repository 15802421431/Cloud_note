package cn.jishi.cloud_note.controller.note;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jishi.cloud_note.service.NoteService;
import cn.jishi.cloud_note.util.NoteResult;

@Controller
public class UpdateNoteController {
	@Resource
	private NoteService noteService;
	
	@RequestMapping("/note/update.do")
	@ResponseBody
	public NoteResult execute(
		String noteId,String title,String body){
		NoteResult result = 
			noteService.updateNote(
				noteId, title, body);
		return result;
	}
	
}
