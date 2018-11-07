package com.cjgmj.testSpringRest.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjgmj.testSpringRest.entity.Player;
import com.cjgmj.testSpringRest.service.PlayerService;

@RestController
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
	
	@GetMapping("/top5Nationality/{nationality}")
	public  ResponseEntity<List<Player>> top5Nationality(@PathVariable(value="nationality") String nationality){
		LOG.info("top5Nationality()");
		List<Player> players = playerService.findTop5ByNationality(nationality);
		return new ResponseEntity<List<Player>>(players, HttpStatus.OK);
	}
	
	@GetMapping("/top1League/{league}")
	public  ResponseEntity<Player> top1League(@PathVariable(value="league") String league){
		LOG.info("top1League()");
		Player player = playerService.findFirstByLeague(league);
		return new ResponseEntity<Player>(player, HttpStatus.OK);
	}

}
