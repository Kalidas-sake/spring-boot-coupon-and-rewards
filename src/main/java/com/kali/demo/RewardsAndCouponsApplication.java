package com.kali.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class RewardsAndCouponsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RewardsAndCouponsApplication.class, args);
	}

}
