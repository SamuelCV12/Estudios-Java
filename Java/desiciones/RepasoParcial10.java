package desiciones;
//El mercado de divisas permite a los inversionistas realizar 3 acciones:
//1. comprar divisas. 2. vender divisas. 3 retirar divisas.
//Cree un programa donde:
//- Pida al usuario la cantidad de divisas (int).
//- Pida al usuario la acción a realizar (int).
//- Si la acción es 1, pida la cantidad de divisas a compra y realicé la operación.
//- Si la acción es 2, pida la cantidad de divisas a vender, y realicé la operación.
//- Si la acción es 3, pida la cantidad de divisas a retirar, y si la cantidad de divisas
//actual es mayor o igual a la cantidad a vender, realicé la operación.
//- Imprima la cantidad de divisas actual.
import java.util.Scanner;
public class RepasoParcial10 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int divisasactuales,divisas,opcion,divisastotales;

        System.out.println("Ingrese la cantidad de divisas actuales");
        divisasactuales = kb.nextInt();
        System.out.println("Ingresar opcion a realizar");
        System.out.println("Ingresar 1 para comprar divisas");
        System.out.println("Ingresar 2 para vender divisas ");
        System.out.println("Ingresar 3 para retirar divisas");
        opcion= kb.nextInt();
        
        if (opcion==1) {
            
            System.out.println("Ingrese la cantidad de divisas a comprar");
            divisas = kb.nextInt();

            divisastotales = (divisasactuales + divisas);

           System.out.println("La cantidad de divisas que tienes despues de comprar es: "+divisastotales);
           
        }else if (opcion==2) {

            System.out.println("Ingrese la cantidad de divisas que desea vender");
            divisas = kb.nextInt();

            divisastotales = (divisasactuales-divisas);

            System.out.println("La cantidad de divisas que tienes despues de vender es: "+divisastotales);
            
        }else if(opcion==3){
            System.out.println("Ingrese la cantidad de divisas que desea retirar");
            divisas = kb.nextInt();
            if (divisasactuales>=divisas) {

                divisastotales = divisasactuales-divisas;
                System.out.println("su cantidad de divisas despues de retirar es: "+divisastotales);
            }else{
                System.out.println("No posees suficientes divisas para retirar");
            }
            
        }else{
            System.out.println("Opcion no valida");
        }
    }
    
}
