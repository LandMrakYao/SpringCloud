package com.example.springclouddmeoeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringclouddmeoEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringclouddmeoEurekaApplication.class, args);
	}

}
