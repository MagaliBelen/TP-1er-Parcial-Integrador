import java.util.List;

public class Comision {
    private Materia materia;
    private CicloLectivo cicloLectivo;
    private List<Profesor> profesores;
    private List<Alumno> alumnos;
    private List<Examen> registrosExamenes;

    public Comision(Materia materia, CicloLectivo cicloLectivo) {
        this.materia = materia;
        this.cicloLectivo = cicloLectivo;
    }

    // Getter y Setter para materia, cicloLectivo, profesores, alumnos y registrosExamenes
}