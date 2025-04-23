package Secuencias;
// Cree un programa que:
//- Le pida al usuario por pantalla un número (float) (valor1).
//- Le pida al usuario por pantalla un segundo número (float) (valor2).
//- Imprima la suma de los valores.
//- Luego, imprima la multiplicación de los 2 valores.
//- La división
import java.util.Scanner;
public class RepasoParcial02 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Ingrese el primer numero flotante:");
        float num1 = kb.nextFloat();
        System.out.println("Ingrese el segundo numero flotante:");
        float num2 = kb.nextFloat();

        double suma = num1 + num2;
        double multiplicacion = num1 * num2;
        double division= num1/num2;

        System.out.println("La suma de los numeros ingresados es: "+ suma);
        System.out.println("La multiplicacion de los numeros ingresados es: "+ multiplicacion);
        System.out.println("La division de los numeros ingresados es: "+ division);

    }
    
}
