package Secuencias;
//: Escribir un programa que convierta un valor dado en
//grados Fahrenheit a grados Celsius. Recordar que la fórmula para la
//conversión es: C = ( F-32 ) * 5/9
import java.util.Scanner;
public class RepasoParcial03 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        
        System.out.println("Ingrese el valor de la temperatura enn grados Fahrenheit");
        float fahrenheit = kb.nextInt();

        double gradosCelcius= (fahrenheit-32)* 5/9;

        System.out.println(fahrenheit+" grados fahrenheit equivalen a: "+gradosCelcius+"");
    }
    
}
