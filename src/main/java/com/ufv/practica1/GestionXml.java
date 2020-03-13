package com.ufv.practica1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class GestionXml {

	public static Tienda readXML() throws JAXBException {
		Tienda tienda_leida = null;

		File file = new File("Tienda_XML.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Tienda.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

		tienda_leida = (Tienda) jaxbUnmarshaller.unmarshal(file);
		return tienda_leida;
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
		String dtd = "\n<!DOCTYPE tienda [" + "<!ELEMENT tienda (productos, clientes, pedidos)>\n"
				+ "<!ELEMENT clientes (cliente*)>\n"
				+ "<!ELEMENT cliente (nombre, apellidos, email, telefono, direccion)>\n"
				+ "<!ELEMENT nombre (#PCDATA)>\n" + "<!ELEMENT apellidos (#PCDATA)>\n" + "<!ELEMENT email (#PCDATA)>\n"
				+ "<!ELEMENT telefono (#PCDATA)>\n"
				+ "<!ELEMENT direccion (calle, numero, codigoPostal, poblacion, pais)>\n"
				+ "<!ELEMENT calle (#PCDATA)>\n" + "<!ELEMENT numero (#PCDATA)>\n"
				+ "<!ELEMENT codigoPostal (#PCDATA)>\n" + "<!ELEMENT poblacion (#PCDATA)>\n"
				+ "<!ELEMENT pais (#PCDATA)>\n" + "<!ELEMENT pedidos (pedido*)>\n"
				+ "<!ELEMENT pedido (nombre, cantidad, direccion, destinatario, fecha)>\n"
				+ "<!ELEMENT destinatario (#PCDATA)>\n" + "<!ELEMENT cantidad (#PCDATA)>\n"
				+ "<!ELEMENT fecha (#PCDATA)>\n" + "<!ELEMENT productos (producto*)>\n"
				+ "<!ELEMENT producto (codigo, nombre, descripcion, stock, localizacion, pendientes)>\n"
				+ "<!ELEMENT codigo (#PCDATA)>\n" + "<!ELEMENT descripcion (#PCDATA)>\n"
				+ "<!ELEMENT stock (#PCDATA)>\n" + "<!ELEMENT localizacion (pasillo, estanteria, estante)>\n"
				+ "<!ELEMENT pasillo (#PCDATA)>\n" + "<!ELEMENT estanteria (#PCDATA)>\n"
				+ "<!ELEMENT estante (#PCDATA)>\n" + "<!ELEMENT pendientes (#PCDATA)>\n" + "]>";

		return dtd;
	}
}
