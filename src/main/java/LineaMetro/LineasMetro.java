
package LineaMetro;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LineasMetro {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("features")
    @Expose
    private List<Feature> features = null;
    @SerializedName("totalFeatures")
    @Expose
    private int totalFeatures;
    @SerializedName("numberMatched")
    @Expose
    private int numberMatched;
    @SerializedName("numberReturned")
    @Expose
    private int numberReturned;
    @SerializedName("timeStamp")
    @Expose
    private String timeStamp;
    @SerializedName("crs")
    @Expose
    private Crs crs;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LineasMetro() {
    }

    /**
     * 
     * @param timeStamp
     * @param features
     * @param totalFeatures
     * @param crs
     * @param numberReturned
     * @param type
     * @param numberMatched
     */
    public LineasMetro(String type, List<Feature> features, int totalFeatures, int numberMatched, int numberReturned, String timeStamp, Crs crs) {
        super();
        this.type = type;
        this.features = features;
        this.totalFeatures = totalFeatures;
        this.numberMatched = numberMatched;
        this.numberReturned = numberReturned;
        this.timeStamp = timeStamp;
        this.crs = crs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public int getTotalFeatures() {
        return totalFeatures;
    }

    public void setTotalFeatures(int totalFeatures) {
        this.totalFeatures = totalFeatures;
    }

    public int getNumberMatched() {
        return numberMatched;
    }

    public void setNumberMatched(int numberMatched) {
        this.numberMatched = numberMatched;
    }

    public int getNumberReturned() {
        return numberReturned;
    }

    public void setNumberReturned(int numberReturned) {
        this.numberReturned = numberReturned;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Crs getCrs() {
        return crs;
    }

    public void setCrs(Crs crs) {
        this.crs = crs;
    }

}
