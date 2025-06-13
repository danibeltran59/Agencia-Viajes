package com.example.Agencia_Viajes.service;

import com.example.Agencia_Viajes.dao.HotelDao;
import com.example.Agencia_Viajes.dao.HotelDaoJPA;
import com.example.Agencia_Viajes.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelDao hotelservice;

    @Override
    public List<Hotel> obtenerHoteles() {
        return hotelservice.listarHoteles();
    }

    @Override
    public Hotel crearHotel(Hotel hotel) {
        return hotelservice.crearHotel(hotel);
    }
}
