package com.wallet.ejecucion;

import java.util.Scanner;

import com.wallet.entidades.Cliente;
import com.wallet.entidades.Cuenta;
import com.wallet.conversor.*;

public class Main {

	// Metodo principal el cual nos permitira  ejecutar nuestro codigo implementando los metodos importados de nuestras clases creadas.
	public static void main(String[] args) {

		// Crear un cliente con una cuenta existente
		Cuenta billetera1 = new Cuenta(12345, "Juanito", 100000);
		Cliente cliente1 = new Cliente(1,"Juanito", billetera1);
		Cuenta billetera2 = new Cuenta(3113,"Ramon", 2100000);
		Cliente cliente2 = new Cliente(2, "Ramon", billetera2);
		//Metodo que nos permite solicitar al usuario valores por consola y poder utilizarlo como eventos.
		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("Bienvenido a su Billetera Virtual AlkeWallet Por Favor elija su operacion");
			System.out.println("1.Crear Cuenta");
			System.out.println("2. Realizar Deposito");
			System.out.println("3.Realizar Retiro");
			System.out.println("4.Convertidor de monedas internacionales");
			System.out.println("5. Salir ");
			System.out.println("6. Mostrar lista de clientes");
			

			int opcion = scan.nextInt();

			switch (opcion) {

			case 1:
				Cuenta.crearCuentaDesdeTeclado();
				break;
			case 2:
				Cuenta.depositar();
				break;
			case 3:
				Cuenta.retirar();
				break;
			case 4:
				ConvertidorMonedas convertidor = new ConvertidorMonedas();
				convertidor.conversor();
				break;
			case 5:
				System.out.println("Saliendo del programa...");
				break;
			case 6:
				cliente1.mostrarInformacion();
				cliente2.mostrarInformacion();

			default:
				System.out.println("Por Favor Ingrese una opcion Validad");
				scan.next();
			}

		}
	}
	

}
