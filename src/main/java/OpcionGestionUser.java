import apitmb.estaciones.*;
import apitmb.estacionesPorLinea.*;
import apitmb.lineasMetro.*;
import apitmb.paradas.*;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class OpcionGestionUser {
    private static final double cambio = 111319.44;

    public void misLocalizaciones(User user, DataModel dm){
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
                    nuevaLocalizacion(user, dm);
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

    private void nuevaLocalizacion(User u, DataModel dm){
        //LeerLocalizations ll = new LeerLocalizations();
        Scanner sc = new Scanner(System.in);
        boolean yaExiste;
        String nom;
        double longitud;
        double latitud;
        String descripcion;

        //DataModel dm = ll.leerLocalizations();
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
            longitud = Double.parseDouble(sc.nextLine());
            if (longitud<=-90 || longitud>=90){
                System.out.println("Error, longitud no valida");
            }
        }while(longitud<=-90 || longitud>=90);
        do{
            System.out.println("Latitud:");
            latitud = Double.parseDouble(sc.nextLine());
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
        try {
            u.getLocalizaciones().add(location);
        }catch (java.lang.NullPointerException npe){
            System.out.println("no se ha podido añadir");
        }
        //sobreescribo el fichero json de forma que la nueva informacion es la correcta.
        u.makeJson(u);
        System.out.println(u);
    }

    public void historialLocalizaciones(LinkedList<String> locBuscadas){
        if (locBuscadas.isEmpty()){
            System.out.println("Todavia no hay ninguna localizacion!");
            System.out.println("Para buscar una, accede a la opcion dos del menu principal.");
        } else {
            for (int i = 0; i < locBuscadas.size(); i++) {
                System.out.println("- " + locBuscadas.get(i));
            }
        }
    }

    public void estacionesMiAnyo(User u) throws NullPointerException {
        boolean encontrado =false;
        apitmb.lineasMetro.Feature prueba = new apitmb.lineasMetro.Feature();
        APIReader apiReader = new APIReader();
        LineasMetro lineasMetro = apiReader.leerLineasMetro();
        for (apitmb.lineasMetro.Feature flm : lineasMetro.getFeatures()) {
            EstacionesPorLinea epl = apiReader.leerEstacionesPorLinea(flm.getProperties().getCODILINIA());
            for (apitmb.estacionesPorLinea.Feature fepl: epl.getFeatures()) {
                char[] anyoCreacion = new char[4];
                fepl.getProperties().getDATAINAUGURACIO().getChars(0, 4, anyoCreacion, 0);
                int x = Integer.parseInt(String.valueOf(anyoCreacion));
                if(x==u.getAnyoNacimineto()){
                    System.out.println(fepl.getProperties().getnOMESTACIO() + " " + fepl.getProperties().getpICTO());
                    encontrado = true;
                }
            }
        }
        if(!encontrado) {
            System.out.println("Ninguna estacion de metro se inauguró en tu año de nacimiento :(");
        }
    }

    public void paradasEstacionesFav (User user) throws NullPointerException {
        boolean metroOEstacionCerca;
        //ParadasEstacionFav elementoLista = null;
        APIReader apiReader = new APIReader();
        Estaciones est = apiReader.leerEstaciones();
        Paradas par = apiReader.leerParadas();
        for (LocalizacionPreferida userLocP: user.getLocPrefs()) {
            System.out.println("-" + userLocP.getLoc().getName());
            metroOEstacionCerca = false;
            LinkedList<ParadasEstacionFav> lista = new LinkedList<>();

            for (apitmb.estaciones.Feature festaciones: est.getFeatures()) {
                double incTotM = getIncTot(userLocP, festaciones.getGeometry().getCoordinates());
                if (incTotM <= 500){
                    String stringE ="\t" + festaciones.getProperties().getNOMESTACIO() +
                            " (" + festaciones.getProperties().getCODIGRUPESTACIO() + ") METRO";
                    ParadasEstacionFav elementoLista = new ParadasEstacionFav(stringE, incTotM);
                    lista.add(elementoLista);
                    metroOEstacionCerca = true;
                }
            }
            for (apitmb.paradas.Feature fparadas: par.getFeatures()) {
                double incTotMP = getIncTot(userLocP, fparadas.getGeometry().getCoordinates());
                if (incTotMP <= 500) {
                    String stringP ="\t" + fparadas.getProperties().getNOMPARADA() +
                            " (" + fparadas.getProperties().getCODIPARADA() + ") BUS";
                    ParadasEstacionFav elementoLista = new ParadasEstacionFav(stringP, incTotMP);
                    lista.add(elementoLista);
                    metroOEstacionCerca = true;
                }
            }
            if (!metroOEstacionCerca){
                System.out.println("\tTMB esta haciendo todo lo posible para que el bus y el metro llegue hasta aqui");
            } else {
                //todo ordenar segin la distancia. FERRY HELP! XP
                //lista.sort(lista, new Comparator<>());
                String stringLista = lista.toString();
                stringLista = stringLista.replace('[', ' ');
                stringLista = stringLista.replace(']', ' ');
                stringLista = stringLista.replace(',', ' ');
                System.out.println(stringLista);

            }
        }
    }

    private double getIncTot(LocalizacionPreferida userLocP, List<Object> coordinates) {
        double incrementoLong = (Double) coordinates.get(0) - userLocP.getLoc().getCoordinates().get(0);
        double incrementoLat = (Double) coordinates.get(1) - userLocP.getLoc().getCoordinates().get(1);
        double sqrt = Math.sqrt(Math.pow(incrementoLong * cambio,2) + Math.pow(incrementoLat * cambio,2));
        //System.out.println("Diferencia" + sqrt);
        return sqrt;
    }
}
