package com.accenture.patterns.singleton.client;

import com.accenture.patterns.singleton.SoyUnico;

public class Client {

	public static void main(String[] args) {
		SoyUnico juan = SoyUnico.getSoyUnico("Juan");
		SoyUnico otro = SoyUnico.getSoyUnico("pedro");
		
		System.out.println(juan == otro);
		System.out.println(juan.getNombre().equals(otro.getNombre()));
		
		otro = SoyUnico.getSoyUnico("Gordo");
		System.out.println(juan == otro);

	}

}
