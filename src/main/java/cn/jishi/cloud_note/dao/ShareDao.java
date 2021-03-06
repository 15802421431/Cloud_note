package cn.jishi.cloud_note.dao;

import java.util.List;
import java.util.Map;

import cn.jishi.cloud_note.entity.Share;

public interface ShareDao {
	public Share findById(String shareId);
	public List<Share> findLikeTitle(
			Map<String, Object> params);
	public void save(Share share);
}
