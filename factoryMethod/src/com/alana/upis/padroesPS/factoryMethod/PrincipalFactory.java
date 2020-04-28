package com.alana.upis.padroesPS.factoryMethod;

public class PrincipalFactory {

	public static void main(String[] args) {
		Poligonos poligono = new Triangulo(10, 10, 12);
		System.out.println(poligono.getTipo());
	}

}
