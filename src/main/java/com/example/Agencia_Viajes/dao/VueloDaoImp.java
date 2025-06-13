package com.example.Agencia_Viajes.dao;

import com.example.Agencia_Viajes.model.Vuelo;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VueloDaoImp implements VueloDao {
    @Autowired
    private VueloDaoJPA vueloDao;

    @Override
    public List<Vuelo> listarVuelos() {
        return vueloDao.findAll();
    }
}
