package com.modulo5final.modelo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Pagos {
	
	@Id
	@SequenceGenerator(name="pagseq", sequenceName="pagos_seq")        
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="pagseq")
	private int IDPago;
	private Date FechaPago;
	private java.util.Date FechaVencimiento;
	private int MontoRegular;
	private int MontoAdicional;
	@ManyToOne (targetEntity = Cliente.class)
	@JoinColumn (name="rutfk") 
	private Cliente rutfk;


	public Pagos( int  IDPago, Date FechaPago, Date FechaVencimiento, int MontoRegular, int MontoAdicional,
			Cliente Rut) {

		this.IDPago = IDPago;
		this.FechaPago = FechaPago;
		this.FechaVencimiento = FechaVencimiento;
		this.MontoRegular = MontoRegular;
		this.MontoAdicional = MontoAdicional;
		this.rutfk = Rut;

	}

	

	public java.util.Date getFechaVencimiento() {
		return FechaVencimiento;
	}



	public void setFechaVencimiento(java.util.Date fecha) {
		FechaVencimiento = fecha;
	}



	public Pagos() {
		
		
	}

	public int getIDPago() {
		return IDPago;
	}

	public void setIDPago(int iDPago) {
		IDPago = iDPago;
	}

	public Date getFechaPago() {
		return FechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		FechaPago = fechaPago;
	}

	public int getMontoRegular() {
		return MontoRegular;
	}

	public void setMontoRegular(int montoRegular) {
		MontoRegular = montoRegular;
	}

	public int getMontoAdicional() {
		return MontoAdicional;
	}

	public void setMontoAdicional(int montoAdicional) {
		MontoAdicional = montoAdicional;
	}

	public Cliente getRutfk() {
		return rutfk;
	}

	public void setRutfk(Cliente rutfk) {
		this.rutfk = rutfk;
	}


	@Override
	public String toString() {
		return "Pagos [IDPago=" + IDPago + ", FechaPago=" + FechaPago + ", FechaVencimiento=" + FechaVencimiento
				+ ", MontoRegular=" + MontoRegular + ", MontoAdicional=" + MontoAdicional 
				+ ", rutfk=" + rutfk + ", getFechaVencimiento()=" + getFechaVencimiento() + ", getIDPago()="
				+ getIDPago() + ", getFechaPago()=" + getFechaPago() + ", getMontoRegular()=" + getMontoRegular()
				+ ", getMontoAdicional()=" + getMontoAdicional() + ", getRutfk()=" + getRutfk() +  "]";
	}

	


	

}