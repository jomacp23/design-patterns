package com.accenture.patterns.decorator.impl;

import com.accenture.patterns.decorator.Car;
import com.accenture.patterns.decorator.CarDecorator;

public class SportsCar extends CarDecorator {

	public SportsCar(Car car) {
		super(car);		
	}
	
	@Override
	public void assemble(){
		super.assemble();
		System.out.println(" Adding features of Sports Car.");
	}

}
