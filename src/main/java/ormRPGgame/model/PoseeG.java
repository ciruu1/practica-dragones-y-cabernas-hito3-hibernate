package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "posee_g")
public class PoseeG {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_g")
    private Guerrero id_g;

    @ManyToOne
    @JoinColumn(name = "nombre_hg")
    private HabilidadGuerrero nombre_hg;

    public PoseeG(Guerrero id_g, HabilidadGuerrero nombre_hg) {
        this.id_g = id_g;
        this.nombre_hg = nombre_hg;
    }

    public PoseeG() {

    }

    public Guerrero getId_g() {
        return id_g;
    }

    public HabilidadGuerrero getNombre_hg() {
        return nombre_hg;
    }

    public void setId_g(Guerrero id_g) {
        this.id_g = id_g;
    }

    public void setNombre_hg(HabilidadGuerrero nombre_hg) {
        this.nombre_hg = nombre_hg;
    }
}
