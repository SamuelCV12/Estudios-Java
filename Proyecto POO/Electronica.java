public class Electronica extends Equipo{
    private String puertoConexion;

    public Electronica(){

    }
    public Electronica(String marca, String nombre, String modelo, String tipoEquipo,
    double precioVenta, double precioAlquiler, int añoFabricacion, String puertoConexion){

        super(marca, nombre, modelo, tipoEquipo, precioVenta, precioAlquiler, añoFabricacion);
        this.puertoConexion= puertoConexion;

    }
    public String getPuertoConexion(){
        return puertoConexion;
    }
    public void setPuertoConexion(String puertoConexion){
        this.puertoConexion=puertoConexion;
    }
}
