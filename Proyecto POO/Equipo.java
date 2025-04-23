public class Equipo {
    private String marca;
    private String nombre;
    private String modelo;
    private String tipoEquipo;
    private double precioVenta;
    private double precioAlquiler;
    private int añoFabricacion;
    
    public Equipo(){
    }

    public Equipo(String marca, String nombre, String modelo, String tipoEquipo,
    double precioVenta, double precioAlquiler, int añoFabricacion){

        this.marca= marca;
        this.nombre = nombre;
        this.modelo = modelo;
        this.tipoEquipo = tipoEquipo;
        this.precioVenta = precioVenta;
        this.precioAlquiler = precioAlquiler;
        this.añoFabricacion = añoFabricacion;

    }
    public Equipo(String tipoEquipo,String modelo,String marca,int añoFabricacion,double precioVenta){

        this.tipoEquipo= tipoEquipo;
        this.marca=marca;
        this.modelo=modelo;
        this.añoFabricacion=añoFabricacion;
        this.precioVenta= precioVenta;

    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;

    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;

    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getTipoEquipo(){
        return tipoEquipo;
    }
    public void setTipoEquipo(String tipoEquipo){
        this.tipoEquipo = tipoEquipo;
    }
    public double getPrecioVenta(){
        return precioVenta;
    }
    public void setPrecioVenta(double precioVenta){
        this.precioVenta = precioVenta;
    }
    public double getPrecioAlquiler(){
        return precioAlquiler;
    }
    public void setPrecioAlquiler(double precioAlquiler){
        this.precioAlquiler = precioAlquiler;
    }
    public int getañoFabricacion(){
        return añoFabricacion;
    }
    public void setañoFabricacion(int añoFabricacion){
        this.añoFabricacion=añoFabricacion;
    }
    public String getDatos(){
        return " La Marca del Equipo es: "+marca+"\n Nombre: " +nombre+"\n Modelo: "+modelo+"\n Tipo: "+ tipoEquipo+ 
        "\n Precio: "+precioVenta+"$"+"\n Precio para Alquilar: "+precioAlquiler+" $"+"\n Año Fabricacion: "+ añoFabricacion+"\n";
    }
    
}
