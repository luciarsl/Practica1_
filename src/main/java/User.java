import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class User {

    private String nombre;
    private String correo;
    private int anyoNacimineto;

    public User (){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getAnyoNacimineto() {
        return anyoNacimineto;
    }

    public void setAnyoNacimineto(int anyoNacimineto) {
        this.anyoNacimineto = anyoNacimineto;
    }

    public User(String nombre, String correo, int anyoNacimineto) {
        this.nombre = nombre;
        this.correo = correo;
        this.anyoNacimineto = anyoNacimineto;
    }

    public User crearUsuario() {
        User u = new User();
        try {
            User json = getJson();
            System.out.println(json);
            System.out.println(json.getNombre());
        } catch (IOException e) {
            Scanner sc = new Scanner(System.in);
            //User u = new User();
            System.out.println("Nombre del usuario: ");
            u.nombre = sc.next();
            System.out.println("correo electronico: ");
            u.correo = sc.next();
            System.out.println("Año de nacimiento: ");
            u.anyoNacimineto = sc.nextInt();
            makeJson(u);
            System.out.println("La informacion se ha añadido con éxito!");

        }
        return u;
    }

    private User getJson() throws FileNotFoundException {
        Gson lecturaGson = new Gson();
        FileReader fr = new FileReader("user.json");
        return lecturaGson.fromJson(fr, User.class);
    }

    private void makeJson(User u) {
        try {
            //System.out.println(u);
            Gson escrituraGson = new GsonBuilder().setPrettyPrinting().create();
            String json = escrituraGson.toJson(u);
            FileWriter fw = new FileWriter("user.json");
            fw.write(json);
            //obligo a vaciar to_do el string del json en el archivo.
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("ERROR");
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", anyoNacimineto=" + anyoNacimineto +
                '}';
    }

}
