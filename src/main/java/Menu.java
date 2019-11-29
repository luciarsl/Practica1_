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

    private void escogerOpcionMenu2(){
        String op;
        Scanner sc = new Scanner(System.in);
        showMenuGestionUser();
        op = sc.next();
        do{
            switch (op){
                case "a":
                    break;
                case "b":
                    break;
                case "c":
                    break;
                case "d":
                    break;
                case "e":
                    break;
                case "f":
                    break;
                default:
                    System.out.println("ERROR: las opciones van de a - f");
                    break;
            }
        }while(!op.equals("f"));
    }

    public void escogerOpcion(){
        String op;
        Scanner sc = new Scanner(System.in);
        showMenuPrincipal();
        op = sc.next();
        String op1 = sc.next();
        System.out.println("op = " + op);
        System.out.println("op1 = " + op1);
        do{
            switch (op1){
                case "1":
                    escogerOpcionMenu2();
                    break;
                case "2":
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
        }while(!op.equals("5"));
    }
}
