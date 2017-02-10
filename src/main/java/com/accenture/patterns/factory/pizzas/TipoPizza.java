package com.accenture.patterns.factory.pizzas;

import lombok.ToString;

@ToString
public enum TipoPizza {
	ESPECIAL("peperoni, tocino, salchicha italiana"), 
	ORIGINAL("peperoni"), 
	VEGETARIANO("cebolla,pimiento");
	
	TipoPizza(String ingredientes){
		this.ingredientes = ingredientes;
	}
	
	private String ingredientes;
	private	String masa = "original";		 
	private	String salsa = "tomate";
	private	String queso = "mozzarela";
	
	
}
