package ciclos;
//Cree un programa que reciba por pantalla el número de
//filas y el número de columnas. Con estos valores diseñe un cuadrado o rectángulo
//de estrellas (asteriscos) e imprímalo utilizando un ciclo.
import java.util.Scanner;
public class RepasoParcial15 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);

        int columnas,filas;
        System.out.println("Ingrese el numero de columnas: ");
        columnas= kb.nextInt();
    
        System.out.println("Ingrese el numero de filas: ");
        filas= kb.nextInt();

        for (int i = 0; i <columnas ; i++) {
            
            for (int j = 0; j <filas ; j++) {
                System.out.print("*");
                
            }
            System.out.println(" ");
        }
        
    }
    
}
