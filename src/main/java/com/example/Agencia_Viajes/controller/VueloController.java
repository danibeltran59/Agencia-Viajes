package com.example.Agencia_Viajes.controller;

import com.example.Agencia_Viajes.model.Vuelo;
import com.example.Agencia_Viajes.service.VueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vuelos")
public class VueloController {

    @Autowired
    private VueloService vueloService;

    @GetMapping
    public List<Vuelo> listarVuelos() {
        return vueloService.listarVuelos();
    }


}
