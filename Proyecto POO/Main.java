import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        
        String marca; String nombre; String modelo; String tipoConexion;
        String puertoConexion; String tipoPantalla;
        double precioVenta=0; double precioAlquiler=0; double consumoEnergia;
        int opc; int añoFabricacion=0; int menu =0;
        
        ArrayList<Equipo> arrayEquipo = new ArrayList<Equipo>();

        arrayEquipo.add(new Audio("Technics","Giradiscos","SL_1200_MKII",
        "Audio",500000,50000,1900,"RCA, Phono"));

        arrayEquipo.add(new Electrodomestico("Philips","Retro Radio","AY1320",
        "Electrodomestico",900000,90000,1890, 500));

        arrayEquipo.add(new Electronica("Nintendo","NES","Consola de videojuegos",
        "Electronica",250000,25000,1790, "RCA"));

        arrayEquipo.add(new Video("LG","Gear_1","IIV5-llP",
        "Video",100000,10000,1790, "IPS"));

        System.out.println("Biembenido al Rincón de Guada y Sam");
        System.out.println("A Continuacion Encontraras un Menu que te Dara a Conocer lo que Puedes Hacer en Nuestra Tienda");
        while (menu==0) {
            opc=0;      
            try {
                
                System.out.println("Ingrese el Numero 1 Para Registrar un Nuevo Equipo ");
                System.out.println("Ingrese el Numero 2 Para Ver el Inventario de Nuestra Tienda ");
                System.out.println("Ingrese el Numero 3 Para Buscar un Equipo ");
                System.out.println("Ingrese el Numero 4 Para Comprar Equipos ");
                System.out.println("Ingrese el Numero 5 Para Alquilar Equipos ");
                System.out.println("Ingrese el Numero -1 para Salir del Menu");
                opc = kb.nextInt();
            } catch (Exception e) {
            System.out.println("El Parametro Ingresado no es de Tipo Entero...");
            kb.nextLine();
            continue;
            }

            if (opc == 1) {
                
                while (menu==0) {
                    int agrEqui=0;
                    try {
                        
                        System.out.println("Para Agregar Equipos de Audio Ingresa el Numero 1");
                        System.out.println("Para Agregar Equipos Electrodomesticos Ingresa el Numero 2");
                        System.out.println("Para Agregar Equipos de Electronica Ingresa el Numero 3");
                        System.out.println("Para Agregar Equipos de Video Ingresa el Numero 4");
                        System.out.println("Para Dejar de Agregar Equipos Ingresa el Numero -1");
                        agrEqui= kb.nextInt();
                    } catch (Exception e) {
                        System.out.println("El Parametro Ingresado no es de Tipo Entero...");
                        kb.nextLine();
                        continue;
                    }

                    if (agrEqui==1) {
                        
                        System.out.println("Ingresa la Marca del Equipo de Audio");
                        marca= kb.next();
                        System.out.println("Ingresa el Nombre del Equipo");
                        nombre = kb.next();
                        System.out.println("Ingresa el Modelo del Equipo");
                        modelo = kb.next();
                        try {
                            
                            System.out.println("Ingresa el Precio del Equipo");
                            precioVenta = kb.nextDouble();

                        } catch (Exception e) {
                        System.out.println("El Parametro Ingresado no es de Tipo Double...");
                        kb.nextLine();
                        continue;
                        }
                        try {
                            
                            System.out.println("Ingresa el Precio por el Cual Deseas que el Equipo sea Alquilado");
                            precioAlquiler = kb.nextDouble();

                        } catch (Exception e) {
                            System.out.println("El Parametro Ingresado no es de Tipo Double...");
                            kb.nextLine();
                            continue;
                        }
                        try {
                            
                            System.out.println("Ingresa el año de Fabricacion del Equipo ");
                            añoFabricacion = kb.nextInt();
                        } catch (Exception e) {
                            System.out.println("El Parametro Ingresado no es de Tipo Entero...");
                            kb.nextLine();
                            continue;
                        }
                        System.out.println("Ingresa el Tipo de Conexion del Equipo ");
                        tipoConexion = kb.next();
                        
                        arrayEquipo.add(new Audio(marca,nombre,modelo,"Audio",precioVenta,precioAlquiler,
                        añoFabricacion,tipoConexion));
                        
                        System.out.println("El Equipo se ha Agregado Correctamente al Inventario De la Tienda");

                        
                        System.out.println();
                        
                    }else if (agrEqui==2) {
                        System.out.println("Ingresa la Marca del Electrodomestico");
                        marca= kb.next();
                        System.out.println("Ingresa el Nombre del Equipo");
                        nombre = kb.next();
                        System.out.println("Ingresa el Modelo del Equipo");
                        modelo = kb.next();
                        try {
                            
                            System.out.println("Ingresa el Precio del Equipo");
                            precioVenta = kb.nextDouble();

                        } catch (Exception e) {
                        System.out.println("El Parametro Ingresado no es de Tipo Double...");
                        kb.nextLine();
                        continue;
                        }
                        try {
                            
                            System.out.println("Ingresa el Precio por el Cual Deseas que el Equipo sea Alquilado");
                            precioAlquiler = kb.nextDouble();

                        } catch (Exception e) {
                            System.out.println("El Parametro Ingresado no es de Tipo Double...");
                            kb.nextLine();
                            continue;
                        }
                        try {
                            
                            System.out.println("Ingresa el año de Fabricacion del Equipo ");
                            añoFabricacion = kb.nextInt();
                        } catch (Exception e) {
                            System.out.println("El Parametro Ingresado no es de Tipo Entero...");
                            kb.nextLine();
                            continue;
                        }
                        System.out.println("Ingresa el Consumo de Energia que Tiene el Equipo");
                        consumoEnergia = kb.nextDouble();
                        
                        arrayEquipo.add(new Electrodomestico(marca,nombre,modelo,"Electrodomestico",
                        precioVenta,precioAlquiler,
                        añoFabricacion,consumoEnergia));

                        System.out.println("El Equipo se ha Agregado Correctamente al Inventario De la Tienda");

                        System.out.println();
                        
                    }
                        
                    else if (agrEqui==3) {
                        System.out.println("Ingresa la Marca del Equipo Electronico");
                        marca= kb.next();
                        System.out.println("Ingresa el Nombre del Equipo ");
                        nombre = kb.next();
                        System.out.println("Ingresa el Modelo del Equipo ");
                        modelo = kb.next();
                        try {
                            
                            System.out.println("Ingresa el Precio del Equipo");
                            precioVenta = kb.nextDouble();

                        } catch (Exception e) {
                        System.out.println("El Parametro Ingresado no es de Tipo Double...");
                        kb.nextLine();
                        continue;
                        }
                        try {
                            
                            System.out.println("Ingresa el Precio por el Cual Deseas que el Equipo sea Alquilado");
                            precioAlquiler = kb.nextDouble();

                        } catch (Exception e) {
                            System.out.println("El Parametro Ingresado no es de Tipo Double...");
                            kb.nextLine();
                            continue;
                        }
                        try {
                            
                            System.out.println("Ingresa el año de Fabricacion del Equipo ");
                            añoFabricacion = kb.nextInt();
                        } catch (Exception e) {
                            System.out.println("El Parametro Ingresado no es de Tipo Entero...");
                            kb.nextLine();
                            continue;
                        }
                        System.out.println("Ingresa el Puerto de Conexion que Tiene el Equipo");
                        puertoConexion = kb.next();
                        
                        arrayEquipo.add(new Electronica(marca,nombre,modelo,"Electronico",
                        precioVenta,precioAlquiler,
                        añoFabricacion,puertoConexion));

                        System.out.println("El Equipo se ha Agregado Correctamente al Inventario De la Tienda");

                        System.out.println();
                        
                    }else if (agrEqui==4) {
                        System.out.println("Ingresa la Marca del Equipo de Video");
                        marca= kb.next();
                        System.out.println("Ingresa el Nombre del Equipo ");
                        nombre = kb.next();
                        System.out.println("Ingresa el Modelo del Equipo ");
                        modelo = kb.next();
                        try {
                            
                            System.out.println("Ingresa el Precio del Equipo");
                            precioVenta = kb.nextDouble();

                        } catch (Exception e) {
                        System.out.println("El Parametro Ingresado no es de Tipo Double...");
                        kb.nextLine();
                        continue;
                        }
                        try {
                            
                            System.out.println("Ingresa el Precio por el Cual Deseas que el Equipo sea Alquilado");
                            precioAlquiler = kb.nextDouble();

                        } catch (Exception e) {
                            System.out.println("El Parametro Ingresado no es de Tipo Double...");
                            kb.nextLine();
                            continue;
                        }
                        try {
                            
                            System.out.println("Ingresa el año de Fabricacion del Equipo ");
                            añoFabricacion = kb.nextInt();
                        } catch (Exception e) {
                            System.out.println("El Parametro Ingresado no es de Tipo Entero...");
                            kb.nextLine();
                            continue;
                        }
                        System.out.println("Ingresa el Tipo de Pantalla que Tiene el Equipo");
                        tipoPantalla = kb.next();
                        
                        arrayEquipo.add(new Video(marca,nombre,modelo,"Video",
                        precioVenta,precioAlquiler,
                        añoFabricacion,tipoPantalla));

                        System.out.println("El Equipo se ha Agregado Correctamente al Inventario De la Tienda");

                        System.out.println();
                        
                    }else if (agrEqui==-1) {
                        System.out.println("Has Decidido Dejar de Agregar Equipos...");
                        System.out.println();
                        break;
                    }
                    
                    else{
                        System.out.println("Error Opcion no Valida");
                    }
                }
                    
            }
                
                
            else if (opc==2) {
                MostrarInventario(arrayEquipo);

            }else if (opc==3) {
                
                BuscarEquipo(arrayEquipo);

            }else if (opc==4) {

                MostrarInventarioCompra(arrayEquipo);
                
            }else if (opc==5) {

                MostrarInventarioAlquiler(arrayEquipo);
                
            }else if (opc==-1) {
                System.out.println("Gracias por Visitarnos Vuelva Pronto");
                System.out.println("Saliendo del Programa...");
                break;
            }else{
                System.out.println("Opcion no Valida...");
                System.out.println("Por Favor Ingresar una Opcion Valida");
            }
            
        }
    }
    public static void MostrarInventario(ArrayList<Equipo>p1){
    
        System.out.println("Los Equipos que Tenemos en el Inventario de la Tienda son: ");
        System.out.println();
        for (Equipo a : p1) {
            System.out.println(a.getDatos());
            
        }   
        System.out.println();
    }
    public static void BuscarEquipo(ArrayList<Equipo>p1){
        Scanner kb= new Scanner(System.in);
        int añoFabricacion=0;
        double precio=0;

        System.out.println("Ingresa el Tipo del Equipo de que Desea Buscar");
        String tipo = kb.next();
        System.out.println("Ingresa el Modelo");
        String mod = kb.next();
        System.out.println("Ingresa la Marca ");
        String marca = kb.next();
        try {
            System.out.println("Ingresa el año de Fabricacion");
            añoFabricacion = kb.nextInt();
            
        } catch (Exception e) {
            System.out.println("El Parametro Ingresado no es de Tipo Entero...");
            kb.nextLine();
            
        }try {
            System.out.println("Ingresa el precio");
            precio = kb.nextDouble();
        } catch (Exception e) {
            System.out.println("El Parametro Ingresado no es de Tipo Double...");
            kb.nextLine();
            
        }

        System.out.println();

        for (Equipo equipo : p1) {
        if (tipo.equalsIgnoreCase(equipo.getTipoEquipo())) {

            if (mod.equalsIgnoreCase(equipo.getModelo())) {

                if (marca.equalsIgnoreCase(equipo.getMarca())) {

                    if (equipo.getañoFabricacion()==añoFabricacion) {

                        if (precio==equipo.getPrecioVenta()) {
                            System.out.println("Equipo Encontrado: ");
                            System.out.println(equipo.getDatos());
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
    }
public static void MostrarInventarioCompra(ArrayList<Equipo>p1){
    Scanner kb= new Scanner(System.in);
    System.out.println("Ingrese su Nombre");
    String nom = kb.nextLine();

    System.out.println("Ingrese la Fecha del Dia de la Compra");
    String fecha = kb.nextLine();

    String tipo = "Venta";

        Compra comp = new Compra(nom, fecha, tipo);
        int opc=0;


        while ((opc!=-1)&&!p1.isEmpty()) {
            System.out.println("Los Equipos que Tenemos Para la Venta Son: ");
            System.out.println();
            int contador=0;
            for (Equipo a : p1) {
                System.out.println("Ingrese el Numero "+contador+" para seleccionar este Eqipo ");
                System.out.println(a.getDatos());
                contador ++;
            }  
            try {
                
                System.out.println("Ingrese el Numero del Equipo que Desea Comprar o Digite -1 para Terminar Compra");
                opc=kb.nextInt();
            } catch (Exception e) {
                System.out.println("El Parametro Ingresado no es de Tipo Entero...");
                kb.nextLine();
                continue;
            } 
            if (opc!=-1) {
                
                comp.setEquipo(p1.get(opc));
                p1.remove(opc);
                
        }
        FacturaVenta(comp);
        System.out.println();
    }
    }
    public static void MostrarInventarioAlquiler(ArrayList<Equipo>p1){
        
        Scanner kb= new Scanner(System.in);
        System.out.println("Ingrese su Nombre");
        String nom = kb.nextLine();
        System.out.println("Ingrese la Fecha del Dia del Alquiler");
        String fecha = kb.nextLine();
        String tipo = "Alquiler";

        Renta renta = new Renta(nom, fecha, tipo);
        int opc=0;

        while ((opc!=-1)&&!p1.isEmpty()) {
            System.out.println("Los Equipos que Tenemos Para Alquilar Son: ");
            System.out.println();
            int contador=0;
            for (Equipo a : p1) {
                System.out.println("Ingrese el Numero "+contador+" para seleccionar este Eqipo ");
                System.out.println(a.getDatos());
                contador ++;
            }   
            try {
                
                System.out.println("Ingrese el Numero del Equipo que Desea Alquitar o Digite -1 para Terminar el Servicio de Alquiler");
                opc=kb.nextInt();
            } catch (Exception e) {
                System.out.println("El Parametro Ingresado no es de Tipo Entero...");
                kb.nextLine();
                continue;
            }
            if (opc!=-1) {
                
                renta.setEquipo(p1.get(opc));
                p1.remove(opc);
                
            }  
        }

        FacturaRenta(renta);
        System.out.println();

    }
    public static void FacturaVenta(Compra p1){
        ArchivoManager archivoManager = new ArchivoManager();

        StringBuilder contenidoFactura = new StringBuilder();
        contenidoFactura.append("Factura De Ventas: \n");
        contenidoFactura.append("Cliente: ").append(p1.getNombre()).append("\n");
        contenidoFactura.append("Fecha: ").append(p1.getFecha()).append("\n");
        contenidoFactura.append("\n");
        int contador=1;
        
        for (Equipo a : p1.arrayCompra) {
            
            contenidoFactura.append("Equipo: "+ contador+" ").append(a.getNombre()).append("\n");
            contenidoFactura.append("Precio Venta: ").append(a.getPrecioVenta()).append("\n");
            contenidoFactura.append("\n");
            contador++;
        }
        contenidoFactura.append("Total a Pagar: ").append(p1.getTotal()).append("\n");

        String rutaArchivo = "C:\\Users\\Samuel\\Desktop\\Proyecto POO\\FacturaVenta.txt"; 

        archivoManager.crearFactura(rutaArchivo, contenidoFactura.toString());

    }
    public static void FacturaRenta(Renta p1){
        ArchivoManager archivoManager = new ArchivoManager();

        StringBuilder contenidoFactura = new StringBuilder();
        contenidoFactura.append("Factura De Renta: \n");
        contenidoFactura.append("Cliente: ").append(p1.getNombre()).append("\n");
        contenidoFactura.append("Fecha: ").append(p1.getFecha()).append("\n");
        contenidoFactura.append("\n");
        int contador=1;
        for (Equipo a : p1.arrayRenta) {
            
            contenidoFactura.append("Equipo: "+ contador+" ").append(a.getNombre()).append("\n");
            contenidoFactura.append("Precio Renta: ").append(a.getPrecioAlquiler()).append("\n");
            contenidoFactura.append("\n");
            contador++;
        }
        contenidoFactura.append("Total a Pagar por El Alquiler: ").append(p1.getTotal()).append("\n");

        String rutaArchivo = "C:\\Users\\Samuel\\Desktop\\Proyecto POO\\FacturaRenta.txt"; 

        archivoManager.crearFactura(rutaArchivo, contenidoFactura.toString());

    }
    
}




