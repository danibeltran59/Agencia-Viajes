package com.example.Agencia_Viajes.dao;

import com.example.Agencia_Viajes.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HotelDaoJPA extends JpaRepository<Hotel, Long> {

}
