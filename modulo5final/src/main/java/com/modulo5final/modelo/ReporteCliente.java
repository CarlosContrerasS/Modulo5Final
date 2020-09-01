package com.modulo5final.modelo;

public class ReporteCliente {
	private int rut;
	private String nombre;
	private String rubro;
	
	private int diasperdidos;
	private int numtrab;
	private long CantidadDeAccidentes;
	private float accidentabilidad;
	
	private long CantidadDeVisitas;
	private long CantidadDeMejoras;
	private long CantidadDeAsesorias;
	
	private long CantidadDeCapacitaciones;
	private int AsistentesaCapacitaciones;
	
		
	private int TotalRegular;
	private int TotalAdicional;
	
	private String cheq2; //Si cuando el cliente esta al día (pago), No en el caso atrasado
	//Se manda un alert en el caso de que este atrasado
	
	public ReporteCliente() {
	}
	
	

	public ReporteCliente(int rut, String nombre, String rubro, int diasperdidos, int numtrab,
			int totalTrabajadoresAccidentados, long cantidadDeAccidentes, float accidentabilidad,
			long cantidadDeVisitas, long cantidadDeAsesorias, long cantidadDeCapacitaciones,
			int asistentesaCapacitaciones, int cantidadDeMejoras, int totalRegular, int totalAdicional,
			String cheq2) {

		this.rut = rut;
		this.nombre = nombre;
		this.rubro = rubro;
		this.diasperdidos = diasperdidos;
		this.numtrab = numtrab;
		CantidadDeAccidentes = cantidadDeAccidentes;
		this.accidentabilidad = accidentabilidad;
		CantidadDeVisitas = cantidadDeVisitas;
		CantidadDeAsesorias = cantidadDeAsesorias;
		CantidadDeCapacitaciones = cantidadDeCapacitaciones;
		AsistentesaCapacitaciones = asistentesaCapacitaciones;
		CantidadDeMejoras = cantidadDeMejoras;
		TotalRegular = totalRegular;
		TotalAdicional = totalAdicional;
		this.cheq2 = cheq2;
	}



	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRubro() {
		return rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
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


	public long getCantidadDeAccidentes() {
		return CantidadDeAccidentes;
	}

	public void setCantidadDeAccidentes(long cantidadDeAccidentes) {
		CantidadDeAccidentes = cantidadDeAccidentes;
	}

	public float getAccidentabilidad() {
		return accidentabilidad;
	}

	public void setAccidentabilidad(float accidentabilidad) {
		this.accidentabilidad = accidentabilidad;
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

	public void setCantidadDeAsesorias(long cantidadDeAsesorias) {
		CantidadDeAsesorias = cantidadDeAsesorias;
	}

	public long getCantidadDeCapacitaciones() {
		return CantidadDeCapacitaciones;
	}

	public void setCantidadDeCapacitaciones(long cantidadDeCapacitaciones) {
		CantidadDeCapacitaciones = cantidadDeCapacitaciones;
	}

	public int getAsistentesaCapacitaciones() {
		return AsistentesaCapacitaciones;
	}

	public void setAsistentesaCapacitaciones(int asistentesaCapacitaciones) {
		AsistentesaCapacitaciones = asistentesaCapacitaciones;
	}

	public long getCantidadDeMejoras() {
		return CantidadDeMejoras;
	}

	public void setCantidadDeMejoras(long cantidadDeMejoras) {
		CantidadDeMejoras = cantidadDeMejoras;
	}

	public int getTotalRegular() {
		return TotalRegular;
	}

	public void setTotalRegular(int totalRegular) {
		TotalRegular = totalRegular;
	}

	public int getTotalAdicional() {
		return TotalAdicional;
	}

	public void setTotalAdicional(int totalAdicional) {
		TotalAdicional = totalAdicional;
	}

	public String getCheq2() {
		return cheq2;
	}

	public void setCheq2(String cheq2) {
		this.cheq2 = cheq2;
	}



	@Override
	public String toString() {
		return "ReporteCliente [rut=" + rut + ", nombre=" + nombre + ", rubro=" + rubro + ", diasperdidos="
				+ diasperdidos + ", numtrab=" + numtrab + ", TotalTrabajadoresAccidentados="
				 + ", CantidadDeAccidentes=" + CantidadDeAccidentes
				+ ", accidentabilidad=" + accidentabilidad + ", CantidadDeVisitas=" + CantidadDeVisitas
				+ ", CantidadDeAsesorias=" + CantidadDeAsesorias + ", CantidadDeCapacitaciones="
				+ CantidadDeCapacitaciones + ", AsistentesaCapacitaciones=" + AsistentesaCapacitaciones
				+ ", CantidadDeMejoras=" + CantidadDeMejoras + ", TotalRegular=" + TotalRegular
				+ ", TotalAdicional=" + TotalAdicional + ", cheq2=" + cheq2 + "]";
	}
	
}
