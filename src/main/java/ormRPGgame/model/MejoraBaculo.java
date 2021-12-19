package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "mejora_baculo")
public class MejoraBaculo {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @OneToMany
    @JoinColumn(name = "nombre_f")
    private Set<Forja> nombre_f;

    @OneToMany
    @JoinColumn(name = "nombre_b")
    private Set<Baculo> nombre_b;

    @OneToMany
    @JoinColumn(name = "nombre_p")
    private Set<Personaje> nombre_p;

    public MejoraBaculo(Forja nombre_f, Baculo nombre_b, Personaje nombre_p) {
        this.nombre_f = new HashSet<>();
        this.nombre_b = new HashSet<>();
        this.nombre_p = new HashSet<>();
        this.nombre_f.add(nombre_f);
        this.nombre_b.add(nombre_b);
        this.nombre_p.add(nombre_p);
    }

    public MejoraBaculo() {
        this.nombre_f = new HashSet<>();
        this.nombre_b = new HashSet<>();
        this.nombre_p = new HashSet<>();
    }

    public Set<Forja> getNombre_f() {
        return nombre_f;
    }

    public Set<Baculo> getNombre_b() {
        return nombre_b;
    }

    public Set<Personaje> getNombre_p() {
        return nombre_p;
    }

    public void setNombre_f(Forja nombre_f) {
        this.nombre_f.add(nombre_f);
    }

    public void setNombre_b(Baculo nombre_b) {
        this.nombre_b.add(nombre_b);
    }

    public void setNombre_p(Personaje nombre_p) {
        this.nombre_p.add(nombre_p);
    }
}
