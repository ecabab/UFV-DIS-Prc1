package com.ufv.practica1;

import javax.xml.bind.annotation.XmlType;

@XmlType (propOrder={"nombre", "cantidad", "direccion", "destinatario", "fecha"})
public class Pedido {
	private String nombre;
	private int cantidad;
	private Direccion direccion;
	private String destinatario;
	private String fecha;

	public Pedido() {
		
	}
	
	public Pedido(String nombre, int cantidad, Direccion direccion, String destinatario, String fecha) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.direccion = direccion;
		this.destinatario = destinatario;
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		return "Pedido [nombre=" + nombre + ", cantidad=" + cantidad + ", direccion=" + direccion + ", nombre="
				+ nombre + ", fecha=" + fecha + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombreProducto) {
		this.nombre = nombreProducto;
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

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
}

