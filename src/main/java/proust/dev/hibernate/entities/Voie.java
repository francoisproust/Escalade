package proust.dev.hibernate.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


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
    @ManyToOne
    @JoinColumn(name = "secteur_id")
    @JsonBackReference
    private Secteur secteur;
    @OneToMany(mappedBy = "voie", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Longueur> longueurs;

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

    public Secteur getSecteur() {
        return secteur;
    }

    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
    }

    public Set<Longueur> getLongueurs() {
        return longueurs;
    }

    public void setLongueurs(Set<Longueur> longueurs) {
        this.longueurs = longueurs;
    }
}
