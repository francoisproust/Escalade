package proust.dev.escalade.hibernate.entities;



import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.GrantedAuthority;
import javax.persistence.*;
import java.io.Serializable;

import java.util.Collection;
import java.util.Set;

@Entity
@Table(name="utilisateur", schema = "public")
public class Utilisateur implements Serializable, UserDetails {
    @Id @GeneratedValue( strategy=GenerationType.IDENTITY )
    @Column (name = "user_id",nullable = false)
    private Integer userId;
    @Column (name = "pseudo",nullable = false,length = 16)
    private String pseudo;
    @Column (name = "nom",nullable = false,length = 32)
    private String nom;
    @Column (name = "prenom",nullable = false,length = 32)
    private String prenom;
    @Column (name = "mail",nullable = false,length = 64)
    private String email;
    @Column (name = "password",nullable = false,length = 32)
    private String password;
    @ManyToOne
    @JoinColumn(name = "type_id")
    private TypeUser typeUser;
    @OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL)
    private Set<Commentaire> commentaires;
    @OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL)
    private Set<Spot> spots;
    @OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL)
    private Set<Topo> topos;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
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

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
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

    public Set<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(Set<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public Set<Spot> getSpots() {
        return spots;
    }

    public void setSpots(Set<Spot> spots) {
        this.spots = spots;
    }

    public Set<Topo> getTopos() {
        return topos;
    }

    public void setTopos(Set<Topo> topos) {
        this.topos = topos;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "userId=" + userId +
                ", pseudo='" + pseudo + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", typeUser=" + typeUser +
                ", commentaires=" + commentaires +
                ", spots=" + spots +
                ", topos=" + topos +
                '}';
    }
}