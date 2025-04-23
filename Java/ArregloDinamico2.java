import java.util.Scanner;
import java.util.ArrayList;
public class ArregloDinamico2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        String name;
        ArrayList<String>nombres = new ArrayList<>();
        leerDatos(nombres);
        imprimirArreglo(nombres);
        System.out.println("Cual nombre desea borrar");
        name= kb.nextLine();
        borrarNombre(nombres, name);
        imprimirArreglo(nombres);
    }
    public static void borrarNombre(ArrayList<String> arr, String nombre){
        boolean resultado;
        resultado = arr.remove(nombre);
        if (resultado == true) {
            System.out.println(" Borrar"); 
        }else{
            System.out.println(nombre+" no encontrado ni borrado!");
        }
       System.out.println("");
       
    }
    public static void imprimirArreglo(ArrayList<String> arr){
        int n= arr.size();
        for (int i = 0; i < n; i++) {
            System.out.println("Indice: "+ i+" = "+ arr.get(i));
        }
       System.out.println("");
    }
    public static void leerDatos(ArrayList<String> arr){
        Scanner kb = new Scanner(System.in);
        System.out.println("Ingresar nombre estudiante: ");
        String nombre_completo = kb.nextLine();
        while (nombre_completo.equalsIgnoreCase("terminar")==false) {
            arr.add(nombre_completo);
            System.out.println("Ingresar nombre estudiante: ");
            nombre_completo = kb.nextLine();
            
            
        }
    }
}
