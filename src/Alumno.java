import java.time.LocalDate;

public class Alumno extends Persona {
    public Alumno(String nombre, String apellido, LocalDate fechaNacimiento, LocalDate fechaIngreso, int dni) {
        super(nombre, apellido, fechaNacimiento, fechaIngreso,dni);
    }

    
}