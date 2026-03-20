package dev.bibliotecaduoc.bibliotecaduoc.service;

import dev.bibliotecaduoc.bibliotecaduoc.model.Prestamo;
import dev.bibliotecaduoc.bibliotecaduoc.repository.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PrestamoService {
    @Autowired
    private PrestamoRepository prestamoRepository;

    public List<Prestamo> getPrestamos() {
        return prestamoRepository.obtenerPrestamos();
    }

    public Prestamo savePrestamo(Prestamo prestamo) {
        return prestamoRepository.guardarPrestamo(prestamo);
    }

    public Prestamo getPrestamoId(int id) {
        return prestamoRepository.buscarPorId(id);
    }

    public Prestamo updatePrestamo(int id, Prestamo prestamo) {
        return prestamoRepository.actualizarPrestamo(id, prestamo);
    }

    public boolean deletePrestamo(int id) {
        return prestamoRepository.eliminarPrestamo(id);
    }
}