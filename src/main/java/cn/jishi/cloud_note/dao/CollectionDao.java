package cn.jishi.cloud_note.dao;

import java.util.List;

import cn.jishi.cloud_note.entity.User;

public interface CollectionDao {
	public List<User> findAllUser();
	public User findById(String userId);
}
