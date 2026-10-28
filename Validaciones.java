import java.util.Scanner;

public class Validaciones {
    public int ValidaEntero(Scanner sc){
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese un digito numerico:");
            sc.next();
        }
        return sc.nextInt();
    }
    public double ValidaDecimal(Scanner sc){
        while (!sc.hasNextDouble()) {
            System.out.println("Por favor ingrese un digito numerico:");
            sc.next();
        }
        return sc.nextDouble();
    }






}
