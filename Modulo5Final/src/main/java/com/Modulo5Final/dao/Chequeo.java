package com.Modulo5Final.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Chequeo {
	
	@Id
	@GeneratedValue
	private int IDChequeo;
	private String Detalle;
	private String Estado;
	private int Visitas_IDVisita;


	public Chequeo(int IDChequeo, String Detalle, String Estado, int Visita_IDVisita) {

		this.IDChequeo = IDChequeo;
		this.Detalle = Detalle;
		this.Estado = Estado;
		this.Visitas_IDVisita = Visita_IDVisita;
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

public int getVisitas_IDVisita() {
	return Visitas_IDVisita;
}

public void setVisitas_IDVisita(int visita_IDVisita) {
	Visitas_IDVisita = visita_IDVisita;
}

@Override
public String toString() {
	return "Checklist [IDChequeo=" + IDChequeo + ", Detalle=" + Detalle + ", Estado=" + Estado + ", Visita_IDVisita="
			+ Visitas_IDVisita + ", getIDChequeo()=" + getIDChequeo() + ", getDetalle()=" + getDetalle()
			+ ", getEstado()=" + getEstado() + ", getVisita_IDVisita()=" + getVisitas_IDVisita() + "]";
}

	

}
