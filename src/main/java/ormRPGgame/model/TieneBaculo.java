package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tiene_baculo")
public class TieneBaculo {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "id_m")
    private Mago id_m;

    @OneToMany
    @JoinColumn(name = "nombre_b")
    private Set<Baculo> nombre_b;

    public TieneBaculo(Mago id_m, Baculo nombre_b) {
        this.id_m = id_m;
        this.nombre_b = new HashSet<>();
        this.nombre_b.add(nombre_b);
    }

    public TieneBaculo() {
        this.nombre_b = new HashSet<>();
    }

    public Mago getId_m() {
        return id_m;
    }

    public Set<Baculo> getNombre_b() {
        return nombre_b;
    }

    public void setId_m(Mago id_m) {
        this.id_m = id_m;
    }

    public void setNombre_b(Baculo nombre_b) {
        this.nombre_b.add(nombre_b);
    }
}
