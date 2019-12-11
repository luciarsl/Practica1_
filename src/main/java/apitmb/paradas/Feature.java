package apitmb.paradas;

public class Feature {

    private String type;
    private String id;
    private Geometry geometry;
    private String geometryName;
    private Properties properties;

    public Feature() {

    }

    public Feature(String type, String id, Geometry geometry, String geometryName, Properties properties) {
        super();
        this.type = type;
        this.id = id;
        this.geometry = geometry;
        this.geometryName = geometryName;
        this.properties = properties;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public String getGeometryName() {
        return geometryName;
    }

    public void setGeometryName(String geometryName) {
        this.geometryName = geometryName;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "apitmb.LineaMetro.Feature{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", geometry=" + geometry +
                ", geometryName='" + geometryName + '\'' +
                ", properties=" + properties +
                '}';
    }
}
