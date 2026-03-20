package dev.bibliotecaduoc.bibliotecaduoc.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Prestamo {
    private int idPrestamo;
    private int idLibro;
    private String runSolicitante;
    private String fechaSolicitud;
    private String fechaEntrega;
    private int cantidadDias;
    private int multas = 0;
}