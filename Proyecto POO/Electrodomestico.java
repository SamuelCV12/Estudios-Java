public class Electrodomestico extends Equipo {
    private double consumoEnergia;

    public Electrodomestico(){

    }
    public Electrodomestico(String marca, String nombre, String modelo, String tipoEquipo,
    double precioVenta, double precioAlquiler, int añoFabricacion, double consumoEnergia){

        super(marca, nombre, modelo, tipoEquipo, precioVenta, precioAlquiler, añoFabricacion);
        this.consumoEnergia= consumoEnergia;
        
    }

    public double getConsumoEnergia(){
        return consumoEnergia;
    }
    public void setConsumoEnergia(double consumoEnergia){
        this.consumoEnergia=consumoEnergia;
    }
}
