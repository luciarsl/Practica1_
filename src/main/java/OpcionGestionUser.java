
//import org.geotools.geometry.jts.JTS;

//import org.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class OpcionGestionUser {

    public void misLocalizaciones(User user){
        String respuesta;
        boolean no = false;
        Scanner sc = new Scanner(System.in);

        if (user.getLocalizaciones() == null) {
            System.out.println("no tienes ninguna localizacion creada.");
        } else {
            if (user.getLocalizaciones().isEmpty()){
                System.out.println("no tienes ninguna localizacion creada.");
            } else {
                System.out.println(user.getLocalizaciones());
            }
        }
        do{
            System.out.println("¿Quieres crear una nueva localizacion? (sí/no)");
            respuesta = sc.next();
            respuesta = respuesta.toLowerCase();
            switch (respuesta){
                case "si":
                case "sí":
                    //System.out.println("escogio Si");
                    //System.out.println(respuesta);
                    nuevaLocalizacion(user);
                    break;
                case "no":
                    //System.out.println("escogio no");
                    //System.out.println(respuesta);
                    no = true;
                    break;
                default:
                    System.out.println("las opcines son sí/no");
                    break;
            }
        }while (!no);
    }

    private void nuevaLocalizacion(User u){
        LeerLocalizations ll = new LeerLocalizations();
        Scanner sc = new Scanner(System.in);
        boolean yaExiste;
        String nom;
        double longitud;
        double latitud;
        String descripcion;

        DataModel dm = ll.leerLocalizations();
        do {
            yaExiste = false;
            System.out.println("Nombre de la localizacion:");
            nom = sc.nextLine().toLowerCase();

            for (Location loc: dm.getLocations()) {
                if(nom.equals(loc.getName().toLowerCase())){
                    System.out.println("Error! esta localizacion ya existe.");
                    yaExiste = true;
                }
            }
            if (u.getLocalizaciones() != null){
                for (Location loc : u.getLocalizaciones()) {
                    if(nom.equals(loc.getName().toLowerCase())){
                        System.out.println("Error! esta localizacion ya existe.");
                        yaExiste = true;
                    }
                }
            }
        }while(yaExiste);

        //todo: preguntar que es el sistema EPSG:4326
        do{
            System.out.println("Longitud:");
            longitud = sc.nextDouble();
            if (longitud<=-90 || longitud>=90){
                System.out.println("Error, longitud no valida");
            }
        }while(longitud<=-90 || longitud>=90);
        do{
            System.out.println("Latitud:");
            latitud = sc.nextDouble();
            if (latitud<=-90 || latitud>=90){
                System.out.println("Error, longitud no valida");
            }
        }while(latitud<=-90 || latitud>=90);
        //creo una nueva linked list para las coordenadas.
        List<Double> coordenadas = new LinkedList<Double>();
        //a la lista de cooredenadas necesitare para añadir a la nueva localizacion le añado la longitud y latitud recien pedidas.
        coordenadas.add(longitud);
        coordenadas.add(latitud);

        System.out.println("Descripcion: ");
        String basura = sc.nextLine();
        descripcion = sc.nextLine();
        System.out.println("La informacion ha sido introducida con exito");

        //creo una nueva localizacion con los atributos que le he pedido al usuario.
        Location location = new Location(nom, coordenadas , descripcion, null, null, null, null);
        //añado esa localizacion a la lista de localizaciones que tengo en usuario.
        u.getLocalizaciones().add(location);
        //sobreescribo el fichero json de forma que la nueva informacion es la correcta.
        u.makeJson(u);
        System.out.println(u);
    }
    //TODO: istorial de localizaciones?!!?
}
