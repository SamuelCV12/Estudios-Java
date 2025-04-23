package semana10_11;

import java.util.Scanner;

public class semana10_11_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresar string: ");
        String cadena = scanner.nextLine();
        
        if (Palindromo(cadena)) {
            System.out.println("El texto es un palíndromo.");
        } else {
            System.out.println("El texto no es un palíndromo.");
        }
    }
    public static boolean Palindromo(String p1) {
        p1 = p1.toLowerCase();
        
        char[] caracteres = p1.toCharArray();
        
        int principio = 0;
        int fin = caracteres.length - 1;
        
        while (principio < fin) {
            if (caracteres[principio] != caracteres[fin]) {
                return false; 
            }
            principio++;
            fin--;
        }
        
        return true; 
    }
}

