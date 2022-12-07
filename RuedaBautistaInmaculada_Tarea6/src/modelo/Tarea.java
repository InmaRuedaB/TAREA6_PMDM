package modelo;

/**
 *
 * @author Inmaculada Rueda Bautista
 */
public class Tarea {
    
    private int id;
    private String nombre;

    public Tarea(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Tarea{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    
}
