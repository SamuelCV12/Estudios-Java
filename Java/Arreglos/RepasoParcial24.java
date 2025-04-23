package Arreglos;
//Pídale al usuario un tamaño de un arreglo por pantalla (int n)
//Cree un arreglo llamado arr_int del tamaño n
//Pídale al usuario tantos números enteros como el tamaño del arreglo arr_int n, y
//asígnele cada uno de esos datos leídos a las posiciones del arreglo arr_int.
//Invierta el arreglo en otro arreglo2.
//imprima por pantalla cada uno de los arreglos.
import java.util.Scanner;
public class RepasoParcial24 {
    public static void main(String[] args) {
       Scanner kb= new Scanner(System.in);

       System.out.println("Ingrese el tamaño del arreglo: ");
       int n = kb.nextInt();

       int arr_int[] = new int[n];

       System.out.println("Arreglo Original: ");

       for (int i = 0; i < arr_int.length; i++) {

        System.out.println("Ingresar numero");
          arr_int[i]= kb.nextInt();
          System.out.println("el numero: "+arr_int[i]+" se encuentra en la posicion: "+i+" del arreglo");
       }

       System.out.println();
       System.out.println("Arreglo invertido: ");

       int arr2[]= new int[n];

       for (int i = arr_int.length-1; i >= 0; i--) {
        arr2[i]= arr_int[i];
        System.out.print(arr2[i]+" ");      
       }

    }
    
}
