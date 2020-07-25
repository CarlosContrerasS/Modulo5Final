package servicios;

import java.util.List;

import modelos.Chequeo;

public interface ChequeoServicio {

	Chequeo findChequeoById(int IDChequeo);
	List<Chequeo> listarChequeo();
	void agregarChequeo(Chequeo che);
	void eliminarChequeo(int IDChequeo);
	void editarChequeo(Chequeo che);


}