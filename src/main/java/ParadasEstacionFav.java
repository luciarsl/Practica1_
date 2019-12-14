import apitmb.paradas.Paradas;

public class ParadasEstacionFav {
    String string;
    double distancia;

    public ParadasEstacionFav(String string, double distancia){
        this.string = string;
        this.distancia = distancia;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return string + "\n";
    }
}
