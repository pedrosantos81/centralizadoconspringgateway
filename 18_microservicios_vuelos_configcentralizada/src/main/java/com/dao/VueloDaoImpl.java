package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Vuelo;

@Repository
public class VueloDaoImpl implements VuelosDao {

	@Autowired
	VuelosJpaSpring vuelos;
	
	@Override
	public List<Vuelo> devolverVuelos() {
		// TODO Auto-generated method stub
		return vuelos.findAll();
	}

	@Override
	public Vuelo devolverVuelo(int idvuelo) {
		// TODO Auto-generated method stub
		return vuelos.findById(idvuelo).orElseGet(()->new Vuelo());
	}

	@Transactional
	@Override
	public void actualizarVuelo(Vuelo vuelo) {
		// TODO Auto-generated method stub
        vuelos.save(vuelo);
	}

}
