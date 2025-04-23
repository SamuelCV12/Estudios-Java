package Funciones;
//Se necesita calcular el área de diferentes figuras
//geométricas, al menos ‘circunferencia’, ‘cuadrilátero’, ‘triangulo’, cree funciones
//para cada una de las figuras geométricas y cree una función para un menú (). Solicite
//al usuario los datos requeridos por cada figura geométrica y los datos del menú.
import java.util.Scanner;
public class RepasoParcial21 {
    public static void main(String[] args) {
        menu();
    }
    public static void circunferencia(double p1){
        
        double areaCirculo= (3.1416*p1)*p1;
        System.out.println("El area del circulo es: "+ areaCirculo);
    }
    public static void cuadrado(double p1,double p2){
        double areaCuadrado= p1*p2;
        System.out.println("El area del cuadrado es: "+ areaCuadrado);
    }
    public static void triangulo(double p1,double p2){
        double areaTriangulo= (p1*p2)/2;
        System.out.println("El area del triangulo es: "+areaTriangulo);
    }
    public static void menu(){
        Scanner kb = new Scanner(System.in);
        int opc;
        System.out.println("Para Ingresar al menu oprima el 0");
        int op= kb.nextInt();
        
        while (op==0) {
            System.out.println("Ingresa 1 para calcular el area de un circulo");
            System.out.println("Ingresa 2 para calcular el area de un cuadrado");
            System.out.println("Ingresa 3 para calcular el area de un triangulo");
            System.out.println("Ingresa 4 para salir del menu");
            opc= kb.nextInt();
            
            if (opc==1) {
                System.out.println("Ingrese el radio del circulo que desea encontrar su area: ");
                double radio =kb.nextDouble();
                circunferencia(radio);
                
            }else if (opc==2) {
                
                System.out.println("Ingrese la base del cuadrado que desea encontrar su area: ");
                double base =kb.nextDouble();
                System.out.println("Ingrese la altura del cuadrado que desea encontrar su area: ");
                double altura =kb.nextDouble();
                cuadrado(base, altura);

            }else if (opc==3) {
                
                System.out.println("Ingrese la base del triangulo que desea encontrar su area: ");
                double base =kb.nextDouble();
                System.out.println("Ingrese la altura del triangulo que desea encontrar su area: ");
                double altura =kb.nextDouble();
                triangulo(base, altura);
            }else if(opc==4){
                System.out.println("Saliendo del menu...");
                break;
            }else{
                System.out.println("Opcion no valida, escoja una opcion valida");
            }
        }
    }
    
}
