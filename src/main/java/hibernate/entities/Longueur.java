package hibernate.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "longueur" ,schema = "public")
public class Longueur implements Serializable {
    @Id @GeneratedValue( strategy=GenerationType.IDENTITY )
    @Column (name = "longueur_id",nullable = false)
    private Integer longueurId;
    @Column (name = "nom",nullable = false,length = 50)
    private String nom;
    @Column (name = "designation",nullable = false,length = 255)
    private String designation;
    @Column (name = "taille_longueur",nullable = false)
    private Integer tailleLongueur;
    @Column (name = "spits",nullable = false)
    private Integer spits;
    @ManyToOne
    @JoinColumn(name = "cotation_id")
    private Cotation cotation;

    @ManyToOne
    @JoinColumn(name = "voie_id")
    private Voie voie;

    public Integer getLongueurId() {
        return longueurId;
    }

    public void setLongueurId(Integer longueurId) {
        this.longueurId = longueurId;
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

    public Integer getTailleLongueur() {
        return tailleLongueur;
    }

    public void setTailleLongueur(Integer tailleLongueur) {
        this.tailleLongueur = tailleLongueur;
    }

    public Integer getSpits() {
        return spits;
    }

    public void setSpits(Integer spits) {
        this.spits = spits;
    }

    public Cotation getCotation() {
        return cotation;
    }

    public void setCotation(Cotation cotation) {
        this.cotation = cotation;
    }

    public Voie getVoie() {
        return voie;
    }

    public void setVoie(Voie voie) {
        this.voie = voie;
    }
}
