package dev.bibliotecaduoc.bibliotecaduoc.controller;

import dev.bibliotecaduoc.bibliotecaduoc.model.Libro;
import dev.bibliotecaduoc.bibliotecaduoc.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> listarLibros() {
        return libroService.getLibros();
    }

    @PostMapping
    public Libro agregarLibro (@RequestBody Libro libro) {
        return libroService.saveLibro(libro);
    }

    @GetMapping("/{id}")
    public Libro buscarLibro (@PathVariable int id){
        return libroService.getLibroId(id);
    }

    @PutMapping("/{id}")
    public Libro actualizarLibro(@PathVariable int id, @RequestBody Libro libro){
        return libroService.updateLibro(libro);
    }

    @DeleteMapping ("{id}")
    public String eliminarLibro(@PathVariable int id){
        return libroService.deleteLibro(id);
    }
    @GetMapping("/isbn/{isbn}")
    public Libro buscarLibroIsbn(@PathVariable String isbn){
        return libroService.getLibroIsbn(isbn);
    }

    @GetMapping("/anio/{anio}/cantidad")
    public int cantidadLibrosPorAnio(@PathVariable int anio){
        return libroService.contarLibrosPorAnio(anio);
    }

    @GetMapping("/total")
    public int totalLibrosV2() {
        return libroService.totalLibrosV2();
    }

    @GetMapping("/autor/{autor}")
    public List<Libro> buscarLibrosAutor(@PathVariable String autor){
        return libroService.getLibrosPorAutor(autor);
    }
}
