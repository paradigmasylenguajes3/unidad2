package test;

import objects.Cuenta;

public class CuentaTest {

	public static void main(String[] args) {
		//declaracion
		Cuenta cuenta;
		Cuenta cuenta2;
		String nombre = "Juan Pablo";
		//instancias
		cuenta = new Cuenta(nombre);
		cuenta2 = new Cuenta();
		
		System.out.println(cuenta);
		//System.out.println(Math.pow(2, 4));
	}

}
