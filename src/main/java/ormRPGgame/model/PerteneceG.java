package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pertenece_g")
public class PerteneceG {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "nombre_esc")
    private Escuadron nombre_esc;

    @ManyToMany
    @JoinColumn(name = "id_g")
    private Set<Guerrero> id_g;

    public PerteneceG(Escuadron nombre_esc, Guerrero id_g) {
        this.nombre_esc = nombre_esc;
        this.id_g = new HashSet<>();
        this.id_g.add(id_g);
    }

    public PerteneceG() {
        this.id_g = new HashSet<>();
    }

    public Escuadron getNombre_esc() {
        return nombre_esc;
    }

    public Set<Guerrero> getId_g() {
        return id_g;
    }

    public void setNombre_esc(Escuadron nombre_esc) {
        this.nombre_esc = nombre_esc;
    }

    public void setId_g(Guerrero id_g) {
        this.id_g.add(id_g);
    }
}
