package com.softedge.solution.certusrediscacheservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CertusRedisCacheServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CertusRedisCacheServiceApplication.class, args);
	}

}
