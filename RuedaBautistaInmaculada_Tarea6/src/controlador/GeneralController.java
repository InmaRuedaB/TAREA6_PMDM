/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author inmar
 */
public class GeneralController {

    public static void ejecutaUpdate(String consulta) throws SQLException {

        int filas;
        PreparedStatement pstment = ConnectionFactory.getConexion().prepareStatement(consulta);

        filas = pstment.executeUpdate();
        JOptionPane.showMessageDialog(null, "Se han actualizado " + filas + " fila(s)");

    }

}
