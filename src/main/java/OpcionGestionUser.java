import com.sun.xml.internal.ws.util.StringUtils;

import java.text.Normalizer;
import java.util.Scanner;

public class OpcionGestionUser {

    public void misLocalizaciones(User user){
        String respuesta;
        boolean no = false;
        Scanner sc = new Scanner(System.in);

        if (user.getLocalizaciones() == null) {
            System.out.println("no tienes ninguna localizacion creada.");
        } else {
            System.out.println(user.getLocalizaciones());
        }
        do{
            System.out.println("¿Quieres crear una nueva localizacion? (sí/no)");
            respuesta = sc.next();
            respuesta = respuesta.toLowerCase();
            switch (respuesta){
                case "si":
                case "sí":
                    System.out.println("escogio Si");
                    System.out.println(respuesta);
                    nuevaLocalizacion();
                    break;
                case "no":
                    System.out.println("escogio no");
                    System.out.println(respuesta);
                    no = true;
                    break;
                default:
                    System.out.println("las opcines son sí/no");
                    break;
            }
        }while (!no);
    }

    private void nuevaLocalizacion(){
        LeerLocalizations ll = new LeerLocalizations();
        Scanner sc = new Scanner(System.in);
        String nom;
        float longitud;
        float latitud;
        String descripcion;

        DataModel loc = ll.leerLocalizations();
        System.out.println(loc.toString());

        System.out.println("Nombre de la localizacion:");
        nom = sc.next();
    }
}
