package hibernate.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "compositon")
public class Composition implements Serializable{
    @Column(name = "spot_id",nullable = false)
    private Integer spotId;
    @Column(name = "topo_id",nullable = false)
    private Integer topoId;

    public Integer getSpotId() {
        return spotId;
    }

    public void setSpotId(Integer spotId) {
        this.spotId = spotId;
    }

    public Integer getTopoId() {
        return topoId;
    }

    public void setTopoId(Integer topoId) {
        this.topoId = topoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Composition that = (Composition) o;

        if (!spotId.equals(that.spotId)) return false;
        if (!topoId.equals(that.topoId)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = spotId.hashCode();
        result = 31 * result + topoId.hashCode();
        return result;
    }
}
