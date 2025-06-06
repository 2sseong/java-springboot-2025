package com.lsh.spring04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring04Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring04Application.class, args);

		// 문자열, 시간타입 핸들링
		String string1 = "Hello";  // 일반적으로 사용
		System.out.println(string1); 

		String string2 = new String("Hello");
		System.out.println(string2);

		System.out.println(string1 == string2); // 둘이 같은 주소를 쓰는 변수인지 질문
		System.out.println(string1.equals(string2)); // 둘이 가지고 있는 데이터가 같은지

		String string3 = string2;			// string2번의 주소를 string3에 할당
		System.out.println(string2 == string3);
		System.out.println(string2.equals(string3));

		// 문자열 메서드 연습
		String carstr = "avante, ionic, x3";
		String cars[] = carstr.split(",");
		for (String car : cars) {
			System.out.println(car.trim());
		}

		for (String car : cars) {
			System.out.println(car.toUpperCase());
		}

		String carresult1 = carstr.replace(", ","/");
		System.out.println(carresult1);
		String carresult2 = carstr.replace(',','/'); // Java에서 ''는 Char(글자 한자)
		System.out.println(carresult2);

		char[] charLst = string1.toCharArray(); //
		for (char oneChar : charLst){
			System.out.println(oneChar);
		}

		System.out.println(carresult1.indexOf("io")); // avante/ionic/x3 io의 위치는 7
		System.out.println(carresult1.lastIndexOf("n")); // 마지막n의 위치는 9
		System.out.println(carresult1.length()); // 전체 문자열의 길이
	}

}

