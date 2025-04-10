package com.lol.civilwar.domain.match;

import lombok.Builder;
import lombok.Getter;

@Getter
public class MatchDetail {

	private Info info;

	@Builder
	private MatchDetail(Info info) {
		this.info = info;
	}
}
