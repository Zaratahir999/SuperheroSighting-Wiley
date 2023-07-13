package com.teamtwo.model.service;


import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamtwo.dto.entity.Sighting;
import com.teamtwo.model.persistence.SightingDao;

@Service
public class SightingServiceImpl implements SightingService {
	
	@Autowired
	private SightingDao sightingDao;

	@Override
	public List<Sighting> getAllSightings() {
		return sightingDao.getAllSighting();
	}

	@Override
	public Sighting deleteSightingById(int sightingId) {
		Sighting sighting = searchSightingById(sightingId);
		
		if (sighting!=null) 
			sightingDao.deleteSighting(sightingId);
		
		return sighting;
		
	}

	@Override
	public Sighting searchSightingById(int sightingId) {
		return sightingDao.getSightingById(sightingId);
	}

	@Override
	public Sighting updateSighting(Sighting sighting) {
		Sighting existingSighting= searchSightingById (sighting.getSightingId());
		
		if (existingSighting != null ) {
			existingSighting.setHeroId(sighting.getHeroId());
			existingSighting.setLocationId(sighting.getLocationId());
			existingSighting.setLocationDate(sighting.getLocationDate());
			
			sightingDao.addSighting(existingSighting);
			return existingSighting;
	    
	}
		return null;
	}


	@Override
	public boolean insertSighting(Sighting sighting) {
		return sightingDao.addSighting(sighting)>0;
	}

	@Override
	public List<Sighting> getSightingByDate(Date locationDate) {
		return sightingDao.getSightingByDate(locationDate);
	}

	@Override
	public List<Sighting> getSightingByLocationId(int locationId) {
		return sightingDao.getSightingByLocationId(locationId);

}
