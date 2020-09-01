package com.modulo5final.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;


@Entity
public class Asesorias {
	
	@Id
	@SequenceGenerator(name="aseseq", sequenceName="asesorias_seq")        
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="aseseq")
	private int idasesoria;
	private String Detalle;
	private String Gestion;
	private String Propuestas;
	private String Fecha;
	private String Pagada;
	
	@ManyToOne 
	@JoinColumn (name="visitasfk") 
	private Visitas visitasfk;



	public Asesorias() {
		
	}
	
	public Asesorias(int IDAsesoria, String Detalle, String Gestion, String Propuestas, String Fecha, 
			String Pagada, Visitas visitasidvisita) {
		
		this.idasesoria = IDAsesoria;
		this.Detalle = Detalle;
		this.Gestion = Gestion;
		this.Propuestas = Propuestas;
		this.Fecha = Fecha;
		this.Pagada = Pagada;
		this.visitasfk = visitasidvisita;
		
	}

	public String getDetalle() {
		return Detalle;
	}

	public void setDetalle(String detalle) {
		Detalle = detalle;
	}

	public String getGestion() {
		return Gestion;
	}

	public void setGestion(String gestion) {
		Gestion = gestion;
	}
	public String getPropuestas() {
		return Propuestas;
	}

	public void setPropuestas(String propuestas) {
		Propuestas = propuestas;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getPagada() {
		return Pagada;
	}

	public void setPagada(String pagada) {
		Pagada = pagada;
	}

	public int getIdasesoria() {
		return idasesoria;
	}

	public void setIdasesoria(int idasesoria) {
		this.idasesoria = idasesoria;
	}

	public Visitas getVisitasfk() {
		
		return visitasfk;
	}
	
	public void setVisitasfk(Visitas visitasid) {
		
			visitasfk=visitasid;
		
	}

	public String toString() {
		return "Asesorias [IDAsesoria=" + idasesoria + ", Detalle=" + Detalle + ", Gestion=" + Gestion + ", Propuestas="
				+ Propuestas + ", Fecha=" + Fecha + ", Pagada=" + Pagada + ", Visitas_IDVisita=" + visitasfk
				+ ", getIDAsesoria()=" + getIdasesoria() + ", getDetalle()=" + getDetalle() + ", getGestion()="
				+ getGestion() + ", getPropuestas()=" + getPropuestas() + ", getFecha()=" + getFecha()
				+ ", getPagada()=" + getPagada() + ", getVisitasidvisita()=" + getVisitasfk() + "]";
	}
	
	

}