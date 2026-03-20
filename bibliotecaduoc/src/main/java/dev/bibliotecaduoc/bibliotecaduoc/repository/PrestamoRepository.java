package dev.bibliotecaduoc.bibliotecaduoc.repository;

import dev.bibliotecaduoc.bibliotecaduoc.model.Prestamo;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PrestamoRepository {
    private List<Prestamo> listaPrestamos = new ArrayList<>();
    private int contadorId = 1;

    public List<Prestamo> obtenerPrestamos() {
        return listaPrestamos;
    }

    public Prestamo guardarPrestamo(Prestamo prestamo) {
        prestamo.setIdPrestamo(contadorId++);
        prestamo.setMultas(0);
        listaPrestamos.add(prestamo);
        return prestamo;
    }

    public Prestamo buscarPorId(int id) {
        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo.getIdPrestamo() == id) {
                return prestamo;
            }
        }
        return null;
    }

    public Prestamo actualizarPrestamo(int id, Prestamo prestamoActualizado) {
        for (int i = 0; i < listaPrestamos.size(); i++) {
            if (listaPrestamos.get(i).getIdPrestamo() == id) {
                prestamoActualizado.setIdPrestamo(id);
                listaPrestamos.set(i, prestamoActualizado);
                return prestamoActualizado;
            }
        }
        return null;
    }

    public boolean eliminarPrestamo(int id) {
        return listaPrestamos.removeIf(p -> p.getIdPrestamo() == id);
    }
}
