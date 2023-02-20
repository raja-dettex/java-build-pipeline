package com.raja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaBuildPipelineApplication {
	
	@GetMapping("/welcome")
	public String hello() {
		return "welcome to homepage";
	}

	public static void main(String[] args) {
		SpringApplication.run(JavaBuildPipelineApplication.class, args);
	}

}
