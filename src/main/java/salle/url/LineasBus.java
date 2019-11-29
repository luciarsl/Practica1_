
package salle.url;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LineasBus {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("features")
    @Expose
    private List<salle.url.Feature> features = null;
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
    private salle.url.Crs crs;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LineasBus() {
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
    public LineasBus(String type, List<salle.url.Feature> features, int totalFeatures, int numberMatched, int numberReturned, String timeStamp, salle.url.Crs crs) {
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

    public List<salle.url.Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<salle.url.Feature> features) {
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

    public salle.url.Crs getCrs() {
        return crs;
    }

    public void setCrs(salle.url.Crs crs) {
        this.crs = crs;
    }

    @Override
    public String toString() {
        return "LineasBus{" +
                "\ntype='" + type + '\'' +
                ",\n features=" + features +
                ",\n totalFeatures=" + totalFeatures +
                ",\n numberMatched=" + numberMatched +
                ",\n numberReturned=" + numberReturned +
                ",\n timeStamp='" + timeStamp + '\'' +
                ",\n crs=" + crs +
                '}';
    }
}
