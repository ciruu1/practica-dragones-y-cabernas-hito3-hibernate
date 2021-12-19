package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "jugador")
public class Jugador {
    @Id
    @Column(name = "nombre_j", nullable = false)
    private String nombre_j;

    @OneToMany
    @JoinColumn(name = "nombre_p")
    private Set<Personaje> nombre_p;

    public Jugador(String nombre_j) {
        this.nombre_j = nombre_j;
        this.nombre_p = new HashSet<>();
    }

    public Jugador() {
        this.nombre_p = new HashSet<>();
    }

    public String getNombre_j() {
        return nombre_j;
    }

    public void setNombre_j(String nombre_j) {
        this.nombre_j = nombre_j;
    }

    public Set<Personaje> getNombre_p() {
        return nombre_p;
    }

    public void addNombre_p(Personaje nombre_p) {
        this.nombre_p.add(nombre_p);
    }
}
