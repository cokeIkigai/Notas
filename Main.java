public class Main {
    public static void main(String[] args) {

        // 1. Crear estudiante con materias cargadas desde el constructor
        Estudiante estudiante = new Estudiante(Ana, "edad", 20);

        // 2. Mostrar nombre del alumno
        System.out.println("Alumno: " + getName());

        // 3. Mostrar asignaturas iniciales
                

        // 4. Mostrar también el contenido completo de cada asignatura (lista de notas)
       

        // 5. Añadir una asignatura nueva y otra repetida (esta debería NO añadirse)
        

        // 6. Añadir notas a Matemáticas 1,5,7
        Asignatura mates = est.findAsignatura("Matematicas");
        if (mates != null) {
            mates.addNota(9);
            mates.addNota(7);
            mates.addNota(5);
        }

        // 7. Añadir notas a Historia (la nueva asignatura) 6.8, 7.3, 9.0
        Asignatura historia = est.buscarAsignatura("Historia");
        if (historia != null) {
            historia.addNota(6);
            historia.addNota(8);
        }

        // 8. Mostrar resumen completo del alumno
        
       
    }
}
