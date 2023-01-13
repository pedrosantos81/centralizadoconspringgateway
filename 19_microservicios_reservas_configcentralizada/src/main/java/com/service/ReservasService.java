package com.service;

import java.util.List;

import com.model.Reserva;

public interface ReservasService {
	void realizarReserva(Reserva reserva,int totalPersonas);
    List<Reserva> getReservas();
}
