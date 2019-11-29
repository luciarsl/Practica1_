//import LineaBus.*;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import salle.url.LineasBus;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class APIReader {
    public APIReader(){
    }

    public void /*salle.url.LineasBus*/ leerLineasBus() throws FileNotFoundException {
        System.out.println("-2");
        System.out.println("-1");

        OkHttpClient cliente = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.tmb.cat/v1/transit/linies/bus?app_id=3f539d36&app_key=91664a5afdb041c53a2824867899f98a")
                .build();
        Response response;
        System.out.println("0");
        try{
            System.out.println("1");
            response = cliente.newCall(request).execute();
            System.out.println("2");
            String datosJson = null;
            if (response.body() != null){
                System.out.println("3");
                datosJson = response.body().string();
            }
            System.out.println("4");

            System.out.println(datosJson);

            Gson gson = new Gson();

            //Todo prefuntar si esta bien hecho o se tiene que hacer en otros metodos separados.
            LineasBus dm = gson.fromJson(datosJson, LineasBus.class);
            System.out.println(dm.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
        //return
    }

}
