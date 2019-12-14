//import apitmb.LineaBus.*;
import apitmb.estaciones.Estaciones;
import apitmb.estacionesPorLinea.EstacionesPorLinea;
import apitmb.lineasBus.LineasBus;
import apitmb.lineasMetro.LineasMetro;
import apitmb.paradas.Paradas;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;
import java.net.UnknownHostException;

public class APIReader {
    public APIReader(){
    }

    public LineasBus leerLineasBus() {
        LineasBus lb = new LineasBus();
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
            System.out.println(datosJson);
            Gson gson = new Gson();
            lb = gson.fromJson(datosJson, LineasBus.class);
            System.out.println("lb = " + lb.toString());
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Error al recuperar la información del servidor."
                    + "\nComprueba tu conexión a Internet");
        }
        return lb;
    }

    public EstacionesPorLinea leerEstacionesPorLinea(String codiLinea) {
        EstacionesPorLinea estaciones = new EstacionesPorLinea();
        OkHttpClient cliente = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.tmb.cat/v1/transit/linies/metro/" + codiLinea + "/estacions?app_id=3f539d36&app_key=91664a5afdb041c53a2824867899f98a")
                .build();
        Response response;
        try{
            response = cliente.newCall(request).execute();
            String datosJson = null;
            if (response.body() != null){
                datosJson = response.body().string();
            }
            Gson gson = new Gson();
            estaciones = gson.fromJson(datosJson, EstacionesPorLinea.class);
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Error al recuperar la información del servidor."
                    + "\nComprueba tu conexión a Internet");
        }
        return estaciones;
    }

    public LineasMetro leerLineasMetro() {
        LineasMetro lm = new LineasMetro();
        OkHttpClient cliente = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.tmb.cat/v1/transit/linies/metro?app_id=3f539d36&app_key=91664a5afdb041c53a2824867899f98a")
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
            lm = gson.fromJson(datosJson, LineasMetro.class);
            //System.out.println(estaciones.toString());
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Error al recuperar la información del servidor."
                    + "\nComprueba tu conexión a Internet");
        }
        return lm;
    }

    public Paradas leerParadas() {
        Paradas p = new Paradas();
        OkHttpClient cliente = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.tmb.cat/v1/transit/parades?app_id=3f539d36&app_key=91664a5afdb041c53a2824867899f98a")
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
            p = gson.fromJson(datosJson, Paradas.class);
            //System.out.println(p);
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Error al recuperar la información del servidor."
                    + "\nComprueba tu conexión a Internet");
        }
        return p;
    }

    public Estaciones leerEstaciones() {
        Estaciones e = new Estaciones();
        OkHttpClient cliente = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.tmb.cat/v1/transit/estacions?app_id=3f539d36&app_key=91664a5afdb041c53a2824867899f98a")
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
            e = gson.fromJson(datosJson, Estaciones.class);
            //System.out.println(estaciones.toString());
        } catch (IOException error) {
            //error.printStackTrace();
            System.out.println("Error al recuperar la información del servidor."
                    + "\nComprueba tu conexión a Internet");
        }
        return e;
    }

}
