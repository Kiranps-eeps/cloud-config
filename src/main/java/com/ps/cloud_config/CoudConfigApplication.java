package com.ps.cloud_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CoudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoudConfigApplication.class, args);
	}

}
