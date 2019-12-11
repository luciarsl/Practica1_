
package apitmb.estaciones;

public class Properties {
    private int CODI_GRUP_ESTACIO;
    private String NOM_ESTACIO;
    private String PICTO;
    private String DATA;

    public Properties() {
    }

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

    @Override
    public String toString() {
        return "Properties{" +
                "CODI_GRUP_ESTACIO=" + CODI_GRUP_ESTACIO +
                ", NOM_ESTACIO='" + NOM_ESTACIO + '\'' +
                ", PICTO='" + PICTO + '\'' +
                ", DATA='" + DATA + '\'' +
                '}';
    }
}
