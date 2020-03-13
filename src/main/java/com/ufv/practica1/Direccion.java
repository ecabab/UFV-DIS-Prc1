package com.ufv.practica1;

import javax.xml.bind.annotation.XmlType;

@XmlType (propOrder={"calle", "numero", "codigoPostal", "poblacion", "pais"})
public class Direccion {
	private String calle;
	private int numero;
	private int codigoPostal;
	private String poblacion;
	private String pais;

	public Direccion() {
		
	}
	public Direccion(String calle, int numero, int codigoPostal, String poblacion, String pais) {
		super();
		this.setCalle(calle);
		this.setNumero(numero);
		this.setCodigoPostal(codigoPostal);
		this.setPoblacion(poblacion);
		this.setPais(pais);
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}
