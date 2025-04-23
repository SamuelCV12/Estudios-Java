package ciclos;
//Cree un programa que:
//- le pida al usuario por pantalla un número (int) cuyos múltiplos serán hallados
//- le pida otro número para indicar hasta que valor desea hallar los múltiplos
//- y luego imprima los múltiplos del número, desde 1 hasta el segundo número que
//ingresó el usuario.
import java.util.Scanner;
public class RepasoParcial11 {
    public static void main(String[] args) {

        Scanner kb= new Scanner(System.in);
          int mult,multiplos,num;
        System.out.println(" Ingresar el numero cuyos multiplos seran hallados: ");
        num = kb.nextInt();

        System.out.println("Ingrese cuantos multiplos desea encontrar: ");
        mult= kb.nextInt();

        for (int i = 1; i < mult; i++) {

         multiplos= i *num;
         System.out.println("los multiplos de "+num+" son: "+multiplos);   
        }
    }
}
