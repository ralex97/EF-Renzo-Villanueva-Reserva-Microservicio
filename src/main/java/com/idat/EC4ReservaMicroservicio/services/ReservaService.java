package com.idat.EC4ReservaMicroservicio.services;

import java.util.List;

import com.idat.EC4ReservaMicroservicio.dto.ReservaDTO;

public interface ReservaService {
  List<ReservaDTO> listar();
  ReservaDTO obtenerId(Integer id);
  void guardar(ReservaDTO reserva);
	void actualizar(ReservaDTO reserva);
	void eliminar(Integer id);
}
