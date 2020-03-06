package com.ufv.practica1;

public class Cliente {
	private String nombre;
	private String apellidos;
	private String email;
	private int telefono;
	private Direccion direccion;

	public Cliente(String nombre, String apellidos, String email, int telefono, Direccion direccion) {
		super();
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setEmail(email);
		this.setTelefono(telefono);
		this.setDireccion(direccion);

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
}
