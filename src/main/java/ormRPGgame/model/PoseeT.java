package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "posee_t")
public class PoseeT {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_t")
    private Tanque id_t;

    @OneToMany
    @JoinColumn(name = "nombre_ht")
    private Set<HabilidadTanque> nombre_ht;

    @OneToOne
    @JoinColumn(name = "nombre_ht")
    private Ciudad nombre_c;

    public PoseeT(Tanque id_t, HabilidadTanque nombre_ht) {
        this.id_t = id_t;
        this.nombre_ht = new HashSet<>();
        this.nombre_ht.add(nombre_ht);
    }

    public PoseeT() {
        this.nombre_ht = new HashSet<>();
    }

    public Tanque getId_t() {
        return id_t;
    }

    public Set<HabilidadTanque> getNombre_ht() {
        return nombre_ht;
    }

    public void setId_t(Tanque id_t) {
        this.id_t = id_t;
    }

    public void setNombre_ht(HabilidadTanque nombre_ht) {
        this.nombre_ht.add(nombre_ht);
    }

    public Ciudad getNombre_c() {
        return nombre_c;
    }

    public void setNombre_c(Ciudad nombre_c) {
        this.nombre_c = nombre_c;
    }
}
