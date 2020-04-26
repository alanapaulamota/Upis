package com.alana.upis.padroesPS.factoryMethod;

import javax.swing.JOptionPane;

class TrianguloFactory {

	public static Poligonos getPoligonos(int l1, int l2, int l3) {

		if (l1 < l2 + l3 && l2 < l1 + l3 && l3 < l1 + l2) {
			if (l1 == l2 && l2 == l3) {
				JOptionPane.showMessageDialog(null, "O triângulo é Equilátero.");
			} else if (l1 == l2 || l1 == l3 || l2 == l3) {
				JOptionPane.showMessageDialog(null, "O triângulo é Isósceles.");
			} else {
				JOptionPane.showMessageDialog(null, "O triângulo é Escaleno.");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Valores invalidos para um triângulo");
		}

		return null;
	}

}
