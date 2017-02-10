package com.accenture.patterns.decorator.client;

import com.accenture.patterns.decorator.Car;
import com.accenture.patterns.decorator.impl.BasicCar;
import com.accenture.patterns.decorator.impl.LuxuryCar;
import com.accenture.patterns.decorator.impl.SportsCar;

public class Client {

	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*****");
		
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();

	}

}
