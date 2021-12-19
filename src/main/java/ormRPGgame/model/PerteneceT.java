package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pertenece_t")
public class PerteneceT {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "nombre_esc")
    private Escuadron nombre_esc;

    @ManyToMany
    @JoinColumn(name = "id_t")
    private Set<Tanque> id_t;

    public PerteneceT(Escuadron nombre_esc, Tanque id_t) {
        this.nombre_esc = nombre_esc;
        this.id_t = new HashSet<>();
        this.id_t.add(id_t);
    }

    public PerteneceT() {
        this.id_t = new HashSet<>();
    }

    public Escuadron getNombre_esc() {
        return nombre_esc;
    }

    public Set<Tanque> getId_t() {
        return id_t;
    }

    public void setNombre_esc(Escuadron nombre_esc) {
        this.nombre_esc = nombre_esc;
    }

    public void addId_t(Tanque id_t) {
        this.id_t.add(id_t);
    }
}
