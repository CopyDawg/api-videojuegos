package com.calificacionVideojuegos.controlador;

import com.calificacionVideojuegos.entidad.Videojuego;
import com.calificacionVideojuegos.servicio.VideojuegoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class VideojuegoControlador {

    private VideojuegoServicio myVideojuegoServicio;

    @Autowired
    public VideojuegoControlador(VideojuegoServicio myVideojuegoServicio) {
        this.myVideojuegoServicio = myVideojuegoServicio;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarVideojuego(@RequestBody Videojuego videojuego) {
        if(videojuego.getNombreJuego().isEmpty()) {
            return ResponseEntity.badRequest().body("Nombre del videojuego es requerido");
        } else {
            this.myVideojuegoServicio.guardarJuego(videojuego);
            return ResponseEntity.ok("Videojuego guardado");
        }
    }

    @GetMapping("/ver-lista")
    public ResponseEntity<?> verListaJuegos() {
        List<Videojuego> listaJuego = this.myVideojuegoServicio.verJuegos();

        if(listaJuego.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(listaJuego);
        }
    }

}
