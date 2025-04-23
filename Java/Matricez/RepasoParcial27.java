package Matricez;
import java.util.Scanner;
import java.util.Random;
public class RepasoParcial27 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        System.out.println("ingrese el tamaño de la matriz");
        int n=kb.nextInt();
        int matrizUsuario[][]= new int[n][n];

    System.out.println("Ingresa el numero 0 para entrar al menu: ");
    int ini= kb.nextInt();
        while (ini==0) {

            System.out.println("Ingrese el numero 1 para llenar matriz con los datos que el usuario ingrese");
            System.out.println("Ingrese el numero 2 para llenar matriz con numeros aleatorios");
            System.out.println("Ingrese el numero 3 para imprimir la matriz");
            System.out.println("Ingrese el numero 4 para obtener el resultado de la suma de una fila");
            System.out.println("Ingrese el numero 5 para obtener el resultado de la suma de una columna");
            System.out.println("Ingrese el numero 6 para imprimir la diagonal principal de la matriz");
            System.out.println("Ingrese el numero 7 para obtener el resultado de la suma de la diagonal principal");
            System.out.println("Ingrese el numero 8 para sumar todos los valores de la matriz");
            System.out.println("Ingrese el numero 9 para obtener el valor promedio de todos los valores de la matriz");
            System.out.println("Ingrese el numero 10 para encontrar el valor maximo dentro de la matriz");
            System.out.println("Ingrese el numero 11 para encontrar el valor minimo dentro de la matriz");
            System.out.println("Ingrese el numero 12 para sumar dos matrices");
            System.out.println("Ingrese el numero -4 para salir del ciclo");
            int opc= kb.nextInt();

            if (opc==1) {
                LlenarMatrizUsuario(matrizUsuario);
            }else if (opc==2) {
                MatrizAleatoria(n);
            }else if (opc==3) {
                ImprimirMatriz(matrizUsuario);   
            }else if (opc==4) {
                SumaFila(matrizUsuario);
            }else if (opc==5) {
                SumaColumna(matrizUsuario);
            }else if (opc==6) {
                ImprimirDiagonal(matrizUsuario);   
            }else if (opc==7) {
                sumaDiagonal(matrizUsuario);
            }else if (opc==8) {
                sumaTodaMatriz(matrizUsuario);
            }else if (opc==9) {
                valorPromedio(matrizUsuario);
            }else if (opc==10) {
                valormax(matrizUsuario);
            }else if (opc==11) {
                valorMin(matrizUsuario);
            }else if (opc==12) {
                sumaMatrices(matrizUsuario);     
            }else if (opc==-4) {
                System.out.println("Saliendo del menu...");
                break;
                
            }else{
                System.out.println("Opcion no valida, Ingrese una opcion valida");
            }  
        }
        
    }
    public static void LlenarMatrizUsuario(int p1[][]){    //opcion 1
        Scanner kb =new Scanner(System.in);

        for (int i = 0; i < p1.length; i++) {
            for (int j = 0; j < p1.length; j++) {
                System.out.println("Ingrese los numeros de la matriz");
                p1[i][j] = kb.nextInt();   
            }     
        }
    }public static void MatrizAleatoria(int p1){ //opcion 2
        Random r = new Random();
        int MatrizAleatoria[][]= new int[p1][p1];

        for (int i = 0; i < MatrizAleatoria.length; i++) {
            for (int j = 0; j < MatrizAleatoria.length; j++) {
            MatrizAleatoria[i][j]=r.nextInt(1,100);       
            }
            
        }
        for (int i = 0; i < MatrizAleatoria.length; i++) { 
            System.out.println();
            for (int j = 0; j < MatrizAleatoria.length; j++) {
                System.out.print(MatrizAleatoria[i][j]+" ");
            }
            System.out.println();
            
        }
    }
    public static void ImprimirMatriz(int p1 [][]){ //opcion 3
        System.out.println();
        for (int i = 0; i < p1.length; i++) {
            for (int j = 0; j <p1.length; j++) {
                System.out.print(p1[i][j]+" ");     
            }
            System.out.println(" ");
        }
    }
    public static void SumaFila(int p1[][]){ //opcion 4 
        Scanner kb= new Scanner(System.in);
        int suma=0;
        System.out.println("Ingrese la fila de la matriz que desea calcular su suma: ");
        int fila = kb.nextInt();
        
        System.out.println("La fila seleccionada es: ");
        for (int i = 0; i < p1.length; i++) {
        System.out.print(p1[fila][i]+" ");
        suma=suma+p1[fila][i];
        }
        System.out.println();
        System.out.println("la suma de la fila es: "+ suma);
    }
    public static void SumaColumna(int p1[][]){ //opcion 5
        Scanner kb = new Scanner(System.in);
        int suma=0;
        System.out.println("Ingrese la columna de la matriz que desea sumar: ");
        int columna =kb.nextInt();

        System.out.println("La columna seleccionada es: ");
        for (int i = 0; i < p1.length; i++) {
            System.out.println(p1[i][columna]);
            suma=suma +p1[i][columna];       
        }
        System.out.println("El resultado de la suma de la columna seleccionada es: "+suma);
    }
    public static void ImprimirDiagonal(int p1[][]){ //opcion 6
        System.out.println("Diagonal Principal de la Matriz");
        for (int i = 0; i < p1.length; i++) {
            int diagonal=p1[i][i];
            System.out.print(diagonal+" ");
        }
        System.out.println();
    }
    public static void sumaDiagonal(int p1[][]){ //opcion 7
        System.out.println("la diagonal es: ");
        int suma=0;
        for (int i = 0; i < p1.length; i++) {
            int diagonal=p1[i][i];
            System.out.print(diagonal+" ");
            suma= suma +p1[i][i];
        }
        System.out.println();
        System.out.println("la suma de la diadonal es: "+suma);
    }
    public static void sumaTodaMatriz(int p1[][]){//opcion 8
        int suma=0;
      for (int i = 0; i < p1.length; i++) {
        for (int j = 0; j < p1.length; j++) {
        suma = suma+p1[i][j]; 
        }
      }
      System.out.println("La suma de la matriz es: "+suma);
    }
    public static void valorPromedio(int p1[][]){
    int suma=0;
    int promedio=0;
    for (int i = 0; i < p1.length; i++) {
        for (int j = 0; j < p1.length; j++) {
           suma=suma + p1[i][j];

        }
    }
    promedio=suma/(p1.length*p1[0].length);
    System.out.println("La suma de la matriz es: "+suma);
    System.out.println();
    System.out.println("El promedio de la matriz es: "+promedio);
    }
    public static void valormax(int p1[][]){
        int max=p1[0][0];
        for (int i = 0; i < p1.length; i++) {
            for (int j = 0; j < p1.length; j++) {
                max= Math.max(max, p1[i][j]);
            }
        }
        System.out.println("El valor maximo de la matriz es: "+max);
    }
    public static void valorMin(int p1[][]){
        int min=p1[0][0];
        for (int i = 0; i < p1.length; i++) {
            for (int j = 0; j < p1.length; j++) {
                min= Math.min(min, p1[i][j]);
            }
            
        }
        System.out.println("El valor minimo de la matriz es: "+min);
    }
    public static void sumaMatrices(int p1[][]){
        Scanner kb=new Scanner(System.in);
        System.out.println("segunda matriz: ");

        int p2[][]=new int [p1.length][p1[0].length];
        
        for (int i = 0; i < p1.length; i++) {
            for (int j = 0; j < p1.length; j++) {
                
                System.out.println("Ingrese los numeros de la matriz: ");
                p2[i][j] = kb.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < p1.length; i++) {
            for (int j = 0; j < p1.length; j++) {
                System.out.print(p2[i][j]+" ");
            }
           System.out.println(); 
        }
        int sumaMatrices[][]=new int[p1.length][p1[0].length];

        for (int i = 0; i< p1.length; i++) {
           for (int j = 0; j < sumaMatrices.length; j++) {
            sumaMatrices[i][j]=p1[i][j]+p2[i][j];
           }
            
        }
        System.out.println();
        for (int i = 0; i < sumaMatrices.length; i++) {
            for (int j = 0; j < sumaMatrices.length; j++) {
                System.out.print(sumaMatrices[i][j]+" ");
            }
            System.out.println();
        }
    }

}
