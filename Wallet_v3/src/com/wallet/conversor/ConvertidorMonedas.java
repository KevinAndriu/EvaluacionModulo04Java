package com.wallet.conversor;

import com.wallet.entidades.Cuenta;
import java.util.Scanner;

public class ConvertidorMonedas {

	public Cuenta saldo; // asociacion con la clase Cuenta
//Atributos Locales y con herencia
	double tasaPesoDolar = 929.89;
	double tasaPesoEuro = 1001.29;
	double cantidadDisponible = convertidorMonedas(saldo);
	Scanner scan = new Scanner(System.in);

	
	//Constructor Parametrizado
	public double convertidorMonedas(Cuenta cuenta) {
		this.saldo = cuenta;
		return cantidadDisponible;
	}
	
	//Metodo para convertir los tipos de monedas dependiendo del caso, mediante validaciones y operaciones matematicas
	public void conversor() {

		System.out.println("Por Favor elija manoneda que desea convertir");
		System.out.println("1. Peso a Dolar");
		System.out.println("2. Peso a Euro");
		System.out.println("3.Salir");
		int opcion = scan.nextInt();

		if (opcion == 1) {
			System.out.println("Por Favor ingrese el monto que desea convertir");
			cantidadDisponible = scan.nextDouble();
			if (cantidadDisponible > tasaPesoDolar) {

				double pesosDolares = cantidadDisponible / tasaPesoDolar;
				System.out.println("Su dinero fue convertido!!! usted Recibe:" + pesosDolares + "$");
			} else {
				System.out.println("Por favor ingrese un monto valido");
			} scan.next();
		} else if (opcion == 2) {
			System.out.println("Por Favor ingrese el monto que desea convertir");
			cantidadDisponible = scan.nextDouble();
			if (cantidadDisponible > tasaPesoEuro) {
				double pesosEuros = cantidadDisponible / tasaPesoEuro;
				System.out.println("Su dinero fue convertido!!! usted Recibe:" + pesosEuros + "€");
			} else {
				System.out.println("Por favor ingrese un monto valido");
			}scan.next();
		} else {

			System.out.println("Por favor ingrese una opcion valida ");

		}
scan.close();
	}
}
