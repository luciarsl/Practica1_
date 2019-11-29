
package Estaciones;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Properties {

    @SerializedName("CODI_GRUP_ESTACIO")
    @Expose
    private int cODIGRUPESTACIO;
    @SerializedName("NOM_ESTACIO")
    @Expose
    private String nOMESTACIO;
    @SerializedName("PICTO")
    @Expose
    private String pICTO;
    @SerializedName("DATA")
    @Expose
    private String dATA;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Properties() {
    }

    /**
     * 
     * @param dATA
     * @param nOMESTACIO
     * @param pICTO
     * @param cODIGRUPESTACIO
     */
    public Properties(int cODIGRUPESTACIO, String nOMESTACIO, String pICTO, String dATA) {
        super();
        this.cODIGRUPESTACIO = cODIGRUPESTACIO;
        this.nOMESTACIO = nOMESTACIO;
        this.pICTO = pICTO;
        this.dATA = dATA;
    }

    public int getCODIGRUPESTACIO() {
        return cODIGRUPESTACIO;
    }

    public void setCODIGRUPESTACIO(int cODIGRUPESTACIO) {
        this.cODIGRUPESTACIO = cODIGRUPESTACIO;
    }

    public String getNOMESTACIO() {
        return nOMESTACIO;
    }

    public void setNOMESTACIO(String nOMESTACIO) {
        this.nOMESTACIO = nOMESTACIO;
    }

    public String getPICTO() {
        return pICTO;
    }

    public void setPICTO(String pICTO) {
        this.pICTO = pICTO;
    }

    public String getDATA() {
        return dATA;
    }

    public void setDATA(String dATA) {
        this.dATA = dATA;
    }

}
