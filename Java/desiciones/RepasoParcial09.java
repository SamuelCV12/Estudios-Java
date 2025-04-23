package desiciones;
//En las elecciones presidenciales, 2 candidatos están
//participando. Cree un programa que le pida al usuario los votos de ambos
//candidatos (int).
//Luego indique cuál candidato es ganador, si es el candidato 1 imprima el candidato
//ganador es el candidato1, si es el candidato 2 imprima el candidato ganador es el
//candidato2.
//Si ambos candidatos tienen la misma cantidad de votos imprima hay empate.
import java.util.Scanner;
public class RepasoParcial09 {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);

        int voto1,voto2;
        System.out.println("Ingrese los votos del candidato numero 1: ");
        voto1= kb.nextInt() ;
        System.out.println("Ingrese los votos del candidato numero 2: ");
        voto2= kb.nextInt() ;

        if (voto1>voto2) {
            System.out.println("El candidato ganador es el candidato numero 1");
            
        }else if (voto1==voto2) {
            System.out.println("Hay un empate");
        }else{
            System.out.println("El candidato ganador es el candidato numero 2");
        }
        
    }
    
}
