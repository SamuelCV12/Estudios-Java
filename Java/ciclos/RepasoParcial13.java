package ciclos;
//Un juez al dictar una sentencia tiene en cuenta el número de declaraciones, a favor o
//en contra de la persona juzgada.
//Cree un programa en donde:
//-Cree un ciclo.
//-Pida al usuario el nombre de la persona juzgada (Str).
//-Pida al usuario la cantidad de declaraciones en contra verificadas (int).
//-Si la cantidad de declaraciones en contra es mayor de 10, imprima nomJuzgado es
//culpable y finalice el ciclo con un break.
//-En caso contrario, imprima nomJuzgado es inocente.
//El ciclo debe volver a ejecutar. 
import java.util.Scanner;
public class RepasoParcial13 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        String nom;
        int inicio, declaraciones;

        System.out.println("Ingrese el numero 0 para ingresar al ciclo");
        inicio = kb.nextInt();

       while (inicio==0) {
        
        System.out.println("Ingrese el nombre de la persona juzgada: ");
        nom = kb.next();

        System.out.println("Ingrese el numero de declaraciones en contra de: "+nom);
        declaraciones =kb.nextInt();

        if (declaraciones>10) {
            System.out.println(nom+" Es culpable");
             break; 
        }else{
            System.out.println(nom+" Es inicente");
        }
       }
    }
    
}
