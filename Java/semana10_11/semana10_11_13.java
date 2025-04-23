package semana10_11;
//⦁	Haz un programa que elimine los caracteres duplicados de un string.
import java.util.Scanner;

public class semana10_11_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar el string: ");
        String cadena = scanner.nextLine();

        String resultado = eliminarCaracter(cadena);
        System.out.println("String sin duplicados: " );
        System.out.println(resultado);
    }
    public static String eliminarCaracter(String p1) {
        String resultado = ""; 
        for (int i = 0; i < p1.length(); i++) {
            char caracter = p1.charAt(i);
            
            if (!contieneCaracter(resultado, caracter)) {
                resultado = resultado +caracter;
            }
        }
        return resultado;
    }
    public static boolean contieneCaracter(String p1, char p2) {
        for (int i = 0; i < p1.length(); i++) {
            if (p1.charAt(i) == p2) {
                return true; 
            }
        }
        return false; 
    }
}

