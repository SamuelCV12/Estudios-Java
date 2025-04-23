package semana10_11;
//⦁	Escribe un programa que invierta un arreglo de caracteres (strings).
import java.util.Scanner;
public class semana10_11_03 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);

        System.out.println("Ingrese tamaño del arreglo de caracteres: ");
        int n= kb.nextInt();

        String arregloString[]= new String[n];

        for (int i = 0; i < arregloString.length; i++) {
            System.out.println("Ingrese las palabras del arreglo: ");
            arregloString[i]=kb.next();
        }
        System.out.println("Arreglo Original: ");
        for (int i = 0; i < arregloString.length; i++) {
            System.out.print(arregloString[i]+" ");
            
        }
        System.out.println();
        String arregloInvertido[]=new String[n];
        for (int i =n-1; i >=0; i--) {
            arregloInvertido[i]= arregloString[i];  
        }
        System.out.println("Arreglo Invertido: ");
        for (int i = n-1; i >=0; i--) {
            System.out.print(arregloInvertido[i]+" ");
        }
    }
    
}
