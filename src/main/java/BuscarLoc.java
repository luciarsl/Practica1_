import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class BuscarLoc {
    public BuscarLoc(){
    }

    public void buscarLoc(User u){
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
                System.out.println(loc.toString());
                //todo: falta crear el array o list de string para guardar los nombres de las localizacioness que has buscado y encontrado.
            }
        }
        if (u.getLocalizaciones() != null && noExiste){
            for (Location loc : u.getLocalizaciones()) {
                if(nom.equals(loc.getName().toLowerCase())){
                    noExiste = false;
                    System.out.println(loc.toString());
                    //todo: falta crear el array o list de string para guardar los nombres de las localizacioness que has buscado y encontrado.
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
                                LocalizacionPreferida lp = new LocalizacionPreferida(date, tipo);
                                System.out.println(date.toString());
                                System.out.println(lp.toString());
                                //TODO: preguntar que es exactamente eso de "de la relacion entre bla bla" para poder termianr la opcion dos
                            } else {
                                System.out.println("Error! se ha de introducir \"casa\", \"feina\", \"estudis\", \"oci\" o \"cultura\".");
                            }
                        }while(!tipo.equals("casa") && !tipo.equals("feina") && !tipo.equals("estudis") && !tipo.equals("oci") && !tipo.equals("cultura"));

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
    }

}
