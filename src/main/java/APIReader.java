//import LineaBus.*;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import LineaBus.LineasBus;

import java.io.FileNotFoundException;
import java.io.IOException;

public class APIReader {
    public APIReader(){
    }

    public LineasBus leerLineasBus() throws FileNotFoundException {
        LineasBus dm = new LineasBus();
        OkHttpClient cliente = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.tmb.cat/v1/transit/linies/bus?app_id=3f539d36&app_key=91664a5afdb041c53a2824867899f98a")
                .build();
        Response response;
        try{
            response = cliente.newCall(request).execute();
            String datosJson = null;
            if (response.body() != null){
                datosJson = response.body().string();
            }
            //System.out.println(datosJson);
            Gson gson = new Gson();
            dm = gson.fromJson(datosJson, LineasBus.class);
            //System.out.println(dm.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dm;
    }

}
