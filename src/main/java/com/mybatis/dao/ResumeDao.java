package com.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mybatis.entity.Resume;
@Mapper
public interface ResumeDao {
	public List<Resume> findResume();
	public void insertResume(Resume resume);
	public void deleteResumeById(int id);
}
