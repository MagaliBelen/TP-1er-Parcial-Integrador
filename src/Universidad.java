import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private List<Materia> materias = new ArrayList<>();
    private List<Alumno> alumnos = new ArrayList<>();
    private List<CicloLectivo> cicloLectivos = new ArrayList<>();
    private List<Comision> comisiones = new ArrayList<>();
    private List<Profesor> profesores = new ArrayList<>();
    private Aula aula;

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

    // agregarAlumno
    // No se puede agregar 2 alumnos con mismo Dni

    public void agregarAlumno(String nombre, String apellido, LocalDate fechaNacimiento, LocalDate fechaIngreso,
            int dni) {
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

    // agregarCicloLectivo
    // No se puede asignar 2 ciclos Lectivo con mismo Id y no se pueden superponer
    // los rangos de fechas entre 2 ciclos distintos

    public void agregarCicloLectivo(LocalDate fechaInicio, LocalDate fechaFinalizacion,
            LocalDate fechaInscripcionInicio, LocalDate fechaInscripcionFinalizacion, int id) {
        // Verificar si ya existe el ciclo con el mismo ID
        for (CicloLectivo cicloLectivo : cicloLectivos) {
            if (cicloLectivo.getId() == id && cicloLectivo.getFechaInicio() != fechaInicio) {
                return;
            }
        }

        // Si no se encontró un ciclo con mismo id, se agrega
        CicloLectivo nuevoCiclo = new CicloLectivo(fechaInicio, fechaFinalizacion, fechaInscripcionInicio,
                fechaInscripcionFinalizacion, id);
        cicloLectivos.add(nuevoCiclo);
    }

    // agregarComision
    // No se Pueden generar 2 Comisiones para la misma materia, el mismo
    // cicloLectivo y el mismo turno

    public void CrearComision(Materia materia, CicloLectivo cicloLectivo, EnumTurno turno, int id, Aula aula,EnumDia dia) {
        // Validar que no exista otra Comisión con los mismos parámetros
        if (existeComisionConParametros(id, materia, cicloLectivo, turno)) {
            System.out.println("Ya existe una comisión con la misma materia, ciclo lectivo y turno");
            return;
        }

        // agregamos la Comision
        Comision nuevaComision = new Comision(materia, cicloLectivo, turno, id, aula, dia);
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

    // agregarDocentes
    // No se puede agregar 2 docentes con el mismo dni

    public void agregarProfesor(String nombre, String apellido, LocalDate fechaNacimiento, LocalDate fechaIngreso,
            int dni) {
        // Verificar si ya existe un alumno con el mismo ID
        for (Profesor profesor : profesores) {
            if (profesor.getDni() == dni) {
                System.out.println("No se puede agregar el profesor. Ya existe un profe con el mismo ID.");
                return;
            }
        }

        // Si no se encontró el alumno con el mismo ID, agregar nuevo alumno
        Profesor nuevoProfe = new Profesor(nombre, apellido, fechaNacimiento, fechaIngreso, dni);
        profesores.add(nuevoProfe);
    }

    // asignarDocentesAComision
    // El mismo docente no puede ser profesor de la misma comisión 2 veces.
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

    // agregarCorrelatividad(idMateria, idCorrelativa)
    // Se debe validar que ambos códigos existan en una materia

    public void agregarCorrelatividad(int idMateria, int idCorrelativa) {
        if (!existeMateria(idMateria) || !existeMateria(idCorrelativa)) {
            throw new IllegalArgumentException("Ambos códigos deben existir en una materia.");
        }

        Materia materia = obtenerMateriaPorId(idMateria);
        materia.agregarCorrelativa(idCorrelativa);
    }

    public boolean existeMateria(int id) {
        for (Materia materia : materias) {
            if (materia.getId() == id) {
                return true; // existe materia
            }
        }
        return false; // no existe materia
    }

    public Materia obtenerMateriaPorId(int id) {
        for (Materia materia : materias) {
            if (materia.getId() == id) {
                return materia;
            }
        }
        return null; // Materia no encontrada
    }

    // eliminarCorrelatividad(idMateria, idCorrelativaAELiminar)
    // Se debe validar que esa correlatividad exista

    public void eliminarCorrelatividad(int idMateria, int idCorrelativa) {
        if (existeMateria(idMateria) && existeMateria(idCorrelativa)) {
            Materia materia = obtenerMateriaPorId(idMateria);
            materia.eliminarCorrelativa(idCorrelativa);
        }
    }


//inscribirAlumnoAComision (dni, idComision)
// Verificar que el alumno y la comisión estén dados de alta
//No se puede inscribir Alumnos si este no tiene aprobadas todas las correlativas. Se aprueba con 4 o más.
//La inscripción no se puede realizar si esta fuera de fecha Inscripción
//No se puede inscribir el alumno si excede la cantidad de alumnos permitidos en el aula
//No se puede inscribir el Alumno si ya está inscripto a otra comisión el mismo día y Turno
//No se puede inscribir a una materia que haya aprobado previamente


public void inscribirAlumnoAComision(Alumno alumno, Comision comision) {
    // Verificar que el alumno y la comisión estén dados de alta
    if (!existeAlumno(alumno) && !existeComision(comision)) {
        throw new IllegalArgumentException("El alumno o la comisión no están dados de alta o la inscripción está fuera de fecha.");
    }

    // Verificar que el alumno tenga aprobadas todas las correlativas
    if (!alumno.tieneCorrelativasAprobadas()) {
        throw new IllegalArgumentException("El alumno no tiene aprobadas todas las correlativas necesarias.");
    }

    // Verificar que el alumno no esté inscrito en otra comisión el mismo día y turno
    if (alumnoEstaInscritoEnOtraComision(alumno, comision)) {
        throw new IllegalArgumentException("El alumno ya está inscrito en otra comisión el mismo día y turno.");
    }

    // Verificar que el alumno no haya aprobado previamente la materia
    if (alumno.haAprobadoMateria()) {
        throw new IllegalArgumentException("El alumno ya ha aprobado previamente esta materia.");
    }

    // Verificar que no se exceda la cantidad de alumnos permitidos en el aula
    if (aula != null &&  Comision.getAlumnosregistrados.size() >= aula.getCapacidadMaxima()) {
        throw new IllegalArgumentException("La comisión ya ha alcanzado su capacidad máxima de alumnos.");
    }

    // Inscribir al alumno a la comisión
    alumnos.add(alumno);
}

//para saber si existe  alumno
private boolean existeAlumno(Alumno alumno) {
    for (Alumno a : alumnos) {
        if (a.equals(alumno)) {
            return true;
        }
    }
    return false;
}

//para saber si existe comision
private boolean existeComision(Comision comision) {
    for (Comision c : comisiones) {
        if (c.equals(comision)) {
            return true;
        }
    }
    return false;
}


// Verificar si el alumno está inscrito en otra comisión el mismo día y turno

private boolean alumnoEstaInscritoEnOtraComision(Alumno alumno, Comision comision) {
    for (Inscripcion inscripcion : listaInscripciones) {
        if (inscripcion.getAlumno().equals(alumno) &&
            inscripcion.getComision().getFecha().equals(comision.getFecha()) &&
            inscripcion.getComision().getTurno().equals(comision.getTurno())) {
            return true;
        }
    }
    return false;
}


    }


