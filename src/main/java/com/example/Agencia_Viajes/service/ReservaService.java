package com.example.Agencia_Viajes.service;

import com.example.Agencia_Viajes.model.Reserva;

import java.util.List;

public interface ReservaService {
    Reserva crearReserva(Reserva reserva);
    List<Reserva> listarReservas();
    void eliminarReserva(Long id);
}
