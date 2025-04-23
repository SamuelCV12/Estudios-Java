import java.util.Scanner;
public class BusquedaBinaria {
    public static void main(String[] args) {

        Scanner kb= new Scanner(System.in);
        System.out.println("Ingresar el tamaño del arreglo: ");
        int n = kb.nextInt();
        int [] arreglo = new int [n];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingresar los numeros del arreglo:");
            arreglo[i] = kb.nextInt();
        }
        System.out.println("El arreglo es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]+ " ");
        }
        System.out.println();
        System.out.println("Ingresa el numero que deseas buscar en el arreglo: ");
        int numBus= kb.nextInt();

        binarySearch(arreglo, numBus);
        
    }
    public static int binarySearch(int[ ] arr, int target){
        int left = 0;
        int right = arr.length-1;

        while (left<= right) {
            int mid = (left + right)/2;
            if (arr[mid]== target) {
                System.out.println("El numero se encuentra en el indice: "+mid+" del arreglo");
                return mid;
            }
            if (arr[mid]<target) {
                left = mid +1;
                System.out.println("El numero se encuentra en el indice: "+left+" del arreglo");
               
            }else{
                right = mid -1;
                
            }  
        }
        return-1;
    }
}
