package Secuencias;
//Diseñar un algoritmo que nos convierta de Pesos a
//dólares, y dólares a Pesos. Pedir al usuario valor en Pesos y Pedir al usuario
//por teclado valor en dólares. Pedir al usuario tasa de cambio de dólar a Pesos.
import java.util.Scanner;
public class RepasoParcial05 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);

        double pesos,tasaCambio,dolares;
        System.out.println("Ingresar los pesos que desea pasar a dolares: ");
        pesos = kb.nextInt();
        
        System.out.println("Tasa de cambio: ");
        tasaCambio = kb.nextDouble();

        dolares = pesos/tasaCambio;
        
        System.out.println(pesos+" Pesos Equivalen a: "+dolares+" dolares");

        System.out.println("Ingresar los dolares que desea pasar a pesos: ");
        dolares = kb.nextInt();
        
        pesos = dolares*tasaCambio;
        
        System.out.println(dolares+" Dolares Equivalen a: "+pesos+" pesos");

    }
    
}
