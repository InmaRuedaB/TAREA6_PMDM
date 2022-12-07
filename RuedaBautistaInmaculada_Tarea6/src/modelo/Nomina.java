package modelo;

import java.sql.Date;

/**
 *
 * @author Inmaculada Rueda Bautista
 */
public class Nomina {
    private int id;
    private float salarioBase;
    private float actividades;
    private float salarioTotal;
    private int idTrabajador;

    public Nomina(int id, float salarioBase, float actividades, float salarioTotal, int idTrabajador) {
        this.id = id;
        this.salarioBase = salarioBase;
        this.actividades = actividades;
        this.salarioTotal = salarioTotal;
        this.idTrabajador = idTrabajador;
 
    }

    public Nomina(String string, int aInt, String string0, Date date, int aInt0, String string1, String string2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public float getActividades() {
        return actividades;
    }


    public float getSalarioTotal() {
        return salarioTotal;
    }

   


    public void setId(int id) {
        this.id = id;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setActividades(float actividades) {
        this.actividades = actividades;
    }


    public void setSalarioTotal(float salarioTotal) {
        this.salarioTotal = salarioTotal;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

   

    @Override
    public String toString() {
        return "Nomina{" + "id=" + id + ", salarioBase=" + salarioBase + ", calculo=" + actividades
                + ", salarioTotal=" + salarioTotal + ", DNI=" + idTrabajador + '}';
    }
    
    
    
    
    
}
