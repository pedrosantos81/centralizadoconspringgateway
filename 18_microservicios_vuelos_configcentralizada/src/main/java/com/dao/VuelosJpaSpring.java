package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Vuelo;

public interface VuelosJpaSpring extends JpaRepository<Vuelo,Integer>{

}
