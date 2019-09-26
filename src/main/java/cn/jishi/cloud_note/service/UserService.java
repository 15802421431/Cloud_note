package cn.jishi.cloud_note.service;

import cn.jishi.cloud_note.util.NoteResult;

public interface UserService {
	public NoteResult addUser(
		String name,String nick,String password);
	public NoteResult checkLogin(
		String name,String password);
}
