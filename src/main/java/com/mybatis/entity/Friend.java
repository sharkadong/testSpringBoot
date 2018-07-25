package com.mybatis.entity;

public class Friend {
	private int id;
	private String nickname;
	private String password;
	private Resume resume;
	private Message message;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Resume getResume() {
		return resume;
	}
	public void setResume(Resume resume) {
		this.resume = resume;
	}
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Friend [id=" + id + ", nickname=" + nickname + ", password=" + password + ", resume=" + resume
				+ ", message=" + message + "]";
	}
	public Friend(int id, String nickname, String password, Resume resume, Message message) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.password = password;
		this.resume = resume;
		this.message = message;
	}
	public Friend() {
		super();
	}

	

}
