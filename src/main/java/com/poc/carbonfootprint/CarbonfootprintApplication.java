package com.poc.carbonfootprint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CarbonfootprintApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarbonfootprintApplication.class, args);
	}

}
