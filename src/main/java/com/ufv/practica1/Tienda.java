package com.ufv.practica1;

import java.util.List;

public class Tienda {
	//Definimos las listas de productos que va a contener nuestra tienda
	private List <Cliente> cliente;
	private List <Pedido> pedido;
	private List <Producto> producto;
	
	//Metodos asociados a las listas
	public List<Cliente> getCliente() {
		return cliente;
	}
	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}
	public List<Pedido> getPedido() {
		return pedido;
	}
	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}
	public List<Producto> getProducto() {
		return producto;
	}
	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}
	
	
	
}
