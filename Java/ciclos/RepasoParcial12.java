package ciclos;
//Una empresa está construyendo paneles solares y
//requiere saber según la cantidad celdas, cuáles paneles tienen celdas pares y cuáles
//tienen celdas impares.
//Cree un programa en donde:
//- Pida al usuario la cantidad de celdas del panel solar (int)
//- El ciclo debe volver a ejecutar hasta que ingrese un número negativo (break).
//- Según la cantidad de celdas, si son pares imprima el panel tiene celdas pares,
//si son impares imprima el panel tiene celdas impares.
//En caso contrario, si no tiene celdas imprima no tiene celdas.
import java.util.Scanner;
public class RepasoParcial12 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int celdas;
        
        System.out.println("Ingrese la cantidad de celdas del panel solar");
        celdas= kb.nextInt();
        
        while (celdas>=0) {
        if ((celdas%2==0)&&(celdas>0)){
                System.out.println("El panel tiene celdas pares"); 
            } else if(celdas==0){
                System.out.println("El panel no tiene celdas ");
            }else{
                System.out.println("El panel tiene celdas impares");
            }
            System.out.println("Ingrese la cantidad de celdas del panel solar o ingrese un numero negativo para salir del blucle");
            celdas= kb.nextInt();
     }
} }
