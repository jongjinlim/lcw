package com.lol.civilwar.service;

import com.lol.civilwar.client.RiotApi;
import com.lol.civilwar.controller.response.MatchDetailResponse;
import com.lol.civilwar.controller.response.RiotAccountResponse;
import com.lol.civilwar.domain.account.RiotAccount;
import com.lol.civilwar.domain.match.MatchDetail;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class RiotService {

	private final RiotApi riotApi;

	private final String riot_token = "RGAPI-c843c250-325b-49b4-8cf2-676ef9b092c1";

	public List<MatchDetail> getCustomMatches(String gameName, String tagLine) {
		// puuid 가져오기
		RiotAccount account = riotApi.getAccountByRiotId(gameName, tagLine, riot_token);
		String puuid = account.getPuuid();

		// 유저 match id 가져오기 (일단 20개)
		List<String> matchIds = riotApi.getMatchIdsByPuuid(puuid, riot_token);

		// 사용자설정게임만 분리
		return matchIds.stream()
				.map(id -> {
					try {
						return riotApi.getMatchDetailById(id, riot_token);
					} catch (Exception e) {
						return null;
					}
				})
				.filter(Objects::nonNull)
				.filter(match -> {
					String mode = match.getInfo().getGameMode();
					int queueId = match.getInfo().getQueueId();
					return "CUSTOM".equalsIgnoreCase(mode) || queueId == 0;
				})
				.collect(Collectors.toList());
	}




}
