import java.util.*;

public class BuscarLoc {
    public BuscarLoc(){
    }

    public LinkedList<String> buscarLoc(User u, LinkedList<String> historialLoc){

        //fixme: hacer que las localizaciones solo puedan añadirse una vez (en principio creo que un if y recorriendose el fichero para ver si ya existe y si ya existe no se añade)

        LeerLocalizations ll = new LeerLocalizations();
        Location finalLoc = new Location();
        DataModel dm = ll.leerLocalizations();
        Scanner sc = new Scanner(System.in);
        boolean noExiste;
        String nom;

        noExiste = true;
        System.out.println("Nombre de la localizacion:");
        nom = sc.nextLine().toLowerCase();

        for (Location loc: dm.getLocations()) {
            if(nom.equals(loc.getName().toLowerCase())){
                noExiste = false;
                finalLoc = loc;
                System.out.println(loc.toString());
                historialLoc.addFirst(loc.getName());
            }
        }
        if (u.getLocalizaciones() != null && noExiste){
            for (Location loc : u.getLocalizaciones()) {
                if(nom.equals(loc.getName().toLowerCase())){
                    noExiste = false;
                    finalLoc = loc;
                    System.out.println(loc.toString());
                    historialLoc.addFirst(loc.getName());
                }
            }
        }

        if (noExiste){
            System.out.println("Lo sentimos, no hay ninguna localizacion con este nombre.");
        } else {
            String respuesta;
            boolean no = false;
            do{
                System.out.println("¿Quieres asignar la localizacion encontrada como preferida? (sí/no)");
                respuesta = sc.next();
                respuesta = respuesta.toLowerCase();
                switch (respuesta){
                    case "si":
                    case "sí":
                        String tipo;
                        do{
                            System.out.println("Tipo(casa/feina/estudis/oci/cultura):");
                            tipo = sc.next();
                            if(tipo.equals("casa") || tipo.equals("feina") || tipo.equals("estudis") || tipo.equals("oci") || tipo.equals("cultura")){
                                Date date = new Date();
                                LocalizacionPreferida lp = new LocalizacionPreferida(date, tipo, finalLoc);
                                u.getLocPrefs().add(lp);
                                //locsPrefs.addFirst(lp);
                                //System.out.println(u.getLocPrefs());
                                //System.out.println("\n" + u);
                            } else {
                                System.out.println("Error! se ha de introducir \"casa\", \"feina\", \"estudis\", \"oci\" o \"cultura\".");
                            }
                        }while(!tipo.equals("casa") && !tipo.equals("feina") && !tipo.equals("estudis") && !tipo.equals("oci") && !tipo.equals("cultura"));
                        u.makeJson(u);
                        no = true;
                        break;
                    case "no":
                        no = true;
                        break;
                    default:
                        System.out.println("las opcines son sí/no");
                        break;
                }
            }while (!no);
        }
        return historialLoc;
    }

}
