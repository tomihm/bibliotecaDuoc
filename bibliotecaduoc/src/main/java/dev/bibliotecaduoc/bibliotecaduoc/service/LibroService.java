package dev.bibliotecaduoc.bibliotecaduoc.service;

import dev.bibliotecaduoc.bibliotecaduoc.model.Libro;
import dev.bibliotecaduoc.bibliotecaduoc.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List <Libro> getLibros() {
        return libroRepository.obtenerLibros();
    }

    public Libro saveLibro(Libro libro){
        return libroRepository.guardar(libro);
    }

    public Libro getLibroId(int id) {
        return libroRepository.buscarPorId(id);
    }

    public Libro updateLibro(Libro libro) {
        return libroRepository.actualizar(libro);
    }

    public String deleteLibro(int id) {
        libroRepository.eliminar(id);
        return "producto eliminado";
    }
    public Libro getLibroIsbn(String isbn) {
        return libroRepository.buscarPorIsbn(isbn);
    }
    public int contarLibrosPorAnio(int anio) {
        return libroRepository.contarPorAnio(anio);
    }

    public int totalLibrosV1() {
        return libroRepository.obtenerLibros().size();
    }

    public int totalLibrosV2() {
        return libroRepository.totalLibros();
    }

    public List<Libro>getLibrosPorAutor(String autor) {
        return libroRepository.buscarPorAutor(autor);
    }
    public Libro getLibroMasAntiguo(){
        return libroRepository.buscarMasAntiguo();
    }
    public Libro getLibroMasNuevo(){
        return libroRepository.buscarMasNuevo();
    }
    public List<Libro> getLibrosOrdenadosPorAnio(){
        return libroRepository.ordenarPorAnio();
    }
}



