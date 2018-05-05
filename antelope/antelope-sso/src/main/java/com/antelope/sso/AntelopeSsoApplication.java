package com.antelope.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class AntelopeSsoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AntelopeSsoApplication.class, args);
	}
}
