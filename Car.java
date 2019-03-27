package com.yjw.car;

public class Car {
	
	Engine engine;
	Wheel [] Wheels;
	String color;
	
	
	
	public void info(String color) {
		
		System.out.println(color);
		System.out.println(color);
		System.out.println(this.color);//자기 객체의 color를 뜻함  this= 자기자신을 나타내는 객체를 뜻함.
		info2();
	}
	
	public void info2() {
		System.out.println("car~~~~~~~~~~");
		
	
		
	}

}
