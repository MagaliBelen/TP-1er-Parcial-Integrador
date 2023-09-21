import java.time.LocalDate;
import java.util.List;

public class Alumno extends Persona {
 private List<Materia> correlativasAprobadas;
 private List<Materia> materiasAprobadas;


    public Alumno(String nombre, String apellido, LocalDate fechaNacimiento, LocalDate fechaIngreso, int dni) {
        super(nombre, apellido, fechaNacimiento, fechaIngreso,dni);
    }

   // Método para verificar si el alumno tiene aprobadas todas las correlativas necesarias
   public boolean tieneCorrelativasAprobadas(List<Materia> correlativasNecesarias) {
    for (Materia correlativa : correlativasNecesarias) {
        if (!correlativasAprobadas.contains(correlativa)) {
            return false;
        }
    }
    return true;
}
      // Método para verificar si el alumno ha aprobado previamente una materia
      public boolean haAprobadoMateria(Materia materia) {
      for (Materia m : materiasAprobadas) {
        if (!materiasAprobadas.contains(m)) {
            return false;
        }
    }
    return true;
}
}