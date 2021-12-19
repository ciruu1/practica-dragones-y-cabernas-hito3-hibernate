package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tiene_hacha")
public class TieneHacha {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "id_t")
    private Tanque id_t;

    @OneToMany
    @JoinColumn(name = "nombre_h")
    private Set<Hacha> nombre_h;

    public TieneHacha(Tanque id_t, Hacha nombre_h) {
        this.id_t = id_t;
        this.nombre_h = new HashSet<>();
        this.nombre_h.add(nombre_h);
    }

    public TieneHacha() {
        this.nombre_h = new HashSet<>();
    }

    public Tanque getId_t() {
        return id_t;
    }

    public Set<Hacha> getNombre_h() {
        return nombre_h;
    }

    public void setId_t(Tanque id_t) {
        this.id_t = id_t;
    }

    public void setNombre_h(Hacha nombre_h) {
        this.nombre_h.add(nombre_h);
    }
}
