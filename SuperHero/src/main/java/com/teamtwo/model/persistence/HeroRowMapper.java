package com.teamtwo.model.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.teamtwo.dto.entity.Hero;

public class HeroRowMapper implements RowMapper<Hero> {

	@Override
	public Hero mapRow(ResultSet resultset, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
