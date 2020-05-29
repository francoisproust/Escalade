package proust.dev.escalade.hibernate.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="topo", schema = "public")
public class Topo implements Serializable {
    @Id @GeneratedValue( strategy=GenerationType.IDENTITY )
    private Integer topoId;
    @Column (name = "nom",nullable = false,length = 50)
    private String nom;
    @Column(name = "isbn",nullable = false,length = 13)
    private String isbn;
    @Column(name="parution",nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date parution;
    @Column (name="disponibilite",nullable = false)
    private String disponibilite;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Utilisateur utilisateur;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "composition",
            joinColumns = { @JoinColumn(name = "topo_id") },
            inverseJoinColumns = { @JoinColumn(name = "spot_id") }
    )
    private Set<Spot> spots;

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

    public String getDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(String disponibilite) {
        this.disponibilite = disponibilite;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Set<Spot> getSpots() {
        return spots;
    }

    public void setSpots(Set<Spot> spots) {
        this.spots = spots;
    }
}
