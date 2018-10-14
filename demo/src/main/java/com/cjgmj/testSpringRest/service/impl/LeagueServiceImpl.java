package com.cjgmj.testSpringRest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cjgmj.testSpringRest.entity.League;
import com.cjgmj.testSpringRest.repository.LeagueRepository;
import com.cjgmj.testSpringRest.service.LeagueService;

@Service("leagueServiceImpl")
public class LeagueServiceImpl implements LeagueService{
	
	@Autowired
	@Qualifier("leagueRepository")
	private LeagueRepository leagueRepository;

	@Override
	public List<League> listAllLeagues() {
		return (List<League>) leagueRepository.findAll();
	}

}
