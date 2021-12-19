package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "posee_m")
public class PoseeM {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_m")
    private Mago id_m;

    @OneToMany
    @JoinColumn(name = "nombre_hm")
    private Set<HabilidadMago> nombre_hm;

    public PoseeM(Mago id_m, HabilidadMago nombre_hm) {
        this.id_m = id_m;
        this.nombre_hm = new HashSet<>();
        this.nombre_hm.add(nombre_hm);
    }

    public PoseeM() {
        this.nombre_hm = new HashSet<>();
    }

    public Mago getId_m() {
        return id_m;
    }

    public Set<HabilidadMago> getNombre_hm() {
        return nombre_hm;
    }

    public void setId_m(Mago id_m) {
        this.id_m = id_m;
    }

    public void setNombre_hm(HabilidadMago nombre_hm) {
        this.nombre_hm.add(nombre_hm);
    }
}
