package semana10_11;
//⦁	Haz un programa que encuentre el número más pequeño en un arreglo de números decimales.
import java.util.Scanner;
public class semana10_11_04 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo: ");
        int n= kb.nextInt();
        
        double arreglo []= new double[n];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese los numeros del arreglo: ");
            arreglo[i]= kb.nextDouble();
        }
        encontrarMenor(arreglo);
    }
    public static void encontrarMenor(double[] array) {
        double menor = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < menor) {
                menor = array[i];
            }
        }
        System.out.println("El numero menor es: " + menor);
    }
}
