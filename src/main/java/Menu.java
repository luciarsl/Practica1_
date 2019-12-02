import java.io.IOException;
import java.util.*;

public class Menu {

    public Menu(){
    }

    private void showMenuPrincipal(){
        System.out.println("1. Gestión de usuario");
        System.out.println("2. Buscar localizaciones");
        System.out.println("3. Planear ruta");
        System.out.println("4. Tiempo de espera del bus");
        System.out.println("5. Salir");
        System.out.println("\nSelecciona una opcion: ");
    }

    private void showMenuGestionUser(){
        System.out.println("a)Mis localizaciones");
        System.out.println("b)Historial de localizaciones");
        System.out.println("c)Mis rutas");
        System.out.println("d)Paradas y estaciones preferidas");
        System.out.println("e)Estaciones inauguradas en mi año de nacimiento");
        System.out.println("f)Volver a menu principal");
        System.out.println("\nSelecciona opcion: ");
    }

    private void escogerOpcionMenu2(User user){
        String op;
        Scanner sc = new Scanner(System.in);
        showMenuGestionUser();
        do{
            op = sc.next();
            switch (op){
                case "a":
                    OpcionGestionUser ogu = new OpcionGestionUser();
                    ogu.misLocalizaciones(user);
                    showMenuGestionUser();
                    break;
                case "b":
                    showMenuGestionUser();
                    break;
                case "c":
                    showMenuGestionUser();
                    break;
                case "d":
                    showMenuGestionUser();
                    break;
                case "e":
                    showMenuGestionUser();
                    break;
                case "f":
                    break;
                default:
                    System.out.println("ERROR: las opciones van de a - f");
                    showMenuGestionUser();
                    break;
            }
        }while(!op.equals("f"));
    }

    public void escogerOpcion() throws IOException {
        User u = new User();
        u = u.crearUsuario();
        String op;
        Scanner sc = new Scanner(System.in);
        showMenuPrincipal();
        do{
            op = sc.next();
            switch (op){
                case "1":
                    escogerOpcionMenu2(u);
                    showMenuPrincipal();
                    break;
                case "2":
                    BuscarLoc bl = new BuscarLoc();
                    bl.buscarLoc(u);
                    showMenuPrincipal();
                    break;
                case "3":
                    showMenuPrincipal();
                    break;
                case "4":
                    showMenuPrincipal();
                    break;
                case "5":
                    break;
                default:
                    System.out.println("ERROR: las opciones van de 1 - 5");
                    showMenuPrincipal();
                    break;
            }
        }while(!op.equals("5"));
    }
}
