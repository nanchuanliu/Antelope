package com.antelope.web;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class AntelopeWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AntelopeWebApplication.class, args);
	}
}
