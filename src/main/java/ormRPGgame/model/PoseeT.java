package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "poseeT")
public class PoseeT {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_t")
    private Tanque id_t;

    @ManyToOne
    @JoinColumn(name = "nombre_ht")
    private HabilidadTanque nombre_ht;

    public PoseeT(Tanque id_t, HabilidadTanque nombre_ht) {
        this.id_t = id_t;
        this.nombre_ht = nombre_ht;
    }

    public PoseeT() {

    }

    public Tanque getId_t() {
        return id_t;
    }

    public HabilidadTanque getNombre_ht() {
        return nombre_ht;
    }

    public void setId_t(Tanque id_t) {
        this.id_t = id_t;
    }

    public void setNombre_ht(HabilidadTanque nombre_ht) {
        this.nombre_ht = nombre_ht;
    }
}
