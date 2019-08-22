package hibernate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "cotation")
public class Cotation implements Serializable {
    @Id @GeneratedValue( strategy=GenerationType.IDENTITY )
    @Column (name = "indice",nullable = false,length = 2)
    private String indice;
    @Column (name = "commentaire",nullable = false,length = 50)
    private String commentaire;

    @OneToMany(mappedBy = "cotation")
    private Collection<Longueur> longueurs;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cotation cotation = (Cotation) o;

        if (!indice.equals(cotation.indice)) return false;
        if (!commentaire.equals(cotation.commentaire)) return false;
        return longueurs.equals(cotation.longueurs);

    }

    @Override
    public int hashCode() {
        int result = indice.hashCode();
        result = 31 * result + commentaire.hashCode();
        result = 31 * result + longueurs.hashCode();
        return result;
    }
}
