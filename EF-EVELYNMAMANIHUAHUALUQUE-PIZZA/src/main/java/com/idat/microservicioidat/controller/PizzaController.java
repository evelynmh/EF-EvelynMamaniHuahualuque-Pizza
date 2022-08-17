package com.idat.microservicioidat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.microservicioidat.entity.Pizza;
import com.idat.microservicioidat.service.PizzaService;

@RestController
@RequestMapping("/api/pizza/v1")
public class PizzaController {

	@Autowired
	private PizzaService service;

	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Pizza pizza) {
		service.guardar(pizza);
	}
}
