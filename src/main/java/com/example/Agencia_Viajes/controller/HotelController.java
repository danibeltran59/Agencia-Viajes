package com.example.Agencia_Viajes.controller;

import com.example.Agencia_Viajes.model.Hotel;
import com.example.Agencia_Viajes.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hoteles")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @GetMapping
    public List<Hotel> obtenerHoteles() {
        return hotelService.obtenerHoteles();
    }
    @PostMapping
    public Hotel crearHotel(@RequestBody Hotel hotel) {
        return hotelService.crearHotel(hotel);
    }
}
