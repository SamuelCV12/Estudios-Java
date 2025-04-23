//Solicitar al usuario que ingrese las cantidades de agua en los embalses guardando las cantidades en un arreglo estático. 
//Crear una función llamada evaluarCapacidadAgua que tome como parámetro los niveles de agua ingresados por el usuario. 
//En la función evaluarCapacidadAgua: determinar y mostrar un mensaje que indique la capacidad de agua con base en los niveles ingresados. 
//Calcular y mostrar el promedio de los niveles de agua. 
//Si el nivel de agua está por encima del 70% de la capacidad, mostrar "Niveles de agua óptimos. No hay preocupaciones por sequía". 
//Si el nivel de agua está entre el 50% y el 70% de la capacidad, mostrar "Niveles de agua moderados. Se recomienda monitorear". 
//Si el nivel de agua está por debajo del 50% de la capacidad, mostrar "Alerta de sequía. Se deben tomar medidas de conservación del agua". 
//Llamar a la función evaluarCapacidadAgua. 
//Mostrar el resultado de la evaluación de la capacidad de agua de los embalses. 
import java.util.Scanner;
public class Parcial2 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int x;
        int agua;
        System.out.println("Ingresar la cantidad de embalces ");
        x= kb.nextInt();
        
        int arr_agua[] = new int [x];

        for (int i = 0; i < arr_agua.length; i++) {
            System.out.println("Ingrese los niveles de agua del embalse posicion "+i+" del arreglo");
             arr_agua[i]= kb.nextInt();
        }
        
        evaluarCapacidadAgua(arr_agua,x); 
    }
    static public void evaluarCapacidadAgua(int p1[],int p2){

        int suma=0;
        int promedio=0;
        for (int i = 0; i < p1.length; i++) {
            System.out.println("Los niveles de agua del embalse en la posicion: "+ i +" del arreglo es: ");
            System.out.println(p1[i]+"%");
        }

        for (int i = 0; i < p1.length; i++) {
            suma = suma + p1[i];
        }
        System.out.println();
        promedio= suma/p2;
        System.out.println("El promedio de los niveles de agua de los embalses es: "+promedio+"%");
        System.out.println();
          
        if (promedio>70){
            System.out.println("Niveles de agua óptimos. No hay preocupaciones por sequía");
        
         }else if ((promedio >50)&&(promedio<70)) {
            System.out.println("Niveles de agua moderados. Se recomienda monitorear");
            
         }else if (promedio<50) {
            System.out.println("Alerta de sequía. Se deben tomar medidas de conservación del agua");       
         }
         System.out.println();
   }
}