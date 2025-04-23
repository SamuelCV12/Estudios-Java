package semana10_11;
//⦁	Crea un programa que calcule la suma de todos los elementos en una matriz de enteros.
import java.util.Scanner;
public class semana10_11_07 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        
        System.out.println("Ingrese las columnas de la matriz: ");
        int columnas = kb.nextInt();
        
        System.out.println("Ingrese las filas de la matriz: ");
        int filas = kb.nextInt();
        
        int matriz[][]= new int[filas][columnas];
        
        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Ingrese los valores de la matriz: ");
                matriz[i][j]=kb.nextInt();
                
            }
        }
        System.out.println("Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        sumaMatriz(matriz);
    }
    public static void sumaMatriz(int p1[][]){
        int suma = 0;
        for (int i = 0; i < p1.length; i++) {
            for (int j = 0; j < p1[0].length; j++) {
                suma = suma + p1[i][j];
                
            }
        }
        System.out.println("La suma de los valores de la matriz es: "+suma);

    }
    
}
