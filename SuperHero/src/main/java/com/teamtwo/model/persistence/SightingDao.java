package com.teamtwo.model.persistence;

import java.sql.Timestamp;
import java.util.List;

import com.teamtwo.dto.entity.Sighting;

public interface SightingDao {

	public Sighting getSightingById(int sightingId);
	public List<Sighting> getAllSighting();
	public int editSighting(Sighting sighting);
	public int addSighting(Sighting sighting);
	public int deleteSighting(int sightingId);
	List <Sighting> getSightingByDate(Timestamp locationDate);
	List <Sighting> getSightingByLocationId(int locationId);
}
