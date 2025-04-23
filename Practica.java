import java.util.Scanner;
import java.util.ArrayList;

public class Practica {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String destinos[] = {"Mexico, Peru"}; 
        String fechasM[]={"30/10/2024 ", "04/11/3024"};
        ArrayList<Integer> asientos = new ArrayList<>();
        ArrayList<Integer> asientos2 = new ArrayList<>();

        int totalA=0;
        int finalA=0;
        int cancelar=0;
        int removeAsientos=0;

        int ini= 0;
        while (ini==0 ) {
            
            int opcf;
            int asiento;
            
            System.out.println("Ingrese la accion a Realizar");
            System.out.println("Las Opciones son: ");
            System.out.println("Ingrese 1 para vuelos a Mexico");
            System.out.println("Ingrese -1 para Salir del Programa");
            int opc = kb.nextInt();
            System.out.println();

            
            if (opc==1) {
                System.out.println("Has Elegido a Mexico como tu Lugar de Destino");
                System.out.println("Los vuelos Disponibles son: ");
                for (int i = 0; i < fechasM.length; i++) {
                    System.out.println(fechasM[i]);
                }
                System.out.println();
                for (int i = 0; i < fechasM.length; i++) {
                    System.out.println("Ingrese el Numero: "+i +" para Seleccionar el Vuelo del dia: ");
                    System.out.println(fechasM[i]);

                }
                opcf=kb.nextInt();
                
                    
                    if (opcf==0) {
                        System.out.println("Has Elegido el Vuelo del dia: 30/10/2024");

                        for (int i = 0; i < 1; i++) {
                            System.out.println("Para este Vuelo Contamos con un Total de: "+(5-totalA)+ " Asientos Disponibles");
                            System.out.println("Ingresar el Numero de Asientos que Desea Reservar: ");
                            asiento = kb.nextInt();
                            
                        if ((asiento<=5)&&(asiento>0)&&(finalA<5)) {
                                
                            for ( i = 0; i < asiento; i++) {
                            asientos.add(1);
                            totalA = totalA + asientos.get(i);
                            }
                            System.out.println("Has Reservado un Total de: "+totalA);
                            System.out.println("El Numero de Asientos Disponibles despues de la Reserva es: ");
                            System.out.println(5-totalA);

                            System.out.println("Ingrese el numero 1 si Desea Cancelar la Reserva de algun Asientos");
                            System.out.println("Ingrese Cualquier Otro Numero si no Desea Cancelar la Reserva ");
                            cancelar=kb.nextInt();
                            
                            if (cancelar==1) {
                                System.out.println("Ingrese el Numero de Asientos que Desea Cancelar su Reserva");
                                removeAsientos = kb.nextInt();
                                int contador=0;
                                
                                while (contador!=removeAsientos) {

                                    asientos.remove(contador);
                                    
                                    contador ++; 
                                }
                                for ( i = 0; i < asientos.size(); i++) {
                                    totalA = totalA - asientos.get(i);
                                    }

                                
                                
                                    totalA -= removeAsientos;  // Actualizar el total de asientos reservados
                                    System.out.println("Despues de Haber Cancelado sus Asientos, el total de Asientos Disponibles es: " + (10 - finalA));
                            }

                            





                        }else{
                            System.out.println("Error, Instruccion no Valida...");
                            break;
                        }
                        
                        
                        }
                        finalA = totalA;


                        
                    }else if (opcf==1) {

                        System.out.println("Has Elegido el Vuelo del dia: 04/11/3024");

                        for (int i = 0; i < 1; i++) {
                            System.out.println("Para este Vuelo Contamos con un Total de: "+(7-totalA)+ " Asientos Disponibles");
                            System.out.println("Ingresar el Numero de Asientos que Desea Reservar: ");
                            asiento = kb.nextInt();
                            
                        if ((asiento<=7)&&(asiento>0)&&(finalA<7)) {
                                
                            for ( i = 0; i < asiento; i++) {
                            asientos2.add(1);
                            totalA = totalA + asientos2.get(i);
                            }
                            System.out.println("Has Reservado un Total de: "+totalA);
                            System.out.println("El Numero de Asientos Disponibles despues de la Reserva es: ");
                            System.out.println(7-totalA);

                            System.out.println("Ingrese el numero 1 si Desea Cancelar la Reserva de algun Asientos");
                            System.out.println("Ingrese Cualquier Otro Numero si no Desea Cancelar la Reserva ");
                            cancelar=kb.nextInt();
                            
                            if (cancelar==1) {
                                System.out.println("Ingrese el Numero de Asientos que Desea Cancelar su Reserva");
                                removeAsientos = kb.nextInt();
                                int contador=0;
                                
                                while (contador!=removeAsientos) {

                                    asientos2.remove(contador);
                                    
                                    contador ++; 
                                }
                                for ( i = 0; i < asientos2.size(); i++) {
                                    totalA = totalA - asientos2.get(i);
                                    }
                                
                                System.out.println("Despues de Haber Cancelado sus Asientos, el total de Asientos Disponibles es:");
                                System.out.println(7-totalA);
                            }
                    }else{
                        System.out.println("Error, Opcion no valida");
                        break;
                    }
                    finalA = totalA;
                }
            }else if(opc==-1){
                System.out.println("Saliendo de la Reserva de Vuelos...");
            }  
        }
    }





                
            }
    public static void ReservarVuelos(String p1, String p2){

    }
    

}
