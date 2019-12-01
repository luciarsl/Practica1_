
import java.util.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//import org.apache.commons.lang.builder.ToStringBuilder;

public class DataModel {

    private List<Location> locations = null;

    public DataModel() {
    }

    public DataModel(List<Location> locations) {
        super();
        this.locations = locations;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "DataModel{" +
                "locations=" + locations.toString() +
                '}';
    }
}
