package desiciones;
import java.util.Scanner;
public class RepasoParcial06 {

    public static void main(String[] args) {
    
        Scanner kb = new Scanner(System.in);
        int valor;

        System.out.println("Ingrese el valor que le da a la serie: ");
        valor = kb.nextInt();

        if (valor>8) {
            System.out.println("La serie es muy buena");
            
        }else if(valor<5){
            
            System.out.println("La serie no es tan buena");
            
        }else{
            System.out.println("La serie es buena");
            
        }
        System.out.println("Fin del programa");
    }  
}
