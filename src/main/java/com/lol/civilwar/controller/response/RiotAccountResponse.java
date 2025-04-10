
package com.lol.civilwar.controller.response;


import com.lol.civilwar.domain.account.RiotAccount;
import com.lol.civilwar.domain.match.MatchDetail;

public record RiotAccountResponse(
		String puuid,
		String gameName,
		String tagLine
) {

	public static RiotAccountResponse from(RiotAccount riotAccount) {
		return new RiotAccountResponse(
				riotAccount.getPuuid(),
				riotAccount.getGameName(),
				riotAccount.getTagLine()
		);
	}
}
