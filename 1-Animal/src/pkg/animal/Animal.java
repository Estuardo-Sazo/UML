package pkg.animal;

/**
 *
 * @author Rolaescobar
 */
public class Animal {

    private String ojos;
    private String boca;
    private String especie;

    public Animal(String ojos, String boca, String especie) {
        this.ojos = ojos;
        this.boca = boca;
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    
    public String getOjos() {
        return ojos;
    }

    public void setOjos(String ojos) {
        this.ojos = ojos;
    }

    public String getBoca() {
        return boca;
    }

    public void setBoca(String boca) {
        this.boca = boca;
    }

}
