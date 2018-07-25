package com.mybatis.entity;

import java.util.Date;

public class Resume {
	private int id;
	private Date createTime;
	private String name;
	private String selfIintroduction;
	private int phone;
	private String education;
	private String major;
	private String graduateInstitutions;
	private String languageSkill;
	private String location;
	private int iDNumber;
	private Boolean gender;
	private Date birth;
	private String nativeplace;
	private String experience;
	private String achievement;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSelfIintroduction() {
		return selfIintroduction;
	}
	public void setSelfIintroduction(String selfIintroduction) {
		this.selfIintroduction = selfIintroduction;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getGraduateInstitutions() {
		return graduateInstitutions;
	}
	public void setGraduateInstitutions(String graduateInstitutions) {
		this.graduateInstitutions = graduateInstitutions;
	}
	public String getLanguageSkill() {
		return languageSkill;
	}
	public void setLanguageSkill(String languageSkill) {
		this.languageSkill = languageSkill;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getiDNumber() {
		return iDNumber;
	}
	public void setiDNumber(int iDNumber) {
		this.iDNumber = iDNumber;
	}
	public Boolean getGender() {
		return gender;
	}
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getNativeplace() {
		return nativeplace;
	}
	public void setNativeplace(String nativeplace) {
		this.nativeplace = nativeplace;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getAchievement() {
		return achievement;
	}
	public void setAchievement(String achievement) {
		this.achievement = achievement;
	}
	@Override
	public String toString() {
		return "Resume [id=" + id + ", createTime=" + createTime + ", name=" + name + ", selfIintroduction="
				+ selfIintroduction + ", phone=" + phone + ", education=" + education + ", major=" + major
				+ ", graduateInstitutions=" + graduateInstitutions + ", languageSkill=" + languageSkill + ", location="
				+ location + ", iDNumber=" + iDNumber + ", gender=" + gender + ", birth=" + birth + ", nativeplace="
				+ nativeplace + ", experience=" + experience + ", achievement=" + achievement + "]";
	}
	public Resume(int id, Date createTime, String name, String selfIintroduction, int phone, String education,
			String major, String graduateInstitutions, String languageSkill, String location, int iDNumber,
			Boolean gender, Date birth, String nativeplace, String experience, String achievement) {
		super();
		this.id = id;
		this.createTime = createTime;
		this.name = name;
		this.selfIintroduction = selfIintroduction;
		this.phone = phone;
		this.education = education;
		this.major = major;
		this.graduateInstitutions = graduateInstitutions;
		this.languageSkill = languageSkill;
		this.location = location;
		this.iDNumber = iDNumber;
		this.gender = gender;
		this.birth = birth;
		this.nativeplace = nativeplace;
		this.experience = experience;
		this.achievement = achievement;
	}
	public Resume() {
		super();
	}

}
