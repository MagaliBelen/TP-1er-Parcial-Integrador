import java.time.LocalDate;

public class Profesor extends Persona {
    public Profesor(String nombre, String apellido, LocalDate fechaNacimiento, LocalDate fechaIngreso, int dni) {
        super(nombre, apellido, fechaNacimiento, fechaIngreso,dni);
    }

}