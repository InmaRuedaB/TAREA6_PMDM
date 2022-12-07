/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author inmar
 */
public class ConsultaController {
    
        
    public static ResultSet crearConsulta(String consulta, boolean simple) {
        Statement stmt = null;
        ResultSet rset = null;
        
        try {
            stmt = ConnectionFactory.getConexion().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            rset = stmt.executeQuery(consulta);
            if(simple) {
                if (rset.next()) {
                    rset.first();
                }
            }
            
            return rset;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
        
        finally{
            if(stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ConsultaController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
}
