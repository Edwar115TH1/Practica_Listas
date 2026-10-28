//import java.net.Socket;
import java.util.LinkedList;
import java.util.Scanner;
public class Utilidades {
    Validaciones v = new Validaciones();

    public int Menu(Scanner sc){
        System.out.println("Bienvenido a la tienda de don juaquin");
        System.out.println("¿Que desea realizar?");
        System.out.println("1. Registrar venta");
        System.out.println("2. Mostrar venta");
        System.out.println("3. Buscar venta");
        System.out.println("4. Modificar una venta");
        System.out.println("5. Cancelar una venta");
        System.out.println("6. Eliminar venta");
        System.out.println("7. Generar venta");       
        int num = v.ValidaEntero(sc);
        return num;
    }
    
       
    public LinkedList<Objventa> LlenaLista(LinkedList<Objventa> l){
        boolean pedir = true;
        while (pedir) {
            System.out.println("");
        }
        return l;
    }

    public static int NumeroFactura(LinkedList<Objventa> l){
        int UltimaFactura = l.size();
        return UltimaFactura++;   
    }

    public String PedirNombre(Scanner sc, int opt){
        switch (opt) {
            case 1:
                System.out.println("Ingrese el Nombre del cliente: ");
                break;
        
            default:
                System.out.println("Ingrese el Nombre del Vendedor");
                break;
        }
        return sc.next();

    }

    public static  double TotalVenta(Scanner sc, Validaciones v){
        System.out.println("Ingrese el total de la venta: ");
        return  v.ValidaDecimal(sc);
        }

    public int DatosEnteros(Scanner sc, int opt){
        switch (opt) {
            case 1:
                System.out.println("Ingrese la cantidad de productos: ");
                break;
        
            default:
                System.out.println("Ingrese el estado de la venta 1.Registrado | 0.Cancelado | 2.Eliminado");
                break;
        }
        return v.ValidaEntero(sc);

    }
    



}
