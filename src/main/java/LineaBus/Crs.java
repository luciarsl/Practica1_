
package LineaBus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Crs {

    private String type;

    private Properties_ properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Crs() {
    }

    /**
     * 
     * @param type
     * @param properties
     */
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

}
