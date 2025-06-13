package com.example.Agencia_Viajes.model;

import jakarta.persistence.*;

@Entity
@Table(name = "reserva")
public class Reserva {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "usuario", nullable = false)
    private String usuario;

    @Column(name = "dni", nullable = false, length = 20)
    private String dni;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vuelo_asociado")
    private com.example.Agencia_Viajes.model.Vuelo vueloAsociado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_asociado")
    private Hotel hotelAsociado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public com.example.Agencia_Viajes.model.Vuelo getVueloAsociado() {
        return vueloAsociado;
    }

    public void setVueloAsociado(com.example.Agencia_Viajes.model.Vuelo vueloAsociado) {
        this.vueloAsociado = vueloAsociado;
    }

    public Hotel getHotelAsociado() {
        return hotelAsociado;
    }

    public void setHotelAsociado(Hotel hotelAsociado) {
        this.hotelAsociado = hotelAsociado;
    }

}