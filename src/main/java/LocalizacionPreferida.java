
import java.util.Date;

public class LocalizacionPreferida {
    Location loc;
    Date c2;
    String tipo;

    public LocalizacionPreferida(Date c2, String tipo, Location loc) {
        this.c2 = c2;
        this.tipo = tipo;
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "LocalizacionPreferida{" +
                "loc=" + loc +
                ", c2=" + c2 +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
