package Secuencias;
//Se requiere un programa que pueda indicar si una
//persona es mayor o menor de edad para el ingreso de un
//establecimiento (la variable debe ser entero).

import java.util.Scanner;
public class RepasoParcial01 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        int edad = kb.nextInt();

        if (edad >= 18) {
            System.out.println(" Eres mayor de edad bienbenido a la discoteca");
        }else{
            System.out.println("Eres menor de edad no puedes ingresar");
        } 
    }
}
