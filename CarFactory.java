package com.yjw.car;

public class CarFactory {
	
	public void makeCar() {
		EngineAdd en = new EngineAdd();
		wheelAdd wa = new wheelAdd();
		Carview cv= new Carview();
		ColorPaint cp = new ColorPaint();
		
		
		
		
		
		 Car car = new Car();//*****Car() = 메서드 
	     car =en.setEngine(car);
	     car = wa.setWheel(car);
	     cp.setColor(car);
	     
	    // cv.view(car);
	     car.info("Blue");
	     Car car2 = new Car();
	     car2.color="White";
	     car2.info("Red");
	
	     
		
		
	}
	
	
	

}
