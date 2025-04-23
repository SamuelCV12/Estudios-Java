package semana10_11;
//⦁	Crea un programa que calcule la suma de todos los elementos en un arreglo de enteros.
import java.util.Scanner;
public class semana10_11_02 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo:");
        int n= kb.nextInt();
        int suma =0;
        int arreglo[]= new int [n];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese los numeros del arreglo: ");
            arreglo[i]= kb.nextInt();
            suma = suma + arreglo[i];
        }
        System.out.println("La suma de los valores del arreglo es: "+suma);
    }  
}
