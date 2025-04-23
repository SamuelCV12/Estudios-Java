package semana10_11;

import java.util.Scanner;
public class semana10_11_09 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);

        System.out.println("Ingrese el numero de filas y columnas que quiere que tengan las matrices");
        int num= kb.nextInt();

        int matriz[][]=new int [num][num];
        int matriz2 [][]=new int[num][num];
        int mulmatriz [][]= new int[num][num];


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Ingresar numeros primera matriz: ");
                matriz[i][j]= kb.nextInt();
                
            }
        }
        System.out.println("primera matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
                
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                System.out.println("Ingresar numeros segunda matriz: ");
                matriz2[i][j]=kb.nextInt();   
            }
        }
        System.out.println("segunda matriz: ");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < mulmatriz.length; i++) {
            for (int j = 0; j < mulmatriz[0].length; j++) {
                mulmatriz[i][j]=matriz[i][j]*matriz2[i][j];
            }
            
        }
        System.out.println("La multiplicacion de las dos matricez es: ");
        for (int i = 0; i < mulmatriz.length; i++) {
            for (int j = 0; j < mulmatriz.length; j++) {
                System.out.print(mulmatriz[i][j]+" ");
            }
            System.out.println();
            
        }   
    }
}
