import LineaBus.*;
import java.io.IOException;
import java.lang.*;
//import java.*;

public class Main {
    public static void main(String[] args) {
        try {
            Menu menu = new Menu();
            Object lb = null;
            Object lineasBus = lb;
            APIReader ap = new APIReader();
            LineasBus ll;
            lb = ap.leerLineasBus();
            System.out.println(lb);
        } catch (IOException e) {
            System.out.println("ERROR: se ha producido un error.");
        }

    }

}
