import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class ArchivoManager {
    
    public void crearFactura(String rutaArchivo, String contenidoFactura) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivo))) {
            escritor.write(contenidoFactura);
            System.out.println("Factura creada con éxito: " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al crear la factura: " + e.getMessage());
        }
    }
}