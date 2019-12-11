
package apitmb.lineasMetro;

public class Properties {
    private String ID_LINIA;
    private String CODI_LINIA;
    private String NOM_LINIA;
    private String DESC_LINIA;
    private String ORIGEN_LINIA;
    private String DESTI_LINIA;
    private int NUM_PAQUETS;
    private int ID_OPERADOR;
    private String NOM_OPERADOR;
    private String NOM_TIPUS_TRANSPORT;
    private int CODI_FAMILIA;
    private String NOM_FAMILIA;
    private int ORDRE_FAMILIA;
    private int ORDRE_LINIA;
    private String CODI_TIPUS_CALENDARI;
    private String NOM_TIPUS_CALENDARI;
    private String DATA;
    private String COLOR_LINIA;
    private String COLOR_AUX_LINIA;
    private String COLOR_TEXT_LINIA;

    public Properties() {
    }

    public Properties(String ID_LINIA, String CODI_LINIA, String NOM_LINIA, String DESC_LINIA, String ORIGEN_LINIA, String DESTI_LINIA, int NUM_PAQUETS, int ID_OPERADOR, String NOM_OPERADOR, String NOM_TIPUS_TRANSPORT, int CODI_FAMILIA, String NOM_FAMILIA, int ORDRE_FAMILIA, int ORDRE_LINIA, String CODI_TIPUS_CALENDARI, String NOM_TIPUS_CALENDARI, String DATA, String COLOR_LINIA, String COLOR_AUX_LINIA, String COLOR_TEXT_LINIA) {
        super();
        this.ID_LINIA = ID_LINIA;
        this.CODI_LINIA = CODI_LINIA;
        this.NOM_LINIA = NOM_LINIA;
        this.DESC_LINIA = DESC_LINIA;
        this.ORIGEN_LINIA = ORIGEN_LINIA;
        this.DESTI_LINIA = DESTI_LINIA;
        this.NUM_PAQUETS = NUM_PAQUETS;
        this.ID_OPERADOR = ID_OPERADOR;
        this.NOM_OPERADOR = NOM_OPERADOR;
        this.NOM_TIPUS_TRANSPORT = NOM_TIPUS_TRANSPORT;
        this.CODI_FAMILIA = CODI_FAMILIA;
        this.NOM_FAMILIA = NOM_FAMILIA;
        this.ORDRE_FAMILIA = ORDRE_FAMILIA;
        this.ORDRE_LINIA = ORDRE_LINIA;
        this.CODI_TIPUS_CALENDARI = CODI_TIPUS_CALENDARI;
        this.NOM_TIPUS_CALENDARI = NOM_TIPUS_CALENDARI;
        this.DATA = DATA;
        this.COLOR_LINIA = COLOR_LINIA;
        this.COLOR_AUX_LINIA = COLOR_AUX_LINIA;
        this.COLOR_TEXT_LINIA = COLOR_TEXT_LINIA;
    }

    public String getIDLINIA() {
        return ID_LINIA;
    }

    public void setIDLINIA(String ID_LINIA) {
        this.ID_LINIA = ID_LINIA;
    }

    public String getCODILINIA() {
        return CODI_LINIA;
    }

    public void setCODILINIA(String CODI_LINIA) {
        this.CODI_LINIA = CODI_LINIA;
    }

    public String getNOMLINIA() {
        return NOM_LINIA;
    }

    public void setNOMLINIA(String NOM_LINIA) {
        this.NOM_LINIA = NOM_LINIA;
    }

    public String getDESCLINIA() {
        return DESC_LINIA;
    }

    public void setDESCLINIA(String DESC_LINIA) {
        this.DESC_LINIA = DESC_LINIA;
    }

    public String getORIGENLINIA() {
        return ORIGEN_LINIA;
    }

    public void setORIGENLINIA(String ORIGEN_LINIA) {
        this.ORIGEN_LINIA = ORIGEN_LINIA;
    }

    public String getDESTILINIA() {
        return DESTI_LINIA;
    }

    public void setDESTILINIA(String DESTI_LINIA) {
        this.DESTI_LINIA = DESTI_LINIA;
    }

    public int getNUMPAQUETS() {
        return NUM_PAQUETS;
    }

    public void setNUMPAQUETS(int NUM_PAQUETS) {
        this.NUM_PAQUETS = NUM_PAQUETS;
    }

    public int getIDOPERADOR() {
        return ID_OPERADOR;
    }

    public void setIDOPERADOR(int ID_OPERADOR) {
        this.ID_OPERADOR = ID_OPERADOR;
    }

    public String getNOMOPERADOR() {
        return NOM_OPERADOR;
    }

    public void setNOMOPERADOR(String NOM_OPERADOR) {
        this.NOM_OPERADOR = NOM_OPERADOR;
    }

    public String getNOMTIPUSTRANSPORT() {
        return NOM_TIPUS_TRANSPORT;
    }

    public void setNOMTIPUSTRANSPORT(String NOM_TIPUS_TRANSPORT) {
        this.NOM_TIPUS_TRANSPORT = NOM_TIPUS_TRANSPORT;
    }

    public int getCODIFAMILIA() {
        return CODI_FAMILIA;
    }

    public void setCODIFAMILIA(int CODI_FAMILIA) {
        this.CODI_FAMILIA = CODI_FAMILIA;
    }

    public String getNOMFAMILIA() {
        return NOM_FAMILIA;
    }

    public void setNOMFAMILIA(String NOM_FAMILIA) {
        this.NOM_FAMILIA = NOM_FAMILIA;
    }

    public int getORDREFAMILIA() {
        return ORDRE_FAMILIA;
    }

    public void setORDREFAMILIA(int ORDRE_FAMILIA) {
        this.ORDRE_FAMILIA = ORDRE_FAMILIA;
    }

    public int getORDRELINIA() {
        return ORDRE_LINIA;
    }

    public void setORDRELINIA(int ORDRE_LINIA) {
        this.ORDRE_LINIA = ORDRE_LINIA;
    }

    public String getCODITIPUSCALENDARI() {
        return CODI_TIPUS_CALENDARI;
    }

    public void setCODITIPUSCALENDARI(String CODI_TIPUS_CALENDARI) {
        this.CODI_TIPUS_CALENDARI = CODI_TIPUS_CALENDARI;
    }

    public String getNOMTIPUSCALENDARI() {
        return NOM_TIPUS_CALENDARI;
    }

    public void setNOMTIPUSCALENDARI(String NOM_TIPUS_CALENDARI) {
        this.NOM_TIPUS_CALENDARI = NOM_TIPUS_CALENDARI;
    }

    public String getDATA() {
        return DATA;
    }

    public void setDATA(String DATA) {
        this.DATA = DATA;
    }

    public String getCOLORLINIA() {
        return COLOR_LINIA;
    }

    public void setCOLORLINIA(String COLOR_LINIA) {
        this.COLOR_LINIA = COLOR_LINIA;
    }

    public String getCOLORAUXLINIA() {
        return COLOR_AUX_LINIA;
    }

    public void setCOLORAUXLINIA(String COLOR_AUX_LINIA) {
        this.COLOR_AUX_LINIA = COLOR_AUX_LINIA;
    }

    public String getCOLORTEXTLINIA() {
        return COLOR_TEXT_LINIA;
    }

    public void setCOLORTEXTLINIA(String COLOR_TEXT_LINIA) {
        this.COLOR_TEXT_LINIA = COLOR_TEXT_LINIA;
    }

}
