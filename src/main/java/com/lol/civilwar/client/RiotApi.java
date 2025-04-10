package com.lol.civilwar.client;

import com.lol.civilwar.controller.response.MatchDetailResponse;
import com.lol.civilwar.controller.response.RiotAccountResponse;
import com.lol.civilwar.domain.account.RiotAccount;
import com.lol.civilwar.domain.match.MatchDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@FeignClient(name = "riot-client", url = "${projects.riot.api.api-url}")
public interface RiotApi {

	@GetMapping("/riot/account/v1/accounts/by-riot-id/{gameName}/{tagLine}")
	RiotAccount getAccountByRiotId(
			@PathVariable String gameName,
			@PathVariable String tagLine,
			@RequestHeader("X-Riot-Token") String riotToken
	);

	@GetMapping("/lol/match/v5/matches/by-puuid/{puuid}/ids?start=0&count=20")
	List<String> getMatchIdsByPuuid(
			@PathVariable String puuid,
			@RequestHeader("X-Riot-Token") String riotToken
	);

	@GetMapping("/lol/match/v5/matches/{matchId}")
	MatchDetail getMatchDetailById(
			@PathVariable String matchId,
			@RequestHeader("X-Riot-Token") String riotToken
	);
}
