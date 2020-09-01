package com.modulo5final.modelo;

public class Reporte {
	
	private long CantidadClientes;
	private int TotalDiasPerdidos;
	private int TotalTrabajoresAccidentados;
	private long CantidadDeAccidentes;
	private float Accidentabilidad;
	private long CantidadDeVisitas;
	private long CantidadDeAsesorias;
	private long CantidadDeCapacitaciones;
	private long CantidadDeMejoras;
	private int CantidadDeAsistentesCapacitaciones;
	private long TotalRegular;
	private long TotalAdicional;
	
	
	public Reporte(int numeroClientes, int totalDiasPerdidos, int totalTrabajoresAccidentados, long cantidadDeAccidentes,
			float accidentabilidad, long cantidadDeVisitas, long cantidadDeAsesorias, long cantidadDeCapacitaciones,
			int cantidadDeAsistentesCapacitaciones, long cantidadDeMejoras, long totalRegular, long totalAdicional) {
		super();
		CantidadClientes = numeroClientes;
		TotalDiasPerdidos = totalDiasPerdidos;
		TotalTrabajoresAccidentados = totalTrabajoresAccidentados;
		CantidadDeAccidentes = cantidadDeAccidentes;
		Accidentabilidad = accidentabilidad;
		CantidadDeVisitas = cantidadDeVisitas;
		CantidadDeAsesorias = cantidadDeAsesorias;
		CantidadDeCapacitaciones = cantidadDeCapacitaciones;
		CantidadDeAsistentesCapacitaciones = cantidadDeAsistentesCapacitaciones;
		CantidadDeMejoras = cantidadDeMejoras;
		TotalRegular = totalRegular;
		TotalAdicional = totalAdicional;
	}


	public Reporte() {
		super();
	}


	public long getCantidadClientes() {
		return CantidadClientes;
	}


	public void setCantidadClientes(long numeroClientes) {
		CantidadClientes = numeroClientes;
	}


	public int getTotalDiasPerdidos() {
		return TotalDiasPerdidos;
	}


	public void setTotalDiasPerdidos(int totalDiasPerdidos) {
		TotalDiasPerdidos = totalDiasPerdidos;
	}


	public int getTotalTrabajoresAccidentados() {
		return TotalTrabajoresAccidentados;
	}


	public void setTotalTrabajoresAccidentados(int totalTrabajoresAccidentados) {
		TotalTrabajoresAccidentados = totalTrabajoresAccidentados;
	}


	public long getCantidadDeAccidentes() {
		return CantidadDeAccidentes;
	}


	public void setCantidadDeAccidentes(long cantidadDeAccidentes) {
		CantidadDeAccidentes = cantidadDeAccidentes;
	}


	public float getAccidentabilidad() {
		return Accidentabilidad;
	}


	public void setAccidentabilidad(float accidentabilidad) {
		Accidentabilidad = accidentabilidad;
	}


	public long getCantidadDeVisitas() {
		return CantidadDeVisitas;
	}


	public void setCantidadDeVisitas(long cantidadDeVisitas) {
		CantidadDeVisitas = cantidadDeVisitas;
	}


	public long getCantidadDeAsesorias() {
		return CantidadDeAsesorias;
	}


	public void setCantidadDeAsesorias(Long cantidadDeAsesorias) {
		CantidadDeAsesorias = cantidadDeAsesorias;
	}


	public long getCantidadDeCapacitaciones() {
		return CantidadDeCapacitaciones;
	}


	public void setCantidadDeCapacitaciones(long cantidadDeCapacitaciones) {
		CantidadDeCapacitaciones = cantidadDeCapacitaciones;
	}


	public int getCantidadDeAsistentesCapacitaciones() {
		return CantidadDeAsistentesCapacitaciones;
	}


	public void setCantidadDeAsistentesCapacitaciones(int cantidadDeAsistentesCapacitaciones) {
		CantidadDeAsistentesCapacitaciones = cantidadDeAsistentesCapacitaciones;
	}


	public long getCantidadDeMejoras() {
		return CantidadDeMejoras;
	}


	public void setCantidadDeMejoras(long cantidadDeMejoras) {
		CantidadDeMejoras = cantidadDeMejoras;
	}


	public long getTotalRegular() {
		return TotalRegular;
	}


	public void setTotalRegular(long totalRegular) {
		TotalRegular = totalRegular;
	}


	public long getTotalAdicional() {
		return TotalAdicional;
	}


	public void setTotalAdicional(long totalAdicional) {
		TotalAdicional = totalAdicional;
	}


	@Override
	public String toString() {
		return "Reporte [NumeroClientes=" + CantidadClientes + ", TotalDiasPerdidos=" + TotalDiasPerdidos
				+ ", TotalTrabajoresAccidentados=" + TotalTrabajoresAccidentados + ", CantidadDeAccidentes="
				+ CantidadDeAccidentes + ", Accidentabilidad=" + Accidentabilidad + ", CantidadDeVisitas="
				+ CantidadDeVisitas + ", CantidadDeAsesorias=" + CantidadDeAsesorias + ", CantidadDeCapacitaciones="
				+ CantidadDeCapacitaciones + ", CantidadDeAsistentesCapacitaciones="
				+ CantidadDeAsistentesCapacitaciones + ", CantidadDeMejoras=" + CantidadDeMejoras + ", TotalRegular="
				+ TotalRegular + ", TotalAdicional=" + TotalAdicional + ", getNumeroClientes()=" + getCantidadClientes()
				+ ", getTotalDiasPerdidos()=" + getTotalDiasPerdidos() + ", getTotalTrabajoresAccidentados()="
				+ getTotalTrabajoresAccidentados() + ", getCantidadDeAccidentes()=" + getCantidadDeAccidentes()
				+ ", getAccidentabilidad()=" + getAccidentabilidad() + ", getCantidadDeVisitas()="
				+ getCantidadDeVisitas() + ", getCantidadDeAsesorias()=" + getCantidadDeAsesorias()
				+ ", getCantidadDeCapacitaciones()=" + getCantidadDeCapacitaciones()
				+ ", getCantidadDeAsistentesCapacitaciones()=" + getCantidadDeAsistentesCapacitaciones()
				+ ", getCantidadDeMejoras()=" + getCantidadDeMejoras() + ", getTotalRegular()=" + getTotalRegular()
				+ ", getTotalAdicional()=" + getTotalAdicional() + "]";
	}
	
	
	

}
