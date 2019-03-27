package com.yjw.mobile;

public class Phone {
	
	String brand;
	int price;
	String color;
	int size;
	
	public Phone(){
		//이렇게 생긴걸 디폴트생성자 또는 빈생성자 또는 기본생성자라고 칭함.
		//매개변수가 없는 생성자
		//클래스 생성자가 하나라도 없으면 
		//컴파일러가 디폴트생성자를 하나 만들어줌.
	    this.brand="LG";
	    this.price=200;
	    color="Red";
	    size = 15;
	    System.out.println("Phone 제작이 완료되었습니다");
	    this.info();
	    
		
		
	}
	public void info() {
		System.out.println("Phone~~~~~~~");
	}
	

}
