package cn.jishi.cloud_note.dao;

import java.util.List;
import cn.jishi.cloud_note.entity.Book;

public interface BookDao {
	public void save(Book book);
	
	public List<Book> findByUserId(
			String userId);
}
