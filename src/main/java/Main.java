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
            //APIReader ap = new APIReader();
            //LineasBus lb;
            //lb = ap.leerLineasBus();
            //System.out.println(lb);
        } catch (FileNotFoundException fnf) {
            //System.out.println("usuario no ha sido introducido anteriormente.");
            //usuario no ha sido introducido con anteriormente.
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("petó");
        }
    }
}
