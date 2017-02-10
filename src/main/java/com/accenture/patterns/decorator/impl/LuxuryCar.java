package com.accenture.patterns.decorator.impl;

import com.accenture.patterns.decorator.Car;
import com.accenture.patterns.decorator.CarDecorator;

public class LuxuryCar extends CarDecorator{

	public LuxuryCar(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void assemble(){
		super.assemble();
		System.out.println(" Adding features of Luxury Car.");
	}
}
