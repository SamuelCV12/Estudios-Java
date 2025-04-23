public class Video extends Equipo {
    private String tipoPantalla;

    public Video(){
    }

    public Video(String marca, String nombre, String modelo, String tipoEquipo,
    double precioVenta, double precioAlquiler, int añoFabricacion, String tipoPantalla){

        super(marca, nombre, modelo, tipoEquipo, precioVenta, precioAlquiler,añoFabricacion );
        this.tipoPantalla= tipoPantalla;

    }
    public String getTipoPantalla(){
        return tipoPantalla;
    }
    public void setTipoPantalla(String tipoPantalla){
        this.tipoPantalla=tipoPantalla;
    }
}
