package hibernate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name="utilisateur")
public class Utilisateur implements Serializable {
    @Id @GeneratedValue( strategy=GenerationType.IDENTITY )
    @Column (name = "user_id",nullable = false)
    private Integer userId;
    @Column (name = "utilisateur",nullable = false,length = 16)
    private String utilisateur;
    @Column (name = "nom",nullable = false,length = 32)
    private String nom;
    @Column (name = "prenom",nullable = false,length = 32)
    private String prenom;
    @Column (name = "mail",nullable = false,length = 64)
    private String email;
    @Column (name = "password",nullable = false,length = 32)
    private String password;
    @JoinColumn(name = "type_id",referencedColumnName = "type_id")
    @ManyToOne
    private TypeUser typeUser;
    @OneToMany(mappedBy = "comId")
    private Collection<Commentaire> commentaires;
    @OneToMany(mappedBy = "spotId")
    private Collection<Spot> spots;
    @OneToMany(mappedBy = "topoId")
    private Collection<Topo> topos;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(String utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TypeUser getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(TypeUser typeUser) {
        this.typeUser = typeUser;
    }

    public Collection<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(Collection<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public Collection<Spot> getSpots() {
        return spots;
    }

    public void setSpots(Collection<Spot> spots) {
        this.spots = spots;
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

        Utilisateur that = (Utilisateur) o;

        if (!userId.equals(that.userId)) return false;
        if (!utilisateur.equals(that.utilisateur)) return false;
        if (!nom.equals(that.nom)) return false;
        if (!prenom.equals(that.prenom)) return false;
        if (!email.equals(that.email)) return false;
        if (!password.equals(that.password)) return false;
        return typeUser.equals(that.typeUser);
    }

    @Override
    public int hashCode() {
        int result = userId.hashCode();
        result = 31 * result + utilisateur.hashCode();
        result = 31 * result + nom.hashCode();
        result = 31 * result + prenom.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + typeUser.hashCode();
        return result;
    }
}
