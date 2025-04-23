package Funciones;
//En el programa de Biología caracterizan las diferentes
//plantas de la Universidad y se desea saber cuáles son predominantes en su especie
//de acuerdo a la cantidad.
//Cree un programa y dentro del programa una función que se llame verificarEspecie,
//que reciba un vector con las plantas.
//Retorne true si la primera planta es igual que la última.
import java.util.Scanner;
public class RepasoParcial20 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector: ");
        int n = kb.nextInt();

        String vector[]= new String[n];
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingresa el nombre de la planta: ");
            vector[i]= kb.next();
        }
        verificarEspecie(vector);
        
    }
    public static boolean verificarEspecie(String vector[]){
        boolean resultado;
        if (vector[0].equalsIgnoreCase(vector[vector.length-1])) {
            resultado= true;
            System.out.println("El primer nombre es igual al ultimo nombre del vector");
        }else{
            resultado=false;
            System.out.println("EL primer nombre es diferente del ultimo nombre del vector");
        }
        return resultado;
    }
    
}
