import java.util.Scanner;

public class Menu {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Utilidades u = new Utilidades();
        boolean seguir = true;

        while (seguir) {
            switch (u.Menu(sc)) {
                    case 1: 
                        System.out.println("Pagina en construccion");
                        break;
                    case 2:
                        System.out.println("Pagina en construccion");
                        break;
                    case 3:
                        System.out.println("Pagina en construccion");
                        break;
                    case 4:
                        System.out.println("Pagina en construccion");
                        break;
                    case 5:
                        System.out.println("Pagina en construccion");
                        break;
                    case 6:
                        System.out.println("Pagina en construccion");
                        break;
                    case 7:
                        System.out.println("Pagina en construccion");
                        break;
            
                default:
                    System.out.println("Esta opción no esta disponible, por favor valide.");
                    break;
            }
        }
    }

}

