package com.modulo5final.servicio;

import java.util.List;

import com.modulo5final.modelo.Pagos;

public interface PagosServicio {

	Pagos findPagoByPagoid(int idpago);
	List<Pagos> listarPagos();
	void agregarPago(Pagos p);
	void eliminarPago(int idpago);
	void editarPago(Pagos p);
}
