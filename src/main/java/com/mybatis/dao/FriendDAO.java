package com.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mybatis.entity.Friend;



@Mapper //依赖于此注解
public interface FriendDAO {
	
	public List<Friend> findFriend();
	public void insertFriend(Friend friend);
	public void deleteFriendById(int id);
	
}
