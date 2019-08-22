package hibernate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="commentaire")
public class Commentaire implements Serializable {
    @Id @GeneratedValue( strategy=GenerationType.IDENTITY )
    @Column(name ="com_id",nullable = false)
    private Integer comId;
    @Column (name = "commentaire",nullable = false,length = 1024)
    private String commentaire;
    @Column (name = "date",nullable = false)
    private Date date;
    @Column (name = "user_id",nullable = false)

    @JoinColumn(name = "user_id",referencedColumnName = "user_id")
    @ManyToOne
    private Utilisateur userId;

    @Column(name="spot_id",nullable = false)
    @JoinColumn(name = "spot_id",referencedColumnName = "spot_id")
    @ManyToOne
    private Spot spotId;


    public Spot getSpotId() {
        return spotId;
    }

    public void setSpotId(Spot spotId) {
        this.spotId = spotId;
    }

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Utilisateur getUserId() {
        return userId;
    }

    public void setUserId(Utilisateur userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Commentaire that = (Commentaire) o;

        if (!comId.equals(that.comId)) return false;
        if (!commentaire.equals(that.commentaire)) return false;
        if (!date.equals(that.date)) return false;
        if (!userId.equals(that.userId)) return false;
        return spotId.equals(that.spotId);

    }

    @Override
    public int hashCode() {
        int result = comId.hashCode();
        result = 31 * result + commentaire.hashCode();
        result = 31 * result + date.hashCode();
        result = 31 * result + userId.hashCode();
        result = 31 * result + spotId.hashCode();
        return result;
    }
}

