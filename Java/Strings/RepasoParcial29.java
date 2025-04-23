package Strings;
//El usuario ingresará un string por teclado (leer un string), y luego leerá un caracter por
//teclado y contará el número de veces que se haya ese caracter en el string leído por el usuario.
import java.util.Scanner;
public class RepasoParcial29 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        char letra;
        int contador=0;
        System.out.println("Ingrese el string: ");
        String cadena=kb.nextLine();

        System.out.println("Ingrese el caracter que desea buscar en el string: ");
         letra = kb.next().charAt(0);

         for (int i = 0; i < cadena.length(); i++) {
            int caracter=cadena.charAt(i);
            if (letra==caracter) {
                contador ++;
            }else{
            }   
         }
         System.out.println("el caracter: "+letra+" se encuentra: "+contador+" veces en el string");
    }   
}
