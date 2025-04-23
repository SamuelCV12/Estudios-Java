import java.util.Scanner;
import java.util.ArrayList;
public class ArregloDinamico {
    public static void main(String[] args) {
        ArrayList<Integer> datos = new ArrayList<>();
        
        int suma;
        float promedio;
        leerDatos(datos);
        imprimirArreglo(datos);
        suma= sumarArreglo(datos);
        promedio = suma/ datos.size();
        System.out.println("Sumatoria del arreglo: "+ suma);
        System.out.println("Promedio del arreglo: "+ promedio);
    }
    public static void imprimirArreglo(ArrayList<Integer> arr){
        int n= arr.size();
        for (int i = 0; i < n; i++) {
            System.out.println("Indice: "+ i+" = "+ arr.get(i));
        }
       System.out.println("");
    }
    public static int sumarArreglo(ArrayList<Integer> arr){
     int acum = 0;
     int n= arr.size();
     for (int i = 0; i < n; i++) {
        acum = acum + arr.get(i);
     }
     return acum;
    }
    public static void leerDatos(ArrayList<Integer> arr){
        Scanner kb = new Scanner(System.in);
        System.out.println("Ingresar el dato al arreglo: ");
        int num = kb.nextInt();
        while (num>0) {
            arr.add(num);
            System.out.println("Ingresar el dato al arreglo");
            num = kb.nextInt();
            
        }



    }
}
