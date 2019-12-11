
package apitmb.estacionesPorLinea;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Properties {

    @SerializedName("ID_ESTACIO_LINIA")
    @Expose
    private int iDESTACIOLINIA;
    @SerializedName("CODI_ESTACIO_LINIA")
    @Expose
    private int cODIESTACIOLINIA;
    @SerializedName("CODI_GRUP_ESTACIO")
    @Expose
    private int cODIGRUPESTACIO;
    @SerializedName("ID_ESTACIO")
    @Expose
    private int iDESTACIO;
    @SerializedName("CODI_ESTACIO")
    @Expose
    private int cODIESTACIO;
    @SerializedName("NOM_ESTACIO")
    @Expose
    private String nOMESTACIO;
    @SerializedName("ORDRE_ESTACIO")
    @Expose
    private int oRDREESTACIO;
    @SerializedName("ID_LINIA")
    @Expose
    private int iDLINIA;
    @SerializedName("CODI_LINIA")
    @Expose
    private int cODILINIA;
    @SerializedName("NOM_LINIA")
    @Expose
    private String nOMLINIA;
    @SerializedName("ORDRE_LINIA")
    @Expose
    private int oRDRELINIA;
    @SerializedName("ID_TIPUS_SERVEI")
    @Expose
    private int iDTIPUSSERVEI;
    @SerializedName("DESC_SERVEI")
    @Expose
    private String dESCSERVEI;
    @SerializedName("ORIGEN_SERVEI")
    @Expose
    private String oRIGENSERVEI;
    @SerializedName("DESTI_SERVEI")
    @Expose
    private String dESTISERVEI;
    @SerializedName("ID_TIPUS_ACCESSIBILITAT")
    @Expose
    private int iDTIPUSACCESSIBILITAT;
    @SerializedName("NOM_TIPUS_ACCESSIBILITAT")
    @Expose
    private String nOMTIPUSACCESSIBILITAT;
    @SerializedName("DATA_INAUGURACIO")
    @Expose
    private String dATAINAUGURACIO;
    @SerializedName("DATA")
    @Expose
    private String dATA;
    @SerializedName("COLOR_LINIA")
    @Expose
    private String cOLORLINIA;
    @SerializedName("PICTO")
    @Expose
    private String pICTO;
    @SerializedName("PICTO_GRUP")
    @Expose
    private String pICTOGRUP;
    @SerializedName("ID_TIPUS_ESTAT")
    @Expose
    private int iDTIPUSESTAT;
    @SerializedName("NOM_TIPUS_ESTAT")
    @Expose
    private String nOMTIPUSESTAT;

    public Properties() {
    }

    public Properties(int iDESTACIOLINIA, int cODIESTACIOLINIA, int cODIGRUPESTACIO, int iDESTACIO, int cODIESTACIO, String nOMESTACIO, int oRDREESTACIO, int iDLINIA, int cODILINIA, String nOMLINIA, int oRDRELINIA, int iDTIPUSSERVEI, String dESCSERVEI, String oRIGENSERVEI, String dESTISERVEI, int iDTIPUSACCESSIBILITAT, String nOMTIPUSACCESSIBILITAT, String dATAINAUGURACIO, String dATA, String cOLORLINIA, String pICTO, String pICTOGRUP, int iDTIPUSESTAT, String nOMTIPUSESTAT) {
        super();
        this.iDESTACIOLINIA = iDESTACIOLINIA;
        this.cODIESTACIOLINIA = cODIESTACIOLINIA;
        this.cODIGRUPESTACIO = cODIGRUPESTACIO;
        this.iDESTACIO = iDESTACIO;
        this.cODIESTACIO = cODIESTACIO;
        this.nOMESTACIO = nOMESTACIO;
        this.oRDREESTACIO = oRDREESTACIO;
        this.iDLINIA = iDLINIA;
        this.cODILINIA = cODILINIA;
        this.nOMLINIA = nOMLINIA;
        this.oRDRELINIA = oRDRELINIA;
        this.iDTIPUSSERVEI = iDTIPUSSERVEI;
        this.dESCSERVEI = dESCSERVEI;
        this.oRIGENSERVEI = oRIGENSERVEI;
        this.dESTISERVEI = dESTISERVEI;
        this.iDTIPUSACCESSIBILITAT = iDTIPUSACCESSIBILITAT;
        this.nOMTIPUSACCESSIBILITAT = nOMTIPUSACCESSIBILITAT;
        this.dATAINAUGURACIO = dATAINAUGURACIO;
        this.dATA = dATA;
        this.cOLORLINIA = cOLORLINIA;
        this.pICTO = pICTO;
        this.pICTOGRUP = pICTOGRUP;
        this.iDTIPUSESTAT = iDTIPUSESTAT;
        this.nOMTIPUSESTAT = nOMTIPUSESTAT;
    }

    public String getDATAINAUGURACIO() {
        return dATAINAUGURACIO;
    }

    public String getnOMESTACIO() {
        return nOMESTACIO;
    }

    public String getpICTO() {
        return pICTO;
    }
}
