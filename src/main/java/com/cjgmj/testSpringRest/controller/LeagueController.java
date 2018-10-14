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

import com.cjgmj.testSpringRest.entity.League;
import com.cjgmj.testSpringRest.service.LeagueService;

@Controller
@RequestMapping("/leagues")
public class LeagueController {
	
	private static final Log LOG = LogFactory.getLog(LeagueController.class);
	
	@Autowired
	@Qualifier("leagueServiceImpl")
	private LeagueService leagueService;
	
	@GetMapping("/list")
	public ResponseEntity<List<League>> listLeagues(){
		LOG.info("listLeagues()");
		List<League> leagues = leagueService.listAllLeagues();
		return new ResponseEntity<List<League>>(leagues, HttpStatus.OK);
	}

}
