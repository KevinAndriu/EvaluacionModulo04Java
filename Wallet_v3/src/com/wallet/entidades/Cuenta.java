package com.wallet.entidades;

import java.util.Scanner;

public class Cuenta {
	private int numeroCuenta;
	private String titular;
	public static double saldo;
	private static String next;

	// Constructor Parametrizado
	public Cuenta(int numeroCuenta, String titular, double saldo) {
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		Cuenta.saldo = saldo;
	}

	// metodo para mostrar info de la cuenta
	public void mostrarInformacion() {
		System.out.println("Numero de cuenta:  " + numeroCuenta);
		System.out.println("Titular:" + titular);
		System.out.println("Saldo: " + Cuenta.saldo);
	}

	// Metodo el cual nos permite crear una nueva cuenta
	// retornando luego los valores ya creados.
	public static Cuenta crearCuentaDesdeTeclado() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Ingrese el numero de cuenta:");
		int numeroCuenta = scan.nextInt();
		scan.nextLine();

		System.out.println("Ingrese el nombre del titular:");
		String titular = scan.nextLine();

		System.out.println("Ingrese el saldo:");
		double saldo = scan.nextDouble();
		scan.nextLine();

		scan.close();
		return new Cuenta(numeroCuenta, titular, saldo);

	}

	/*
	 * El siguiente codigo ha sido comentado con la finalidad de poder darle un uso
	 * cuando lo requiera o como metodo de prueba public static Cuenta
	 * crearCuentaDesdeTecladov2() { Scanner scanner = new Scanner(System.in);
	 * 
	 * System.out.println("Ingrese el numero de cuenta:"); int numeroCuenta =
	 * scanner.nextInt();
	 * 
	 * System.out.println("Ingrese el nombre del titular:"); String titular =
	 * scanner.nextLine();
	 * 
	 * System.out.println("Ingrese el saldo:"); double saldo = scanner.nextDouble();
	 * scanner.close();
	 * 
	 * Cuenta cuenta = new Cuenta(numeroCuenta, titular, saldo ); return cuenta; }
	 **/

	// Metodo para realizar depositos
	public static void depositar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Por favor ingrese la cantidad que de sea agregar");
		double cantidad = scan.nextDouble();
		if (cantidad > 0) {
			double nuevoSaldo = saldo += cantidad;
			System.out.println("Se ha ingresado " + cantidad + " en la cuenta, su saldo disponible es: " + nuevoSaldo);
		} else {
			System.out.println("Favor ingrese una cantidad para depositar");
		}
scan.close();
	}

	// Metodo para realizar retiros.

	public static void retirar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Por favor ingrese el monto a retirar");
		double cantidad = scan.nextDouble();
		if (cantidad < saldo) {
			double saldoRestante = saldo -= cantidad;
			System.out
					.println("Se ha retirado " + cantidad + " de su cuenta " + "su saldo actual es: " + saldoRestante);
		} else {

			System.out.println("Fondos insuficientes por favor realice agregue dinero a su cuenta.");
		}
		
		scan.close();
	}

	// Se agregan Getters and Setters los claues nos permitirar mostrar y accerder a
	// cada atributo del constructor
	// para hacer uso de ellos cuando se requiera
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		Cuenta.saldo = saldo;
	}

}
