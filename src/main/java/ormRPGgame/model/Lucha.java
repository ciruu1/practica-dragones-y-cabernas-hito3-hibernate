package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "lucha")
public class Lucha {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @OneToMany
    @JoinColumn(name = "nombre_dr")
    private Set<Dragon> nombre_dr;

    @OneToMany
    @JoinColumn(name = "nombre_esc")
    private Set<Escuadron> nombre_esc;

    public Lucha(Dragon nombre_dr, Escuadron nombre_esc) {
        this.nombre_dr = new HashSet<>();
        this.nombre_dr.add(nombre_dr);
        this.nombre_esc = new HashSet<>();
        this.nombre_esc.add(nombre_esc);
    }

    public Lucha() {
        this.nombre_dr = new HashSet<>();
        this.nombre_esc = new HashSet<>();
    }

    public Set<Dragon> getNombre_dr() {
        return nombre_dr;
    }

    public Set<Escuadron> getNombre_esc() {
        return nombre_esc;
    }

    public void addNombre_dr(Dragon nombre_dr) {
        this.nombre_dr.add(nombre_dr);
    }

    public void addNombre_esc(Escuadron nombre_esc) {
        this.nombre_esc.add(nombre_esc);
    }
}
