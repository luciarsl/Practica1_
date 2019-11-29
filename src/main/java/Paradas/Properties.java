
package Paradas;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Properties {

    @SerializedName("ID_PARADA")
    @Expose
    private int iDPARADA;
    @SerializedName("CODI_PARADA")
    @Expose
    private int cODIPARADA;
    @SerializedName("NOM_PARADA")
    @Expose
    private String nOMPARADA;
    @SerializedName("DESC_PARADA")
    @Expose
    private String dESCPARADA;
    @SerializedName("CODI_INTERC")
    @Expose
    private int cODIINTERC;
    @SerializedName("NOM_INTERC")
    @Expose
    private Object nOMINTERC;
    @SerializedName("NOM_TIPUS_PARADA")
    @Expose
    private String nOMTIPUSPARADA;
    @SerializedName("NOM_TIPUS_SIMPLE_PARADA")
    @Expose
    private String nOMTIPUSSIMPLEPARADA;
    @SerializedName("DESC_TIPUS_PARADA")
    @Expose
    private String dESCTIPUSPARADA;
    @SerializedName("TIPIFICACIO_PARADA")
    @Expose
    private String tIPIFICACIOPARADA;
    @SerializedName("ADRECA")
    @Expose
    private String aDRECA;
    @SerializedName("ID_POBLACIO")
    @Expose
    private int iDPOBLACIO;
    @SerializedName("NOM_POBLACIO")
    @Expose
    private String nOMPOBLACIO;
    @SerializedName("ID_DISTRICTE")
    @Expose
    private int iDDISTRICTE;
    @SerializedName("NOM_DISTRICTE")
    @Expose
    private String nOMDISTRICTE;
    @SerializedName("DATA")
    @Expose
    private String dATA;
    @SerializedName("NOM_VIA")
    @Expose
    private String nOMVIA;
    @SerializedName("NOM_PROPERA_VIA")
    @Expose
    private String nOMPROPERAVIA;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Properties() {
    }

    /**
     * 
     * @param dATA
     * @param nOMPOBLACIO
     * @param cODIINTERC
     * @param iDPOBLACIO
     * @param iDDISTRICTE
     * @param nOMPARADA
     * @param dESCPARADA
     * @param nOMTIPUSSIMPLEPARADA
     * @param nOMDISTRICTE
     * @param nOMVIA
     * @param tIPIFICACIOPARADA
     * @param cODIPARADA
     * @param iDPARADA
     * @param nOMTIPUSPARADA
     * @param nOMINTERC
     * @param dESCTIPUSPARADA
     * @param aDRECA
     * @param nOMPROPERAVIA
     */
    public Properties(int iDPARADA, int cODIPARADA, String nOMPARADA, String dESCPARADA, int cODIINTERC, Object nOMINTERC, String nOMTIPUSPARADA, String nOMTIPUSSIMPLEPARADA, String dESCTIPUSPARADA, String tIPIFICACIOPARADA, String aDRECA, int iDPOBLACIO, String nOMPOBLACIO, int iDDISTRICTE, String nOMDISTRICTE, String dATA, String nOMVIA, String nOMPROPERAVIA) {
        super();
        this.iDPARADA = iDPARADA;
        this.cODIPARADA = cODIPARADA;
        this.nOMPARADA = nOMPARADA;
        this.dESCPARADA = dESCPARADA;
        this.cODIINTERC = cODIINTERC;
        this.nOMINTERC = nOMINTERC;
        this.nOMTIPUSPARADA = nOMTIPUSPARADA;
        this.nOMTIPUSSIMPLEPARADA = nOMTIPUSSIMPLEPARADA;
        this.dESCTIPUSPARADA = dESCTIPUSPARADA;
        this.tIPIFICACIOPARADA = tIPIFICACIOPARADA;
        this.aDRECA = aDRECA;
        this.iDPOBLACIO = iDPOBLACIO;
        this.nOMPOBLACIO = nOMPOBLACIO;
        this.iDDISTRICTE = iDDISTRICTE;
        this.nOMDISTRICTE = nOMDISTRICTE;
        this.dATA = dATA;
        this.nOMVIA = nOMVIA;
        this.nOMPROPERAVIA = nOMPROPERAVIA;
    }

    public int getIDPARADA() {
        return iDPARADA;
    }

    public void setIDPARADA(int iDPARADA) {
        this.iDPARADA = iDPARADA;
    }

    public int getCODIPARADA() {
        return cODIPARADA;
    }

    public void setCODIPARADA(int cODIPARADA) {
        this.cODIPARADA = cODIPARADA;
    }

    public String getNOMPARADA() {
        return nOMPARADA;
    }

    public void setNOMPARADA(String nOMPARADA) {
        this.nOMPARADA = nOMPARADA;
    }

    public String getDESCPARADA() {
        return dESCPARADA;
    }

    public void setDESCPARADA(String dESCPARADA) {
        this.dESCPARADA = dESCPARADA;
    }

    public int getCODIINTERC() {
        return cODIINTERC;
    }

    public void setCODIINTERC(int cODIINTERC) {
        this.cODIINTERC = cODIINTERC;
    }

    public Object getNOMINTERC() {
        return nOMINTERC;
    }

    public void setNOMINTERC(Object nOMINTERC) {
        this.nOMINTERC = nOMINTERC;
    }

    public String getNOMTIPUSPARADA() {
        return nOMTIPUSPARADA;
    }

    public void setNOMTIPUSPARADA(String nOMTIPUSPARADA) {
        this.nOMTIPUSPARADA = nOMTIPUSPARADA;
    }

    public String getNOMTIPUSSIMPLEPARADA() {
        return nOMTIPUSSIMPLEPARADA;
    }

    public void setNOMTIPUSSIMPLEPARADA(String nOMTIPUSSIMPLEPARADA) {
        this.nOMTIPUSSIMPLEPARADA = nOMTIPUSSIMPLEPARADA;
    }

    public String getDESCTIPUSPARADA() {
        return dESCTIPUSPARADA;
    }

    public void setDESCTIPUSPARADA(String dESCTIPUSPARADA) {
        this.dESCTIPUSPARADA = dESCTIPUSPARADA;
    }

    public String getTIPIFICACIOPARADA() {
        return tIPIFICACIOPARADA;
    }

    public void setTIPIFICACIOPARADA(String tIPIFICACIOPARADA) {
        this.tIPIFICACIOPARADA = tIPIFICACIOPARADA;
    }

    public String getADRECA() {
        return aDRECA;
    }

    public void setADRECA(String aDRECA) {
        this.aDRECA = aDRECA;
    }

    public int getIDPOBLACIO() {
        return iDPOBLACIO;
    }

    public void setIDPOBLACIO(int iDPOBLACIO) {
        this.iDPOBLACIO = iDPOBLACIO;
    }

    public String getNOMPOBLACIO() {
        return nOMPOBLACIO;
    }

    public void setNOMPOBLACIO(String nOMPOBLACIO) {
        this.nOMPOBLACIO = nOMPOBLACIO;
    }

    public int getIDDISTRICTE() {
        return iDDISTRICTE;
    }

    public void setIDDISTRICTE(int iDDISTRICTE) {
        this.iDDISTRICTE = iDDISTRICTE;
    }

    public String getNOMDISTRICTE() {
        return nOMDISTRICTE;
    }

    public void setNOMDISTRICTE(String nOMDISTRICTE) {
        this.nOMDISTRICTE = nOMDISTRICTE;
    }

    public String getDATA() {
        return dATA;
    }

    public void setDATA(String dATA) {
        this.dATA = dATA;
    }

    public String getNOMVIA() {
        return nOMVIA;
    }

    public void setNOMVIA(String nOMVIA) {
        this.nOMVIA = nOMVIA;
    }

    public String getNOMPROPERAVIA() {
        return nOMPROPERAVIA;
    }

    public void setNOMPROPERAVIA(String nOMPROPERAVIA) {
        this.nOMPROPERAVIA = nOMPROPERAVIA;
    }

}
