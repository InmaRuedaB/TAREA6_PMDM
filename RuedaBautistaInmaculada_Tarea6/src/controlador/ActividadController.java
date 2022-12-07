/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Actividad;

/**
 *
 * @author inmar
 */
public class ActividadController extends GeneralController {

    private static ResultSet rset = null;

    public static void crearConsultaActividad(String consulta) {
        Statement stmt = null;

        try {
            stmt = ConnectionFactory.getConexion().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            rset = stmt.executeQuery(consulta);
            rset.next();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "La consulta realizada no es válida");

        }

    }
    
    public static void crearConsultaActividades(String consulta) {
        Statement stmt = null;

        try {
            stmt = ConnectionFactory.getConexion().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            rset = stmt.executeQuery(consulta);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "La consulta realizada no es válida");

        }

    }

    public static List<Actividad> devolverActividades(int idNomina) {
        
        List<Actividad> listaActividades = new ArrayList<>();
        try {
           
            while (rset.next()) {
                Actividad act = new Actividad(
                        rset.getInt(1),
                        rset.getString(2),
                        rset.getFloat(3),
                        rset.getInt(4),
                        rset.getInt(5)
                );
                listaActividades.add(act);
            }
            return listaActividades;
        } catch (SQLException ex) {
            Logger.getLogger(NominasController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
    
    
    public static Actividad devolverActividad() throws SQLException {

        Actividad act = new Actividad(
                        rset.getInt(1),
                        rset.getString(2),
                        rset.getFloat(3),
                        rset.getInt(4),
                        rset.getInt(5));

        return act;
    }
    
   
    public static int ultimoId() {
        Statement stmt = null;
        ResultSet rset = null;
        String consulta = "SELECT MAX(ID_ACT) AS MAXID FROM ACTIVIDAD";
        try {
            stmt = ConnectionFactory.getConexion().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            rset = stmt.executeQuery(consulta);
            rset.next();
            int ultimoId = rset.getInt("MAXID");
            return ultimoId+1;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return -1;
        }
    }

}
