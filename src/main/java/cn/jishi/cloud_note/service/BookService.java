package cn.jishi.cloud_note.service;

import cn.jishi.cloud_note.util.NoteResult;

public interface BookService {
	public NoteResult addBook(
			String userId,String name);
	public NoteResult loadUserBooks(String userId);
}
