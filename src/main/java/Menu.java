import java.io.IOException;
import java.net.UnknownHostException;
import java.util.*;

public class Menu {

    public Menu() {
    }

    private void showMenuPrincipal() {
        System.out.println("1. Gestión de usuario");
        System.out.println("2. Buscar localizaciones");
        System.out.println("3. Planear ruta");
        System.out.println("4. Tiempo de espera del bus");
        System.out.println("5. Salir");
        System.out.println("\nSelecciona una opcion: ");
    }

    private void showMenuGestionUser() {
        System.out.println("a)Mis localizaciones");
        System.out.println("b)Historial de localizaciones");
        System.out.println("c)Mis rutas");
        System.out.println("d)Paradas y estaciones preferidas");
        System.out.println("e)Estaciones inauguradas en mi año de nacimiento");
        System.out.println("f)Volver a menu principal");
        System.out.println("\nSelecciona opcion: ");
    }

    private void escogerOpcionMenu2(User user, DataModel dm, LinkedList<String> historialLoc) {
        Scanner sc = new Scanner(System.in);
        OpcionGestionUser ogu = new OpcionGestionUser();
        String op = "f";
        do {
            try {
                showMenuGestionUser();
                op = sc.next();
                switch (op) {
                    case "a":
                        ogu.misLocalizaciones(user, dm);
                        break;
                    case "b":
                        ogu.historialLocalizaciones(historialLoc);
                        break;
                    case "c":
                        System.out.println("opcion c");
                        break;
                    case "d":
                        ogu.paradasEstacionesFav(user);
                        break;
                    case "e":
                        ogu.estacionesMiAnyo(user);
                        break;
                    case "f":
                        break;
                    default:
                        System.out.println("ERROR: las opciones van de a - f");
                        break;
                }
            } catch (NullPointerException e) {
                System.out.println("Fallo en la lectura de la API.");
            }
        } while (!op.equals("f"));
    }

    public void escogerOpcion() throws IOException {
        LeerLocalizations ll = new LeerLocalizations();
        DataModel dm = ll.leerLocalizations();
        //LinkedList<LocalizacionPreferida> locsPrefs = new LinkedList<>();
        LinkedList<String> historialLoc = new LinkedList<>();
        User u = new User();
        u = u.crearUsuario();
        String op;
        Scanner sc = new Scanner(System.in);
        do {
            showMenuPrincipal();
            op = sc.next();
            switch (op) {
                case "1":
                    escogerOpcionMenu2(u, dm, historialLoc);
                    break;
                case "2":
                    BuscarLoc bl = new BuscarLoc();
                    historialLoc = bl.buscarLoc(u, historialLoc);
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                default:
                    System.out.println("ERROR: las opciones van de 1 - 5");
                    break;
            }
        } while (!op.equals("5"));
    }
}
