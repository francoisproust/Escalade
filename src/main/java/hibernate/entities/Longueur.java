package hibernate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;


@Entity
@Table(name = "longueur")
public class Longueur implements Serializable {
    @Id @GeneratedValue( strategy=GenerationType.IDENTITY )
    @Column (name = "longueur_id",nullable = false)
    private Integer longueurId;
    @Column (name = "nom",nullable = false,length = 50)
    private String nom;
    @Column (name = "designation",nullable = false,length = 255)
    private String designation;
    @Column (name = "longueur",nullable = false)
    private Integer longueur;
    @Column (name = "spits",nullable = false)
    private Integer spits;

    @JoinColumn(name = "indice",referencedColumnName = "indice")
    @ManyToOne
    private Cotation indice;

    @Column(name = "voie_id",nullable = false)
    @JoinColumn(name = "voie_id",referencedColumnName = "voie_id")
    private Voie voieId;

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

    public Integer getLongueur() {
        return longueur;
    }

    public void setLongueur(Integer longueur) {
        this.longueur = longueur;
    }

    public Integer getSpits() {
        return spits;
    }

    public void setSpits(Integer spits) {
        this.spits = spits;
    }

    public Cotation getIndice() {
        return indice;
    }

    public void setIndice(Cotation indice) {
        this.indice = indice;
    }

    public Voie getVoieId() {
        return voieId;
    }

    public void setVoieId(Voie voieId) {
        this.voieId = voieId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Longueur longueur1 = (Longueur) o;

        if (!longueurId.equals(longueur1.longueurId)) return false;
        if (!nom.equals(longueur1.nom)) return false;
        if (!designation.equals(longueur1.designation)) return false;
        if (!longueur.equals(longueur1.longueur)) return false;
        if (!spits.equals(longueur1.spits)) return false;
        if (!indice.equals(longueur1.indice)) return false;
        return voieId.equals(longueur1.voieId);

    }

    @Override
    public int hashCode() {
        int result = longueurId.hashCode();
        result = 31 * result + nom.hashCode();
        result = 31 * result + designation.hashCode();
        result = 31 * result + longueur.hashCode();
        result = 31 * result + spits.hashCode();
        result = 31 * result + indice.hashCode();
        result = 31 * result + voieId.hashCode();
        return result;
    }
}
