package controlador;

/**
 *
 * @author Inmaculada Rueda Bautista
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectionFactory {

    private static Connection conexion;

    public static void abrirConexion() throws SQLException, ClassNotFoundException {
        conexion = null;

        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/TAREA6_PMDM";

        if (conexion == null) {
            conexion = DriverManager.getConnection(url, "root", "1234");
        } else {
            JOptionPane.showMessageDialog(null, "Ya está conectado");
        }

    }

    public static void close() throws SQLException {
        if (conexion != null)
            conexion.close();
    }

    public static Connection getConexion() {
        return conexion;
    }
}
