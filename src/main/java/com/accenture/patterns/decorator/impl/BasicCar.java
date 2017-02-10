package com.accenture.patterns.decorator.impl;

import com.accenture.patterns.decorator.Car;

public class BasicCar implements Car{

	@Override
	public void assemble() {
		System.out.println("Basic Car.");		
	}

}
