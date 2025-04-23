package Strings;
//Leer un string1 por parte del usuario, crear una función que ingrese como parámetro string1 y retorne:
//si string1 es de longitud par, retorne otro nuevo string con el primer y último carácter.
//si string1 es de longitud impar, retorne otro nuevo string con el primero, la mitad y
//último carácter.
//imprimir por pantalla el nuevo string.
import java.util.Scanner;
public class RepasoParcial33 {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.println("Ingrese un String: ");
        String str1=kb.nextLine();
      cadenita(str1);
    }
    public static String cadenita(String p1){
     String string;
     int tamañoCadena=p1.length();
     if (tamañoCadena%2==0) {
        System.out.println("EL string es de longitud par");
        
        string= p1.charAt(0)+""+p1.charAt(tamañoCadena-1);
        System.out.println(string);   
    }else{
         System.out.println("EL string es de longitud impar");
      string = p1.charAt(0)+""+p1.charAt(tamañoCadena/2)+""+p1.charAt(tamañoCadena-1);
      System.out.println(string);
     }
     return string;
    }
    
}
