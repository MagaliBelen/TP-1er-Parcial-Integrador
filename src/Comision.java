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

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public CicloLectivo getCicloLectivo() {
        return cicloLectivo;
    }

    public void setCicloLectivo(CicloLectivo cicloLectivo) {
        this.cicloLectivo = cicloLectivo;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public List<Examen> getRegistrosExamenes() {
        return registrosExamenes;
    }

    public void setRegistrosExamenes(List<Examen> registrosExamenes) {
        this.registrosExamenes = registrosExamenes;
    }

    
}