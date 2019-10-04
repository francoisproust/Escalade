package hibernate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="spot", schema = "public")
public class Spot implements Serializable {
    @Id @GeneratedValue( strategy=GenerationType.IDENTITY )
    @Column(name = "spot_id",nullable = false)
    private Integer spotId;
    @Column(name="nom",nullable = false,length = 50)
    private String nom;
    @Column(name="localisation",nullable = false,length = 255)
    private String localisation;
    @Column(name="descriptif",nullable = false, length = 255)
    private String descriptif;
    @Column(name="flag_asso", nullable = false)
    private Boolean flagAsso;

    @JoinColumn(name = "user_id",referencedColumnName = "user_id")
    @ManyToOne
    private Utilisateur userId;

    @OneToMany(mappedBy = "description")
    private Collection<Commentaire> descriptions;
    @OneToMany(mappedBy = "spotId")
    private Collection<Secteur> secteurs;
    @ManyToMany(mappedBy = "spots")
    private Set<Topo> topos;

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

    public Utilisateur getUserId() {
        return userId;
    }

    public void setUserId(Utilisateur userId) {
        this.userId = userId;
    }

    public Collection<Commentaire> getDescriptions() {
        return descriptions;
    }

    public void setCommentaires(Collection<Commentaire> descriptions) {
        this.descriptions = descriptions;
    }

    public Collection<Secteur> getSecteurs() {
        return secteurs;
    }

    public void setSecteurs(Collection<Secteur> secteurs) {
        this.secteurs = secteurs;
    }

    public Collection<Topo> getTopos() {
        return topos;
    }

    public void setTopos(Set<Topo> topos) {
        this.topos = topos;
    }



}
