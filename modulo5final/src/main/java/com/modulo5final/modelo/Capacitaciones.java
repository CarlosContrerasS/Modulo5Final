package com.modulo5final.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Capacitaciones {
	
	@Id
	@SequenceGenerator(name="capseq", sequenceName="capacitaciones_seq")        
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="capseq")
	private int IDCapacitacion;
	private String Fecha;
	private String Hora;
	private int NumAsistentes;
	@ManyToOne (targetEntity = Visitas.class)
	@JoinColumn (name="visitasfk") 
	private Visitas visitasfk;

	
	public Capacitaciones( int IDCapacitacion, String Fecha, String Hora, int NumAsistentes, Visitas Visita_IDVisita) {
		this.IDCapacitacion = IDCapacitacion;
		this.Fecha = Fecha;
		this.NumAsistentes = NumAsistentes;
		this.visitasfk = Visita_IDVisita;
		

	}
	
	public Capacitaciones() {
		
	}

	public int getIDCapacitacion() {
		return IDCapacitacion;
	}

	public void setIDCapacitacion(int iDCapacitacion) {
		IDCapacitacion = iDCapacitacion;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getHora() {
		return Hora;
	}

	public void setHora(String hora) {
		Hora = hora;
	}

	public int getNumAsistentes() {
		return NumAsistentes;
	}

	public void setNumAsistentes(int numAsistentes) {
		NumAsistentes = numAsistentes;
	
	}

	public Visitas getVisitasfk() {
		return visitasfk;
	}

	public void setVisitasfk(Visitas visitasfk) {
		this.visitasfk = visitasfk;
	}

	@Override
	public String toString() {
		return "Capacitaciones [IDCapacitacion=" + IDCapacitacion + ", Fecha=" + Fecha + ", Hora=" + Hora
				+ ", NumAsistentes=" + NumAsistentes + ", Visita_IDVisita=" + visitasfk + ", getIDCapacitacion()="
				+ getIDCapacitacion() + ", getFecha()=" + getFecha() + ", getHora()=" + getHora()
				+ ", getNumAsistentes()=" + getNumAsistentes() + ", getVisita_IDVisita()=" + getVisitasfk() + "]";
	}


}