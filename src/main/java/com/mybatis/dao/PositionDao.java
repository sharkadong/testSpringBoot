package com.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mybatis.entity.Position;
@Mapper
public interface PositionDao {
	public List<Position> findPosition();
	public void insertPosition(Position position);
	public void deletePositionById(int id);
}
