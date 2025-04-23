import java.util.Scanner;
public class Ordenamiento {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo: ");
        int x = kb.nextInt();

        int arreglo[]= new int [x];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese los numeros del arreglo: ");
            arreglo[i]= kb.nextInt();  
        }
        System.out.println("EL arreglo es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]+" ");
        }

        
    }public static int [] selectionSort(int []arr){
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j]<arr[minPos]) {
                    minPos=j;
                    
                }
                
            }
            swap(arr,minPos,i);
            
        }
        return arr;
    }
}
