package Arreglos;
//Cree un arreglo de n enteros (arreglo1). Cree un algoritmo y programa en Java que
//invierta las posiciones del arreglo1 SIN utilizar otro arreglo temporal. (puede utilizar variables temporales).
//Los datos del arreglo1 se llenarán con cualquier serie de su preferencia
//aprovechando el índice i.
import java.util.Scanner;
public class RepasoParcial26 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        int temp;
        System.out.println("Ingrese el tamaño del arreglo: ");
        int n = kb.nextInt();

        int arreglo[]= new int[n];

        System.out.println("Arreglo original");
        for (int i = 0; i < arreglo.length; i++) {
        
            arreglo[i]=i*1;
            System.out.print(arreglo[i]+" ");
        }
        System.out.println();
        System.out.println("Arreglo invertido");
        for (int i =arreglo.length-1; i >= 0; i--) {
            temp= arreglo[i];
            System.out.print(temp+" 5");
        }
    }
}
