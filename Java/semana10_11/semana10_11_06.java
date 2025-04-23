package semana10_11;
//⦁	Escribe un programa que encuentre el mayor elemento en una matriz (arreglo bidimensional) de enteros.
import java.util.Scanner;
public class semana10_11_06 {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        int max= 0;
        System.out.println("Ingrese las columnas de la matriz");
        int columnas=kb.nextInt();
        System.out.println("Ingrese las filas de la matriz");
        int filas = kb.nextInt();

        int matriz[][]= new int [filas][columnas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Ingrese los valores de la matriz ");
                matriz[i][j]=kb.nextInt();  
            }
        }
        System.out.println("Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
        maximo(matriz);
    }
    public static void maximo(int p1[][]){
        int max=0;
        for (int i = 0; i < p1.length; i++) {
           for (int j = 0; j < p1[0].length; j++) {
            max= Math.max(max, p1[i][j]);
           }  
        }
        System.out.println("El valor maximo del arreglo es: "+ max);

    }
    
}
