package com.idat.EC4ReservaMicroservicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EC4ReservaMicroservicio.models.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
  
}
