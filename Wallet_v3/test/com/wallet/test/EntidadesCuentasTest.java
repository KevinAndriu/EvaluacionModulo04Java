package com.wallet.test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.wallet.entidades.Cuenta;

class EntidadesCuentasTest {

	// Declaramos el objeto

	@BeforeAll
	public static void setUpObject() {
		System.out.println("Configuracion inicial de objetos");
		new EntidadesCuentasTest();
	}

	@AfterAll
	public static void tearDownClass() {
		System.out.println("Limpieza al final de la clase");
	}

	@BeforeEach
	public void setUp() {
		System.out.println("esta a punto de ejecutarse una prueba");
	}

	@AfterEach
	public void tearDown() {
		System.out.println("Limpiando recuersos");
	}

	@Test
	public void testMostrarInfo() {
		System.out.println("Muestra Informacion de los Clientes.");
		Cuenta cuenta = new Cuenta(12345,"jose",3000);
		//LLamamos al metodo que queremos probar
		cuenta.mostrarInformacion();
		//Luego verificamos que la salida sea la esperada
		
		String expectedOutPut = "Numero de Cuenta: 12345\n Titulat : Jose\n 3000";
		equals(expectedOutPut);
	}
	
	
	
	@Test
	public void testCrearCuenta() {
	    System.out.println("Creamos Cuenta desde Consola");
	    
	    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outputStream));
	    Cuenta cuenta = new Cuenta(12345678, " Pedro", 10000);
	    
	    // Llamamos al método que queremos probar
	    cuenta.mostrarInformacion();
	    
	    // Verificamos que la salida sea la esperada
	    String expectedOutput = "Numero de cuenta:  12345678\nTitular: Pedro\nSaldo: 10000.0\n";
	    assertEquals(expectedOutput.trim(), outputStream.toString().trim());
	}
	
	@Test
    public void testDepositar() {
        // Redirigir la entrada y la salida estándar
        String input = "1500\n"; // Simula la entrada del usuario
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Ejecutar el método a probar
        Cuenta.depositar();

        // Restaurar la entrada y la salida estándar
        System.setIn(System.in);
        System.setOut(System.out);

        // Verificar la salida esperada
        String expectedOutput = "Por favor ingrese la cantidad que de sea agregar\nSe ha ingresado 500.0 en la cuenta, su saldo disponible es: 1500.0\n";
        assertEquals(expectedOutput, outputStream.toString());
    }
	}

