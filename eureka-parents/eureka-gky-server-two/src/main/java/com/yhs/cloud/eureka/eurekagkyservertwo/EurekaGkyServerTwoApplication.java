package com.yhs.cloud.eureka.eurekagkyservertwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaGkyServerTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaGkyServerTwoApplication.class, args);
	}
}
