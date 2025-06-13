package com.example.Agencia_Viajes.service;



import com.example.Agencia_Viajes.dao.ReservaDao;
import com.example.Agencia_Viajes.dao.ReservaDaoJPA;
import com.example.Agencia_Viajes.dao.VueloDaoJPA;
import com.example.Agencia_Viajes.model.Reserva;
import com.example.Agencia_Viajes.model.Vuelo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ReservaServiceImp implements ReservaService {

    @Autowired
    private ReservaDao rdao;

    @Override
    public Reserva crearReserva(Reserva reserva) {
        return rdao.crearReserva(reserva);
    }

    @Override
    public List<Reserva> listarReservas() {
        return rdao.obtenerReserva();
    }

    @Override
    public void eliminarReserva(Long id) {
        rdao.elminarReserva(id);
    }
}
