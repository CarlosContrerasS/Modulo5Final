package com.modulo5final.modelo;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table (name="ACCIDENTES")
public class Accidentes {
	
	@Id
	@SequenceGenerator(name="accseq",sequenceName="accidentes_seq")        
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="accseq")       
	private int idaccidente;
	
	private String Fecha;
	private String Hora;
	private String Suceso;
	private String	Lugar;
	private int diasperdidos;
	private int numtrab;
	
	@ManyToOne (targetEntity = Cliente.class)
	@JoinColumn (name="rutfk") private Cliente Rutfk;
	
	public Accidentes() {
		super();
	}
	
	public Accidentes(int IdAccidente, String Fecha, String Hora, String Suceso, String Lugar, Cliente Rut, 
			int diasperdidos, int numtrab) {
			
		this.idaccidente = IdAccidente;
		this.Fecha = Fecha;
		this.Hora = Hora;
		this.Suceso = Suceso;
		this.Lugar = Lugar;
		this.Rutfk = Rut;
		this.diasperdidos = diasperdidos;
		this.numtrab = numtrab;
		
	}
	
	public int getIdaccidente() {
		return idaccidente;
	}
	public void setIdaccidente(int idaccidente) {
		this.idaccidente = idaccidente;
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
	public String getSuceso() {
		return Suceso;
	}
	public void setSuceso(String suceso) {
		Suceso = suceso;
	}
	public String getLugar() {
		return Lugar;
	}
	public void setLugar(String lugar) {
		Lugar = lugar;
	}
	public int getDiasperdidos() {
		return diasperdidos;
	}
	public void setDiasperdidos(int diasperdidos) {
		this.diasperdidos = diasperdidos;
	}
	public int getNumtrab() {
		return numtrab;
	}
	public void setNumtrab(int numtrab) {
		this.numtrab = numtrab;
	}
	public Cliente getRutfk() {
		return Rutfk;
	}
	
	public void setRutfk(Cliente Rutid) {
		Rutfk = Rutid;
	}
	
	@Override
	public String toString() {
		return "Accidentes [idaccidente=" + idaccidente + ", Fecha=" + Fecha + ", Hora=" + Hora + ", Suceso=" + Suceso
				+ ", Lugar=" + Lugar + ", diasperdidos=" + diasperdidos + ", numtrab=" + numtrab + ", rutfk=" + Rutfk
				+ ", getIdaccidente()=" + getIdaccidente() + ", getFecha()=" + getFecha() + ", getHora()=" + getHora()
				+ ", getSuceso()=" + getSuceso() + ", getLugar()=" + getLugar() + ", getDiasperdidos()="
				+ getDiasperdidos() + ", getNumtrab()=" + getNumtrab() + ", getRutfk()=" + getRutfk() + "]";
	}
	
}