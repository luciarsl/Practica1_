
package salle.url;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Properties_ {

    @SerializedName("name")
    @Expose
    private String name;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Properties_() {
    }

    /**
     * 
     * @param name
     */
    public Properties_(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
