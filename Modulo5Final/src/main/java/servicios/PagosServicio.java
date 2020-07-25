package servicios;

import java.util.List;

import modelos.Pagos;

public interface PagosServicio {

	Pagos findPagoByPagoid(int idpago);
	List<Pagos> listarPagos();
	void agregarPago(Pagos p);
	void eliminarPago(int idpago);
	void editarPago(Pagos p);
}
