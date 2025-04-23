import java.util.Scanner;
public class Ordenamiento_BubbleSort {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);


        
    }public static int [] bubbleSort(int [] arr){
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 0; j < n -i -1 ; j++) {
                if (arr[j]>arr[j +1]) {
                    swap (arr, j, j+1);
                    swapped = true;
                    
                }
                
            }
            
        }

    }
}
