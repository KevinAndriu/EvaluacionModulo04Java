package com.wallet.entidades;


// La Clase Cliente nos permite crear una estructura basica de cada nuevo cliente que sea creado y se asociara 
// a la cuenta antes creada. pudiendo permitir heredar una su estrcutura a nuevos clientes.
public class Cliente {
	
	private long id;
	private String nombre;
	private Cuenta cuenta; // asociacion con la clase Cuenta
	
	//Constructor Parametrizado
	public Cliente(long id, String nombre, Cuenta cuenta) {
		this.id = id;
		this.nombre = nombre;
		this.cuenta = cuenta;
	}
	
	//El siguiente metodo nos permite imprimir por consola la informacion de cada cliente que sea creado.
	public void mostrarInformacion(){
		System.out.println("Id cliente :  " + id);
		System.out.println("Nombre cliente : " + nombre);
		System.out.println("Datos de la cuenta : ");
		cuenta.mostrarInformacion();
	}
	
	//Se agregan Getters and Setters los claues nos permitirar mostrar y accerder a cada atributo del constructor 
	//para hacer uso de ellos cuando se requiera

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	
	
	
	
}
