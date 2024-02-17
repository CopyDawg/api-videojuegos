package com.calificacionVideojuegos.entidad;

import jakarta.persistence.*;

@Entity
public class Videojuego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVideojuego;

    @Column(nullable = false, unique = true)
    private String nombreJuego;
    private Integer calificacion;

    public String getNombreJuego() {
        return nombreJuego;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }
    
}
