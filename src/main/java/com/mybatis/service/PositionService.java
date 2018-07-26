package com.mybatis.service;

import java.util.List;

import com.mybatis.entity.Position;

public interface PositionService {
	public List<Position> findPosition();
	public void insertPosition(Position position);
	public void deletePositionById(int id);
}
