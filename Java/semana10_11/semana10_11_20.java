package semana10_11;
//⦁	Crea un programa que encuentre la suma de todos los elementos en un ArrayList de números decimales.
import java.util.Scanner;
import java.util.ArrayList;
public class semana10_11_20 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        
        ArrayList<Double> arreglo = new ArrayList<>();
         double num;
        System.out.println("Ingrese 0 para empezar a agregar numeros decimales al arreglo");
        int ini = kb.nextInt();

        if (ini==0) {

            while (ini==0) {
                System.out.println("Ingrese el numero decimal");
                num= kb.nextDouble();
                arreglo.add(num);

                
                if (num==-0) {
                    break;
                }
                System.out.println("Para dejar de ingresar numeros, ingrese el -0");
            }
            
        }else{
            System.out.println("No puedes agregar numeros si no entras al menu...(Ingrese el numero 0)");
        }
        sumaArray(arreglo);
    }
    public static void sumaArray(ArrayList<Double> p1){
    Double suma = 0.0;
    for (int i = 0; i < p1.size(); i++) {
        suma = suma+ p1.get(i);
    }
    System.out.println("La suma de los elementos del array es: " + suma);
   }
}

