package cn.jishi.cloud_note.service;

import cn.jishi.cloud_note.util.NoteResult;

public interface NoteService {
	public NoteResult searchNotes(
		String title,String status,
		String beginStr,String endStr);
	public NoteResult loadShareNote(
			String shareId);
	public NoteResult searchShareNote(
			String keyword,int page);
	public NoteResult shareNote(String noteId);
	public NoteResult moveNote(
		String noteId,String bookId);
	public NoteResult deleteNote(String noteId);
	public NoteResult addNote(
		String userId,String noteTitle,String bookId);
	public NoteResult updateNote(
		String noteId,String title,String body);
	public NoteResult loadNote(
			String noteId);
	public NoteResult loadBookNotes(
			String bookId);
}
