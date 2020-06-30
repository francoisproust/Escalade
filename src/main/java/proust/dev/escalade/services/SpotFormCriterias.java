package proust.dev.escalade.services;


public class SpotFormCriterias {
    private String localisation = "";
    private String cotationMin ="";
    private String cotationMax ="";
    private Boolean multiSecteurs = false;
    private String longueurMin ="";
    private String longueurMax ="";

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public String getCotationMin() {
        return cotationMin;
    }

    public void setCotationMin(String cotationMin) {
        this.cotationMin = cotationMin;
    }

    public String getCotationMax() {
        return cotationMax;
    }

    public void setCotationMax(String cotationMax) {
        this.cotationMax = cotationMax;
    }


    public String getLongueurMin() {
        return longueurMin;
    }

    public void setLongueurMin(String longueurMin) {
        this.longueurMin = longueurMin;
    }

    public String getLongueurMax() {
        return longueurMax;
    }

    public void setLongueurMax(String longueurMax) {
        this.longueurMax = longueurMax;
    }

    public Boolean getMultiSecteurs() {
        return multiSecteurs;
    }

    public void setMultiSecteurs(Boolean multiSecteurs) {
        this.multiSecteurs = multiSecteurs;
    }
}
