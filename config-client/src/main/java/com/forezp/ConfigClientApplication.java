package com.forezp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RefreshScope
public class ConfigClientApplication {

	@Value("${confVersion}")
	String version;
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

	@RequestMapping(value = "/versionInfo")
	public String versionInfo(){
		return version;
	}
}
