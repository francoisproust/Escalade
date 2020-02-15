package proust.dev.escalade.hibernate.entities;

import javax.persistence.*;
import java.io.Serializable;
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
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Utilisateur utilisateur;
    @OneToMany(mappedBy = "spot",cascade = CascadeType.ALL)
    private Set<Secteur> secteurs;
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

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Set<Secteur> getSecteurs() {
        return secteurs;
    }

    public void setSecteurs(Set<Secteur> secteurs) {
        this.secteurs = secteurs;
    }

    public Set<Topo> getTopos() {
        return topos;
    }

    public void setTopos(Set<Topo> topos) {
        this.topos = topos;
    }
}
