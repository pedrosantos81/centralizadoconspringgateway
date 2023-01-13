package com.service;

import java.util.List;

import com.model.Vuelo;

public interface VuelosService {
	List<Vuelo> recuperarVuelosDisponibles(int plazas);
	void actualizarPlazas(int vuelo,int plazas);
}
