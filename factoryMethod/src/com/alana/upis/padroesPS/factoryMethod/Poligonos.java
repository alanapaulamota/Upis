package com.alana.upis.padroesPS.factoryMethod;

public abstract class Poligonos {

	public abstract String getL1();

	public abstract String getL2();

	public abstract String getL3();

	@Override
	public String toString() {
		return "Lado1 =" + this.getL1() + ", Lado2 =" + this.getL2() + ", Lado3 =" + this.getL3();
	}

}
