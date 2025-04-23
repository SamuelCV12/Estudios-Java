package semana10_11;

import java.util.Scanner;
public class semana10_11_10 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        int sumacolumnas, sumafilas;
        sumafilas=0;
        sumacolumnas=0;
        System.out.println("Ingrese las filas y las columnas de la matriz: ");
        int n = kb.nextInt();

        int matriz[][]= new int [n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Ingrese los numeros de la matriz: ");
                matriz[i][j]= kb.nextInt();
            } 
        }
        System.out.println();
        System.out.println("La matriz es: ");
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");     
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Las filas de la matriz son: ");
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
                sumafilas =sumafilas + matriz[i][j];
            }
            System.out.println(": La suma de la fila: "+i+" Es: "+ sumafilas);
            sumafilas = 0;
        }
        System.out.println();
        System.out.println("Las columnas de la matriz son: ");
        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[j][i]+" ");
                sumacolumnas= sumacolumnas + matriz[j][i] ;
            }
            System.out.println(": La suma de la columna: "+i+" Es: "+sumacolumnas);
            sumacolumnas=0;
        }
    }
    
}
