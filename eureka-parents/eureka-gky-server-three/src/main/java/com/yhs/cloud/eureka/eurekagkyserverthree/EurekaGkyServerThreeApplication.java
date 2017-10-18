package com.yhs.cloud.eureka.eurekagkyserverthree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaGkyServerThreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaGkyServerThreeApplication.class, args);
	}
}
