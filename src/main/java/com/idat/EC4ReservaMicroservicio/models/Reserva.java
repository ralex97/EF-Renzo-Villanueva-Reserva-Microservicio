package com.idat.EC4ReservaMicroservicio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Reserva {
  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idReserva;
  private Double costo;
}
