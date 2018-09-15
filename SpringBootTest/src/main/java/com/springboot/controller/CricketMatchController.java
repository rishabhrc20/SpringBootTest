package com.springboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.commond.TeamDetail;

@RestController
public class CricketMatchController {

	@GetMapping("/api/cricketScore/{teamId}")
	public List<TeamDetail> getTeamInformation(@RequestBody TeamDetail details)

	{

		List<TeamDetail> team = new ArrayList<TeamDetail>();
		
		team.add(new TeamDetail(1,30,"kenya"));
		team.add(new TeamDetail(2,100,"Aus"));
		team.add(new TeamDetail(3,120,"Inida"));
		team.add(new TeamDetail(4,70,"Pakistan"));
		team.add(new TeamDetail(6,92,"Srilanka"));
		team.add(new TeamDetail(7,114,"Africa"));
		
		HashMap cricketScore = new HashMap<>();
		
		return team;
		}
	

		
		@GetMapping("/health")
		public String checkStatus() 
		
		{
			System.out.println("health-- Check");
			return "Success";
		}
		
		


}


