package com.idat.EC4ReservaMicroservicio.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC4ReservaMicroservicio.dto.ReservaDTO;
import com.idat.EC4ReservaMicroservicio.models.Reserva;
import com.idat.EC4ReservaMicroservicio.repository.ReservaRepository;

@Service
public class ReservaServiceImpl implements ReservaService {

  @Autowired
  private ReservaRepository repository;

  @Override
  public List<ReservaDTO> listar() {
    List<ReservaDTO> lista = new ArrayList<>();
    ReservaDTO dto = null;

    for (Reserva reserva : repository.findAll()) {
      dto = new ReservaDTO();
      dto.setCodigo(reserva.getIdReserva());
      dto.setCosto(reserva.getCosto());
      lista.add(dto);
    }

    return lista;
  }

  @Override
  public ReservaDTO obtenerId(Integer id) {
    Reserva obj = repository.findById(id).orElse(null);
    ReservaDTO dto = new ReservaDTO();
    dto.setCodigo(obj.getIdReserva());
    dto.setCosto(obj.getCosto());
    return dto;
  }

  @Override
  public void guardar(ReservaDTO reserva) {
    Reserva obj = new Reserva();
    obj.setIdReserva(obj.getIdReserva());
    obj.setCosto(obj.getCosto());
    repository.save(obj);
  }

  @Override
  public void actualizar(ReservaDTO reserva) {
    Reserva obj = new Reserva();
    obj.setIdReserva(obj.getIdReserva());
    obj.setCosto(obj.getCosto());
    repository.saveAndFlush(obj);
  }

  @Override
  public void eliminar(Integer id) {
    repository.deleteById(id);
  }
  
}
