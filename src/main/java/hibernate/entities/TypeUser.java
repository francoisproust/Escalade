package hibernate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;



@Entity
@Table(name="type_user")
public class TypeUser implements Serializable {
    @Id @GeneratedValue( strategy=GenerationType.IDENTITY )
    @Column (name = "type_id",nullable = false)
    private Integer typeId;

    @OneToMany(mappedBy="typeUser")
    private Collection<Utilisateur> utilisateurs ;

    @Column(name="type_user",nullable = false,length = 32)
    private String typeUser;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(String typeUser) {
        this.typeUser = typeUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TypeUser typeUser1 = (TypeUser) o;

        if (!typeId.equals(typeUser1.typeId)) return false;
        return typeUser.equals(typeUser1.typeUser);
    }

    @Override
    public int hashCode() {
        int result = typeId.hashCode();
        result = 31 * result + typeUser.hashCode();
        return result;
    }
}

