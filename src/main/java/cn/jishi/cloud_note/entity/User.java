package cn.jishi.cloud_note.entity;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable{
	private String id;
	private String name;
	private String password;
	private String token;
	private String nick;
	//追加关联属性,用于加载相关的多个Book
	private List<Book> books;
	
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", token=" + token + ", nick=" + nick
				+ ", books=" + books + "]";
	}
	
}
