package com.lol.civilwar.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "riot-client", url = "${projects.riot.api.api-url}")
public class RiotApi {
}
