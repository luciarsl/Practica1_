
package LineaMetro;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Properties {

    @SerializedName("ID_LINIA")
    @Expose
    private int iDLINIA;
    @SerializedName("CODI_LINIA")
    @Expose
    private int cODILINIA;
    @SerializedName("NOM_LINIA")
    @Expose
    private String nOMLINIA;
    @SerializedName("DESC_LINIA")
    @Expose
    private String dESCLINIA;
    @SerializedName("ORIGEN_LINIA")
    @Expose
    private String oRIGENLINIA;
    @SerializedName("DESTI_LINIA")
    @Expose
    private String dESTILINIA;
    @SerializedName("NUM_PAQUETS")
    @Expose
    private int nUMPAQUETS;
    @SerializedName("ID_OPERADOR")
    @Expose
    private int iDOPERADOR;
    @SerializedName("NOM_OPERADOR")
    @Expose
    private String nOMOPERADOR;
    @SerializedName("NOM_TIPUS_TRANSPORT")
    @Expose
    private String nOMTIPUSTRANSPORT;
    @SerializedName("CODI_FAMILIA")
    @Expose
    private int cODIFAMILIA;
    @SerializedName("NOM_FAMILIA")
    @Expose
    private String nOMFAMILIA;
    @SerializedName("ORDRE_FAMILIA")
    @Expose
    private int oRDREFAMILIA;
    @SerializedName("ORDRE_LINIA")
    @Expose
    private int oRDRELINIA;
    @SerializedName("CODI_TIPUS_CALENDARI")
    @Expose
    private String cODITIPUSCALENDARI;
    @SerializedName("NOM_TIPUS_CALENDARI")
    @Expose
    private String nOMTIPUSCALENDARI;
    @SerializedName("DATA")
    @Expose
    private String dATA;
    @SerializedName("COLOR_LINIA")
    @Expose
    private String cOLORLINIA;
    @SerializedName("COLOR_AUX_LINIA")
    @Expose
    private String cOLORAUXLINIA;
    @SerializedName("COLOR_TEXT_LINIA")
    @Expose
    private String cOLORTEXTLINIA;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Properties() {
    }

    /**
     * 
     * @param cODIFAMILIA
     * @param nOMTIPUSCALENDARI
     * @param nOMFAMILIA
     * @param dATA
     * @param cOLORTEXTLINIA
     * @param cODILINIA
     * @param iDLINIA
     * @param cODITIPUSCALENDARI
     * @param dESCLINIA
     * @param cOLORLINIA
     * @param dESTILINIA
     * @param iDOPERADOR
     * @param nOMOPERADOR
     * @param nUMPAQUETS
     * @param oRDRELINIA
     * @param nOMLINIA
     * @param cOLORAUXLINIA
     * @param nOMTIPUSTRANSPORT
     * @param oRDREFAMILIA
     * @param oRIGENLINIA
     */
    public Properties(int iDLINIA, int cODILINIA, String nOMLINIA, String dESCLINIA, String oRIGENLINIA, String dESTILINIA, int nUMPAQUETS, int iDOPERADOR, String nOMOPERADOR, String nOMTIPUSTRANSPORT, int cODIFAMILIA, String nOMFAMILIA, int oRDREFAMILIA, int oRDRELINIA, String cODITIPUSCALENDARI, String nOMTIPUSCALENDARI, String dATA, String cOLORLINIA, String cOLORAUXLINIA, String cOLORTEXTLINIA) {
        super();
        this.iDLINIA = iDLINIA;
        this.cODILINIA = cODILINIA;
        this.nOMLINIA = nOMLINIA;
        this.dESCLINIA = dESCLINIA;
        this.oRIGENLINIA = oRIGENLINIA;
        this.dESTILINIA = dESTILINIA;
        this.nUMPAQUETS = nUMPAQUETS;
        this.iDOPERADOR = iDOPERADOR;
        this.nOMOPERADOR = nOMOPERADOR;
        this.nOMTIPUSTRANSPORT = nOMTIPUSTRANSPORT;
        this.cODIFAMILIA = cODIFAMILIA;
        this.nOMFAMILIA = nOMFAMILIA;
        this.oRDREFAMILIA = oRDREFAMILIA;
        this.oRDRELINIA = oRDRELINIA;
        this.cODITIPUSCALENDARI = cODITIPUSCALENDARI;
        this.nOMTIPUSCALENDARI = nOMTIPUSCALENDARI;
        this.dATA = dATA;
        this.cOLORLINIA = cOLORLINIA;
        this.cOLORAUXLINIA = cOLORAUXLINIA;
        this.cOLORTEXTLINIA = cOLORTEXTLINIA;
    }

    public int getIDLINIA() {
        return iDLINIA;
    }

    public void setIDLINIA(int iDLINIA) {
        this.iDLINIA = iDLINIA;
    }

    public int getCODILINIA() {
        return cODILINIA;
    }

    public void setCODILINIA(int cODILINIA) {
        this.cODILINIA = cODILINIA;
    }

    public String getNOMLINIA() {
        return nOMLINIA;
    }

    public void setNOMLINIA(String nOMLINIA) {
        this.nOMLINIA = nOMLINIA;
    }

    public String getDESCLINIA() {
        return dESCLINIA;
    }

    public void setDESCLINIA(String dESCLINIA) {
        this.dESCLINIA = dESCLINIA;
    }

    public String getORIGENLINIA() {
        return oRIGENLINIA;
    }

    public void setORIGENLINIA(String oRIGENLINIA) {
        this.oRIGENLINIA = oRIGENLINIA;
    }

    public String getDESTILINIA() {
        return dESTILINIA;
    }

    public void setDESTILINIA(String dESTILINIA) {
        this.dESTILINIA = dESTILINIA;
    }

    public int getNUMPAQUETS() {
        return nUMPAQUETS;
    }

    public void setNUMPAQUETS(int nUMPAQUETS) {
        this.nUMPAQUETS = nUMPAQUETS;
    }

    public int getIDOPERADOR() {
        return iDOPERADOR;
    }

    public void setIDOPERADOR(int iDOPERADOR) {
        this.iDOPERADOR = iDOPERADOR;
    }

    public String getNOMOPERADOR() {
        return nOMOPERADOR;
    }

    public void setNOMOPERADOR(String nOMOPERADOR) {
        this.nOMOPERADOR = nOMOPERADOR;
    }

    public String getNOMTIPUSTRANSPORT() {
        return nOMTIPUSTRANSPORT;
    }

    public void setNOMTIPUSTRANSPORT(String nOMTIPUSTRANSPORT) {
        this.nOMTIPUSTRANSPORT = nOMTIPUSTRANSPORT;
    }

    public int getCODIFAMILIA() {
        return cODIFAMILIA;
    }

    public void setCODIFAMILIA(int cODIFAMILIA) {
        this.cODIFAMILIA = cODIFAMILIA;
    }

    public String getNOMFAMILIA() {
        return nOMFAMILIA;
    }

    public void setNOMFAMILIA(String nOMFAMILIA) {
        this.nOMFAMILIA = nOMFAMILIA;
    }

    public int getORDREFAMILIA() {
        return oRDREFAMILIA;
    }

    public void setORDREFAMILIA(int oRDREFAMILIA) {
        this.oRDREFAMILIA = oRDREFAMILIA;
    }

    public int getORDRELINIA() {
        return oRDRELINIA;
    }

    public void setORDRELINIA(int oRDRELINIA) {
        this.oRDRELINIA = oRDRELINIA;
    }

    public String getCODITIPUSCALENDARI() {
        return cODITIPUSCALENDARI;
    }

    public void setCODITIPUSCALENDARI(String cODITIPUSCALENDARI) {
        this.cODITIPUSCALENDARI = cODITIPUSCALENDARI;
    }

    public String getNOMTIPUSCALENDARI() {
        return nOMTIPUSCALENDARI;
    }

    public void setNOMTIPUSCALENDARI(String nOMTIPUSCALENDARI) {
        this.nOMTIPUSCALENDARI = nOMTIPUSCALENDARI;
    }

    public String getDATA() {
        return dATA;
    }

    public void setDATA(String dATA) {
        this.dATA = dATA;
    }

    public String getCOLORLINIA() {
        return cOLORLINIA;
    }

    public void setCOLORLINIA(String cOLORLINIA) {
        this.cOLORLINIA = cOLORLINIA;
    }

    public String getCOLORAUXLINIA() {
        return cOLORAUXLINIA;
    }

    public void setCOLORAUXLINIA(String cOLORAUXLINIA) {
        this.cOLORAUXLINIA = cOLORAUXLINIA;
    }

    public String getCOLORTEXTLINIA() {
        return cOLORTEXTLINIA;
    }

    public void setCOLORTEXTLINIA(String cOLORTEXTLINIA) {
        this.cOLORTEXTLINIA = cOLORTEXTLINIA;
    }

}
