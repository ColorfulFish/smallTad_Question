package com.small.tadpole;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.small.tadpole.mapper")
@ServletComponentScan
public class SmallTadpoleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmallTadpoleApplication.class, args);
	}
}
