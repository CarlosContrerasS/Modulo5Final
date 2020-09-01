package com.modulo5final.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Mejoras {
	
	@Id
	@SequenceGenerator(name="mejseq", sequenceName="mejoras_seq")        
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="mejseq")
	private int IDMejora;
	private String Fecha;
	private String Motivo;
	private String Actividades;
	private String Estado;
	@ManyToOne (targetEntity = Cliente.class)
	@JoinColumn (name="rutfk") 
	private Cliente rutfk;


	public Mejoras( int IDMejora, String Fecha, String Motivo, String Actividades, String Estado, Cliente Rut) {

		this.IDMejora = IDMejora;
		this.Fecha = Fecha;
		this.Motivo = Motivo;
		this.Actividades = Actividades;
		this.Estado = Estado;
		this.rutfk = Rut;
		
	}
	
	public Mejoras() {
		
	}

	public int getIDMejora() {
		return IDMejora;
	}

	public void setIDMejora(int iDMejora) {
		IDMejora = iDMejora;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getMotivo() {
		return Motivo;
	}

	public void setMotivo(String motivo) {
		Motivo = motivo;
	}

	public String getActividades() {
		return Actividades;
	}

	public void setActividades(String actividades) {
		Actividades = actividades;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}
	
		public Cliente getRutfk() {
		return rutfk;
	}

	public void setRutfk(Cliente rutfk) {
		this.rutfk = rutfk;
	}

	@Override
	public String toString() {
		return "Mejoras [IDMejora=" + IDMejora + ", Fecha=" + Fecha + ", Motivo=" + Motivo + ", Actividades="
				+ Actividades + ", Estado=" + Estado + ", Rut=" + rutfk + ", getIDMejora()=" + getIDMejora()
				+ ", getFecha()=" + getFecha() + ", getMotivo()=" + getMotivo() + ", getActividades()="
				+ getActividades() + ", getEstado()=" + getEstado() + ", getRutfk()=" + getRutfk() + "]";
	}
	
}