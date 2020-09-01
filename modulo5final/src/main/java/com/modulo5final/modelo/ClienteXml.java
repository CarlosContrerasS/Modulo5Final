package com.modulo5final.modelo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="cliente")
public class ClienteXml {
	
	private int Rut;
	private String Nombre;
	private int Telefono;
	private String Mail;
	private String Rubro;
	private String Direccion;
	
	public ClienteXml() {
		super();
	}

	public ClienteXml(int rut, String nombre, int telefono, String mail, String rubro, String direccion) {
		super();
		Rut = rut;
		Nombre = nombre;
		Telefono = telefono;
		Mail = mail;
		Rubro = rubro;
		Direccion = direccion;
	}

	@XmlElement
	public int getRut() {
		return Rut;
	}

	public void setRut(int rut) {
		Rut = rut;
	}

	@XmlElement
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	@XmlElement
	public int getTelefono() {
		return Telefono;
	}

	public void setTelefono(int telefono) {
		Telefono = telefono;
	}

	@XmlElement
	public String getMail() {
		return Mail;
	}

	public void setMail(String mail) {
		Mail = mail;
	}

	@XmlElement
	public String getRubro() {
		return Rubro;
	}

	public void setRubro(String rubro) {
		Rubro = rubro;
	}

	@XmlElement
	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	
	
	
	

}
