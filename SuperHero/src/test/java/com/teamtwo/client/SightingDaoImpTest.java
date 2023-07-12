package com.teamtwo.client;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Date;
import java.util.List;

import com.teamtwo.dto.entity.Sighting;
import com.teamtwo.model.persistence.SightingDaoImpl;

@SpringBootTest
@ActiveProfiles("test")
public class SightingDaoImpTest {
	
	@Autowired
	private SightingDaoImpl sightingDao;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	@Test
	public void testGetSightingById() {
	    Sighting retrievedSighting = sightingDao.getSightingById(111);
	    assertEquals(111, retrievedSighting.getSightingId());
	}
	
	@Test
	public void testGetAllSightings() {
		List<Sighting> sightings = sightingDao.getAllSighting();
		assertEquals(1, sightings.size());
	}
	
	@Test
	public void testEditSighting() {
	    Sighting originalSighting = sightingDao.getSightingById(111);
	    assertNotNull(originalSighting);

	    originalSighting.setHeroId(3);
	    originalSighting.setLocationId(002);

	    int rowsAffected = sightingDao.editSighting(originalSighting);
	    assertEquals(1, rowsAffected);

	    Sighting updatedSighting = sightingDao.getSightingById(111);
	    assertNotNull(updatedSighting);

	    assertEquals(3, updatedSighting.getHeroId());
	    assertEquals(002, updatedSighting.getLocationId());
	}

		
		

	@Test
	public void testAddSighting() {
		Sighting sight = new Sighting();
		sight.setSightingId(444);
		sight.setHeroId(3);
		sight.setLocationId(003);
		sight.setLocationDate(Date.valueOf("2023-01-01"));
		
		int rows = sightingDao.addSighting(sight);
		assertEquals(1, rows);
		
		jdbcTemplate.update("DELETE FROM Sighting WHERE sightingId = ?", 444);
		
	}

	
	@Test
	public void testDeleteSighting() {
		assertEquals(0, sightingDao.deleteSighting(333));
		
	}

	  
	@Test
	public void testGetSightingByDate() {
	    Date date = Date.valueOf("2023-01-01");

	    List<Sighting> retrievedSightings = sightingDao.getSightingByDate(date);

	    Assertions.assertEquals(1, retrievedSightings.size());

	    Assertions.assertEquals(111, retrievedSightings.get(0).getSightingId());
	}
    }

				
 