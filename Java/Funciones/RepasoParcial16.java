package Funciones;
//Cree un programa. Dentro del programa cree una función
//que se llame accesodiscoteca, y que reciba 3 parámetros.
//- Como primer parámetro recibe la edad de una persona (int)
//- Como segundo parámetro recibe el dinero de una persona (int)
//- Como tercer parámetro recibe el nombre de la persona (string)
//La función debe retornar True o False para saber si la persona puede acceder o no a la discoteca.
//Solo puede acceder a la discoteca, aquellas personas que tengan 18 o más años,
//que tengan 100 o más de dinero, y que no se llamen “Jimmy”.
import java.util.Scanner;
public class RepasoParcial16 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        int edad,dinero;
        String nom;
        System.out.println("Ingrese su nombre");
        nom= kb.nextLine();
        System.out.println("Ingrese su edad: ");
        edad =kb.nextInt();
        System.out.println("Ingrese su dinero: ");
        dinero =kb.nextInt();
        accesodiscoteca(edad, dinero, nom);

    }
    public static void accesodiscoteca(int p1,int p2, String p3){
        if ((p1 >=18)&&(p2>=100)&&(!p3.equalsIgnoreCase("Jimmy"))) {
            System.out.println("Puede ingresar a la discoteca");
            
        }else{
            System.out.println("no puede ingresar a la discoteca");
        }
    }
    
}
