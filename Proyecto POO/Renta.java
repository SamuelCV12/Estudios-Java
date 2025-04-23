import java.util.ArrayList;

public class Renta {
    private String fecha;
    private String nombre;
    private String tipo;

    ArrayList<Equipo> arrayRenta= new ArrayList<Equipo>();

    Renta(String nombre, String fecha, String tipo){
        this.nombre = nombre;
        this.fecha = fecha;
        this.tipo = tipo;
        
    }
    public void setEquipo(Equipo p1){
    this.arrayRenta.add(p1);
    }
    public double getTotal(){
        double total=0;
        
            for (Equipo equipo : this.arrayRenta) {
                total= total+equipo.getPrecioAlquiler();
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

