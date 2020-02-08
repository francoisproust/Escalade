package proust.dev.hibernate.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Table(name = "secteur", schema = "public")
public class Secteur implements Serializable {
    @Id @GeneratedValue( strategy=GenerationType.IDENTITY )
    @Column (name = "secteur_id",nullable = false)
    private Integer secteurId;
    @Column (name = "nom",nullable = false,length = 50)
    private String nom;
    @Column (name = "designation",nullable = false,length = 255)
    private String designation;
    @ManyToOne
    @JoinColumn(name = "spot_id")
    private Spot spot;
    @OneToMany(mappedBy = "secteur",cascade = CascadeType.ALL)
    private Set<Voie> voie;
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

    public Spot getSpot() {
        return spot;
    }

    public void setSpot(Spot spot) {
        this.spot = spot;
    }

    public Set<Voie> getVoie() {
        return voie;
    }

    public void setVoie(Set<Voie> voie) {
        this.voie = voie;
    }
}
