package semana10_11;
//⦁	Haz un programa que encuentre el índice de un elemento dado en un ArrayList.
import java.util.Scanner;
import java.util.ArrayList;
public class semana10_11_18 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        
        ArrayList<Double> arreglo= new ArrayList<>();

        System.out.println("Ingrese un numero diferente de 0 para empezar a agregar valores al array ");
        double num = kb.nextDouble();
     if (num!=0) {
        
         while (num!=0) {
           System.out.println("Ingrese los datos que desea agredar a su arreglo(Ingrese 0 para dejar de agregar elementos): ");
           num= kb.nextDouble();
           arreglo.add(num);
         }
        System.out.println("Array: ");
   
         for (int i = 0; i < arreglo.size(); i++) {
           System.out.print(arreglo.get(i)+" ");
         }
        System.out.println();
   
           System.out.println("Ingrese el dato que desea buscar el indice: ");
           num= kb.nextDouble();
           arreglo.indexOf(num);
           int indice = arreglo.indexOf(num);
           System.out.println("el indice de: "+num+" en el arreglo es: "+indice);
       }else{
        System.out.println("ERROR..");
       }
     }
    
}
