package hibernate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name="spot")
public class Spot implements Serializable {
    @Id @GeneratedValue( strategy=GenerationType.IDENTITY )
    @Column(name="spot_id", nullable = false)
    private Integer spotId;
    @Column(name="nom",nullable = false,length = 50)
    private String nom;
    @Column(name="localisation",nullable = false,length = 255)
    private String localisation;
    @Column(name="descriptif",nullable = false, length = 255)
    private String descriptif;
    @Column(name="flag_asso", nullable = false)
    private Boolean flagAsso;
    @Column(name="com_id",nullable = false)
    private Integer comId;

    @JoinColumn(name = "user_id",referencedColumnName = "user_id")
    @ManyToOne
    private Utilisateur userId;


    @OneToMany(mappedBy = "secteur")
    private Collection<Secteur> secteurs;

    public Integer getSpotId() {
        return spotId;
    }

    public void setSpotId(Integer spotId) {
        this.spotId = spotId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    public Boolean getFlagAsso() {
        return flagAsso;
    }

    public void setFlagAsso(Boolean flagAsso) {
        this.flagAsso = flagAsso;
    }

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public Utilisateur getUserId() {
        return userId;
    }

    public void setUserId(Utilisateur userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Spot spot = (Spot) o;

        if (!spotId.equals(spot.spotId)) return false;
        if (!nom.equals(spot.nom)) return false;
        if (!localisation.equals(spot.localisation)) return false;
        if (!descriptif.equals(spot.descriptif)) return false;
        if (!flagAsso.equals(spot.flagAsso)) return false;
        if (!comId.equals(spot.comId)) return false;
        return userId.equals(spot.userId);
    }

    @Override
    public int hashCode() {
        int result = spotId.hashCode();
        result = 31 * result + nom.hashCode();
        result = 31 * result + localisation.hashCode();
        result = 31 * result + descriptif.hashCode();
        result = 31 * result + flagAsso.hashCode();
        result = 31 * result + comId.hashCode();
        result = 31 * result + userId.hashCode();
        return result;
    }
}
