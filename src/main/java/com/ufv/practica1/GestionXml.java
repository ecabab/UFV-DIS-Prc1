package com.ufv.practica1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class GestionXml {

	public static Tienda readXML() {
		Tienda tienda_leida = null;
		
		try {
			File file = new File("Tienda_XML.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Tienda.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			tienda_leida = (Tienda) jaxbUnmarshaller.unmarshal(file);
			return tienda_leida;

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return tienda_leida;
		}
	}

	public static void createXML(Tienda datos_tienda) {

		try {
			JAXBContext contextObj = JAXBContext.newInstance(Tienda.class);
			Marshaller marshallerObj;
			marshallerObj = contextObj.createMarshaller();
			marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			// Creación del DTD
			marshallerObj.setProperty("com.sun.xml.internal.bind.xmlHeaders", generarDTD());
			
			try {
				marshallerObj.marshal(datos_tienda, new FileOutputStream("Tienda_XML.xml"));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
	
	public static String generarDTD() {
		String dtd = "\n<!DOCTYPE TIENDA ["
							+"<!ELEMENT CLIENTES (cliente+)>\n"
							+"<!ELEMENT cliente (nombre, apellidos, email, telefono, direccion)>\n"
							+"<!ELEMENT nombre (#PCDATA)>\n"
							+"<!ELEMENT apellidos (#PCDATA)>\n"
							+"<!ELEMENT email (#PCDATA)>\n"
							+"<!ELEMENT telefono (#PCDATA)>\n"
							+"<!ELEMENT direccion (#PCDATA)>\n"
							+"<!ATTLIST direccion calle CDATA #REQUIRED>\n"
							+"<!ATTLIST direccion numero CDATA #REQUIRED>\n"
							+"<!ATTLIST direccion codigoPostal CDATA #REQUIRED>\n"
							+"<!ATTLIST direccion poblacion CDATA #IMPLIED>\n"
							+"<!ATTLIST direccion pais CDATA #REQUIRED>\n"
							+"<!ELEMENT PRODUCTOS (producto+)>\n"
							+"<!ELEMENT producto (codigo, nombre, descripcion, stock, localizacion, pendientes)>\n"
							+"<!ELEMENT codigo (#PCDATA)>\n"
							+"<!ELEMENT nombre (#PCDATA)>\n"
							+"<!ELEMENT descripcion (#PCDATA)>\n"
							+"<!ELEMENT stock (#PCDATA)>\n"
							+"<!ELEMENT localizacion (#PCDATA)>\n"
							+"<!ATTLIST localizacion pasillo CDATA #REQUIRED>\n"
							+"<!ATTLIST localizacion estanteria CDATA #REQUIRED>\n"
							+"<!ATTLIST localizacion estante CDATA #REQUIRED>\n"
							+"<!ELEMENT pendientes (#PCDATA)>\n"
							+"<!ELEMENT PEDIDOS (pedido+)>\n"
							+"<!ELEMENT pedido (nombreProducto, cantidad, direccion, nombre, fecha>\n"
							+"<!ELEMENT nombreProducto (#PCDATA)>\n"
							+"<!ELEMENT cantidad (#PCDATA)>\n"
							+"<!ELEMENT direccion (#PCDATA)>\n"
							+"<!ATTLIST direccion calle CDATA #REQUIRED>\n"
							+"<!ATTLIST direccion numero CDATA #REQUIRED>\n"
							+"<!ATTLIST direccion codigoPostal CDATA #REQUIRED>\n"
							+"<!ATTLIST direccion poblacion CDATA #IMPLIED>\n"
							+"<!ATTLIST direccion pais CDATA #REQUIRED>\n"
							+"<!ELEMENT nombre (#PCDATA)>\n"
							+"<!ELEMENT fecha (#PCDATA)>\n"
							+ "]>";
		
		return dtd;
	}
}
