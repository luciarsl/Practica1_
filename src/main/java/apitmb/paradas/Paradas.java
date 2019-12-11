package apitmb.paradas;

import apitmb.Crs;
import java.util.List;

public class Paradas {

    private String type;
    private List<Feature> featureParadas = null;
    private int totalFeatures;
    private int numberMatched;
    private int numberReturned;
    private String timeStamp;
    private Crs crs;

    public Paradas() {
    }

    public Paradas(String type, List<Feature> featureParadas, int totalFeatures, int numberMatched, int numberReturned, String timeStamp, Crs crs) {
        super();
        this.type = type;
        this.featureParadas = featureParadas;
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

    public List<Feature> getFeatureParadas() {
        return featureParadas;
    }

    public void setFeatureParadas(List<Feature> featureParadas) {
        this.featureParadas = featureParadas;
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
