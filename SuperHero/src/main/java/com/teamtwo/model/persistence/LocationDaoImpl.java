package com.teamtwo.model.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.teamtwo.dto.entity.Location;

@Repository
public class LocationDaoImpl implements LocationDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Location getLocationById(int locationId) {
		  String sql = "SELECT * FROM Location WHERE locationId = ?";

	        return jdbcTemplate.queryForObject(sql, new LocationRowMapper(), locationId);
	}

	@Override
	public List<Location> getAllLocations() {
		
		String sql = "SELECT * FROM Location";

        return jdbcTemplate.query(sql, new LocationRowMapper());
	}

	@Override
	public int editLocation(Location location) {
		String sql = "UPDATE Location SET locationName = ?, locationDesc = ?, locationAddress = ? , coordinates = ? WHERE locationId = ?";

        return jdbcTemplate.update(sql, location.getLocationName(), location.getLocationDesc(), 
                location.getLocationAddress(), location.getCoordinates(), location.getLocationId());
	}

	@Override
	public int addLocation(Location location) {
		 String sql = "INSERT INTO Location (locationName, locationDesc, locationAddress, coordinates) VALUES (?, ?, ?, ?)";

	        return jdbcTemplate.update(sql, location.getLocationName(), location.getLocationDesc(), 
	                location.getLocationAddress(), location.getCoordinates());
	}

	@Override
	public int deleteLocation(int locationId) {
		String sql = "DELETE FROM Location WHERE locationId = ?";

        return jdbcTemplate.update(sql, locationId);
	}

}
