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

import com.cjgmj.testSpringRest.entity.Team;
import com.cjgmj.testSpringRest.service.TeamService;

@Controller
@RequestMapping("/teams")
public class TeamController {
	
	private static final Log LOG = LogFactory.getLog(TeamController.class);
	
	@Autowired
	@Qualifier("teamServiceImpl")
	private TeamService teamService;
	
	@GetMapping("/list")
	public ResponseEntity<List<Team>> listTeams(){
		LOG.info("listTeams()");
		List<Team> teams = teamService.listAllTeams();
		return new ResponseEntity<List<Team>>(teams, HttpStatus.OK);
	}

}
