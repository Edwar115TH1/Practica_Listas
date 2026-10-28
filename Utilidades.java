import java.net.Socket;
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
    
        
    
}
