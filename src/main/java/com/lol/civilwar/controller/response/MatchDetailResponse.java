package com.lol.civilwar.controller.response;

import com.lol.civilwar.domain.match.Info;
import com.lol.civilwar.domain.match.MatchDetail;

public record MatchDetailResponse(
		Info info

) {
	public static MatchDetailResponse from(MatchDetail matchDetail) {
		return new MatchDetailResponse(
				matchDetail.getInfo()
		);
	}
}
