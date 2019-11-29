
//package java;

import java.util.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//import org.apache.commons.lang.builder.ToStringBuilder;

public class Location {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("coordinates")
    @Expose
    private List<Double> coordinates = null;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("architect")
    @Expose
    private String architect;
    @SerializedName("inauguration")
    @Expose
    private Integer inauguration;
    @SerializedName("characteristics")
    @Expose
    private List<String> characteristics = null;
    @SerializedName("stars")
    @Expose
    private Integer stars;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Location() {
    }

    /**
     * 
     * @param characteristics
     * @param architect
     * @param name
     * @param coordinates
     * @param description
     * @param stars
     * @param inauguration
     */
    public Location(String name, List<Double> coordinates, String description, String architect, Integer inauguration, List<String> characteristics, Integer stars) {
        super();
        this.name = name;
        this.coordinates = coordinates;
        this.description = description;
        this.architect = architect;
        this.inauguration = inauguration;
        this.characteristics = characteristics;
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getArchitect() {
        return architect;
    }

    public void setArchitect(String architect) {
        this.architect = architect;
    }

    public Integer getInauguration() {
        return inauguration;
    }

    public void setInauguration(Integer inauguration) {
        this.inauguration = inauguration;
    }

    public List<String> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(List<String> characteristics) {
        this.characteristics = characteristics;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Location{" +
                "\nname='" + name + '\'' +
                ", \ncoordinates=" + coordinates +
                ", \ndescription='" + description + '\'' +
                ", \narchitect='" + architect + '\'' +
                ", \ninauguration=" + inauguration +
                ", \ncharacteristics=" + characteristics +
                ", \nstars=" + stars +
                '}';
    }

    /*
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("coordinates", coordinates).append("description", description).append("architect", architect).append("inauguration", inauguration).append("characteristics", characteristics).append("stars", stars).toString();
    }
*/
}
