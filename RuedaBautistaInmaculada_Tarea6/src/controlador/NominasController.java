package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Nomina;

/**
 *
 * @author inmar
 */

public class NominasController extends GeneralController {

    private static ResultSet rsetNomina = null;

    public static void crearConsultaNomina(String consulta) throws SQLException {
        Statement stmt = null;
        ResultSet rset = null;

        stmt = ConnectionFactory.getConexion().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        rsetNomina = stmt.executeQuery(consulta);
        
        if (rsetNomina.next()) {
            rsetNomina.first();
        }
    }

    public static void crearConsultaNominas(String consulta) {
        Statement stmt = null;
        ResultSet rset = null;

        try {
            stmt = ConnectionFactory.getConexion().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            rsetNomina = stmt.executeQuery(consulta);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
    }

    public static Nomina devolverNomina() throws SQLException {

        Nomina nomina = null;

        nomina = new Nomina(rsetNomina.getInt(1),
                rsetNomina.getFloat(2),
                rsetNomina.getFloat(3),
                rsetNomina.getFloat(4),
                rsetNomina.getInt(5));

        return nomina;
    }

    public static List<Nomina> devolverNominas() throws SQLException {
        List<Nomina> listaNominas = new ArrayList<>();

        while (rsetNomina.next()) {
            Nomina nomina = new Nomina(rsetNomina.getInt(1),
                    rsetNomina.getFloat(2),
                    rsetNomina.getFloat(3),
                    rsetNomina.getFloat(4),
                    rsetNomina.getInt(5));

            listaNominas.add(nomina);
        }
        return listaNominas;

    }

    public static boolean siguienteNomina() throws SQLException {

        return rsetNomina.next();
    }

    public static boolean anteriorNomina() throws SQLException {

        return rsetNomina.previous();
    }

    public static boolean esPrimero() throws SQLException {

        return rsetNomina.isFirst();
    }

    public static boolean esUltimo() throws SQLException {

        return rsetNomina.isLast();
    }

}
