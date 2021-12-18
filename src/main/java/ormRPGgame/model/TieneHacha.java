package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "tiene_hacha")
public class TieneHacha {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_t")
    private Tanque id_t;

    @ManyToOne
    @JoinColumn(name = "nombre_h")
    private Hacha nombre_h;

    public TieneHacha(Tanque id_t, Hacha nombre_h) {
        this.id_t = id_t;
        this.nombre_h = nombre_h;
    }

    public TieneHacha() {

    }

    public Tanque getId_t() {
        return id_t;
    }

    public Hacha getNombre_h() {
        return nombre_h;
    }

    public void setId_t(Tanque id_t) {
        this.id_t = id_t;
    }

    public void setNombre_h(Hacha nombre_h) {
        this.nombre_h = nombre_h;
    }
}
