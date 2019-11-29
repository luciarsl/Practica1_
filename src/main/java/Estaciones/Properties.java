
package Estaciones;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Properties {

    @SerializedName("CODI_GRUP_ESTACIO")
    @Expose
    private int CODI_GRUP_ESTACIO;
    @SerializedName("NOM_ESTACIO")
    @Expose
    private String NOM_ESTACIO;
    @SerializedName("PICTO")
    @Expose
    private String PICTO;
    @SerializedName("DATA")
    @Expose
    private String DATA;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Properties() {
    }

    /**
     * 
     * @param DATA
     * @param NOM_ESTACIO
     * @param PICTO
     * @param CODIGRUPESTACIO
     */
    public Properties(int CODIGRUPESTACIO, String NOM_ESTACIO, String PICTO, String DATA) {
        super();
        this.CODI_GRUP_ESTACIO = CODIGRUPESTACIO;
        this.NOM_ESTACIO = NOM_ESTACIO;
        this.PICTO = PICTO;
        this.DATA = DATA;
    }

    public int getCODIGRUPESTACIO() {
        return CODI_GRUP_ESTACIO;
    }

    public void setCODIGRUPESTACIO(int CODI_GRUP_ESTACIO) {
        this.CODI_GRUP_ESTACIO = CODI_GRUP_ESTACIO;
    }

    public String getNOMESTACIO() {
        return NOM_ESTACIO;
    }

    public void setNOMESTACIO(String NOM_ESTACIO) {
        this.NOM_ESTACIO = NOM_ESTACIO;
    }

    public String getPICTO() {
        return PICTO;
    }

    public void setPICTO(String PICTO) {
        this.PICTO = PICTO;
    }

    public String getDATA() {
        return DATA;
    }

    public void setDATA(String DATA) {
        this.DATA = DATA;
    }

}
