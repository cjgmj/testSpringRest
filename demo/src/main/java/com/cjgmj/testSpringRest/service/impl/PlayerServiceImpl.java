package com.cjgmj.testSpringRest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cjgmj.testSpringRest.entity.Player;
import com.cjgmj.testSpringRest.repository.PlayerRepository;
import com.cjgmj.testSpringRest.service.PlayerService;

@Service("playerServiceImpl")
public class PlayerServiceImpl implements PlayerService{
	
	@Autowired
	@Qualifier("playerRepository")
	private PlayerRepository playerRepository;

	@Override
	public List<Player> listAllPlayers() {
		return (List<Player>) playerRepository.findAll();
	}

}
