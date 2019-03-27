package com.yjw.car;

public class Carview {
	
	public void view(Car car) {
		System.out.println("인젠 파워: "  +  car.engine.hp);
		for(int i=0;i<car.Wheels.length;i++) {
			System.out.println("Wheel color:"+ car.Wheels[i].color);
			System.out.println("Wheel size:"+car.Wheels[i].size);
		}
		System.out.println("Color :"+car.color);
		
		
		
	}

}
