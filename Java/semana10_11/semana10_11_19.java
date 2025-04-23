package semana10_11;
//⦁	Escribe un programa que ordene un ArrayList de números enteros en orden ascendente.
import java.util.Scanner;
import java.util.ArrayList;
public class semana10_11_19 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);

        ArrayList<Integer> arreglo = new ArrayList<>();

        System.out.println("Ingrese el numero 0 para empezar a agregar numeros a su array");
        int ini = kb.nextInt();
        
        int num=0;

        if (ini==0) {
            while (ini==0) {
                System.out.println("Ingresar numero para el arreglo: ");
                num = kb.nextInt();
                arreglo.add(num);
                if (num==-0) {
                    break;
                    
                }
                System.out.println("Para dejar de agregar numeros ingrese el numero -0");      
            }
        }else{
            System.out.println("No has entrado al menu porque no ingresaste el numero 0...");
        }
        System.out.println("Los elementos del array son: ");
        for (int i = 0; i < arreglo.size(); i++) {
            System.out.print(arreglo.get(i)+" ");
        }
        ordenarArray(arreglo);
        System.out.println();
        System.out.println("Despues de ordenar: ");
        System.out.println(arreglo);
    }
    
   public static void ordenarArray (ArrayList<Integer>p1) {
    for (int i = 0; i < p1.size() - 1; i++) {

      for (int j = 0; j < p1.size() - 1 - i; j++) {
        
        if (p1.get(j) > p1.get(j + 1)) {
            int temp = p1.get(j);
            p1.set(j, p1.get(j + 1));
            p1.set(j + 1, temp);
        }
      }
    } 
  }
}
