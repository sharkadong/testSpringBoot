package com.mybatis.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {

    @RequestMapping("/a")
    public String index(){
        return "a";
    } 
    @RequestMapping("/b")
    public String indexb(Map<String,Object> map){
        map.put("name", "JSP");
        return "b";
    }
    @RequestMapping("/c")
    public String indexc(){
        
        return "c";
    }
    @RequestMapping("/register")
    public String register(){
        
        return "register";
    }
    
}