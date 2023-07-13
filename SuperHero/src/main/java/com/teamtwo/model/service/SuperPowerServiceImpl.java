package com.teamtwo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamtwo.dto.entity.Organisation;
import com.teamtwo.dto.entity.SuperPower;
import com.teamtwo.model.persistence.OrganisationDao;
import com.teamtwo.model.persistence.SuperPowerDao;


@Service
public class SuperPowerServiceImpl implements SuperPowerService {

	@Autowired
	private SuperPowerDao superPowerDao;
	
	
	
	
	@Override
	public SuperPower getSuperPowerById(int superPowerId) {
		return superPowerDao.getSuperPowerById(superPowerId);
	}

	@Override
	public List<SuperPower> getAllSuperPowers() {
		return superPowerDao.getAllSuperPowers();
	}

	@Override
	public SuperPower editSuperPower(SuperPower superPower) {
		SuperPower existingPower = getSuperPowerById(superPower.getHeroId());

		    if (existingPower != null) {
		    	existingPower.setSuperPowerName(superPower.getSuperPowerName()); 
		       

		        superPowerDao.addSuperPower(existingPower);
		        return existingPower;
		    }

		    return null;
		}

	@Override
	public boolean addSuperPower(SuperPower superPower) {
		return superPowerDao.addSuperPower(superPower)>0;
	}

	@Override
	public SuperPower deleteSuperPower(int superPowerId) {
		SuperPower superPower=getSuperPowerById(superPowerId);
		
		if(superPower!=null)
			superPowerDao.deleteSuperPower(superPowerId);
		return superPower;
	}

}
