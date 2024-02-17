package com.calificacionVideojuegos.repositorio;

import com.calificacionVideojuegos.entidad.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideojuegoRepositorio extends JpaRepository<Videojuego, Integer> {
}
