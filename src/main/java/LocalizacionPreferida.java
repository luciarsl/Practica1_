
import java.util.Date;

public class LocalizacionPreferida {
    Date c2;
    String tipo;

    public LocalizacionPreferida(Date c2, String tipo) {
        this.c2 = c2;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "LocalizacionPreferida{" +
                "c2=" + c2 +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
