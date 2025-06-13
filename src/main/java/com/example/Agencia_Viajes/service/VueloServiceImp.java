package com.example.Agencia_Viajes.service;


import com.example.Agencia_Viajes.dao.VueloDao;

import com.example.Agencia_Viajes.model.Vuelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VueloServiceImp implements VueloService {

    @Autowired
    private VueloDao vueloDao;

    @Override
    public List<Vuelo> listarVuelos() {
        return vueloDao.listarVuelos();
    }
}


