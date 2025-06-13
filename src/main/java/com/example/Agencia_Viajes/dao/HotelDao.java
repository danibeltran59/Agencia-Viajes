package com.example.Agencia_Viajes.dao;


import com.example.Agencia_Viajes.model.Hotel;

import java.util.List;


public interface HotelDao {
    List<Hotel> listarHoteles();
    Hotel crearHotel(Hotel hotel);

}

