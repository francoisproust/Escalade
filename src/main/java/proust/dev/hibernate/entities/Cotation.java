package proust.dev.hibernate.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "cotation", schema = "public" )
public class Cotation implements Serializable {
    @Id @GeneratedValue( strategy=GenerationType.IDENTITY )
    @Column(name="cotation_id",nullable = false)
    private Integer cotationId;
    @Column (name = "indice",nullable = false,length = 2)
    private String indice;

    @OneToMany(mappedBy = "cotation", cascade = CascadeType.ALL)
    private Set<Longueur> longueurs;

    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }

    public Integer getCotationId() {
        return cotationId;
    }

    public void setCotationId(Integer cotationId) {
        this.cotationId = cotationId;
    }

    public Set<Longueur> getLongueurs() {
        return longueurs;
    }

    public void setLongueurs(Set<Longueur> longueurs) {
        this.longueurs = longueurs;
    }
}
