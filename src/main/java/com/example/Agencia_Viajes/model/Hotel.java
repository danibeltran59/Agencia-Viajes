package com.example.Agencia_Viajes.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "hotel")
public class Hotel {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "categoria", nullable = false)
    private String categoria;

    @Column(name = "precio", nullable = false, precision = 10, scale = 2)
    private BigDecimal precio;

    @Column(name = "disponibilidad", nullable = false)
    private Boolean disponibilidad = false;

    @OneToMany(mappedBy = "hotelAsociado")
    private Set<com.example.Agencia_Viajes.model.Reserva> reservas = new LinkedHashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Set<com.example.Agencia_Viajes.model.Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(Set<com.example.Agencia_Viajes.model.Reserva> reservas) {
        this.reservas = reservas;
    }

}