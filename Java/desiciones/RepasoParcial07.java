package desiciones;
//El sistema metro de la ciudad tiene una máquina para
//reciclar botellas de plástico. Esta máquina otorga puntos reembolsables en servicios
//del sistema. En la maquina existen 3 tipos de botellas, tipo 1, tipo 2 y tipo 3. Un
//usuario solo puede comprar productos de un solo tipo.
//- Por cada botella reciclada del tipo 1, le dan 5 puntos.
//- Por cada botella reciclada del tipo 2, le dan 10 puntos.
//- Por cada botella reciclada del tipo 3, le dan 15 puntos.
import java.util.Scanner;
public class RepasoParcial07 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int tipo,puntos;
        int botella=0;
        System.out.println("Ingrese el tipo de botella las opciones son: ");
        System.out.println("Ingresar el numero 1 para el primer tipo de botella");
        System.out.println("Ingresar el numero 2 para el segundo tipo de botella");
        System.out.println("Ingresar el numero 3 para el tercer tipo de botella");
        tipo= kb.nextInt();

        if (tipo==1) {

            System.out.println("Ingrese la cantidad de botellas tipo 1");
            botella= kb.nextInt();

            puntos = botella*5;

            System.out.println("a obtenido "+puntos+" puntos");
        }else if(tipo==2){
            System.out.println("Ingrese la cantidad de botellas tipo 2");
            botella= kb.nextInt();

            puntos = botella*10;

            System.out.println("a obtenido "+puntos+" puntos");
        }else if(tipo==3){
            
            System.out.println("Ingrese la cantidad de botellas tipo 3");
            botella= kb.nextInt();

            puntos = botella*15;

            System.out.println("a obtenido "+puntos+" puntos");

        }else{
            System.out.println("opcion no valida ingrese una opcion valida");
        }

    }
    
}
