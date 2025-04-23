//⦁	Escribe un programa que añada elementos a un ArrayList y luego imprima el contenido.
import java.util.ArrayList;
import java.util.Scanner;
public class semana10_11_16 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);

        ArrayList<Integer> arreglo= new ArrayList<>();
        System.out.println("Ingrese un numero diferente de 0 para empezar a agregar valores al array ");
        int num = kb.nextInt();
        
     while (num!=0) {
        System.out.println("Ingrese los datos que desea agredar a su arreglo(Ingrese 0 para dejar de agregar elementos): ");
        num= kb.nextInt();
        arreglo.add(num);
     }
     System.out.println("Array: ");
     for (int i = 0; i < arreglo.size(); i++) {
        System.out.print(arreglo.get(i)+" ");
        
     }   
    }
}
