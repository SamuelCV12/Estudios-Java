package Arreglos;
//Cree un arreglo de n enteros (arreglo1) con datos generados a partir de cualquier
//serie de su preferencia (aproveche la variable del índice i). A partir de este arreglo1,
//crea otro arreglo (arreglo2) de igual tamaño (n) a partir del arreglo1 pero con los datos invertidos.
//Imprima ambos arreglos.
import java.util.Scanner;
public class RepasoParcial23 {
    public static void main(String[] args) {

        Scanner kb= new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo: ");
        int n=kb.nextInt();

        int arreglo1[]= new int[n];

        System.out.println("Arreglo Original: ");

        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] = i*2;
            
            System.out.print(arreglo1[i]+" ");
            
        }
        int arreglo2[]=new int[n];
        System.out.println();
        System.out.println("Arreglo invertido: ");
        for (int i = arreglo1.length-1; i >=0; i--) {
            arreglo2[i]=arreglo1[i];
            System.out.print(arreglo2[i]+ " ");
            
        }
       
    }
    
}
