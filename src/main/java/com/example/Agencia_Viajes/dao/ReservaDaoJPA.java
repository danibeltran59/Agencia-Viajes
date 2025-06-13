package com.example.Agencia_Viajes.dao;

import com.example.Agencia_Viajes.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaDaoJPA extends JpaRepository<Reserva, Long> {
}
