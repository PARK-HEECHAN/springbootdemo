package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan; //컴포넌트 스캔을 위한 모듈

@SpringBootApplication
//@ComponentScan(basePackageClasses={ExController.class}) //컨트롤러 스캔
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
