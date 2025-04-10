package com.lol.civilwar.domain.match;

import lombok.Getter;

import java.util.List;

@Getter
public class Info {
	private String gameMode;
	private int queueId;
	private long gameStartTimestamp;
	private long gameDuration;
	private List<Participant> participants;
}
