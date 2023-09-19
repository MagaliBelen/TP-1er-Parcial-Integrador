import java.util.List;

public class Comision {
    private int id;
    private Materia materia;
    private CicloLectivo cicloLectivo;
    private List<Profesor> profesores;
    private List<Alumno> alumnosregistrados;
    private List<Examen> registrosExamenes;
    private EnumTurno turno;
    private Aula aula;
    private EnumDia dia;

    public Comision(Materia materia, CicloLectivo cicloLectivo, EnumTurno turno, int id, Aula aula, EnumDia dia) {
        this.materia = materia;
        this.cicloLectivo = cicloLectivo;
        this.turno=turno;
        this.id=id;
        this.aula=aula;
        this.dia=dia;
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




    public Aula getAula() {
        return aula;
    }




    public void setAula(Aula aula) {
        this.aula = aula;
    }




    public EnumDia getDia() {
        return dia;
    }




    public void setDia(EnumDia dia) {
        this.dia = dia;
    }


    public List<Alumno> getAlumnosregistrados() {
        return alumnosregistrados;
    }


    public void setAlumnosregistrados(List<Alumno> alumnosregistrados) {
        this.alumnosregistrados = alumnosregistrados;
    }

    
}