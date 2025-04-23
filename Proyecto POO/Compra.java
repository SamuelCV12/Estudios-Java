import java.util.ArrayList;

public class Compra {
    private String fecha;
    private String nombre;
    private String tipo;
    ArrayList<Equipo> arrayCompra= new ArrayList<Equipo>();

    Compra(String nombre, String fecha, String tipo){
        this.nombre = nombre;
        this.fecha = fecha;
        this.tipo = tipo;
        
    }
    public void setEquipo(Equipo p1){
    this.arrayCompra.add(p1);
    }
    public double getTotal(){
        double total=0;
        
            for (Equipo equipo : this.arrayCompra) {
                total= total+equipo.getPrecioVenta();
            
        }
        return total;
    }
    

    public void setFecha(String fecha){
        this.fecha =fecha;
    }
    public String getFecha (){
        return fecha;
    }
    public void setNombre(String nombre){
        this.nombre =nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setTipo(String tipo){
        this.tipo =tipo;
    }
    public String getTipo(){
        return tipo;
    }


}
