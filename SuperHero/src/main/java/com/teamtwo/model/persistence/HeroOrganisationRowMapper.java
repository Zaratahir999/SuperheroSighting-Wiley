package com.teamtwo.model.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.teamtwo.dto.entity.HeroOrganisation;

public class HeroOrganisationRowMapper implements RowMapper<HeroOrganisation> {

	@Override
	public HeroOrganisation mapRow(ResultSet resultset, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
