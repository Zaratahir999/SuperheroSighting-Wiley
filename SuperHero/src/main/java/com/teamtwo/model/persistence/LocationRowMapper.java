package com.teamtwo.model.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.teamtwo.dto.entity.Location;

public class LocationRowMapper implements RowMapper<Location> {

	@Override
	public Location mapRow(ResultSet resultset, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
