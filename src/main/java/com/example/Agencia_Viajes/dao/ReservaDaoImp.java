package com.example.Agencia_Viajes.dao;

import com.example.Agencia_Viajes.model.Reserva;
import com.example.Agencia_Viajes.model.Vuelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Repository
public class ReservaDaoImp implements ReservaDao {
    @Autowired
    private ReservaDaoJPA reservaDao;
    @Autowired
    private VueloDaoJPA vueloDao;

    @Override
    public Reserva crearReserva(Reserva reserva) {
        Vuelo vuelo = vueloDao.findById(reserva.getVueloAsociado().getId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Vuelo no encontrado"));

        if (vuelo.getPlazasDisponibles() <= 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No hay plazas disponibles");
        }

        vuelo.setPlazasDisponibles(vuelo.getPlazasDisponibles() - 1);
        vueloDao.save(vuelo);

        return reservaDao.save(reserva);
    }

    @Override
    public List<Reserva> obtenerReserva() {
        return reservaDao.findAll();
    }

    @Override
    public void elminarReserva(Long id) {
         reservaDao.deleteById(id);
    }
}
