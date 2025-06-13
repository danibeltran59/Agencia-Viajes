package com.example.Agencia_Viajes.dao;

import com.example.Agencia_Viajes.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HotelDaoImp implements HotelDao {

    @Autowired
    private HotelDaoJPA hotelDao;

    @Override
    public List<Hotel> listarHoteles() {
        return hotelDao.findAll();
    }

    @Override
    public Hotel crearHotel(Hotel hotel) {
        return hotelDao.save(hotel);
    }

}