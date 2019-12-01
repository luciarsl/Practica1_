import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerLocalizations {

    public LeerLocalizations(){
    }

    public DataModel leerLocalizations() {
        DataModel location = null;
        try {
            location = getLoc();
            System.out.println(location.toString());
        } catch (IOException e) {
            System.out.println("ERROR: se ha producido un error.");
        }
        return location;
    }

    private DataModel getLoc() throws FileNotFoundException {
        Gson lecturaGson = new Gson();
        FileReader fr = new FileReader("localitzacions.json");
        return lecturaGson.fromJson(fr, DataModel.class);
    }
}
