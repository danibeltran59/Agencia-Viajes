package com.example.Agencia_Viajes.dao;

import com.example.Agencia_Viajes.model.Reserva;

import java.util.List;

public interface ReservaDao {
    Reserva crearReserva(Reserva reserva);
    List<Reserva> obtenerReserva();
    void elminarReserva(Long id);
}
