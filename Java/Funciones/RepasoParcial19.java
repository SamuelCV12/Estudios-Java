package Funciones;
//En el rio San Sebastián, los visitantes pueden pescar. Sin
//embargo, está prohibido pescar peces que midan menos de 10 cm por protección de
//las especies y su reproducción.
//Cree un programa y dentro del programa una función llamada chequearPez, que
//reciba el tamaño del pez.
//Si el pez mide más de 10 cm retorne true e imprima puede tomar el pez, de lo
//contrario retorne falso, e imprima no puede tomar el pez.
import java.util.Scanner;;
public class RepasoParcial19 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        float tamaño;
        System.out.println("Ingresar el tamaño del pez: ");
        tamaño = kb.nextFloat();
        chequearPez(tamaño);
    }
    public static boolean chequearPez(float p1){
       boolean resultado;
        if (p1>10) {
            resultado= true;
            System.out.println(resultado+" Puede tomar el pez");
            
        }else{
            resultado = false;
            System.out.println(resultado+" No puede tomar el pez");
        }
        return resultado;
    }
}
