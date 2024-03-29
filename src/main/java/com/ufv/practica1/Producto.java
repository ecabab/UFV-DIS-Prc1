package com.ufv.practica1;

import javax.xml.bind.annotation.XmlType;

@XmlType (propOrder={"codigo", "nombre", "descripcion", "stock", "localizacion", "pendientes"})
public class Producto {
	private String codigo;
	private String nombre;
	private String descripcion;
	private int stock;
	private Localizacion localizacion;
	private int pendientes;
	
	public Producto() {
		
	}
	
	public Producto(String codigo, String nombre, String descripcion, int stock, Localizacion localizacion,
			int pendientes) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.stock = stock;
		this.localizacion = localizacion;
		this.pendientes = pendientes;
	}
	

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", stock=" + stock
				+ ", localizacion=" + localizacion + ", pendientes=" + pendientes + "]";
	}

	
	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public Localizacion getLocalizacion() {
		return localizacion;
	}


	public void setLocalizacion(Localizacion localizacion) {
		this.localizacion = localizacion;
	}


	public int getPendientes() {
		return pendientes;
	}


	public void setPendientes(int pendientes) {
		this.pendientes = pendientes;
	}
}
