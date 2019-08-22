package hibernate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name="topo")
public class Topo implements Serializable {
    @Id @GeneratedValue( strategy=GenerationType.IDENTITY )
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "composition",
            joinColumns = { @JoinColumn(name = "topo_id") },
            inverseJoinColumns = { @JoinColumn(name = "spot_id") }
    )
    private Collection<Spot> spots;
    private Integer topoId;
    @Column (name = "nom",nullable = false,length = 50)
    private String nom;
    @Column(name = "isbn",nullable = false,length = 13)
    private String isbn;
    @Column(name="parution",nullable = false)
    private Date parution;
    @Column (name="disponibilite",nullable = false)
    private Boolean disponibilite;

    @JoinColumn(name = "user_id",referencedColumnName = "user_id")
    @ManyToOne
    private Utilisateur userId;

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

    public Utilisateur getUserId() {
        return userId;
    }

    public void setUserId(Utilisateur userId) {
        this.userId = userId;
    }

    public Collection<Spot> getSpots() {
        return spots;
    }

    public void setSpots(Collection<Spot> spots) {
        this.spots = spots;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Topo topo = (Topo) o;

        if (!spots.equals(topo.spots)) return false;
        if (!topoId.equals(topo.topoId)) return false;
        if (!nom.equals(topo.nom)) return false;
        if (!isbn.equals(topo.isbn)) return false;
        if (!parution.equals(topo.parution)) return false;
        if (!disponibilite.equals(topo.disponibilite)) return false;
        return userId.equals(topo.userId);

    }

    @Override
    public int hashCode() {
        int result = spots.hashCode();
        result = 31 * result + topoId.hashCode();
        result = 31 * result + nom.hashCode();
        result = 31 * result + isbn.hashCode();
        result = 31 * result + parution.hashCode();
        result = 31 * result + disponibilite.hashCode();
        result = 31 * result + userId.hashCode();
        return result;
    }
}
