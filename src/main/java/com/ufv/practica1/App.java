package com.ufv.practica1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NumberFormatException, IOException
    {
    	Tienda tienda = new Tienda();
    	List<Producto> productos = new ArrayList<Producto>();
    	List<Cliente> clientes = new ArrayList<Cliente>();
    	List<Pedido> pedidos = new ArrayList<Pedido>();
    	tienda =  GestionXml.ReadXML();
    	productos = tienda.getProductos();
    	clientes = tienda.getClientes();
    	pedidos = tienda.getPedidos();
        int menu = -1;
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (menu != 0) {
        	mostrarMenu();
        	
        	System.out.print("-- Introduzca opción: ");
        	menu = Integer.parseInt(in.readLine());
        	
        	switch(menu) {
        	case 1:
        		Producto nuevo_producto = crearProducto();
        		productos.add(nuevo_producto);
        		break;
        	case 2:
        		Cliente nuevo_cliente = crearCliente();
        		clientes.add(nuevo_cliente);
        		break;
        	case 3:
        		Pedido nuevo_pedido = crearPedido();
        		pedidos.add(nuevo_pedido);
        		break;
        	case 4:
        		tienda.setProductos(productos);
        		tienda.setClientes(clientes);
        		tienda.setPedidos(pedidos);
        		GestionXml.CreateXML(tienda);
        		for (Producto producto: productos) {
        			System.out.println(producto.toString());
        		}
        		for (Cliente cliente: clientes) {
        			System.out.println(cliente.toString());
        		}
        		for (Pedido pedido: pedidos) {
        			System.out.println(pedido.toString());
        		}
        	}
        	
        }
        
        
    }
    
    public static void mostrarMenu() {
    	System.out.println("-- MENÚ --");
    	System.out.println("1. Crear Producto");
    	System.out.println("2. Crear Cliente");
    	System.out.println("3. Crear Pedido");
    	System.out.println("4. Exportar XML");
    }
    
    public static Producto crearProducto() throws IOException {
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	
    	// Información del producto
    	System.out.print("Código: ");
    	String codigo = in.readLine();
    	System.out.print("Nombre: ");
    	String nombre = in.readLine();
    	System.out.print("Descripción: ");
    	String descripcion = in.readLine();
    	System.out.print("Stock (número de existencias): ");
    	int stock = Integer.parseInt(in.readLine());
    	System.out.print("Pendientes de entrada en almacén: ");
    	int pendientes = Integer.parseInt(in.readLine());
    	
    	// Información de la localización
    	System.out.println("LOCALIZACIÓN");
    	System.out.print("Pasillo: ");
    	String pasillo = in.readLine();
    	System.out.print("Estantería: ");
    	String estanteria = in.readLine();
    	System.out.print("Estante: ");
    	String estante = in.readLine();
    	
    	// Creación de la localización
    	Localizacion localizacion = new Localizacion(pasillo, estanteria, estante);
    	
    	// Creación del producto
    	Producto producto = new Producto(codigo, nombre, descripcion, stock, localizacion, pendientes);
    	
		return producto;
    }
    
    public static Cliente crearCliente() throws IOException {
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	
    	// Información del cliente
    	System.out.print("Nombre: ");
    	String nombre = in.readLine();
    	System.out.print("Apellidos: ");
    	String apellidos = in.readLine();
    	System.out.print("Email: ");
    	String email = in.readLine();
    	System.out.print("Teléfono: ");
    	String telefono = in.readLine();
    	
    	// Información de la dirección
    	System.out.println("DIRECCIÓN");
    	System.out.print("Calle: ");
    	String calle = in.readLine();
    	System.out.print("Número: ");
    	int numero = Integer.parseInt(in.readLine());
    	System.out.print("Código postal: ");
    	int cod_postal = Integer.parseInt(in.readLine());
    	System.out.print("Población: ");
    	String poblacion = in.readLine();
    	System.out.print("País: ");
    	String pais = in.readLine();
    	
    	// Creación de la dirección
    	Direccion direccion = new Direccion(calle, numero, cod_postal, poblacion, pais);
    	
    	// Creación del cliente
    	Cliente cliente = new Cliente(nombre, apellidos, email, telefono, direccion);
    	
		return cliente;
    }
    
    public static Pedido crearPedido() throws IOException {
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	
    	// Información del producto
    	System.out.print("Producto: ");
    	String producto = in.readLine();
    	System.out.print("Cantidad: ");
    	int cantidad = Integer.parseInt(in.readLine());
    	System.out.print("Destinatario: ");
    	String destinatario = in.readLine();
    	System.out.print("Fecha de entrega estimada: ");
    	String fecha_entrega = in.readLine();
    	
    	// Información de la dirección
    	System.out.println("DIRECCIÓN");
    	System.out.print("Calle: ");
    	String calle = in.readLine();
    	System.out.print("Número: ");
    	int numero = Integer.parseInt(in.readLine());
    	System.out.print("Código postal: ");
    	int cod_postal = Integer.parseInt(in.readLine());
    	System.out.print("Población: ");
    	String poblacion = in.readLine();
    	System.out.print("País: ");
    	String pais = in.readLine();
    	
    	// Creación de la dirección
    	Direccion direccion = new Direccion(calle, numero, cod_postal, poblacion, pais);
    	
    	// Creación del pedido
    	Pedido pedido = new Pedido(producto, cantidad, direccion, destinatario, fecha_entrega);
    	
		return pedido;
    }
}
