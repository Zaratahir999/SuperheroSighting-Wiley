package com.teamtwo.model.persistence;

import java.sql.Timestamp;
import java.util.List;

import com.teamtwo.dto.entity.Sighting;

public class SightingDaoImpl implements SightingDao {

	@Override
	public Sighting getSightingById(int sightingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sighting> getAllSighting() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int editSighting(Sighting sighting) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addSighting(Sighting sighting) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteSighting(int sightingId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Sighting> getSightingByDate(Timestamp locationDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sighting> getSightingByLocationId(int locationId) {
		// TODO Auto-generated method stub
		return null;
	}

}
