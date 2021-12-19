package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "escuadron")
public class Escuadron {
    @Id
    @Column(name = "nombre_esc", nullable = false, unique = true)
    private String nombre_esc;

    @ManyToMany
    @JoinColumn(name = "nombre_dr")
    private Set<Dragon> nombre_dr;

    public Escuadron(String nombre_esc) {
        this.nombre_esc = nombre_esc;
        this.nombre_dr = new HashSet<>();
    }

    public Escuadron() {
        this.nombre_dr = new HashSet<>();
    }

    public String getNombre_esc() {
        return nombre_esc;
    }

    public void setNombre_esc(String nombre_esc) {
        this.nombre_esc = nombre_esc;
    }

    public Set<Dragon> getNombre_dr() {
        return nombre_dr;
    }

    public void addNombre_dr(Dragon dragon) {
        this.nombre_dr.add(dragon);
    }
}
