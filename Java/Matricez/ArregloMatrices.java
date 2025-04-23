package Matricez;
public class ArregloMatrices {
    public static void main(String[] args) {
        int[][] edades2={{23214,43543,22322,12345,32324},{23,45,12,11,34}};
        imprimirEdades(edades2);
        System.out.println("");
        System.out.println("Buscar por Id: "+22322);
        buscarId(edades2,22322);
        System.out.println("Buscar por Id: "+ 98498);
        buscarId(edades2, 98498);
    }
    public static void imprimirEdades(int [][] edades) {
        int n = edades[0].length; //numero de columnas
        int i;
        for(i =0; i<n; i++){
            System.out.println("id: "+edades[0][i]+" edad: "+ edades[1][i]);
        }
        
    }
    public static void buscarId(int [][] edades, int id){
        int n= edades[0].length;
        int i;
        boolean encontrado = false;
        for(i =0;i<n; i++){
            if(edades[0][i]==id){
                System.out.println("id: "+ edades[0][i]+ " edad: "+ edades[1][i]);
                encontrado=true;
            }
        }
            if(encontrado==false){
                System.out.println("id: "+id+" NO ENCONTRADO");
            }
        
        
    }
    
}
