package com.ufv.practica1;

public class Pedido {
	private Producto producto;
	private int cantidad;
	private Direccion direccion;
	private String nombre;
	private String fecha;

	public Pedido() {
		
	}
	public Pedido(Producto producto, int cantidad, Direccion direccion, String nombre, String fecha) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
		this.direccion = direccion;
		this.nombre = nombre;
		this.fecha = fecha;

	}
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
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

