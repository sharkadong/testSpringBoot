
package com.mybatis.service;

import java.util.List;

import com.mybatis.entity.Friend;

public interface FriendService {
	public List<Friend> findFriend();
	public void insertFriend(Friend friend);
	public void deleteFriendById(int id);
}
