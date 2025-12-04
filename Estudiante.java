import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private int edad;
    private List<Asignatura> asignaturas;

    // Debe inicializar la lista de asignaturas Lengua, Matematicas y Música 
    // 7. Crea el constructor: (0.4ptos)


    // 8. Método agregarAsignatura(String nombre) (1.0ptos)
    // - No permitir asignaturas repetidas
    // - Crear y añadir una nueva asignatura


    // 9. Método Devolver la lista completa de asignaturas (0.2ptos)
 

    // 10. Método para buscarAsignatura(String nombre)(0.3ptos)
    // - Devolver la asignatura si existe, o null si no


    // *OPCIONAL!!! 11. Método para promedioGeneral()(1.5ptos)
    /*
        Calcular el promedio de TODAS las notas de TODAS las asignaturas.
        Reglas:
        - Si no hay asignaturas -> devolver -1
        - Si existen asignaturas pero ninguna tiene notas -> devolver -1
        - Recorrer de forma manual las listas; no usar streams.
    */
    //Método


    // *OPCIONAL!!! 12. Método para ver resumen()(1.5ptos)
    /*
        Formato esperado:

        Estudiante: Ana (20 años)
        Asignaturas:
          - Matematicas -> [7, 8, 9], Promedio: 8.0, Max: 9, Min: 7
          - Lengua -> [5, 6],   Promedio: 5.5, Max: 6, Min: 5
        Promedio general: 7.0
    */
}

