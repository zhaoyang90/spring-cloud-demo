package com.noisyle.demo.springcloud.zuul;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.netflix.zuul.ZuulFilter;
import com.noisyle.demo.springcloud.zuul.filter.AccessFilter;

@EnableZuulProxy
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).web(true).run(args);
	}
	
	@Bean
	public ZuulFilter accessFilter() {
		return new AccessFilter();
	}
}
