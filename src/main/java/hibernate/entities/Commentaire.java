package hibernate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="commentaire", schema = "public")
public class Commentaire implements Serializable {
    @Id @GeneratedValue( strategy=GenerationType.IDENTITY )
    @Column(name ="com_id",nullable = false)
    private Integer comId;
    @Column (name = "description",nullable = false,length = 1024)
    private String description;
    @Column (name = "date",nullable = false)
    private Date date;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Utilisateur utilisateur;
    @Column(name = "spot_id")
    private Integer spotId;

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
}

