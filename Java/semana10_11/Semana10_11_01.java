package semana10_11;
//⦁	Escribe un programa que encuentre el elemento más grande en un arreglo de enteros.
import java.util.Scanner;
public class Semana10_11_01 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo: ");
        int n= kb.nextInt();
        int max =0;
        int arreglo []= new int[n];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese los numeros del arreglo: ");
             arreglo[i]= kb.nextInt();
            
        }
        for (int i = 0; i < arreglo.length; i++) {
            max= Math.max(max, arreglo[i]);
        }
        System.out.println("El valor maximo del arreglo es: "+max);
    }
   
}
