package com.reskilling4.dao;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Pagos")
public class Pago {
	
	@Id
	@Column(name="idpago")
	private int idpago;
	private Date fechapago;
	private int montoregular;
	private int montoadicional;
	
	@ManyToOne
	private Cliente rut_id;

	public Pago() {
		super();
	}

	public Pago(int idpago, Date fechapago, int montoregular, int montoadicional, Cliente rut_id) {
		super();
		this.idpago = idpago;
		this.fechapago = fechapago;
		this.montoregular = montoregular;
		this.montoadicional = montoadicional;
		this.rut_id = rut_id;
	}

	public int getIdpago() {
		return idpago;
	}

	public void setIdpago(int idpago) {
		this.idpago = idpago;
	}

	public Date getFechapago() {
		return fechapago;
	}

	public void setFechapago(Date fechapago) {
		this.fechapago = fechapago;
	}

	public int getMontoregular() {
		return montoregular;
	}

	public void setMontoregular(int montoregular) {
		this.montoregular = montoregular;
	}

	public int getMontoadicional() {
		return montoadicional;
	}

	public void setMontoadicional(int montoadicional) {
		this.montoadicional = montoadicional;
	}

	public Cliente getRut_id() {
		return rut_id;
	}

	public void setRut_id(Cliente rut_id) {
		this.rut_id = rut_id;
	}

	@Override
	public String toString() {
		return "Pago [idpago=" + idpago + ", fechapago=" + fechapago + ", montoregular=" + montoregular
				+ ", montoadicional=" + montoadicional + ", rut_id=" + rut_id + "]";
	}
	
	
	
	
	

}
