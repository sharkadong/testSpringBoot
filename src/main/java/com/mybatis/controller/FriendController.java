
package com.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mybatis.entity.Friend;
import com.mybatis.service.FriendService;

@Controller
public class FriendController {	
	@Autowired
	private FriendService friendService;
	@RequestMapping("/welcome")	
	public String getFriend(Friend friend){				 
		 System.out.println(friend);	 
		 friendService.insertFriend(friend);
		return "welcome";		
	}
	@RequestMapping("/tryfind")	
	public String findFriend(){				 
		 	 
		 List<Friend> listfriend=friendService.findFriend();
		 System.out.println(listfriend);
		return "tryfind";		
	}
	@RequestMapping("/first")	
	public String first(){				 
		return "first";		
	}
	@RequestMapping("/resume")	
	public String Resume(){				 
		return "resume";		
	}
}
