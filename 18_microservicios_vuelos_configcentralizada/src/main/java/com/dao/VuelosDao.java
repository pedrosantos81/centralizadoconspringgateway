package com.dao;

import java.util.List;

import com.model.Vuelo;

public interface VuelosDao {
	
	public List<Vuelo> devolverVuelos();
	public Vuelo devolverVuelo(int idvuelo);
	public void actualizarVuelo(Vuelo vuelo); 

}
