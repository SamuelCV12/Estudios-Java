import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class EjercicioEnanos {
    public static void main(String[] args) {
        ArrayList <String> palabra = new ArrayList<>();
        menu(palabra);
    }
    public static void menu(ArrayList<String> p1){
        Scanner kb = new Scanner(System.in);
        while (true){
            System.out.println("Ingresa 1 agregar enano");
            System.out.println("Ingresa 2 para mostrar enanos");
            System.out.println("Ingresa 3 para buscar enano");
            System.out.println("Ingresa 4 para cambiar nombre de enano");
            System.out.println("Ingresa 5 para calcular total de enanos");
            System.out.println("Ingresa 6 para calcular nombre más largo");
            System.out.println("Ingresa 7 para calcular nombre más corto");
            System.out.println("Ingresa 8 para calcular nombre con más vocales");
            System.out.println("Ingresa 9 para generar longitud de nombres");
            System.out.println("Ingresa 10 para sumar longitudes de nombres");
            System.out.println("Ingresa 11 para generar matriz de caracteres");
            System.out.println("Ingresa 12 salir");

            String opcion = kb.nextLine();
            switch (opcion) {
                case "1":
                    AgregarEnano(p1);
                    break;
                case "2":
                    mostrarenanos(p1);
                    break;
                case "3":
                    buscar(p1);
                    break;
                case "4":
                    cambiarNombre(p1);
                    break;
                case "5":
                    totalEnanos(p1);
                    break;
                case "6":
                    nombremaslargo(p1);
                    break;
                case "7":
                    nombremascorto(p1);
                    break;
                case "8":
                    nombrevocales(p1);
                    break;
                case "9":
                    longitudnombres(p1);
                    break;
                case "10":
                    sumalongitudes(p1);
                    break;
                case "11":
                    generarMatrizCaracteres(p1);
                    break;
                case "12":
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción inválida, por favor elige una opción válida.");
            }
            System.out.println("");
        }
    }
    public static String mayuscula(String arr){
        if ( arr == null || arr.isEmpty()){
            return arr;
        }
        return arr.substring(0, 1).toUpperCase() + arr.substring(1).toLowerCase();
    }
    public static int contarvocales(String arr){
        return (int) arr.chars().filter(c -> "aeiouAEIOU".indexOf(c) != -1).count();  
    }
    public static void mostrarenanos(ArrayList<String> arr){
        int n = arr.size();
        for ( int i =0; i<n; i++){
            System.out.println("enano"+" "+i+"="+" "+arr.get(i));
        }
    }
    public static void AgregarEnano(ArrayList<String> arr) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Ingresar el nombre del enano (escribe 'fin' para terminar):");
        String palabra = kb.nextLine();
        
        while (!palabra.equalsIgnoreCase("fin")) {
            palabra = mayuscula(palabra); 
            arr.add(palabra);
            System.out.println("Ingresar el nombre del enano (escribe 'fin' para terminar):");
            palabra = kb.nextLine();
        }
    }
    
    public static void buscar(ArrayList<String> arr){
        Scanner kb = new Scanner(System.in);
        System.out.println("ingrese el nombre del enano a buscar:");
        String nombre = mayuscula(kb.nextLine());
        arr.indexOf(nombre);

           int indice = arr.indexOf(nombre);
        if (arr.contains(nombre)){
            System.out.println(nombre+" "+"esta en la lista");
            System.out.println("El Enano: "+nombre+" se encuentra en la posicion: "+indice+" de la lista");
        } else {
            System.out.println(nombre+" "+"no se encuentra en la lista");
        }

    }
    public static void cambiarNombre(ArrayList<String> arr){
        Scanner kb = new Scanner(System.in);
        System.out.println("ingrese el nombre del enano que desea cambiar:");
        String na = mayuscula(kb.nextLine());
        if (arr.contains(na)){
            System.out.println("ingresa el nombre nuevo:");
            String nn = mayuscula(kb.nextLine());
            arr.set(arr.indexOf(na),nn);
            System.out.println("nombre canbiado de:"+ na + " a "+ nn);
        } else {
            System.out.println("este nombre no esta en la lista.");
        }
    }
    public static void totalEnanos(ArrayList<String> arr){
        System.out.println("total de enanos:" + arr.size());
    }
    public static void nombremaslargo(ArrayList<String> arr){
        if (!arr.isEmpty()){
            String nml = arr.stream().max((n1, n2) -> n1.length()- n2.length()).get();
            System.out.println("el nombre mas largo es:"+" "+nml);
        }
    }
    public static void nombremascorto(ArrayList<String> arr){
        if (!arr.isEmpty()){
            String nmc = arr.stream().min((n1, n2) -> n1.length()- n2.length()).get();
            System.out.println("el nombre mas corto es:"+" "+nmc);
        }
    }
    public static void nombrevocales(ArrayList<String> arr){
        if (!arr.isEmpty()){
            String nmv = arr.stream().max((n1, n2) -> contarvocales(n1) - contarvocales(n2)).get();
            System.out.println("nombre con mas vocales es:"+" "+nmv);
        }
    }
    public static void longitudnombres(ArrayList<String> arr){
        List<Integer> longitudes = new ArrayList<>();
        for ( String palabra  : arr){
            longitudes.add(palabra.length());

        }
        System.out.print("longitudes de cada nombre:" + longitudes);
    }
    public static void sumalongitudes(ArrayList<String> arr){
    int total = arr.stream().mapToInt(String :: length).sum();
    System.out.println("suma de las longitudes de todos los nombres:" + total);
    }
    public static void generarMatrizCaracteres(ArrayList<String> arr) {
        System.out.println("Matriz de caracteres:");
        for (String palabra: arr ) {
            char[] fila = palabra.toCharArray();
            for (char c : fila) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}