package com.antelope;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDubboConfiguration
@ComponentScan(basePackages = {"com.antelope"})
//加载当前包和所有子包下的注释类
//继承SpringBootServletInitializer支持war包发布
public class AntelopeWebApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AntelopeWebApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(AntelopeWebApplication.class);
	}
}
