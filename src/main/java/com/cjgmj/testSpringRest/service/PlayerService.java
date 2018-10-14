package com.cjgmj.testSpringRest.service;

import java.util.List;

import com.cjgmj.testSpringRest.entity.Player;

public interface PlayerService {
	
	public abstract List<Player> listAllPlayers();
	
	public abstract List<Player> findTop5ByNationality(String nationality);
	
	public abstract Player findTop1ByLeague(String league);

}
