package com.antelope.web;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDubboConfiguration
@ComponentScan(basePackages = {"com.antelope.sso","com.antelope.web"})
public class AntelopeWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AntelopeWebApplication.class, args);
	}
}
