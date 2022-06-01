package com.kcrs.microservice.loyality.loYalityClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class LoYalityClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoYalityClientApplication.class, args);
	}

}
