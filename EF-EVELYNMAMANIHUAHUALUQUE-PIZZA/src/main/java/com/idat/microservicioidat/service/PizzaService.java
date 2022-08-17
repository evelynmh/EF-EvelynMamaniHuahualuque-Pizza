package com.idat.microservicioidat.service;

import java.util.List;

import com.idat.microservicioidat.entity.Pizza;

public interface PizzaService {

	List<Pizza> listar();
	Pizza ObtenerId(Integer id);	
	void guardar(Pizza pizza);
	void eliminar(Integer id);
	void actualizar(Pizza pizza);
}
