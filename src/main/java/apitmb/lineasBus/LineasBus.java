package apitmb.lineasBus;

import apitmb.Crs;
import java.util.*;

public class LineasBus {

    private String type;
    private List<Feature> features = null;
    private int totalFeatures;
    private int numberMatched;
    private int numberReturned;
    private String timeStamp;
    private Crs crs;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LineasBus() {
    }

    public LineasBus(String type, List<Feature> featureLBS, int totalFeatures, int numberMatched, int numberReturned, String timeStamp, Crs crs) {
        super();
        this.type = type;
        this.features = featureLBS;
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

    public void setFeatures(List<Feature> featureLBS) {
        this.features = featureLBS;
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

    @Override
    public String toString() {
        return "apitmb.LineaBus.LineasBus{" +
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
