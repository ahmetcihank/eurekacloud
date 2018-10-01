package com.sft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class EurekacloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekacloudApplication.class, args);
	}


}
