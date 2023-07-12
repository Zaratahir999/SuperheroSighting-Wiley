package com.teamtwo.model.persistence;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.teamtwo.dto.entity.Sighting;

@Repository
public class SightingDaoImpl implements SightingDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Sighting getSightingById(int sightingId) {
		return jdbcTemplate.queryForObject("SELECT * FROM Sighting WHERE sightingId=?", new SightingRowMapper(), sightingId);
	}
	

	@Override
	public List<Sighting> getAllSighting() {
		return jdbcTemplate.query("SELECT * FROM Sighting", new SightingRowMapper());
	}

	@Override
	public int editSighting(Sighting sighting) {
		return jdbcTemplate.update("UPDATE Sighting SET heroId = ?, locationId = ?, locationDate = ? WHERE sightingId = ?", sighting.getHeroId(), sighting.getLocationId(), sighting.getLocationDate());
	}
	
	@Override
	public int addSighting(Sighting sighting) {
		
		return jdbcTemplate.update("INSERT INTO Sighting VALUES (?, ?, ?, ?) ", sighting.getSightingId(), sighting.getHeroId(), sighting.getLocationId(), sighting.getLocationDate());
	}

	@Override
	public int deleteSighting(int sightingId) {
		
		return jdbcTemplate.update("DELETE FROM Sighting WHERE sightingId = ?", sightingId);
	}

	@Override
	public List<Sighting> getSightingByDate(Timestamp locationDate) {
	
		return jdbcTemplate.query("SELECT * FROM Sighting WHERE locationDate= ? ", new SightingRowMapper(), locationDate);
	}

	@Override
	public List<Sighting> getSightingByLocationId(int locationId) {

		return jdbcTemplate.query("SELECT * FROM Sighting WHERE locationId= ?", new SightingRowMapper(), locationId);
	}

}
