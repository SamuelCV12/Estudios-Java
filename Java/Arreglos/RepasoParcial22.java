package Arreglos;
//Leer el tamaño del arreglo por el usuario (variable x).
//Defina un nuevo arreglo de enteros llamado arr_int, de tamaño x.
//Pídale al usuario tantos números enteros como el tamaño del arreglo arr_int creado,
//y asígnele el doble de cada uno de esos datos recibidos a las posiciones del arreglo arr_int.
//Realice un ciclo para imprimir todas las variables del arreglo multiplicados por tres por pantalla.
import java.util.Scanner;
public class RepasoParcial22 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);

        int x;

        System.out.println("Ingresar el tamaño del arreglo: ");
        x= kb.nextInt();
        
        int arr_int[] = new int [x];
        
        for (int i = 0; i < arr_int.length; i++) {
            System.out.println("Ingrese el numero en la posicion "+i);
             arr_int[i]= kb.nextInt();

             arr_int[i]= arr_int[i] *2;  
        }
        for (int i = 0; i < arr_int.length; i++) {
            arr_int[i]=arr_int[i]*3;
            System.out.println("la variable en la posicion "+i+" Es: "+arr_int[i]);
        }
    }
    
}
