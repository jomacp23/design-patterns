package com.accenture.patterns.factory.client;

import com.accenture.patterns.factory.Pizza;
import com.accenture.patterns.factory.Pizzeria;
import com.accenture.patterns.factory.pizzas.TipoPizza;

public class Cliente {
	
	public static void main(String... args){
		Pizza especial    = Pizzeria.createPizza(TipoPizza.ESPECIAL);
		Pizza original    = Pizzeria.createPizza(TipoPizza.ORIGINAL);
		Pizza vegetariano = Pizzeria.createPizza(TipoPizza.VEGETARIANO);
				
		System.out.println(especial);
		System.out.println(original);
		System.out.println(vegetariano);
	}

}
