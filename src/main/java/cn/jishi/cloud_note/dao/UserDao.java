package cn.jishi.cloud_note.dao;

import cn.jishi.cloud_note.entity.User;

public interface UserDao {
	public void save(User user);
	public User findByName(String name);
}
