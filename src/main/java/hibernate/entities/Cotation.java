package hibernate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "cotation", schema = "public" )
public class Cotation implements Serializable {
    @Id @GeneratedValue( strategy=GenerationType.IDENTITY )
    @Column(name="cotation_id",nullable = false)
    private Integer cotationId;

    @Column (name = "indice",nullable = false,length = 2)
    private String indice;

    @OneToMany(mappedBy = "cotationId")
    private Collection<Longueur> longueurs;

    //@Column (name = "commentaire",nullable = false,length = 50)
    private String commentaire;

    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Collection<Longueur> getLongueurs() {
        return longueurs;
    }

    public void setLongueurs(Collection<Longueur> longueurs) {
        this.longueurs = longueurs;
    }

    public Integer getCotationId() {
        return cotationId;
    }

    public void setCotationId(Integer cotationId) {
        this.cotationId = cotationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cotation cotation = (Cotation) o;

        if (!cotationId.equals(cotation.cotationId)) return false;
        if (!indice.equals(cotation.indice)) return false;
        if (!longueurs.equals(cotation.longueurs)) return false;
        return commentaire.equals(cotation.commentaire);
    }

    @Override
    public int hashCode() {
        int result = cotationId.hashCode();
        result = 31 * result + indice.hashCode();
        result = 31 * result + longueurs.hashCode();
        result = 31 * result + commentaire.hashCode();
        return result;
    }
}
