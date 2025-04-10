package com.lol.civilwar.domain.account;

import lombok.Builder;
import lombok.Getter;

@Getter
public class RiotAccount {

	private String puuid;
	private String gameName;
	private String tagLine;

	@Builder
	private RiotAccount(String puuid, String gameName, String tagLine) {
		this.puuid = puuid;
		this.gameName = gameName;
		this.tagLine = tagLine;
	}
}
