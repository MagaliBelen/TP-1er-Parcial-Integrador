import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private List<Materia> materias = new ArrayList<>();
    private List<Alumno> alumnos = new ArrayList<>();

    ////////////// F U N C I O N A L I D A D E S //////////////
    
    // agregarMateria
    // No se puede agregar 2 materias con mismo Id

    public void agregarMateria(int id, String nombre) {
        // Verificar si ya existe una materia con el mismo ID
        for (Materia materia : materias) {
            if (materia.getId() == id) {
                System.out.println("No se puede agregar la materia. Ya existe una materia con el mismo ID.");
                return;
            }
        }

        // Si no se encontró una materia con el mismo ID, agregar la nueva materia
        Materia nuevaMateria = new Materia(id, nombre);
        materias.add(nuevaMateria);
    }


    //agregarAlumno
    //No se puede agregar 2 alumnos con mismo Dni
    
      public void agregarAlumno(String nombre, String apellido, LocalDate fechaNacimiento, LocalDate fechaIngreso, int dni) {
        // Verificar si ya existe una materia con el mismo ID
        for (Alumno alumno : alumnos) {
            if (alumno.getDni() == dni) {
                System.out.println("No se puede agregar la materia. Ya existe una materia con el mismo ID.");
                return;
            }
        }

        // Si no se encontró una materia con el mismo ID, agregar la nueva materia
       Alumno nuevoAlumno = new Alumno(nombre, apellido, fechaNacimiento, fechaIngreso, dni);
        alumnos.add(nuevoAlumno);
    }


}
