package Arreglos;
//Realice un algoritmo y programa en java, que lea n (n es par) del usuario como
//tamaño del arreglo1, será de enteros, y lo llenará con datos de alguna serie de su
//preferencia aprovechando el índice i. Una vez tengo definido, creado y con datos elarreglo1:
//* Defina y cree otro arreglo2 de tamaño n/2 de tipo float
//* Cada valor del arreglo2 en la posición j, será el promedio de dos consecutivos del arreglo1.
import java.util.Scanner;
public class RepasoParcial25 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo (debe ser un numero par)");
        int n = kb.nextInt();

        if ((n%2==0)&&(n>0)) {
            int arreglo1[]= new int[n];

            for (int i = 0; i < arreglo1.length; i++) {
                arreglo1[i]=i*1;
                System.out.print(arreglo1[i]+" ");    
            }
            System.out.println();
            float arreglo2[]= new float[n/2];
            for (int i =0 ; i < arreglo2.length; i++) {
                arreglo2[i]=(arreglo1[i*2]+arreglo1[i*2+1])/2.0f;
                System.out.println(arreglo2[i]+" ");
            }
            
        }else{
            System.out.println("El tamaño del arreglo no puede ser impar");
            System.err.println("Fin del programa...");
        }
        
    }
    
}
