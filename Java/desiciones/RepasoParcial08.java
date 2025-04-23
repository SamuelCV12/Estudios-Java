package desiciones;
//Cree un programa que se comporte como un sensor y lea
//la temperatura actual (float).
//Luego si la temperatura es mayor a 27 imprima alerta de calor,
//Si la temperatura es menor a 15 imprima alerta de frio.
import java.util.Scanner;
public class RepasoParcial08 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        float temp;
        System.out.println("Ingrese la temperatura actual: ");
        temp = kb.nextFloat();

        if (temp>27) {
            System.out.println("Alerta de Calor, Correeee");
        }else if(temp<15){
            System.out.println("Alerta de Frio, Correeee");
            
        }else{
            System.out.println("La temperatura esta normal, breve manito");
        }
    }
    
}
