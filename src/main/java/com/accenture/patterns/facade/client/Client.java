package com.accenture.patterns.facade.client;

import com.accenture.patterns.facade.OrderServiceFacade;
import com.accenture.patterns.facade.OrderServiceFacadeImpl;

public class Client {

	public static void main(String[] args) {
		OrderServiceFacade facade =new OrderServiceFacadeImpl();
		System.out.println("Before the order");
        boolean result = facade.placeOrder(9);
        System.out.println("Resul is:" +result);

	}

}
