package com.calificacionVideojuegos.servicio;

import com.calificacionVideojuegos.entidad.Videojuego;
import com.calificacionVideojuegos.repositorio.VideojuegoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideojuegoServicio {

    private VideojuegoRepositorio myVideojuegoRepositorio;

    @Autowired
    public VideojuegoServicio(VideojuegoRepositorio myVideojuegoRepositorio) {
        this.myVideojuegoRepositorio = myVideojuegoRepositorio;
    }

    public void guardarJuego(Videojuego videojuego) {
        this.myVideojuegoRepositorio.save(videojuego);
    }

    public List<Videojuego> verJuegos() {
        return this.myVideojuegoRepositorio.findAll();
    }

}
