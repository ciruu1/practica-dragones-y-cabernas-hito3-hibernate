package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "desbloquea_dr")
public class DesbloqueaDr {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "nombre_dr")
    private Dragon nombre_dr;

    public DesbloqueaDr(Dragon nombre_dr) {
        this.nombre_dr = nombre_dr;
    }

    public DesbloqueaDr() {

    }

    public Dragon getNombre_dr() {
        return nombre_dr;
    }

    public void setNombre_dr(Dragon nombre_dr) {
        this.nombre_dr = nombre_dr;
    }
}
