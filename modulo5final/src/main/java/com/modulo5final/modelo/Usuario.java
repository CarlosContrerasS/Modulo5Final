package com.modulo5final.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Usuarios")
public class Usuario {

	@Id
	@SequenceGenerator(name="usaseq", sequenceName="usuarios_seq")        
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="usaseq")
	private int Usuarioid;
	private String Login;
	private String Clave;
	private String Rol;
	
	
	public Usuario() {
		super();
	}

	public Usuario(int usuarioid, String login, String clave, String rol) {
		super();
		Usuarioid = usuarioid;
		Login = login;
		Clave = clave;
		Rol = rol;
	}

	public int getUsuarioid() {
		return Usuarioid;
	}

	public void setUsuarioid(int usuarioid) {
		Usuarioid = usuarioid;
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public String getClave() {
		return Clave;
	}

	public void setClave(String clave) {
		Clave = clave;
	}
	
	public String getRol() {
		return Rol;
	}

	public void setRol(String rol) {
		Rol = rol;
	}

	@Override
	public String toString() {
		return "Usuario [Usuarioid=" + Usuarioid + ", Login=" + Login + ", Clave=" + Clave + "]";
	}

	
	
	
	
	
	
	
	
}
