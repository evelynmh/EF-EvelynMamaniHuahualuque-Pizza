package com.idat.microservicioidat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.microservicioidat.entity.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer>{

}
