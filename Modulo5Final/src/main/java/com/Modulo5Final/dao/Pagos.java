package com.Modulo5Final.dao;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pagos {
	
	@Id
	@GeneratedValue
	private int IDPago;
	private Date FechaPago;
	private Date FechaVencimiento;
	private int MontoRegular;
	private int MontoAdicional;
	private int Rut_ID;


	public Pagos( int  IDPago, Date FechaPago, Date FechaVencimiento, int MontoRegular, int MontoAdicional, int Rut) {

		this.IDPago = IDPago;
		this.FechaPago = FechaPago;
		this.FechaVencimiento = FechaVencimiento;
		this.MontoRegular = MontoRegular;
		this.MontoAdicional = MontoAdicional;
		this.Rut_ID = Rut;

	}

	public Date getFechaVencimiento() {
		return FechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		FechaVencimiento = fechaVencimiento;
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

	public int getRut_ID() {
		return Rut_ID;
	}

	public void setRut_ID(int rut) {
		Rut_ID = rut;
	}

	
	@Override
	public String toString() {
		return "Pagos [IDPago=" + IDPago + ", FechaPago=" + FechaPago + ", FechaVencimiento=" + FechaVencimiento
				+ ", MontoRegular=" + MontoRegular + ", MontoAdicional=" + MontoAdicional + ", Rut_ID=" + Rut_ID
				+ ", getFechaVencimiento()=" + getFechaVencimiento() + ", getIDPago()=" + getIDPago()
				+ ", getFechaPago()=" + getFechaPago() + ", getMontoRegular()=" + getMontoRegular()
				+ ", getMontoAdicional()=" + getMontoAdicional() + ", getRut_ID()=" + getRut_ID() + "]";
	}


	
	

}
