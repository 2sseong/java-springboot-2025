package com.lsh.spring05;

// Animal 부모클래스를 상속한 Dog 클래스
public class Dog extends Animal {
    
    //부모클래스의 메서드를 오버라이딩
    void cry(){
        System.out.println(super.getName() +"이(가) 웁니다. 멍멍!!");   //super 부모클래스
        
    }
}
