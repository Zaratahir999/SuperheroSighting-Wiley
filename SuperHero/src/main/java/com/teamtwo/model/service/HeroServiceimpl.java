package com.teamtwo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamtwo.dto.entity.Hero;
import com.teamtwo.model.persistence.HeroDao;

@Service
public class HeroServiceimpl implements HeroService {
	
	@Autowired
	private HeroDao dao;

	@Override
	public List<Hero> getAllHeroes() {
	
		return dao.getAllHeroes();
	}

	@Override
	public boolean addHero(Hero hero) {
	
		return dao.addHero(hero) > 0;
	}

	@Override
	public boolean deleteHeroById(int heroId) {

		return dao.deleteHero(heroId) > 0;
	}

	@Override
	public List<Hero> getHeroByLocation(int locationId) {
	
		return dao.getSuperHeroByLocation(locationId);
	}

	@Override
	public Hero editHero(Hero hero) {
		if (dao.editHero(hero) > 0) {
			return dao.getHeroById(hero.getHeroId());
		}
		return null;
	}
	
	

}
