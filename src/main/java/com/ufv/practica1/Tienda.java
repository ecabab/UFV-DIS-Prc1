package com.ufv.practica1;

import java.util.List;

public class Tienda {
	//Definimos las listas de productos que va a contener nuestra tienda
	private List <Cliente> clientes;
	private List <Pedido> pedidos;
	private List <Producto> productos;
	
	
	
	public Tienda() {
		super();
	}
	
	//Metodos asociados a las listas
	public List<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
	
}
