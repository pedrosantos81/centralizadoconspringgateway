package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Reserva;

@Repository
public class ReservasDaoImpl implements ReservasDao{
	
	@Autowired
	ReservasJpaSpring reservas;

	@Override
	public void generarReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		reservas.save(reserva);
	}

	@Override
	public List<Reserva> getReservas() {
		// TODO Auto-generated method stub
		return reservas.findAll();
	}

}
