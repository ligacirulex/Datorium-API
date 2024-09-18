package com.datorium.Datorium.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin
public class DatoriumApiApplication {

	public static void main(String[] args) {
		var userService = new UserService();

		System.out.println(userService.getFullName("Līga", "Cīrule"));
		SpringApplication.run(DatoriumApiApplication.class, args);
	}
}

