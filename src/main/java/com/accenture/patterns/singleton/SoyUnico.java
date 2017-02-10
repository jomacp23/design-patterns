package com.accenture.patterns.singleton;

import lombok.Getter;

@Getter
public class SoyUnico {
	private static SoyUnico UNICO;
	
	private String nombre;
	
	private SoyUnico(String nombre){
		this.nombre = nombre;
		System.out.println("Mi nombre es: "+nombre);
	}

	public static SoyUnico getSoyUnico(String nombre) {
		
		if(UNICO == null){
			UNICO = new SoyUnico(nombre);
		}else{
			System.out.println("No se puede crear el objeto "+ nombre + " porque ya existe un objeto de la clase SoyUnico");
		}
		
		return UNICO;
	}

	
	
	
	

}
