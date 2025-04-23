package Strings;
//: Dados los siguientes dos strings:
//str1: “Esta es una prueba de string, que verifica donde está un string”
//imprimir en que posición de str1 están todos los siguientes substrings: str2: “esta”
//str3: “string” (ignorar mayúsculas y minúsculas).
import java.util.Scanner;
public class RepasoParcial28 {
    public static void main(String[] args) {
        String str1="Esta es una prueba de string, que verifica donde esta un string";
        String str2="esta";
        String str3="String";

        int posicion1=str1.toLowerCase().indexOf(str2.toLowerCase());
        System.out.println("El string numero 2 se encuentra en la posicion "+posicion1);
        int posicion2=str1.toLowerCase().indexOf(str3.toLowerCase());
        System.out.println("El string numero 3 se encuentra en la posicion "+posicion2);
    }
    
}
