package com.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybatis.dao.ResumeDao;
import com.mybatis.entity.Resume;
import com.mybatis.service.ResumeService;
@Service
public class ResumeServiceImpl implements ResumeService {
 @Autowired
 private ResumeDao resumeDao;
	@Override
	public List<Resume> findResume() {
		List<Resume> listresume=resumeDao.findResume();
		return listresume;
	}

	@Override
	public void insertResume(Resume resume) {
		resumeDao.insertResume(resume);
	}

	@Override
	public void deleteResumeById(int id) {
		resumeDao.deleteResumeById(id);
	}

}
