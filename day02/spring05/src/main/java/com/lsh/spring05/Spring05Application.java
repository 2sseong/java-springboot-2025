package com.lsh.spring05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring05Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring05Application.class, args);

		//상속
		Dog poppy = new Dog();
		poppy.setName("뽀삐");
		poppy.cry();
		
		Cat kitty = new Cat();
		kitty.setName("키티");
		kitty.cry();
	}

}
