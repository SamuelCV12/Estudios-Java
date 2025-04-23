package Secuencias;
//Calcular el promedio de tres números pedidos por teclado
import java.util.Scanner;
public class RepasoParcial04 {

    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);

        System.out.println("Ingresar el primer numero: ");
        int num1= kb.nextInt();
        System.out.println("Ingresar el segundo numero: ");
        int num2= kb.nextInt();
        System.out.println("Ingresar el tercer numero: ");
        int num3= kb.nextInt();

        double promedio=(num1+num2+num3)/3;
        
        System.out.println("EL promedio de los numeros wingresados son: "+promedio);
    }
}
