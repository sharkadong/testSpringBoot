package com.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mybatis.dao.ResumeDao;

@Controller
public class ResumeController {
@Autowired
private ResumeDao resumeDao;

}
