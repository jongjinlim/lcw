package com.lol.civilwar.domain.match;

import lombok.Getter;

@Getter
public class Participant {

	private String summonerName;
	private String championName;
	private int kills;
	private int deaths;
	private int assists;
}
