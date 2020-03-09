package com.ufv.practica1;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name= "tienda")
public class Tienda {
	//Definimos las listas de productos que va a contener nuestra tienda
	private List <Producto> productos;
	private List <Cliente> clientes;
	private List <Pedido> pedidos;
	
	
	public Tienda() {
		super();
	}
	

	//Metodos asociados a las listas
	@XmlElementWrapper(name="productos")
	@XmlElement(name="producto")
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	@XmlElementWrapper(name="clientes")
	@XmlElement(name="cliente")
	public List<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	@XmlElementWrapper(name="pedidos")
	@XmlElement(name="pedido")
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
}
