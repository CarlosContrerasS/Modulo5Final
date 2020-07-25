package servicios;

import java.util.List;

import modelos.Accidentes;


public interface AccidentesServicio {
	
	Accidentes findAccidenteById(int IdAccidente);
	List<Accidentes> listarAccidentes();
	void agregarAccidente(Accidentes acc);
	void eliminarAccidente(int IdAccidente);
	void editarAccidente(Accidentes acc);

}
