package com.lol.civilwar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CivilWarApplication {

	public static void main(String[] args) {
		SpringApplication.run(CivilWarApplication.class, args);
	}

}
