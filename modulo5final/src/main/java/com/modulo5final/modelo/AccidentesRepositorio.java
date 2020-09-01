package com.modulo5final.modelo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccidentesRepositorio extends CrudRepository<Accidentes, Integer>{
	
	
	
}
