Biblioteca Duoc UC — API REST con Spring Boot

¿Qué hace este proyecto?
API REST desarrollada en Spring Boot para gestionar libros y préstamos de una biblioteca.


Endpoints de Libros `/api/v1/libros`

| Método | Path | Descripción |
|--------|------|-------------|
| GET | /api/v1/libros | Listar todos los libros |
| POST | /api/v1/libros | Agregar un libro |
| GET | /api/v1/libros/{id} | Buscar libro por ID |
| PUT | /api/v1/libros/{id} | Actualizar libro |
| DELETE | /api/v1/libros/{id} | Eliminar libro |
| GET | /api/v1/libros/isbn/{isbn} | Buscar por ISBN |
| GET | /api/v1/libros/autor/{autor} | Buscar por autor |
| GET | /api/v1/libros/anio/{anio}/cantidad | Contar libros por año |
| GET | /api/v1/libros/masAntiguo | Libro más antiguo |
| GET | /api/v1/libros/masNuevo | Libro más nuevo |
| GET | /api/v1/libros/ordenadosPorAnio | Libros ordenados por año |

Endpoints de Préstamos `/api/v1/prestamos`

| Método | Path | Descripción |
|--------|------|-------------|
| GET | /api/v1/prestamos | Listar todos los préstamos |
| POST | /api/v1/prestamos | Crear un préstamo |
| GET | /api/v1/prestamos/{id} | Obtener préstamo por ID |
| PUT | /api/v1/prestamos/{id} | Actualizar préstamo |
| DELETE | /api/v1/prestamos/{id} | Eliminar préstamo |

Problemas encontrados y solucionados
- Typo en `@RequestMapping`: `/ap1/v1/libros` en vez de `/api/v1/libros` → causaba error 404.
- Microsoft Defender bloqueaba IntelliJ → se excluyeron las carpetas del antivirus.
- Error 400 en préstamos → se cambió `Date` a `String` y se eliminó `@AllArgsConstructor`.
