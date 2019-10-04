package hibernate.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "composition",schema = "public")
public class Composition  implements Serializable {
    @EmbeddedId
    private CompositionPK id;

    @JoinColumn(name = "spot_id", insertable = false, updatable = false)
    @ManyToOne
    private Spot spotId;

    @JoinColumn(name = "topo_id", insertable = false, updatable = false)
    @ManyToOne
    private Topo topoId;

    public CompositionPK getId() {
        return id;
    }

    public void setId(CompositionPK id) {
        this.id = id;
    }

    public Spot getSpotId() {
        return spotId;
    }

    public void setSpotId(Spot spotId) {
        this.spotId = spotId;
    }

    public Topo getTopoId() {
        return topoId;
    }

    public void setTopoId(Topo topoId) {
        this.topoId = topoId;
    }
}
