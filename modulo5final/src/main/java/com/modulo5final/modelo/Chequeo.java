package com.modulo5final.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Chequeo {
	
	@Id
	@SequenceGenerator(name="cheseq", sequenceName="chequeo_seq")        
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cheseq")
	private int IDChequeo;
	private String Detalle;
	private String Estado;
	@ManyToOne (targetEntity = Visitas.class)
	@JoinColumn (name="visitasfk") 
	private Visitas visitasfk;


	public Chequeo(int IDChequeo, String Detalle, String Estado, Visitas Visita_IDVisita) {

		this.IDChequeo = IDChequeo;
		this.Detalle = Detalle;
		this.Estado = Estado;
		this.visitasfk = Visita_IDVisita;
	}
	
public Chequeo() {
		
	}

public int getIDChequeo() {
	return IDChequeo;
}

public void setIDChequeo(int iDChequeo) {
	IDChequeo = iDChequeo;
}

public String getDetalle() {
	return Detalle;
}

public void setDetalle(String detalle) {
	Detalle = detalle;
}

public String getEstado() {
	return Estado;
}

public void setEstado(String estado) {
	Estado = estado;
}


public Visitas getVisitasfk() {
	return visitasfk;
}

public void setVisitasfk(Visitas visitasfk) {
	this.visitasfk = visitasfk;
}

@Override
public String toString() {
	return "Checklist [IDChequeo=" + IDChequeo + ", Detalle=" + Detalle + ", Estado=" + Estado + ", Visita_IDVisita="
			+ visitasfk + ", getIDChequeo()=" + getIDChequeo() + ", getDetalle()=" + getDetalle()
			+ ", getEstado()=" + getEstado() + ", getVisitsfk()=" + getVisitasfk() + "]";
	}

	
}