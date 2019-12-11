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
    private LinkedList<Location> localizaciones;
    private LinkedList<LocalizacionPreferida> locPrefs;

    public User (){
    }

    public User(String nombre, String correo, int anyoNacimineto, LinkedList<Location> localizaciones, LinkedList<LocalizacionPreferida> locPrefs) {
        this.nombre = nombre;
        this.correo = correo;
        this.anyoNacimineto = anyoNacimineto;
        this.localizaciones = localizaciones;
        this.locPrefs = locPrefs;
    }

    public int getAnyoNacimineto() {
        return anyoNacimineto;
    }

    public LinkedList<Location> getLocalizaciones() {
        return localizaciones;
    }

    public LinkedList<LocalizacionPreferida> getLocPrefs() {
        return locPrefs;
    }

    public User crearUsuario() {
        User u = new User();
        try {
            //User json = getJson();
            u = getJson();
            //System.out.println(u);
            //System.out.println(json);
            //System.out.println(json.getNombre());
        } catch (IOException e) {
            Scanner sc = new Scanner(System.in);
            u.localizaciones = null;
            System.out.println("Nombre del usuario: ");
            u.nombre = sc.next();
            System.out.println("correo electronico: ");
            u.correo = sc.next();
            System.out.println("Año de nacimiento: ");
            u.anyoNacimineto = sc.nextInt();
            makeJson(u);
            u.localizaciones = new LinkedList<>();
            u.locPrefs = new LinkedList<>();
            System.out.println("La informacion se ha añadido con éxito!");

        }
        return u;
    }

    private User getJson() throws FileNotFoundException {
        Gson lecturaGson = new Gson();
        FileReader fr = new FileReader("user.json");
        return lecturaGson.fromJson(fr, User.class);
    }

    public void makeJson(User u) {
        try {
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
                ", localizaciones=" + localizaciones +
                ", locPrefs=" + locPrefs +
                '}';
    }
}