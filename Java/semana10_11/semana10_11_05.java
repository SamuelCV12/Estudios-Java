package semana10_11;
//⦁	Crea un programa que encuentre la suma de los números pares en un arreglo de enteros.
import java.util.Scanner;
public class semana10_11_05 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int suma=0;
        System.out.println("Ingrese el tamaño del arreglo: ");
        int n = kb.nextInt();

        int arreglo []= new int [n];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese los valores del arreglo: ");
            arreglo[i]=kb.nextInt();
            if (arreglo[i]%2==0) {
                suma= suma+ arreglo[i];  
            } 
        }
        System.out.println("La suma de los numeros pares es: "+suma);
    }
    
}
