package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*  test*/
@SpringBootApplication
@RestController
public class Sample01hApplication {

	@GetMapping("/message")
	public String message(){
		return "Hello Message from Main  -  Changing the message !";
	}

	public static void main(String[] args) {
		SpringApplication.run(Sample01hApplication.class, args);
	}

}
