package com.mybatis.entity;

import java.util.Date;

public class Position {
	private int id;
	private String name;
	private int lv;
	private Date createTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "Position [id=" + id + ", name=" + name + ", lv=" + lv + ", createTime=" + createTime + "]";
	}

	public Position(int id, String name, int lv, Date createTime) {
		super();
		this.id = id;
		this.name = name;
		this.lv = lv;
		this.createTime = createTime;
	}

	public Position() {
		super();
	}

}
