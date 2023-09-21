public class ComisionProfesor {
    private Comision comision;
    private Profesor profesor;

   
    public ComisionProfesor(Comision comision, Profesor profesor) {
        this.comision = comision;
        this.profesor = profesor;
    }

    
    public Comision getComision() {
        return comision;
    }
    public void setComision(Comision comision) {
        this.comision = comision;
    }
    public Profesor getProfesor() {
        return profesor;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    
}
