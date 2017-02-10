package com.accenture.patterns.factory.pizzas;

import com.accenture.patterns.factory.Pizza;

import lombok.Data;

@Data
public class Original implements Pizza{
	private TipoPizza tipoPizza= TipoPizza.ORIGINAL;
}
