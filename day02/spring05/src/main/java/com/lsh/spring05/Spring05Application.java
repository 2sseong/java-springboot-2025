package com.lsh.spring05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import java.lang.Object;

@SpringBootApplication
public class Spring05Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring05Application.class, args);

		//상속
		Dog poppy = new Dog();
		poppy.setName("뽀삐");
		poppy.cry();
		// poppy.age = -19;
		poppy.setAge(450);
		System.out.println("뽀삐의 나이는 " + poppy.getAge() + "살");

		Cat kitty = new Cat();
		kitty.setName("키티");
		kitty.cry();
		// kitty.age = 3;
		kitty.setAge(12);
		System.out.println("키티의 나이는 " + kitty.getAge() + "살");


		Dog choonsam = new Dog();
		choonsam.setName("춘삼");	
		choonsam.cry();
		System.out.println(choonsam.getClass().getSimpleName()); // Object 클래스 메서드를 사용가능

	}

}
