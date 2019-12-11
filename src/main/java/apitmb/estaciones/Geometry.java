package apitmb.estaciones;

import java.util.List;

public class Geometry {

    private String type;
    private List<Object> coordinates = null;

    public Geometry() {
    }

    public Geometry(String type, List<Object> coordinates) {
        super();
        this.type = type;
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
