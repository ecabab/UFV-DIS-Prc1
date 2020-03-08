package com.ufv.practica1;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;





public class GestionXml {

	
	public static Tienda ReadXML(){
		Tienda que = null;
		// TODO Auto-generated method stub
		try {
			File file = new File("XmlBackup.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Tienda.class);  
	        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
	        
			que = (Tienda) jaxbUnmarshaller.unmarshal(file);
			return que;
	        
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return que;
	       
	        
		}
		
	}
	public static void CreateXML(Tienda parametro) {
		
		
		try {
			JAXBContext contextObj = JAXBContext.newInstance(Tienda.class);   
		    Marshaller marshallerObj;
			marshallerObj = contextObj.createMarshaller();
		    marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		    Tienda tienda = parametro;
			try {
				marshallerObj.marshal(tienda, new FileOutputStream("XmlBackup.xml"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  


		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	    
	    
	}
}
