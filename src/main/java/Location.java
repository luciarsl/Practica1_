import java.util.*;

public class Location {

    private String name;
    private List<Double> coordinates = null;
    private String description;
    private String architect;
    private Integer inauguration;
    private List<String> characteristics = null;
    private Integer stars;

    public Location() {
    }

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
}
