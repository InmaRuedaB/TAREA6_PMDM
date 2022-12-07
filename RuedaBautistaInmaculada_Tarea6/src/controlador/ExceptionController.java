package controlador;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import javax.swing.JOptionPane;


public class ExceptionController
{
    private static File logFile = new File("./logFile.txt");
    private static BufferedWriter bf;
    
    public static void getError(int n, String origin) {
        try {
            // Inicialización de los streams.
            bf = new BufferedWriter(
                new FileWriter(logFile, true));
            if (!logFile.exists())
                logFile.createNewFile();
            bf.write((new Date()).toString());
        } catch (IOException ex) {
            ExceptionController.getError(8, "ExceptionManager.getError()");
        }
        
        String mensaje = "";
        switch(n) {
            case 0 : {
                // SQLException (Error consulta)
                mensaje = "ERROR: SQLException in " + origin + ".\n"
                    + "Error en la consulta.\n";
                break;
            }
            case 1 : {
                // SQLExceptions (abrir conexión)
                mensaje = "ERROR: SQLException in " + origin + ".\n"
                    + "Error de conexión.\n";
                break;
            }
            case 2 : {
                // SQLExceptions (cerrar conexión)
                mensaje = "ERROR: SQLException in " + origin + ".\n"
                    + "Error al cerrar conexión.\n";
                break;
            }
            case 3 : {
                // Invalid NIF/pass
                mensaje = "ERROR: DNI o Contraseña inválido";
                break;
            }
            case 4 : {
                // Salario base fuera de ranco
                mensaje = "ERROR: El salario base debe estar entre 500.00 y 1200.00";
                break;
            }
            case 5 : {
                // NumberFormatException
                mensaje = "ERROR: NumberFormatException in " + origin + ".\n"
                    + "Debe ser un número válido.\n";
                break;
            }
            case 6 : {
                // SQLException UPDATE
                mensaje = "ERROR: SQLException in " + origin + ".\n"
                    + "No se ha podido realizar la actualización.\n";
                break;
            }
            case 7 : {
                // SQLException Resulset
                mensaje = "ERROR: SQLException in " + origin + ".\n"
                    + "Error en posición de lista.\n";
                break;
            }
         
        }
        JOptionPane.showMessageDialog(null, mensaje);
        try {
            bf.write("\n" + mensaje + "\n");
        } catch (IOException ex) {
            System.out.println("Error, podría no haberse escrito en el archivo log");
        }
        
        close();
    }
    
    private static void close() {
        try {
            bf.close();
        } catch (IOException ex) {
            System.out.println("No se ha podido cerrar el buffer");
        }
    }
}
