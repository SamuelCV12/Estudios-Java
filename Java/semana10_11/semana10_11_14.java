package semana10_11;
import java.util.Scanner;

public class semana10_11_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresar cadena: ");
        String cadena = scanner.nextLine();
        
        int Palabras = contarPalabras(cadena);
        
        System.out.println("Numero de palabras: " + Palabras);    
    }
    public static int contarPalabras(String p1) {
        p1 = p1.trim();

        if (p1.isEmpty()) {
            return 0; 
        }
        int contador = 0;
        boolean Palabra = false;
        for (int i = 0; i < p1.length(); i++) {
            char caracter = p1.charAt(i);
            if (caracter == ' ') {
                Palabra = false; 
            } else {
                if (!Palabra) {
                    contador++;
                    Palabra = true; 
                }
            }
        }
        return contador;
    }
}
