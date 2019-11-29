import LineaBus.LineasBus;

import java.io.IOException;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        /*OkHttpClient cliente = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.tmb.cat/v1/transit/linies/bus?app_id=3f539d36&app_key=91664a5afdb041c53a2824867899f98a")
                .build();
        Response response;
        Request requestt = new Request.Builder()
                .url("https://api.tmb.cat/v1/transit/linies/metro?app_id=3f539d36&app_key=91664a5afdb041c53a2824867899f98a")
                .build();
        Response responsee;
        try{
            response = cliente.newCall(request).execute();
            responsee = cliente.newCall(requestt).execute();
            String datosJson = null;
            if (response.body() != null){
                datosJson = response.body().string();
            }

            System.out.println(datosJson);

            if (responsee.body() != null){
                datosJson = responsee.body().string();
            }

            System.out.println(datosJson);

            Gson gson = new Gson();

            DataModel dm = gson.fromJson(datosJson, DataModel.class);
            System.out.println(dm);

        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try {
            Menu menu = new Menu();
            System.out.println("hola1");
            APIReader ap = new APIReader();
            System.out.println("hola2");
            LineasBus ll;
            System.out.println("hola3");
            ap.leerLineasBus();
            System.out.println("hola4");
            //System.out.println(ll);
        } catch (IOException e) {
            System.out.println("ERROR: se ha producido un error.");
        }

    }

}
