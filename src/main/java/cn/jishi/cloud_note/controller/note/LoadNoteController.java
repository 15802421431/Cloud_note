package cn.jishi.cloud_note.controller.note;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jishi.cloud_note.service.NoteService;
import cn.jishi.cloud_note.util.NoteResult;

@Controller
public class LoadNoteController {
	@Resource
	private NoteService noteService;
	
	@RequestMapping("/note/load")
	@ResponseBody
	public NoteResult execute(String noteId){
		NoteResult result = 
			noteService.loadNote(noteId);
		return result;
	}
	
}
