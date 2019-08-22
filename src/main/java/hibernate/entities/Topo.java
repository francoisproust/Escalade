package hibernate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;



@Entity
@Table(name="topo")
public class Topo implements Serializable {
    @Id @GeneratedValue( strategy=GenerationType.IDENTITY )
    @Column (name="topo_id")
    private Integer topoId;
    @Column (name = "nom",nullable = false,length = 50)
    private String nom;
    @Column(name = "isbn",nullable = false,length = 13)
    private String isbn;
    @Column(name="parution",nullable = false)
    private Date parution;
    @Column (name="disponibilite",nullable = false)
    private Boolean disponibilite;
    @Column(name = "user_id",nullable = false)
    private Integer userId;
    @Column(name = "spot_id",nullable = false)
    private Integer spotId;

    public Integer getTopoId() {
        return topoId;
    }

    public void setTopoId(Integer topoId) {
        this.topoId = topoId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getParution() {
        return parution;
    }

    public void setParution(Date parution) {
        this.parution = parution;
    }

    public Boolean getDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(Boolean disponibilite) {
        this.disponibilite = disponibilite;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSpotId() {
        return spotId;
    }

    public void setSpotId(Integer spotId) {
        this.spotId = spotId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Topo topo = (Topo) o;

        if (!topoId.equals(topo.topoId)) return false;
        if (!nom.equals(topo.nom)) return false;
        if (!isbn.equals(topo.isbn)) return false;
        if (!parution.equals(topo.parution)) return false;
        if (!disponibilite.equals(topo.disponibilite)) return false;
        if (!userId.equals(topo.userId)) return false;
        return spotId.equals(topo.spotId);
    }

    @Override
    public int hashCode() {
        int result = topoId.hashCode();
        result = 31 * result + nom.hashCode();
        result = 31 * result + isbn.hashCode();
        result = 31 * result + parution.hashCode();
        result = 31 * result + disponibilite.hashCode();
        result = 31 * result + userId.hashCode();
        result = 31 * result + spotId.hashCode();
        return result;
    }
}
