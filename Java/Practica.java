 //Ordenar vuelos: El sistema debe ordenar los vuelos por destino en orden alfabético. 
import java.util.Scanner;
import java.util.ArrayList;
public class Practica {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int opc =0;
        int ini =0;

        ArrayList <String> arrayNom = new ArrayList<>();
        ArrayList <String> arrayDestino = new ArrayList<>();
        ArrayList <Integer> arrayEdad = new ArrayList<>();
        System.out.println("Menu:");
        while (ini == 0) {
                System.out.println("Ingresar el Numero 1 para Registrar un Pasajero");
                System.out.println("Ingresar el Numero 2 para Mostrar la Lista de pasajeros");
                System.out.println("Ingresar el Numero 3 para Reservar vuelos");
                System.out.println("Ingresar el Numero 4 para Buscar pasajeros por su Edad");
                System.out.println("Ingresar el Numero 5 para Ordenar los Vuelos por Orden Alfabetico");
                System.out.println("Ingresar el Numero 6 para Salir del Programa");
                opc= kb.nextInt();
                
            if (opc==1) {

                RegistrarPasajeros(arrayNom,arrayEdad,arrayDestino);
                
            }else if (opc==2) {

                MostrarListaPasajeros(arrayNom,arrayEdad,arrayDestino);
                
            }else if (opc==3) {

                ReservarVuelos();
                
            }else if (opc==4) {

                BuscarPorEdad(arrayNom,arrayEdad,arrayDestino);
                
            }else if (opc==5) {

                OrdenarVuelos(arrayDestino);
                
            }else if (opc==6) {
                System.out.println("Saliendo del Programa...");
                break;
            }else{
                System.out.println("ERROR, OPCION NO VALIDA, INGRESE UNA OPCION VALIDA...");
                System.out.println();
            }
        }
        
    }public static void RegistrarPasajeros(ArrayList<String>p1, ArrayList<Integer>p2, ArrayList<String>p3){
        Scanner kb = new Scanner(System.in);
        String nom; int edad; String destino;
        String ini="agregar";
        
            while (!ini.equalsIgnoreCase("Terminar")) {
                
                System.out.println("Ingrese el Nombre del Pasajero o Digite Terminar, para no Agregar mas Pasajeros");
                nom = kb.next();

                if (nom.equalsIgnoreCase("Terminar")) {

                    System.out.println("Has Desidido Dejar de Agregar Pasajeros...");
                    System.out.println();
                    break;
                }
                System.out.println("Ingrese la Edad del Pasajero");
                edad = kb.nextInt();
                System.out.println("Ingrese el Destino de Vuelo");
                destino = kb.next();

                p1.add(nom);
                p2.add(edad);
                p3.add(destino);       
            }

    }public static void MostrarListaPasajeros(ArrayList<String>p1, ArrayList<Integer>p2, ArrayList<String>p3){
        System.out.println();
        System.out.println("La Lista de los Pasajeros es: ");
        System.out.println();
        for (int i = 0; i < p1.size(); i++) {
        System.out.println("Nombre: "+p1.get(i)+", Edad: "+p2.get(i)+" años"+", Lugar de Destino: "+p3.get(i));
        }
        System.out.println();

    }public static void ReservarVuelos(){
        //Reservar vuelos: El sistema debe permitir a los pasajeros reservar vuelos.
        // Los pasajeros deben poder seleccionar su destino, ingresar la fecha del vuelo y
        // el número de asientos que desean reservar. El programa debe verificar si hay suficientes asientos disponibles
        // en el vuelo y actualizar la disponibilidad de asientos.

    }public static void BuscarPorEdad(ArrayList<String>p1, ArrayList<Integer>p2, ArrayList<String>p3){ 
        Scanner kb = new Scanner(System.in);

        System.out.println("Ingrese la Edad Minima Desde Donde Desea que Comienze la Busqueda");
        int edad1 = kb.nextInt();
        System.out.println("Ingrese la Edad en Donde Desea que Termine la Busqueda de Pasajeros");
        int edad2=kb.nextInt();
        int contador= 0;

        System.out.println("Los Pasajeros que se Encuentran en el Rango de Edad de: "+edad1+" años a "+edad2 +" años son:");
        System.out.println();

    for (int i = 0; i < p1.size(); i++) {
        if ((edad1<=p2.get(i)&&(edad2>=p2.get(i)))) {
            System.out.println(p1.get(i)+" y su Destino es: "+p3.get(i));
            contador++;
        }
    }
    if (contador==0) {
        System.out.println("No se han Encontrado Pasajeros con esa Edad");
    }
    System.out.println();
    }public static void OrdenarVuelos(ArrayList<String>p1){
         //Ordenar vuelos: El sistema debe ordenar los vuelos por destino en orden alfabético.
        
        
    }
}
