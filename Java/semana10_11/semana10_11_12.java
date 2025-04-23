package semana10_11;
//⦁Crea un programa que invierta un string.
import java.util.Scanner;
public class semana10_11_12 {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);

        System.out.println("Ingrese el String que deseas invertir");
        String cadena = kb.nextLine();

        char arr_cadena[]= cadena.toCharArray();

        System.out.println("La cadena invertida es: ");

        for (int i = cadena.length()-1; i >= 0; i--) {
            arr_cadena[i] = arr_cadena[i];
         System.out.print(arr_cadena[i]);
        }
    }
}
