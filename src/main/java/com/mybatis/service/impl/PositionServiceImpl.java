package com.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybatis.dao.PositionDao;
import com.mybatis.entity.Position;
import com.mybatis.service.PositionService;
@Service
public class PositionServiceImpl implements PositionService {
   @Autowired
   private PositionDao positionDao;
	@Override
	public List<Position> findPosition() {
		List<Position> listposition=positionDao.findPosition();
		return listposition;
	}

	@Override
	public void insertPosition(Position position) {
		positionDao.insertPosition(position);
	}

	@Override
	public void deletePositionById(int id) {
		positionDao.deletePositionById(id);
	}

}
