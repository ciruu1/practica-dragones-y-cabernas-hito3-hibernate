package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pertenece_m")
public class PerteneceM {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "nombre_esc")
    private Escuadron nombre_esc;

    @ManyToMany
    @JoinColumn(name = "id_m")
    private Set<Mago> id_m;

    public PerteneceM(Escuadron nombre_esc, Mago id_m) {
        this.nombre_esc = nombre_esc;
        this.id_m = new HashSet<>();
        this.id_m.add(id_m);
    }

    public PerteneceM() {
        this.id_m = new HashSet<>();
    }

    public Escuadron getNombre_esc() {
        return nombre_esc;
    }

    public Set<Mago> getId_m() {
        return id_m;
    }

    public void setNombre_esc(Escuadron nombre_esc) {
        this.nombre_esc = nombre_esc;
    }

    public void addId_m(Mago id_m) {
        this.id_m.add(id_m);
    }
}
