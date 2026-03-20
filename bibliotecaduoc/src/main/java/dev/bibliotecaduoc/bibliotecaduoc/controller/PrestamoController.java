package dev.bibliotecaduoc.bibliotecaduoc.controller;

import dev.bibliotecaduoc.bibliotecaduoc.model.Prestamo;
import dev.bibliotecaduoc.bibliotecaduoc.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/prestamos")
public class PrestamoController {

    @Autowired
    private PrestamoService prestamoService;

    @GetMapping
    public ResponseEntity<List<Prestamo>> listarPrestamos() {
        return ResponseEntity.ok(prestamoService.getPrestamos());
    }

    @PostMapping
    public ResponseEntity<Prestamo> guardarPrestamo(@RequestBody Prestamo prestamo) {
        return ResponseEntity.status(HttpStatus.CREATED).body(prestamoService.savePrestamo(prestamo));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Prestamo> obtenerPrestamo(@PathVariable int id) {
        return ResponseEntity.ok(prestamoService.getPrestamoId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Prestamo> actualizarPrestamo(@PathVariable int id, @RequestBody Prestamo prestamo) {
        return ResponseEntity.ok(prestamoService.updatePrestamo(id, prestamo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPrestamo(@PathVariable int id) {
        prestamoService.deletePrestamo(id);
        return ResponseEntity.noContent().build();
    }
}