package proust.dev.escalade.hibernate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="type_user", schema = "public")
public class TypeUser implements Serializable {
    @Id @GeneratedValue( strategy=GenerationType.IDENTITY )
    @Column (name = "type_id",nullable = false)
    private Integer typeId;
    @Column(name="libelle_user",nullable = false,length = 32)
    private String libelleUser;

    @OneToMany(mappedBy = "typeUser", cascade = CascadeType.ALL)
    private Set<Utilisateur> utilisateurs;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getLibelleUser() {
        return libelleUser;
    }

    public void setLibelleUser(String libelleUser) {
        this.libelleUser = libelleUser;
    }

    public Set<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(Set<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

}

