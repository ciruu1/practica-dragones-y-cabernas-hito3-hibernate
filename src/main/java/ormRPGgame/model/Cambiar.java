package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "cambiar")
public class Cambiar {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    //@Column(name = "nombre_t", nullable = false)
    @OneToMany
    @JoinColumn(name = "nombre_t")
    private Set<Tienda> nombre_t;
    //@Column(name = "nombre_p", nullable = false)
    @OneToMany
    @JoinColumn(name = "nombre_p")
    private Set<Personaje> nombre_p;
    //@Column(name = "nombre_d", nullable = false)
    @OneToMany
    @JoinColumn(name = "nombre_d")
    private Set<Daga> nombre_d;

    public Cambiar(Tienda nombre_t, Personaje nombre_p, Daga nombre_d) {
        this.nombre_t = new HashSet<>();
        this.nombre_t.add(nombre_t);
        this.nombre_p = new HashSet<>();
        this.nombre_p.add(nombre_p);
        this.nombre_d = new HashSet<>();
        this.nombre_d.add(nombre_d);
    }

    public Cambiar() {
        this.nombre_t = new HashSet<>();
        this.nombre_p = new HashSet<>();
        this.nombre_d = new HashSet<>();
    }

    public Set<Tienda> getNombre_t() {
        return nombre_t;
    }

    public Set<Personaje> getNombre_p() {
        return nombre_p;
    }

    public Set<Daga> getNombre_d() {
        return nombre_d;
    }

    public void addNombre_t(Tienda nombre_t) {
        this.nombre_t.add(nombre_t);
    }

    public void addNombre_p(Personaje nombre_p) {
        this.nombre_p.add(nombre_p);
    }

    public void addNombre_d(Daga nombre_d) {
        this.nombre_d.add(nombre_d);
    }
}
