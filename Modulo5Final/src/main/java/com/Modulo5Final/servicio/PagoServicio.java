package com.reskilling4.servicio;

import java.util.List;

import com.reskilling4.dao.Pago;

public interface PagoServicio {

	Pago findPagoByPagoid(int idpago);
	List<Pago> listarPago();
	void agregarPago(Pago p);
	void eliminarPago(int idpago);
	void editarPago(Pago p);
}
