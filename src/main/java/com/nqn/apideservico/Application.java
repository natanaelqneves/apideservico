package com.nqn.apideservico;

import com.nqn.apideservico.exceptions.RestExceptionHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.nqn.apideservico.exceptions")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
