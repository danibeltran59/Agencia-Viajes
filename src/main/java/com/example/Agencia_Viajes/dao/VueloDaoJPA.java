package com.example.Agencia_Viajes.dao;

import com.example.Agencia_Viajes.model.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VueloDaoJPA extends JpaRepository<Vuelo, Long> {
    Long id(Long id);
}
