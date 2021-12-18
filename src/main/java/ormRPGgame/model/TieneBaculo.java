package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "tiene_baculo")
public class TieneBaculo {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_m")
    private Mago id_m;

    @ManyToOne
    @JoinColumn(name = "nombre_b")
    private Baculo nombre_b;

    public TieneBaculo(Mago id_m, Baculo nombre_b) {
        this.id_m = id_m;
        this.nombre_b = nombre_b;
    }

    public TieneBaculo() {

    }

    public Mago getId_m() {
        return id_m;
    }

    public Baculo getNombre_b() {
        return nombre_b;
    }

    public void setId_m(Mago id_m) {
        this.id_m = id_m;
    }

    public void setNombre_b(Baculo nombre_b) {
        this.nombre_b = nombre_b;
    }
}
