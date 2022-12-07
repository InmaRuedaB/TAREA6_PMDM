package controlador;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Trabajador;

/**
 *
 * @author Inmaculada Rueda Bautista
 */
public class LoginController {

    private static Connection con = null;
    private static PreparedStatement pst = null;
    private static ResultSet rs = null;
    private static Trabajador auxTrab = null;

    public static void loginGetTrabajador(String DNI, String password) throws SQLException {

        con = ConnectionFactory.getConexion();
        pst = con.prepareStatement("SELECT * FROM TRABAJADOR WHERE DNI=? AND PASS=?");
        pst.setString(1, DNI);
        pst.setString(2, password);

        rs = pst.executeQuery();

        while (rs.next()) {
            auxTrab = new Trabajador(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getInt(3),
                    rs.getString(4),
                    rs.getDate(5),
                    rs.getInt(6),
                    rs.getString(7),
                    rs.getString(8)
            );

        }
        rs.close();
        pst.close();

    }

    public static void ejecutaUpdate(String consulta) throws SQLException {

        int filas;
        PreparedStatement pstment;
        pstment = ConnectionFactory.getConexion().prepareStatement(consulta);
        filas = pstment.executeUpdate();

    }

    public static void ejecutaUpdate2(String consulta, String dni, String foto, Date fecha) {

        try {
            int filas;
            PreparedStatement pstment;                   

            pstment = ConnectionFactory.getConexion().prepareStatement(consulta);
            System.out.println("hola0");
            pstment.setString(1, foto);
            System.out.println("hola1");
            pstment.setString(2, dni);
            System.out.println("hola2");
            pstment.setDate(3, fecha);
            System.out.println("hola3");
            System.out.print(auxTrab.getId());
            pstment.setInt(4, 1);
            
            
            filas = pstment.executeUpdate();
            System.out.println("hola4");
        } catch (SQLException ex) {
            ExceptionController.getError(6, "JPanelVerPerfil.jButton2ActionPerformed()");
        }

    }

    public static Trabajador getAuxTrab() {
        return auxTrab;
    }

}
