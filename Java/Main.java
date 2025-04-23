import java.util.Random;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int value, found, n;
        System.out.println("Digite el tamaño del arreglo:");
        n = kb.nextInt();
        System.out.println("Operaciones de búsqueda y ordenamiento");
        // definición y creación de arreglo:
        int[] arreglo = new int[n];
        int[] arreglo2 = new int[n];
        // llenar arreglo con serie aritmetica:
        llenarArregloAleatorio(arreglo);
        copiarArreglo(arreglo,arreglo2);
        // imprimit arreglo:
        System.out.println("Arreglo DESORDENADO:");
        //imprimirArreglo(arreglo);
        System.out.println("Digite un elemento a buscar:");
        value = kb.nextInt();
        System.out.println("Buscandolo en arreglo desordenado...");
        found = buscarEnArregloSecuencial(arreglo, value);
        System.out.println("Encontrado en indice: " + found);
        // ordenar Arreglo estrategia Secuencial:
        ordenarArregloSecuencial(arreglo);
        bubbleSort(arreglo2);
        // imprimir arreglo:
        System.out.println("Arreglo ORDENADO:");
        //imprimirArreglo(arreglo);
        System.out.println("Buscandolo en arreglo ordenado...");
        found = buscarEnArregloBinaria(arreglo, value);
        System.out.println("Encontrado en indice: " + found);
        imprimirArreglo(arreglo);
    }
 
    public static void llenarArregloAleatorio(int[] arr) {
        // LLENAR EL ARREGLO con números aleatorios
        Random r = new Random(100);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt(10000);
        }
    }
 
    public static void bubbleSort(int[] arreglo) {
        boolean intercambiado;
        int nro_pasos = 0;
        int n = arreglo.length;
        do {
            intercambiado = false;
            for (int i = 0; i < n - 1; i++) {
                nro_pasos++;
                if (arreglo[i] > arreglo[i + 1]) {
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = temp;
                    intercambiado = true;
                }
            }
            n--;
        } while (intercambiado);
        System.out.println("nro_pasos para ordenar por BubbleSort = " + nro_pasos);
    }
 
    public static void ordenarArregloSecuencial(int[] arr) {
        // ORDENAR ARREGLO estrategia: SECUENCIAL
        int n = arr.length;
        int nro_pasos = 0;
        int tmp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
                nro_pasos++;
            }
        }
        System.out.println("nro_pasos para ordenar por Secuencial = " + nro_pasos);
    }
 
    public static void imprimirArreglo(int[] arr) {
        // IMPRIMIR UN ARREGLO
        int n = arr.length;
        System.out.print("{");
        for (int i = 0; i < n; i++) {
            // System.out.println("arr["+i+"]="+arr[i]);
            System.out.print(arr[i] + ",");
        }
        System.out.println("}");
    }
 
    public static int buscarEnArregloSecuencial(int[] arr, int v) {
        // BUSCAR EN UN ARREGLO
        // arr como parámetro por REFERENCIA
        int nro_pasos = 1;
        int n = arr.length;
        for (int i = 0; i < n; i++, nro_pasos++) {
            if (arr[i] == v) {
                System.out.println("nro_pasos=" + nro_pasos);
                return i;
            }
        }
        System.out.println("nro_pasos=" + nro_pasos);
        return -1;
    }
    public static int buscarEnArregloBinaria(int[] arr, int v) {
        // BUSCAR EN UN ARREGLO
        // arr como parámetro por REFERENCIA
        int left = 0;
        int right = arr.length - 1;
        int nro_pasos = 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            // System.out.println("left="+left+" middle="+middle+" right="+right);
            if (arr[middle] == v) {
                System.out.println("nro_pasos=" + nro_pasos);
                return middle;
            }
            if (arr[middle] < v) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
            nro_pasos++;
        }
        System.out.println("nro_pasos=" + nro_pasos);
        return -1;
    }
    public static void copiarArreglo(int[] arr1, int[] arr2) {
        for (int i=0;i<arr1.length;i++) {
            arr2[i] = arr1[i];
        }
    }
 
 
}
