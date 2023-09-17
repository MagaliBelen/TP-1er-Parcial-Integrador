import java.time.LocalDate;

public class CicloLectivo {
    private LocalDate fechaInicio;
    private LocalDate fechaFinalizacion;
    private LocalDate fechaInscripcionInicio;
    private LocalDate fechaInscripcionFinalizacion;

    public CicloLectivo(LocalDate fechaInicio, LocalDate fechaFinalizacion, LocalDate fechaInscripcionInicio, LocalDate fechaInscripcionFinalizacion) {
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.fechaInscripcionInicio = fechaInscripcionInicio;
        this.fechaInscripcionFinalizacion = fechaInscripcionFinalizacion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(LocalDate fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public LocalDate getFechaInscripcionInicio() {
        return fechaInscripcionInicio;
    }

    public void setFechaInscripcionInicio(LocalDate fechaInscripcionInicio) {
        this.fechaInscripcionInicio = fechaInscripcionInicio;
    }

    public LocalDate getFechaInscripcionFinalizacion() {
        return fechaInscripcionFinalizacion;
    }

    public void setFechaInscripcionFinalizacion(LocalDate fechaInscripcionFinalizacion) {
        this.fechaInscripcionFinalizacion = fechaInscripcionFinalizacion;
    }

}