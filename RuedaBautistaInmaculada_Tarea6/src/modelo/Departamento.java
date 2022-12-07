package modelo;

/**
 *
 * @author Inmaculada Rueda Bautista
 */
public class Departamento {
    
    private int id;
    private String nombre;
    private int planta;
    private int numOfi;

    public Departamento(int id, String nombre, int planta, int numOfi) {
        this.id = id;
        this.nombre = nombre;
        this.planta = planta;
        this.numOfi = numOfi;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPlanta() {
        return planta;
    }

    public int getNumOfi() {
        return numOfi;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public void setNumOfi(int numOfi) {
        this.numOfi = numOfi;
    }

    @Override
    public String toString() {
        return "Departamento{" + "id=" + id + ", nombre=" + nombre + ", planta=" + planta + ", numOfi=" + numOfi + '}';
    }
    
    
    
}
