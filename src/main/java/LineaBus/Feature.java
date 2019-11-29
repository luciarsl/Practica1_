
package salle.url;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Feature {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("geometry")
    @Expose
    private Geometry geometry;
    @SerializedName("geometry_name")
    @Expose
    private String geometryName;
    @SerializedName("properties")
    @Expose
    private Properties properties;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Feature() {
    }

    /**
     * 
     * @param geometryName
     * @param geometry
     * @param id
     * @param type
     * @param properties
     */
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

}
