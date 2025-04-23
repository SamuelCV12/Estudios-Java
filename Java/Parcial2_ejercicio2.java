//agregarLibro: Solicita al usuario que ingrese N títulos de libros y los almacena en un arreglo dinámico 
//hasta que el usuario indique con un fin que ya no requiere ingresar más títulos.  
//● mostrarLibros: muestra la lista completa de libros.  
//● buscarLibro: por título.  
//● actualizarLibro: si hay un error en el nombre del libro, debe ser actualizado para que en la búsqueda sea encontrado 
//El CRUD (funciones anteriores) debe ser elegido por el usuario. 
//Los siguientes se deben mostrar siempre. 
//● calcularTituloLargo: el título más largo.   
//● generarLongitudTitulos: arreglo que muestra la longitud de cada título. 
 //● sumarLongitudesTitulos: la suma de las longitudes de todos los títulos. 
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Parcial2_ejercicio2 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
         int menu;
        ArrayList<String> libros = new ArrayList<>();

        System.out.println("Para añadir los titulos de los libros digite cualquier letra o cadena de texto");
        String ini= kb.nextLine();

        while (!ini.equalsIgnoreCase("Fin")) {
            System.out.println("Ingrese los titulos de los libros que desea añadir al Array (digitar Fin para no añadir mas titulos) ");
            ini=kb.nextLine();
            libros.add(ini);   
        }
        System.out.println("Ingrese un numero mayor a 0 para ingresar al menu");
        int ingreso= kb.nextInt();
        while (ingreso>0) {
            System.out.println("Ingrese el numero 1 para mostrar la lista completa de los libros: ");
            System.out.println("Ingrese el numero 2 para buscar un libro por su titulo");
            System.out.println("Ingrese el numero 3 para actualizar el nombre de un libro");
            System.out.println("Ingrese 4 para salir del menu");
            menu =kb .nextInt();

            if (menu==1) {
                mostrarLibros(libros);
                
            }else if (menu==2) {
                buscarLibro(libros);
            }else if (menu==3) {
                actualizarLibro(libros);
            }else if (menu==4) {
                System.out.println("Saliendo...");
                break;
                
            }else{
                System.out.println("Error, opcion no valida...");
            }   
        }
        calcularTituloLargo(libros);
        generarLongitudTitulos(libros);
        sumarLongitudesTitulos(libros);
     
    }
    public static void mostrarLibros(ArrayList<String>p1){
        System.out.println("Los elementos del array son: ");
        for (int i = 0; i < p1.size(); i++) {
            System.out.print(p1.get(i)+" ");
        }
        System.out.println();
    }public static void buscarLibro(ArrayList<String>p1){
        Scanner kb= new Scanner(System.in);

        System.out.println("Ingrese el libro que desea buscar: ");
           String libro = kb.nextLine();
           p1.indexOf(libro);

           int indice = p1.indexOf(libro);

           if (p1.contains(libro)){
               System.out.println(libro+" "+"esta en la lista");
               System.out.println("El libro: "+libro+" se encuentra en la posicion: "+indice+" del Array");
            } else {
                System.out.println(libro+" "+"no se encuentra en la lista");
        }

    }
    public static void actualizarLibro(ArrayList<String> p1){
        Scanner kb = new Scanner(System.in);
        System.out.println("ingrese el nombre del libro que desea actualizar: ");
        String libro = kb.nextLine();

        if (p1.contains(libro)){
            System.out.println("ingresa el nombre nuevo:");
            String nombreNuevo = kb.nextLine();
            p1.set(p1.indexOf(libro),nombreNuevo);
            System.out.println("nombre canbiado de:"+ libro + "a "+ nombreNuevo);
        } else {
            System.out.println("este nombre no esta en la lista.");
        }
    }
    public static void calcularTituloLargo(ArrayList<String> p1){
        if (!p1.isEmpty()){
            String nml = p1.stream().max((n1, n2) -> n1.length()- n2.length()).get();
            System.out.println("El titulo mas largo es:"+" "+nml);
        }
    }public static void generarLongitudTitulos(ArrayList<String> p1){
        List<Integer> longitudes = new ArrayList<>();
        for ( String palabra  : p1){
            longitudes.add(palabra.length());

        }
        System.out.print("La longitud de cada titulo es:" + longitudes);
    }
    public static void sumarLongitudesTitulos(ArrayList<String> p1){
        int total = p1.stream().mapToInt(String :: length).sum();
        System.out.println("suma de las longitudes de todos los titulos de los libros: " + total);
        }
        
}
