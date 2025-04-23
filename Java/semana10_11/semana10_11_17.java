package semana10_11;
//⦁	Crea un programa que elimine un elemento específico de un ArrayList.
import java.util.Scanner;
import java.util.ArrayList;
public class semana10_11_17 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        ArrayList<String> nombres= new ArrayList<>();

        System.out.println("Para añadir nombres digite cualquier letra o cadena de texto");
        String ini= kb.nextLine();

        while (!ini.equalsIgnoreCase("Terminar")) {
            System.out.println("Ingrese los nombres que desea añadir al Array (digite terminar para no añadir mas nombres) ");
            ini=kb.nextLine();
            nombres.add(ini);   
        }
        System.out.println("Los elementos del array son: ");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.print(nombres.get(i)+" ");
        }
        System.out.println();

        System.out.println("Para eliminar un nombre del arreglo digita cualquier letra o cadena: ");
        String ini2=kb.nextLine();
        while (!ini2.equalsIgnoreCase("Terminar")) {
            System.out.println("Ingrese los nombres que desea eliminar del Array (digite terminar para no eliminar mas nombres) ");
            ini2=kb.nextLine();
            nombres.remove(ini2);
            
        }
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }System.out.println();


    }
    
}
