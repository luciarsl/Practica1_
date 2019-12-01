import LineaBus.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.*;
//import java.*;

public class Main {
    public static void main(String[] args) {
        try {
            Menu menu = new Menu();
            menu.escogerOpcion();
            /*User u = new User("a", "a.com", 1000, null);
            OpcionGestionUser ogu = new OpcionGestionUser();
            ogu.misLocalizaciones(u);*/

        } catch (FileNotFoundException fnf) {
            System.out.println("usuario no ha sido introducido anteriormente.");
            //usuario no ha sido introducido con anteriormente.
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("petó");
        }
    }
}
