package com.lsh.spring05;

// 부모클래스 동물
public class Animal { // public 어디서든지 불러서 사용가능
    // String name; // default 
    // public String naem; // public
    private String name; // private
    // protected String name; // protected
    private int age;        // 동물의 나이 


    public int getAge() {
        return age;
    }

    // 정확한 캡슐화를 위해서 필터림
    public void setAge(int age) {
        if (age < 0) {
            this.age = 1; // 음수제한
        } else if (age> 20){
            this.age = 20; // 큰수제한
        } else{
            this.age = age;
        }
    }

    void setName(String name){
        this.name = name;
    }
    
    String getName(){
        return this.name;
    }
    
    void cry(){
        System.out.println(this.name +"이 웁니다");
    }
}
