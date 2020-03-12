package com.ufv.practica1;

public class Pedido {
	private String nombreProducto;
	private int cantidad;
	private Direccion direccion;
	private String nombre;
	private String fecha;

	public Pedido() {
		
	}
	
	public Pedido(String nombreProducto, int cantidad, Direccion direccion, String nombre, String fecha) {
		super();
		this.nombreProducto = nombreProducto;
		this.cantidad = cantidad;
		this.direccion = direccion;
		this.nombre = nombre;
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		return "Pedido [nombreProducto=" + nombreProducto + ", cantidad=" + cantidad + ", direccion=" + direccion + ", nombre="
				+ nombre + ", fecha=" + fecha + "]";
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
}

