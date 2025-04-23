package Strings;
//Leer un String desde teclado, crear otro string, del mismo tamaño del string leido,
//pero al revés, imprimir el string creado.
import java.util.Scanner;
public class RepasoParcial31 {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);

        System.out.println("Ingrese el string: ");
        String cadena= kb.nextLine();

        char cadena2 []=cadena.toCharArray();
        System.out.println("String Invertido: ");

        for (int i = cadena.length()-1; i >=0; i--) {
           
            String str2 = new String(cadena2);
            System.out.print(str2);
        }
    }
}
