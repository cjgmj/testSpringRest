package com.cjgmj.testSpringRest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cjgmj.testSpringRest.entity.Team;
import com.cjgmj.testSpringRest.repository.TeamRepository;
import com.cjgmj.testSpringRest.service.TeamService;

@Service("teamServiceImpl")
public class TeamServiceImpl implements TeamService{
	
	@Autowired
	@Qualifier("teamRepository")
	private TeamRepository teamRepository;

	@Override
	public List<Team> listAllTeams() {
		return (List<Team>) teamRepository.findAll();
	}

}
