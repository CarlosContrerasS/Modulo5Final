package com.Modulo5Final.servicio;

import com.Modulo5Final.dao.Pagos;

import java.util.List;


public interface PagosServicio {

	Pagos findPagoByPagoid(int idpago);
	List<Pagos> listarPagos();
	void agregarPago(Pagos p);
	void eliminarPago(int idpago);
	void editarPago(Pagos p);
}
