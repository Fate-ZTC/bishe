package com.xxl.api.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author ztc 2018-10-25
 */
@SpringBootApplication
@EnableSwagger2
public class XxlApiApplication {

	public static void main(String[] args) {
        SpringApplication.run(XxlApiApplication.class, args);
	}

}