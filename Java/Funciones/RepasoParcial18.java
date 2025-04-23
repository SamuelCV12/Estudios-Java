package Funciones;
//Mi amigo Carlos está comprando un apartamento y
//requiere conocer cuál es el valor de los intereses que debe pagar por el precio del
//apartamento.
//Cree un programa y dentro del programa una función que se llame
//obtenerIntereses, que reciba el precio del apartamento y el tiempo que desea de pago.
//Debe tener en cuenta que la tasa de interés es del 0,8 y el resultado del valor de
//intereses es el precio del apartamento multiplicado por el tiempo de pago y la tasa de interés.
import java.util.Scanner;
public class RepasoParcial18 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        double precio;
        int tiempo;
        System.out.println("Ingrese el precio del apartamento: ");
        precio = kb.nextDouble();
        System.out.println("Ingrese el tiempo que desea de pago: ");
        tiempo =kb.nextInt();

        obtenerIntereses(precio, tiempo);

    }
    public static double obtenerIntereses(double p1,int p2){
     double resultado;

     resultado= (p1 *0.8) * p2;
     System.out.println("el interes del apartamento es: "+resultado);

     return resultado;
    }
    
}
