package com.lol.civilwar.controller;

import com.lol.civilwar.service.RiotService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/riot/api/")
@RestController
public class RiotController {

	private final RiotService riotService;

	public RiotController(RiotService riotService) {
		this.riotService = riotService;
	}

	@GetMapping("/{gameId}/{tagName}")
	public void getMatchList(
			@PathVariable("gameId") String gameId,
			@PathVariable("tagName") String tagName
	) {

	}
}
