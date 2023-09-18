import java.util.ArrayList;
import java.util.List;

public class Materia {
    private int id;
    private String nombre;
    private List<Integer> materiasCorrelativas = new ArrayList<>();

    public Materia(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.materiasCorrelativas = new ArrayList<>();
    }    

    //Agregar correlativas 
    public void agregarCorrelativa(int idCorrelativa) {
        materiasCorrelativas.add(idCorrelativa);
    }

    public boolean tieneCorrelativa(int idCorrelativa) {
        return materiasCorrelativas.contains(idCorrelativa);
    }


    public int getId() {
        return id;
    }

    public List<Integer> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }

    public void setMateriasCorrelativas(List<Integer> materiasCorrelativas) {
        this.materiasCorrelativas = materiasCorrelativas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
}