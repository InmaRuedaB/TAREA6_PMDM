package modelo;

/**
 *
 * @author Inmaculada Rueda Bautista
 */
public class Actividad {
    
    private int id;
    private String nombre;
    private float precio;
    private int tipoTarea;
    private int idNomina;

    public Actividad(int id, String nombre, float precio, int tipoTarea, int idNomina) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.tipoTarea = tipoTarea;
        this.idNomina = idNomina;
    }

    public int getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(int idNomina) {
        this.idNomina = idNomina;
    }
    
    

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public int getTipoTarea() {
        return tipoTarea;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setTipoTarea(int tipoTarea) {
        this.tipoTarea = tipoTarea;
    }

    @Override
    public String toString() {
        return "Actividad{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", tipoTarea=" + tipoTarea + '}';
    }
    
    public String toStringList() {
        return id +" - " + nombre +" - " + precio +" - " + tipoTarea;
    }
    
    
    
}
