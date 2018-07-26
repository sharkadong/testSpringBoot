package com.mybatis.service;

import java.util.List;

import com.mybatis.entity.Resume;

public interface ResumeService {
	public List<Resume> findResume();
	public void insertResume(Resume resume);
	public void deleteResumeById(int id);
}
