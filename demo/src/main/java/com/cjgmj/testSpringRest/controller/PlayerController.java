package com.cjgmj.testSpringRest.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjgmj.testSpringRest.entity.Player;
import com.cjgmj.testSpringRest.service.PlayerService;

@Controller
@RequestMapping("/players")
public class PlayerController {
	
	private static final Log LOG = LogFactory.getLog(PlayerController.class);
	
	@Autowired
	@Qualifier("playerServiceImpl")
	private PlayerService playerService;
	
	@GetMapping("/list")
	public ResponseEntity<List<Player>> listPlayers(){
		LOG.info("listPlayers()");
		List<Player> players = playerService.listAllPlayers();
		return new ResponseEntity<List<Player>>(players, HttpStatus.OK);
	}

}
