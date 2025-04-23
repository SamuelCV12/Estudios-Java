package Funciones;
//El canal Nacional Geographic estudia una familia de
//monos babuinos en África. Al estudiar el comportamiento de dos monos, existe un
//problema si los dos están sonriendo al mismo tiempo, o también hay problema si
//ninguno de los dos está sonriendo (retornamos True en estos casos). En cualquier
//otro caso no hay problema y retornamos False.
//Cree un programa y dentro del programa una función que se llame problemamonos,
//y que reciba dos parámetros (a_sonrie y b_sonrie). Esos parámetros son “Boleanos”,
//E indican si el False “mono a” y el “mono b” están sonriendo o no. La función debe
//retornar True o False (para indicar si hay un problema con los monos sonrientes o no hay problema).
import java.util.Scanner;
public class RepasoParcial17 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        boolean a_sonrie,b_sonrie;
        System.out.println("El mono numero uno esta sonriendo? true o false");
        a_sonrie = kb.nextBoolean();
        System.out.println("El mono numero dos esta sonriendo? true o false");
         b_sonrie = kb.nextBoolean();

        problemaMonos(a_sonrie, b_sonrie);
    
    }
    public static boolean problemaMonos(boolean p1,boolean p2){
     boolean resultado;

     if ((p1==true)&&(p2==true)||(p1==false)&&(p2==false)) {
      System.out.println("Hay problema entre los monos");
        resultado = true;
        
     }else{
         System.out.println("NO hay problemas entre los monos");
         resultado= false;
     }
     return resultado;
    }
    
}
