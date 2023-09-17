import java.util.List;

public class Comision {
    private int id;
    private Materia materia;
    private CicloLectivo cicloLectivo;
    private List<Profesor> profesores;
    private List<Alumno> alumnos;
    private List<Examen> registrosExamenes;
    private EnumTurno turno;

    public Comision(Materia materia, CicloLectivo cicloLectivo, EnumTurno turno, int id) {
        this.materia = materia;
        this.cicloLectivo = cicloLectivo;
        this.turno=turno;
        this.id=id;
    } 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public EnumTurno getTurno() {
        return turno;
    }

    public void setTurno(EnumTurno turno) {
        this.turno = turno;
    }

    
}