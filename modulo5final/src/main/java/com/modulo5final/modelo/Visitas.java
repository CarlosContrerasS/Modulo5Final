package com.modulo5final.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;


@Entity
public class Visitas {
		
		@Id
		@SequenceGenerator(name="visseq", sequenceName="visitas_seq")        
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="visseq")
		private int idvisita;
		
		private String Direccion;
		private String Ciudad;
		private String Fecha;
		private String Resumen;
		private String Observaciones;
		@ManyToOne (targetEntity = Cliente.class)
		@JoinColumn (name="rutfk") 
		private Cliente rutfk;
		
		@ManyToOne (targetEntity = Empleado.class)
		@JoinColumn (name="empleadorutfk") 
		private Empleado empleadorutfk;


		public Visitas( int IDVisitas, String Direccion, String Ciudad, String Fecha, String Resumen, 
				String Observaciones, Cliente Rut, Empleado Empleado_RutEmpleado) {

			this.idvisita = IDVisitas;
			this.Direccion = Direccion;
			this.Ciudad = Ciudad;
			this.Fecha = Fecha;
			this.Resumen = Resumen;
			this.Observaciones = Observaciones;
			this.rutfk = Rut;
			this.empleadorutfk = Empleado_RutEmpleado;

		}
		
		public Visitas() {
			
		}

		public String getDireccion() {
			return Direccion;
		}

		public void setDireccion(String direccion) {
			Direccion = direccion;
		}

		public String getCiudad() {
			return Ciudad;
		}

		public void setCiudad(String ciudad) {
			Ciudad = ciudad;
		}

		public String getFecha() {
			return Fecha;
		}

		public void setFecha(String fecha) {
			Fecha = fecha;
		}

		public String getResumen() {
			return Resumen;
		}

		public void setResumen(String resumen) {
			Resumen = resumen;
		}

		public String getObservaciones() {
			return Observaciones;
		}

		public void setObservaciones(String observaciones) {
			Observaciones = observaciones;
		}

		public int getIdvisita() {
			return idvisita;
		}

		public void setIdvisita(int idvisita) {
			this.idvisita = idvisita;
		}

		public Cliente getRutfk() {
			return rutfk;
		}

		public void setRutfk(Cliente rutfk) {
			this.rutfk = rutfk;
		}

		public Empleado getEmpleadorutfk() {
			return empleadorutfk;
		}

		public void setEmpleadorutfk(Empleado empleadorutfk) {
			this.empleadorutfk = empleadorutfk;
		}

		@Override
		public String toString() {
			return "Visitas [idvisita=" + idvisita + ", Direccion=" + Direccion + ", Ciudad=" + Ciudad + ", Fecha="
					+ Fecha + ", Resumen=" + Resumen + ", Observaciones=" + Observaciones + ", rutfk=" + rutfk
					+ ", empleadorutfk=" + empleadorutfk + ", getDireccion()=" + getDireccion() + ", getCiudad()="
					+ getCiudad() + ", getFecha()=" + getFecha() + ", getResumen()=" + getResumen()
					+ ", getObservaciones()=" + getObservaciones() + ", getIdvisita()=" + getIdvisita()
					+ ", getRutfk()=" + getRutfk() + ", getEmpleadorutfk()=" + getEmpleadorutfk() + "]";
		}

		
		
		
		

}