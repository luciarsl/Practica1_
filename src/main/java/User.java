import com.google.gson.Gson;
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

    public User(String nombre, String correo, int anyoNacimineto) {
        this.nombre = nombre;
        this.correo = correo;
        this.anyoNacimineto = anyoNacimineto;
    }

    public User crearUsuario() throws IOException {
        User u = new User();
        try {
            User json = getJson();
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
        FileReader fr = new FileReader("User.json");
        System.out.println(fr.toString());
        return lecturaGson.fromJson(fr, User.class);
    }

    private void makeJson(User u) throws IOException {
        System.out.println(u);
        Gson escrituraGson = new Gson();
        escrituraGson.toJson(u, new FileWriter("User.json"));

    }
}
