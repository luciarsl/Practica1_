package apitmb.estacionesPorLinea;

import apitmb.Crs;

import java.util.List;

public class EstacionesPorLinea {

    private String type;
    private List<Feature> features = null;
    private int totalFeatures;
    private int numberMatched;
    private int numberReturned;
    private String timeStamp;
    private Crs crs;

    public EstacionesPorLinea() {
    }

    public EstacionesPorLinea(String type, List<Feature> features, int totalFeatures, int numberMatched, int numberReturned, String timeStamp, Crs crs) {
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





}
