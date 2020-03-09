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
			
			try {
				marshallerObj.marshal(datos_tienda, new FileOutputStream("Tienda_XML.xml"));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}
