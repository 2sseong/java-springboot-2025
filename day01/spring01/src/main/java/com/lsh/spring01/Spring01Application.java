package com.lsh.spring01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring01Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring01Application.class, args);

		System.out.println("Hello, Spring Boot");

		// 변수, 자료현연습
		int account = 10000000;
		System.out.println("계좌금액은"+ account);
		float pi = 3.141592f;
		System.out.println("Pi는"+pi);
		char ch_first = "A";
		System.out.println("문자는" + ch_first);

		// 연산자 연습
		int a = 17;
		int b =25;
		System.out.println("a+b - %d\n");
		float divresult = b/a;
		System.out.println("a %% b = %f/n", divresult);
		
		a++;
		System.out.println("a++=" +a++);


	}

}
