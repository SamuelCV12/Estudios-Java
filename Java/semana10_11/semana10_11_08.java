package semana10_11;

import java.util.Scanner;
public class semana10_11_08 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Ingresar filas y columnas de la matriz: ");
        int n = kb.nextInt();
        int matriz[][]= new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                System.out.println("Ingrese los elementos de la matriz: ");
                matriz[i][j]= kb.nextInt();   
            }
        }
        System.out.println("Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
                
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Diagonal de la matriz: ");
        
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[j][j]+" ");
                
            }
            
        System.out.println();
        
    }
    
}
