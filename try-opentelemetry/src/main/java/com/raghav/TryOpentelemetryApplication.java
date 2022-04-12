package com.raghav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TryOpentelemetryApplication {

	@RequestMapping("/message")
	public String getMessage()
	{
		return "Hello Raghav";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TryOpentelemetryApplication.class, args);
	}

}
