
package apitmb.paradas;

public class Properties {
    private int ID_PARADA;
    private int CODI_PARADA;
    private String NOM_PARADA;
    private String DESC_PARADA;
    private int CODI_INTERC;
    private Object NOM_INTERC;
    private String NOM_TIPUS_PARADA;
    private String NOM_TIPUS_SIMPLE_PARADA;
    private String DESC_TIPUS_PARADA;
    private String TIPIFICACIO_PARADA;
    private String ADRECA;
    private int ID_POBLACIO;
    private String NOM_POBLACIO;
    private int ID_DISTRICTE;
    private String NOM_DISTRICTE;
    private String DATA;
    private String NOM_VIA;
    private String NOM_PROPERA_VIA;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Properties() {
    }

    public Properties(int ID_PARADA, int CODI_PARADA, String NOM_PARADA, String DESC_PARADA, int CODI_INTERC, Object NOM_INTERC, String NOM_TIPUS_PARADA, String NOM_TIPUS_SIMPLE_PARADA, String DESC_TIPUS_PARADA, String TIPIFICACIO_PARADA, String ADRECA, int ID_POBLACIO, String NOM_POBLACIO, int ID_DISTRICTE, String NOM_DISTRICTE, String DATA, String NOM_VIA, String NOM_PROPERA_VIA) {
        super();
        this.ID_PARADA = ID_PARADA;
        this.CODI_PARADA = CODI_PARADA;
        this.NOM_PARADA = NOM_PARADA;
        this.DESC_PARADA = DESC_PARADA;
        this.CODI_INTERC = CODI_INTERC;
        this.NOM_INTERC = NOM_INTERC;
        this.NOM_TIPUS_PARADA = NOM_TIPUS_PARADA;
        this.NOM_TIPUS_SIMPLE_PARADA = NOM_TIPUS_SIMPLE_PARADA;
        this.DESC_TIPUS_PARADA = DESC_TIPUS_PARADA;
        this.TIPIFICACIO_PARADA = TIPIFICACIO_PARADA;
        this.ADRECA = ADRECA;
        this.ID_POBLACIO = ID_POBLACIO;
        this.NOM_POBLACIO = NOM_POBLACIO;
        this.ID_DISTRICTE = ID_DISTRICTE;
        this.NOM_DISTRICTE = NOM_DISTRICTE;
        this.DATA = DATA;
        this.NOM_VIA = NOM_VIA;
        this.NOM_PROPERA_VIA = NOM_PROPERA_VIA;
    }

    public int getIDPARADA() {
        return ID_PARADA;
    }

    public void setIDPARADA(int ID_PARADA) {
        this.ID_PARADA = ID_PARADA;
    }

    public int getCODIPARADA() {
        return CODI_PARADA;
    }

    public void setCODIPARADA(int CODI_PARADA) {
        this.CODI_PARADA = CODI_PARADA;
    }

    public String getNOMPARADA() {
        return NOM_PARADA;
    }

    public void setNOMPARADA(String NOM_PARADA) {
        this.NOM_PARADA = NOM_PARADA;
    }

    public String getDESCPARADA() {
        return DESC_PARADA;
    }

    public void setDESCPARADA(String DESC_PARADA) {
        this.DESC_PARADA = DESC_PARADA;
    }

    public int getCODIINTERC() {
        return CODI_INTERC;
    }

    public void setCODIINTERC(int CODI_INTERC) {
        this.CODI_INTERC = CODI_INTERC;
    }

    public Object getNOMINTERC() {
        return NOM_INTERC;
    }

    public void setNOMINTERC(Object NOM_INTERC) {
        this.NOM_INTERC = NOM_INTERC;
    }

    public String getNOMTIPUSPARADA() {
        return NOM_TIPUS_PARADA;
    }

    public void setNOMTIPUSPARADA(String NOM_TIPUS_PARADA) {
        this.NOM_TIPUS_PARADA = NOM_TIPUS_PARADA;
    }

    public String getNOMTIPUSSIMPLEPARADA() {
        return NOM_TIPUS_SIMPLE_PARADA;
    }

    public void setNOMTIPUSSIMPLEPARADA(String NOM_TIPUS_SIMPLE_PARADA) {
        this.NOM_TIPUS_SIMPLE_PARADA = NOM_TIPUS_SIMPLE_PARADA;
    }

    public String getDESCTIPUSPARADA() {
        return DESC_TIPUS_PARADA;
    }

    public void setDESCTIPUSPARADA(String DESC_TIPUS_PARADA) {
        this.DESC_TIPUS_PARADA = DESC_TIPUS_PARADA;
    }

    public String getTIPIFICACIOPARADA() {
        return TIPIFICACIO_PARADA;
    }

    public void setTIPIFICACIOPARADA(String TIPIFICACIO_PARADA) {
        this.TIPIFICACIO_PARADA = TIPIFICACIO_PARADA;
    }

    public String getADRECA() {
        return ADRECA;
    }

    public void setADRECA(String ADRECA) {
        this.ADRECA = ADRECA;
    }

    public int getIDPOBLACIO() {
        return ID_POBLACIO;
    }

    public void setIDPOBLACIO(int ID_POBLACIO) {
        this.ID_POBLACIO = ID_POBLACIO;
    }

    public String getNOMPOBLACIO() {
        return NOM_POBLACIO;
    }

    public void setNOMPOBLACIO(String NOM_POBLACIO) {
        this.NOM_POBLACIO = NOM_POBLACIO;
    }

    public int getIDDISTRICTE() {
        return ID_DISTRICTE;
    }

    public void setIDDISTRICTE(int ID_DISTRICTE) {
        this.ID_DISTRICTE = ID_DISTRICTE;
    }

    public String getNOMDISTRICTE() {
        return NOM_DISTRICTE;
    }

    public void setNOMDISTRICTE(String NOM_DISTRICTE) {
        this.NOM_DISTRICTE = NOM_DISTRICTE;
    }

    public String getDATA() {
        return DATA;
    }

    public void setDATA(String DATA) {
        this.DATA = DATA;
    }

    public String getNOMVIA() {
        return NOM_VIA;
    }

    public void setNOMVIA(String NOM_VIA) {
        this.NOM_VIA = NOM_VIA;
    }

    public String getNOMPROPERAVIA() {
        return NOM_PROPERA_VIA;
    }

    public void setNOMPROPERAVIA(String NOM_PROPERA_VIA) {
        this.NOM_PROPERA_VIA = NOM_PROPERA_VIA;
    }

}
