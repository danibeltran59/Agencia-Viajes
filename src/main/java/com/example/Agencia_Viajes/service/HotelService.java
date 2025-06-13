package com.example.Agencia_Viajes.service;

import com.example.Agencia_Viajes.model.Hotel;

import java.util.List;

public interface HotelService {
    List<Hotel> obtenerHoteles();
    Hotel crearHotel(Hotel hotel);
}
