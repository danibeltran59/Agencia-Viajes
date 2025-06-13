package com.example.Agencia_Viajes.controller;

import com.example.Agencia_Viajes.model.Reserva;
import com.example.Agencia_Viajes.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @PostMapping
    public Reserva crearReserva(@RequestBody Reserva reserva) {
        return reservaService.crearReserva(reserva);
    }

    @GetMapping
    public List<Reserva> obtenerReservas() {
        return reservaService.listarReservas();
    }

    @DeleteMapping("/{id}")
    public void eliminarReserva(@PathVariable Long id) {
        reservaService.eliminarReserva(id);
    }
}
