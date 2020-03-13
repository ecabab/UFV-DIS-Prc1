package com.ufv.practica1;

import javax.xml.bind.annotation.XmlType;

@XmlType (propOrder={"pasillo", "estanteria", "estante"})
public class Localizacion {
	private String pasillo;
	private String estanteria;
	private String estante;
	
	public Localizacion() {
		
	}
	public Localizacion(String pasillo, String estanteria, String estante) {
		super();
		this.pasillo = pasillo;
		this.estanteria = estanteria;
		this.estante = estante;
	}


	@Override
	public String toString() {
		return "Localizacion [pasillo=" + pasillo + ", estanteria=" + estanteria + ", estante=" + estante + "]";
	}


	public String getPasillo() {
		return pasillo;
	}


	public void setPasillo(String pasillo) {
		this.pasillo = pasillo;
	}


	public String getEstanteria() {
		return estanteria;
	}


	public void setEstanteria(String estanteria) {
		this.estanteria = estanteria;
	}


	public String getEstante() {
		return estante;
	}


	public void setEstante(String estante) {
		this.estante = estante;
	}

}
