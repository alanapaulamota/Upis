package com.alana.upis.padroesPS.factoryMethod;

public class PrincipalFactory {

	public static void main(String[] args) {
		Poligonos poligonos = TrianguloFactory.getPoligonos(10, 1, 5);
		System.out.println(poligonos);
	}

}
