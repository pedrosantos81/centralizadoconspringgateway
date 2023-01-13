package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dao.ReservasDao;
import com.model.Reserva;

@Service
public class ReservasServiceImpl implements ReservasService{

	@Autowired
	ReservasDao reservas;
	
	@Autowired
	RestTemplate template;
	String url = "http://servicio-vuelos";

	
	@Override
	public void realizarReserva(Reserva reserva, int totalPersonas) {
		// TODO Auto-generated method stub
		reservas.generarReserva(reserva);
		/*Como no le pasamos nada en el cuerpo ponemos null*/
		template.put(url + "/vuelos/{p1}/{p2}",null,reserva.getVuelo(),totalPersonas);

	}

	@Override
	public List<Reserva> getReservas() {
		// TODO Auto-generated method stub
		return this.reservas.getReservas();

	}

}
