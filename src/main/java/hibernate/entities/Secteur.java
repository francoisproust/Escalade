package hibernate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;


@Entity
@Table(name = "secteur")
public class Secteur implements Serializable {
    @Id @GeneratedValue( strategy=GenerationType.IDENTITY )
    @Column (name = "secteur_id",nullable = false)
    private Integer secteurId;
    @Column (name = "nom",nullable = false,length = 50)
    private String nom;
    @Column (name = "designation",nullable = false,length = 255)
    private String designation;

    //@Column(name = "spot_id",nullable = false)
    @JoinColumn(name = "spot_id",referencedColumnName = "spot_id")
    @ManyToOne
    private Spot spotId;

    @OneToMany(mappedBy = "voie")
    private Collection<Voie> voies;

    public Integer getSecteurId() {
        return secteurId;
    }

    public void setSecteurId(Integer secteurId) {
        this.secteurId = secteurId;
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

    public Spot getSpotId() {
        return spotId;
    }

    public void setSpotId(Spot spotId) {
        this.spotId = spotId;
    }

    public Collection<Voie> getVoies() {
        return voies;
    }

    public void setVoies(Collection<Voie> voies) {
        this.voies = voies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Secteur secteur = (Secteur) o;

        if (!secteurId.equals(secteur.secteurId)) return false;
        if (!nom.equals(secteur.nom)) return false;
        if (!designation.equals(secteur.designation)) return false;
        if (!spotId.equals(secteur.spotId)) return false;
        return voies.equals(secteur.voies);

    }

    @Override
    public int hashCode() {
        int result = secteurId.hashCode();
        result = 31 * result + nom.hashCode();
        result = 31 * result + designation.hashCode();
        result = 31 * result + spotId.hashCode();
        result = 31 * result + voies.hashCode();
        return result;
    }
}
