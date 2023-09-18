import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private List<Materia> materias = new ArrayList<>();
    private List<Alumno> alumnos = new ArrayList<>();
    private List<CicloLectivo> cicloLectivos = new ArrayList<>();
    private List<Comision> comisiones = new ArrayList<>();
    private List<Profesor> profesores = new ArrayList<>();
    

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
        // Verificar si ya existe un alumno con el mismo ID
        for (Alumno alumno : alumnos) {
            if (alumno.getDni() == dni) {
                System.out.println("No se puede agregar el alumno. Ya existe un alumno con el mismo ID.");
                return;
            }
        }

        // Si no se encontró el alumno con el mismo ID, agregar nuevo alumno
       Alumno nuevoAlumno = new Alumno(nombre, apellido, fechaNacimiento, fechaIngreso, dni);
        alumnos.add(nuevoAlumno);
    }

    //agregarCicloLectivo
    //No se puede asignar 2 ciclos Lectivo con mismo Id y no se pueden superponer los rangos de fechas entre 2 ciclos distintos

public void agregarCicloLectivo(LocalDate fechaInicio, LocalDate fechaFinalizacion, LocalDate fechaInscripcionInicio, LocalDate fechaInscripcionFinalizacion, int id) {
        // Verificar si ya existe el ciclo con el mismo ID
        for (CicloLectivo cicloLectivo : cicloLectivos) {
            if (cicloLectivo.getId() == id && cicloLectivo.getFechaInicio() != fechaInicio) {
                return;
            }
        }

        // Si no se encontró un ciclo con mismo id, se agrega
       CicloLectivo nuevoCiclo = new CicloLectivo(fechaInicio,  fechaFinalizacion, fechaInscripcionInicio, fechaInscripcionFinalizacion,id);
        cicloLectivos.add(nuevoCiclo);
    }


    //agregarComision
//No se Pueden generar 2 Comisiones para la misma materia, el mismo cicloLectivo y el mismo turno

public void CrearComision(Materia materia, CicloLectivo cicloLectivo, EnumTurno turno, int id) {
    // Validar que no exista otra Comisión con los mismos parámetros
    if (existeComisionConParametros(id, materia, cicloLectivo, turno)) {
        System.out.println("Ya existe una comisión con la misma materia, ciclo lectivo y turno");
        return;
    }

    // agregamos la Comision
    Comision nuevaComision = new Comision(materia, cicloLectivo, turno, id);
    comisiones.add(nuevaComision);
}

// validacion
private boolean existeComisionConParametros(int id, Materia materia, CicloLectivo cicloLectivo, EnumTurno turno) {
    for (Comision comision : comisiones) {
        if (comision.getMateria().equals(materia) &&
                comision.getCicloLectivo().equals(cicloLectivo) &&
                comision.getTurno().equals(turno)) {
            return true;
        }
    }
    return false;
}


//agregarDocentes
//No se puede agregar 2 docentes con el mismo dni

public void agregarProfesor (String nombre, String apellido, LocalDate fechaNacimiento, LocalDate fechaIngreso, int dni) {
        // Verificar si ya existe un alumno con el mismo ID
        for (Profesor profesor : profesores) {
            if (profesor.getDni() == dni) {
                System.out.println("No se puede agregar el profesor. Ya existe un profe con el mismo ID.");
                return;
            }
        }

        // Si no se encontró el alumno con el mismo ID, agregar nuevo alumno
       Profesor nuevoProfe = new Profesor (nombre, apellido, fechaNacimiento, fechaIngreso, dni);
        profesores.add(nuevoProfe);
    }

//asignarDocentesAComision
//El mismo docente no puede ser profesor de la misma comisión 2 veces.
public void asignarDocentesAComision(Profesor profesor) {
    // Verificar si el docente ya está asignado a la comisión
    if (existeProfesorEnComision(profesor)) {
        System.out.println("El mismo docente no puede ser profesor de la misma comisión 2 veces.");
        return;
    }
    
    // Agregar el profesor a la comisión
    profesores.add(profesor);
}

private boolean existeProfesorEnComision(Profesor profesor) {
    return profesores.contains(profesor);
}





}


