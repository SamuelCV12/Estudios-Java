package semana10_11;
//⦁	Escribe un programa que cuente el número de vocales en un string.
import java.util.Scanner;
public class semana10_11_11 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Ingresar el string al cual quiere contar sus vocales: ");
        String cadena = kb.nextLine();
        char A,E,I,O,U;
        int contador=0;
        A = 'a'; E = 'e'; I = 'i'; O = 'o'; U = 'u';
        
        for (int j = 0; j < cadena.length(); j++) {
            int vocales = cadena.toLowerCase().charAt(j);
            if (A== vocales) {
                contador ++;
            }else if (E==vocales) {
                contador ++;
            }else if (I==vocales) {
                contador ++;
            }else if (O==vocales){
                contador++;
            }else if (U==vocales) {
               contador++; 
            }else{
           }  
        }
        System.out.println("El string tiene: "+contador+" vocales");   
    }
    
}
