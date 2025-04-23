package Matricez;
import java.util.Scanner;
import java.util.Random;
public class EjercicioMatrices {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int n = 0, opcion = 0;
    System.out.println("ingrese las filas y columnas de la matriz:");
    n = kb.nextInt();
    int[][] matriz = new int[n][n];
    while (opcion >= 0) {
      System.out.println("Ingrese una de las 12 opciones");
      System.out.println("1. Llenar toda la matriz por teclado");
      System.out.println("2. Llenar toda la matriz con numeros aleatorios");
      System.out.println("3. Imprimir matriz");
      System.out.println("4. Resultado de la suma de una fila pedida por el usuario");
      System.out.println("5. Resultado de la suma de una columna pedida por el usuario");
      System.out.println("6. Imprimir la diagonal principal");
      System.out.println("7. Resultado de la suma de la diagonal");
      System.out.println("8. Suma de todos los valores de la matriz");
      System.out.println("9. Valor promedio de todos los valores de la matriz");
      System.out.println("10. Encontrar el valor maximo");
      System.out.println("11. Encontrar el valor minimo");
      System.out.println("12. Sumar matriz");
      System.out.println("-1. Salir del menu");
      opcion = kb.nextInt();
      if (opcion == 1) {
        matrizUsuario(matriz, n);
      }
      if(opcion == 2) {
        matrizAleatoria(matriz, n);
      }
      if (opcion == 3) {
        imprimirMatriz(matriz);
      }
      if (opcion == 4 ) {
        imprimirFila(matriz);
      }
      if(opcion == 5) {
        imprimirColumna(matriz);
      }
      if(opcion == 6) {
        imprimirDiagonal(matriz);
      }
      if(opcion == 7) {
        imprimirSumaDiagonal(matriz);
      }
      if(opcion == 8) {
        imprimirSumaMatriz(matriz);
      }
      if(opcion == 9) {
        imprimirPromedioMatriz(matriz);
      }
      if(opcion == 10) {
        imprimirValorMaximo(matriz);
      }
      if(opcion == 11) {
        imprimirValorMinimo(matriz);
      }
      if(opcion == 12) {
        sumaMatrices(matriz, n);
      }
      if(opcion == -1) {
        System.out.println("Hasta luego.");
        opcion = -1;
        break;
      }
    }
  }

  public static void matrizUsuario(int[][] matriz, int n) { // OPCION 1
    Scanner kb = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
      System.out.println("ingrese los numeros de la matriz");
      int numero = kb.nextInt();
      matriz[i][j] = numero;
      }
    }
    System.out.println(" ");
    System.out.println("Matriz completa:");
    for (int j=0;j<n;j++) {
      for (int i=0;i<n;i++) {
          System.out.print(matriz[j][i]+" ");
        }
        System.out.println("");
    }
  }

  public static void matrizAleatoria(int [][] matriz, int n) { // OPCION 2
    Random r = new Random();
    for (int j=0;j<n;j++) {
      for (int i=0;i<n;i++) {
        matriz[j][i]=r.nextInt(1,100); // <-- llena la matriz con numeros aleatorios del 1 al 100
      }
    }
    System.out.println(" ");
    System.out.println("Matriz completa aleatoria:");
    for (int j=0;j<n;j++) {
      for (int i=0;i<n;i++) {
          System.out.print(matriz[j][i]+" ");
        }
        System.out.println("");
    }
  }

  public static void imprimirMatriz(int[][] matriz) { // OPCION 3
    int n = matriz.length;
    int m = matriz[0].length;
    System.out.println("Matriz impresa:");
    for (int j=0;j<n;j++) {
      for (int i=0;i<m;i++) {
          System.out.print(matriz[j][i]+" ");
        }
        System.out.println("");
    }
  }
  public static void imprimirFila(int[][] matriz) { // OPCION 4
    Scanner kb = new Scanner (System.in);
    System.out.println("ingrese la fila que se desea imprimir:");
    int n = kb.nextInt();
    int m = matriz[n].length;
    int suma =0;
    System.out.println("Fila impresa:");
      for (int j = 0; j < m; j++) {
        System.out.print(matriz[n][j] + " ");
        suma=suma+matriz[n][j];
      }   
    System.out.println("");
    System.out.println("La suma de la fila es");
    System.out.println(suma);
    System.out.println("");
  }

  public static void imprimirColumna(int[][] matriz) { // OPCION 5
    Scanner kb = new Scanner (System.in);
    System.out.println("ingrese la columna que se desea imprimir:");
    int n = kb.nextInt();
    int m = matriz[n].length;
    int suma = 0;
    System.out.println("Columna impresa:");
      for (int j = 0; j < m; j++) {
        System.out.println(matriz[j][n]);
        suma = suma + matriz[j][n];
      }
    System.out.println("La suma de la columna es:");
    System.out.println("");
    System.out.println(suma);
    System.out.println("");
  }


  public static void imprimirDiagonal(int[][] matriz) { // OPCION 6
    System.out.println("Diagonal principal:");
    int m = matriz.length;
    for (int j = 0; j < m; j++) {
      System.out.println(matriz[j][j]);
    }
    System.out.println("");
  }


  public static void imprimirSumaDiagonal(int[][] matriz) { // OPCION 7
    System.out.println("Diagonal principal:");
    int m = matriz.length;
    int suma = 0;
    for (int j = 0; j < m; j++) {
      System.out.println(matriz[j][j]);
    }
    System.out.println("");
    System.out.println("La suma de la diagonal es:");
    for (int j = 0; j < m; j++) {
      suma = suma + matriz[j][j];
    }
    System.out.println(suma);
  }


  public static void imprimirSumaMatriz(int[][] matriz) { // OPCION 8
    int n = matriz.length;
    int m = matriz[0].length;
    int suma = 0;
    System.out.println("Matriz impresa:");
    for (int j=0;j<n;j++) {
      for (int i=0;i<m;i++) {
        suma = suma + matriz[j][i];
      }
      System.out.println("");
    }
      System.out.println("La suma de la matriz es:");
      System.out.println(suma);
  }


  public static void imprimirPromedioMatriz(int[][] matriz) { // OPCION 9
    int n = matriz.length;
    int m = matriz[0].length;
    int conteo = n*m;
    int suma = 0;
    System.out.println("Matriz impresa:");
    for (int j=0;j<n;j++) {
      for (int i=0;i<m;i++) {
        suma = suma + matriz[j][i];
      }
    }
      System.out.println("La suma de la matriz es:");
      System.out.println(suma);
      System.out.println("El promedio de la matriz es:");
      System.out.println(suma/conteo);
  }


  public static void imprimirValorMaximo(int[][] matriz) { // OPCION 10
    int n = matriz.length;
    int m = matriz[0].length;
    int max = matriz[0][0];
    System.out.println("Matriz impresa:");
    for (int j=0;j<n;j++) {
      for (int i=0;i<m;i++) {
          max = Math.max(max, matriz[j][i]);
      }
    }
    System.out.println(max);
  }


  public static void imprimirValorMinimo(int[][] matriz) { // OPCION 11
    int n = matriz.length;
    int m = matriz[0].length;
    int min = matriz[0][0];
    System.out.println("Matriz impresa:");
    for (int j=0;j<n;j++) {
      for (int i=0;i<m;i++) {
          min = Math.min(min, matriz[j][i]);
      }
    }
    System.out.println(min);
  }

  
  public static void sumaMatrices(int[][] matriz, int n) { // OPCION 12
    int[][] matriz2 = new int[n][n];
    int[][] matriz3 = new int[n][n];
    Scanner kb = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
      System.out.println("ingrese los numeros de la matriz");
      int numero = kb.nextInt();
      matriz2[i][j] = numero;
      }
    }
    System.out.println("");
    System.out.println("Matriz 2 completa:");
    for (int j=0;j<n;j++) {
      for (int i=0;i<n;i++) {
          System.out.print(matriz2[j][i]+" ");
        }
        System.out.println("");
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
          matriz3[j][i] = matriz[j][i] + matriz2[j][i];
      }
    }
    System.out.println("");
    System.out.println("Matriz 3 a partir de la suma de la matriz 1 y 2");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(matriz3[i][j] + " ");
      }
      System.out.println("");
    }
  }
}