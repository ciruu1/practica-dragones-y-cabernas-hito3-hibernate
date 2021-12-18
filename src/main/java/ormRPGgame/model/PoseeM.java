package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "poseeM")
public class PoseeM {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_m")
    private Mago id_m;

    @ManyToOne
    @JoinColumn(name = "nombre_hm")
    private HabilidadMago nombre_hm;

    public PoseeM(Mago id_m, HabilidadMago nombre_hm) {
        this.id_m = id_m;
        this.nombre_hm = nombre_hm;
    }

    public PoseeM() {

    }

    public Mago getId_m() {
        return id_m;
    }

    public HabilidadMago getNombre_hm() {
        return nombre_hm;
    }

    public void setId_m(Mago id_m) {
        this.id_m = id_m;
    }

    public void setNombre_hm(HabilidadMago nombre_hm) {
        this.nombre_hm = nombre_hm;
    }
}
