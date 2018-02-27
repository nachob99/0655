import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class AnalizadorAccesosAServidor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AnalizadorAccesosAServidor
{
    // ArrayList donde almacenamos los accesos
    private ArrayList<Acceso> accesos;

    /**
     * Constructor for objects of class AnalizadorAccesosAServidor
     */
    public AnalizadorAccesosAServidor()
    {
        // initialise instance variables
        accesos = new ArrayList<>();
    }
    /**
     * Metodo con el cual leemos los archivos
     */
    public void analizarArchivoDeLog(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();               
                String[] elementos = linea.split(" ");
                Acceso accesoActual = new Acceso(Integer.parseInt(elementos[0]), 
                        Integer.parseInt(elementos[1]), 
                        Integer.parseInt(elementos[2]),
                        Integer.parseInt(elementos[3]), 
                        Integer.parseInt(elementos[4]));               

                accesos.add(accesoActual);
            }
            sc.close();
        }
        catch (Exception e) {
            System.out.println("No se pudo leer el archivo");
        }

    }
    
}
