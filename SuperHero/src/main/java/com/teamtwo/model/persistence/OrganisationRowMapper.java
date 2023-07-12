package com.teamtwo.model.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.teamtwo.dto.entity.Organisation;

public class OrganisationRowMapper implements RowMapper<Organisation> {

	@Override
	public Organisation mapRow(ResultSet resultset, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
