public class Audio extends Equipo{
    private String tipoConexion;
    public Audio(){

    }

    public Audio(String marca, String nombre, String modelo, String tipoEquipo,
    double precioVenta, double precioAlquiler, int añoFabricacion, String tipoConexion){

        super(marca, nombre, modelo, tipoEquipo, precioVenta, precioAlquiler, añoFabricacion);
        this.tipoConexion = tipoConexion;
        
    }
    public String getTipoConexion(){
        return tipoConexion;
    }
    public void setTipoConexion(String tipoConexion){
        this.tipoConexion= tipoConexion;
    }



}
