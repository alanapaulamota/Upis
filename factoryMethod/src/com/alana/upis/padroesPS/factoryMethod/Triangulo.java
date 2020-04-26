package com.alana.upis.padroesPS.factoryMethod;

public class Triangulo extends Poligonos {
	private String l1;
	private String l2;
	private String l3;

	public Triangulo(String l1, String l2, String l3) {
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}

	@Override
	public String getL1() {
		return this.l1;
	}

	@Override
	public String getL2() {
		return this.l2;
	}

	@Override
	public String getL3() {
		return this.l3;
	}

}
