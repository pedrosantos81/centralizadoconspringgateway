package com.dao;

import java.util.List;

import com.model.Reserva;

public interface ReservasDao {
	
	public void generarReserva(Reserva reserva);
	List<Reserva> getReservas();

}
