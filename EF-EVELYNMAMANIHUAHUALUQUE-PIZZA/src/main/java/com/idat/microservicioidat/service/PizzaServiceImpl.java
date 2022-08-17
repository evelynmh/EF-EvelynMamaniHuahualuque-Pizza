package com.idat.microservicioidat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.microservicioidat.client.OpenFeignClient;
import com.idat.microservicioidat.entity.Pizza;
import com.idat.microservicioidat.repository.PizzaRepository;
import com.idat.microservicioidat.service.PizzaService;

@Service
public class PizzaServiceImpl implements PizzaService{

	@Autowired
	private PizzaRepository repositoryPizza;
	
	@Autowired
	private OpenFeignClient feign;
	
	@Override
	public void guardar(Pizza pizza) {
		repositoryPizza.save(pizza);
	}
	
	@Override
	public List<Pizza> listar() {
		return repositoryPizza.findAll();
	}

	@Override
	public Pizza ObtenerId(Integer id) {
		return repositoryPizza.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Integer id) {
		repositoryPizza.deleteById(id);
		
	}

	@Override
	public void actualizar(Pizza pizza) {
		repositoryPizza.saveAndFlush(pizza);
		
	}
}
