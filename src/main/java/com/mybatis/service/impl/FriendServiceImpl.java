/******************************************************************
 *
 *    Powered By Baishi Huifang.
 *
 *    TODO(用一句话描述该文件做什么)
 *
 *    @author:     mn11235813@163.com
 *
 *    Create at:   2017-07-03 15:22:24
 *
 *    Revision:
 *
 *    2017-07-03 15:22:24
 *        - first revision
 *
 *****************************************************************/
package com.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.mybatis.dao.FriendDAO;
import com.mybatis.entity.Friend;
import com.mybatis.service.FriendService;

/**
 * @author mn11235813@163.com
 * @date 2017-07-03 15:22:24
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout = 36000,rollbackFor = Exception.class)
public class FriendServiceImpl implements FriendService {

	@Autowired
	private FriendDAO friendDao;


	@Override
	public List<Friend> findFriend() {
		List<Friend> listfriend=friendDao.findFriend();
		return listfriend;
	}


	@Override
	public void insertFriend(Friend friend) {
		friendDao.insertFriend(friend);
	}


	@Override
	public void deleteFriendById(int id) {
		friendDao.deleteFriendById(id);
	}
}
