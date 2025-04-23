package Strings;
//Leer un string1 y un string2, determinar si string2 es un substring de string1.
import java.util.Scanner;
public class RepasoParcial32 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);

        System.out.println("Ingrese el string numero 1: ");
        String str1= kb.nextLine();

        System.out.println("Ingrese el string 2: ");
        String str2 =kb.nextLine();

        if (str1.toLowerCase().contains(str2)) {
            System.out.println();
            System.out.println("La cadena "+str2+ " es substring de la cadena: "+str1);
            System.out.println();
        }else{
            System.out.println("La cadena "+str2+" no es substring de la cadena: "+str1);
        }  
    }   
}
