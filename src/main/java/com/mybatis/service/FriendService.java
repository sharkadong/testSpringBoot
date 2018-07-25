/******************************************************************
 *
 *    Powered By Baishi Huifang.
 *
 *    TODO(用一句话描述该文件做什么)
 *
 *    @author:     mn11235813@163.com
 *
 *    Create at:   2017-07-03 15:21:17
 *
 *    Revision:
 *
 *    2017-07-03 15:21:17
 *        - first revision
 *
 *****************************************************************/
package com.mybatis.service;

import java.util.List;

import com.mybatis.entity.Friend;

/**
 * 
 * @author mn11235813@163.com
 * @date 2017-07-03 15:21:17
 */
public interface FriendService {
	public List<Friend> findFriend();
	public void insertFriend(Friend friend);
	public void deleteFriendById(int id);
}
