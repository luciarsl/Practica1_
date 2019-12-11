package apitmb;

public class Crs {

    private String type;
    private Properties_ properties;

    public Crs() {
    }

    public Crs(String type, Properties_ properties) {
        super();
        this.type = type;
        this.properties = properties;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Properties_ getProperties() {
        return properties;
    }

    public void setProperties(Properties_ properties) {
        this.properties = properties;
    }

    public Crs withProperties(Properties_ properties) {
        this.properties = properties;
        return this;
    }

}
