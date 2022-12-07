
package modelo;

import java.util.Date;

/**
 *
 * @author Inmaculada Rueda Bautista
 */
public class Trabajador {
    
    private int id;
    private String dni;
    private int pass;
    private String nombre;
    private Date fechaNacimeinto;
    private int id_dpto;
    private String jefe;
    private String foto;

    public Trabajador(int id, String dni, int pass, String nombre, Date fechaNacimeinto, int id_dpto, String jefe, String foto) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimeinto = fechaNacimeinto;
        this.id_dpto = id_dpto;
        this.foto = foto;
        this.jefe = jefe;
        this.pass = pass;
    }

    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getDNI() {
        return dni;
    }

    public int getPass() {
        return pass;
    }

   

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimeinto() {
        return fechaNacimeinto;
    }

    public int getId_dpto() {
        return id_dpto;
    }

    public String getJefe() {
        return jefe;
    }

    public String getFoto() {
        return foto;
    }

    public void setDNI(String DNI) {
        this.dni = DNI;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimeinto(Date fechaNacimeinto) {
        this.fechaNacimeinto = fechaNacimeinto;
    }

    public void setId_dpto(int id_dpto) {
        this.id_dpto = id_dpto;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "DNI=" + dni + ", contrase\u00f1a=" + pass + ", nombre=" + nombre + ", FechaNacimeinto=" + fechaNacimeinto + ", id_dpto=" + id_dpto + ", jefe=" + jefe + ", foto=" + foto + '}';
    }
    
    
    
    
}
