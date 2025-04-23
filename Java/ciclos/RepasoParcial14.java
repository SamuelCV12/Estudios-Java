package ciclos;
//Se tiene un cajero automático con 4 opciones: 1. Ingresar dinero, 2. Retirar dinero, 3.
//Mostrar dinero, 4. salir
//Cree un programa donde:
//-Ingrese un saldo inicial.
//-Utilice un ciclo
//- Pida al usuario siempre ingresar la opción (int).
//- Si la opción es 1, pida la cantidad de dinero a ingresar y realicé la operación imprima el saldo.
//- Si la opción es 2, pida la cantidad de dinero a retirar, si el saldo es mayor a cero y la
//cantidad de dinero a retirar es menor o igual que la cantidad actual realicé la
//operación e imprima el saldo. De lo contrario, imprima no tiene saldo.
//- Si la opción es 3, imprima el saldo.
//- Si la opción es 4, utilice un break para salir.
//- En caso de que elija otra opción imprimir error.
import java.util.Scanner;
public class RepasoParcial14 {

    public static void main(String[] args) {
     Scanner kb= new Scanner(System.in);

      double salIni,ingreso,total;
      int inicio, opc;

     System.out.println("Ingrese el salario inicial");
     salIni= kb.nextDouble();
     System.out.println("Ingrese 0 para entrar al menu");
     inicio = kb.nextInt();

      while (inicio==0) {
        
          System.out.println("Ingrese la opcion a realizar: ");
          System.out.println("Oprima 1 para ingresar dinero");
          System.out.println("Oprima 2 para retirar dinero");
          System.out.println("Oprima 3 para mostrar dinero");
          System.out.println("Oprima 4 para salir del menu");
          opc = kb.nextInt();

          if (opc==1) {
            System.out.println("Digitar la cantidad de dinero que desea ingresar");
            ingreso = kb.nextDouble();

            salIni=salIni + ingreso;

            System.out.println("su saldo es de: "+salIni);
            
        }else if (opc==2) {

              System.out.println("Digitar la cantidad de dinero que desea retirar");
              ingreso=kb.nextDouble();

              if ((salIni>0)&&(ingreso<=salIni)) {

                total = salIni-ingreso;

                System.out.println("La cantidad de dinero que tiene despues de retirar es: "+total);
              }
            
          }else if (opc==3) {

            System.out.println("Su dinero actual es: "+salIni);
            
          }else if (opc==4) {

            System.out.println("Saliendo del menu...");
            break;
            
          }else{

            System.out.println("Opcion no valida");
            System.out.println("ERROR");

          }

        }

   }
   
}
