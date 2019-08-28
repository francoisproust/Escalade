package hibernate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name="spot")
public class Spot implements Serializable {
    @Id @GeneratedValue( strategy=GenerationType.IDENTITY )
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

    @OneToMany(mappedBy = "commentaire")
    private Collection<Commentaire> commentaires;
    @OneToMany(mappedBy = "secteur")
    private Collection<Secteur> secteurs;
    @ManyToMany(mappedBy = "spots")
    private Collection<Topo> topos;

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

    public Collection<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(Collection<Commentaire> commentaires) {
        this.commentaires = commentaires;
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

    public void setTopos(Collection<Topo> topos) {
        this.topos = topos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Spot spot = (Spot) o;

        if (!topos.equals(spot.topos)) return false;
        if (!spotId.equals(spot.spotId)) return false;
        if (!nom.equals(spot.nom)) return false;
        if (!localisation.equals(spot.localisation)) return false;
        if (!descriptif.equals(spot.descriptif)) return false;
        if (!flagAsso.equals(spot.flagAsso)) return false;
        if (!userId.equals(spot.userId)) return false;
        if (!commentaires.equals(spot.commentaires)) return false;
        return secteurs.equals(spot.secteurs);

    }

    @Override
    public int hashCode() {
        int result = topos.hashCode();
        result = 31 * result + spotId.hashCode();
        result = 31 * result + nom.hashCode();
        result = 31 * result + localisation.hashCode();
        result = 31 * result + descriptif.hashCode();
        result = 31 * result + flagAsso.hashCode();
        result = 31 * result + userId.hashCode();
        result = 31 * result + commentaires.hashCode();
        result = 31 * result + secteurs.hashCode();
        return result;
    }
}
