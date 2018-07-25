package com.mybatis.entity;

import java.util.Date;

public class Message {
	private int id;
	private Date createTime;
	private int sender;
	private int target;
	private String context;
	private String course;

	public Message() {
		super();
	}

	public Message(int id, Date createTime, int sender, int target, String context, String course) {
		super();
		this.id = id;
		this.createTime = createTime;
		this.sender = sender;
		this.target = target;
		this.context = context;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", createTime=" + createTime + ", sender=" + sender + ", target=" + target
				+ ", context=" + context + ", course=" + course + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getSender() {
		return sender;
	}

	public void setSender(int sender) {
		this.sender = sender;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
