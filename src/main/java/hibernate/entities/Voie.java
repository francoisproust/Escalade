package hibernate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;



@Entity
@Table(name = "voie", schema = "public")
public class Voie implements Serializable {
    @Id @GeneratedValue( strategy=GenerationType.IDENTITY )
    @Column (name = "voie_id",nullable = false)
    private Integer voieId;
    @Column (name = "nom",nullable = false,length = 50)
    private String nom;
    @Column (name = "designation",nullable = false,length = 255)
    private String designation;
    @Column (name = "relai",nullable = false)
    private Boolean relai;
    @Column (name = "nb_relai",nullable = false)
    private Integer nbRelai;

    //@Column(name = "secteur_id",nullable = false)
    @JoinColumn(name = "secteur_id",referencedColumnName = "secteur_id")
    @ManyToOne
    private Secteur secteurId;

    @OneToMany(mappedBy = "longueur")
    private Collection<Longueur> longueurs;

    public Integer getVoieId() {
        return voieId;
    }

    public void setVoieId(Integer voieId) {
        this.voieId = voieId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Boolean getRelai() {
        return relai;
    }

    public void setRelai(Boolean relai) {
        this.relai = relai;
    }

    public Integer getNbRelai() {
        return nbRelai;
    }

    public void setNbRelai(Integer nbRelai) {
        this.nbRelai = nbRelai;
    }

    public Secteur getSecteurId() {
        return secteurId;
    }

    public void setSecteurId(Secteur secteurId) {
        this.secteurId = secteurId;
    }

    public Collection<Longueur> getLongueurs() {
        return longueurs;
    }

    public void setLongueurs(Collection<Longueur> longueurs) {
        this.longueurs = longueurs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Voie voie = (Voie) o;

        if (!voieId.equals(voie.voieId)) return false;
        if (!nom.equals(voie.nom)) return false;
        if (!designation.equals(voie.designation)) return false;
        if (!relai.equals(voie.relai)) return false;
        if (!nbRelai.equals(voie.nbRelai)) return false;
        if (!secteurId.equals(voie.secteurId)) return false;
        return longueurs.equals(voie.longueurs);

    }

    @Override
    public int hashCode() {
        int result = voieId.hashCode();
        result = 31 * result + nom.hashCode();
        result = 31 * result + designation.hashCode();
        result = 31 * result + relai.hashCode();
        result = 31 * result + nbRelai.hashCode();
        result = 31 * result + secteurId.hashCode();
        result = 31 * result + longueurs.hashCode();
        return result;
    }
}
