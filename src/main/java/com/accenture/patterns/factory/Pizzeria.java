package com.accenture.patterns.factory;

import com.accenture.patterns.factory.pizzas.Especial;
import com.accenture.patterns.factory.pizzas.Original;
import com.accenture.patterns.factory.pizzas.TipoPizza;
import com.accenture.patterns.factory.pizzas.Vegetariano;

public class Pizzeria {

	public static Pizza createPizza(TipoPizza tipoPizza) {
		Pizza pizza = null;

		switch (tipoPizza) {
		case ESPECIAL:
			pizza = new Especial();
			break;
		case ORIGINAL:
			pizza = new Original();
			break;
		case VEGETARIANO:
			pizza = new Vegetariano();
			break;
		default:
			break;			
		}

		return pizza;
	}
}
