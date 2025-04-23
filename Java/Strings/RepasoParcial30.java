package Strings;
//Leer un String desde el teclado por el usuario, imprimir el string al revés (en una sola línea)
import java.util.Scanner;
public class RepasoParcial30{
   public static void main(String[] args) {
   Scanner kb = new Scanner(System.in);

   System.out.println("Ingresar el string: ");
   String cadena = kb.nextLine();

   char cadenita[]=cadena.toCharArray();

   System.out.println("String Invertido: ");

    for (int i = cadena.length()-1; i >= 0; i--) {
    cadenita[i]=cadenita[i];
    System.out.print(cadenita[i]);
    }
   }
}
