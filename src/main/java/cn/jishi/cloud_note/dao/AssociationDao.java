package cn.jishi.cloud_note.dao;

import java.util.List;

import cn.jishi.cloud_note.entity.Book;

public interface AssociationDao {
	public List<Book> findAllBook();
	public Book findById(String bookId);
}
