package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "forja")
public class Forja {
    @Id
    @Column(name = "nombre_f", nullable = false)
    private String nombre_f;
    
    @Column(name = "dueño", nullable = false)
    private String owner; // Dueño

    @ManyToOne
    @JoinColumn(name = "nombre_c")
    private Ciudad nombre_c;

    @OneToMany
    @JoinColumn(name = "nombre_e")
    private Set<Espada> nombre_e;

    @OneToMany
    @JoinColumn(name = "nombre_b")
    private Set<Baculo> nombre_b;

    @OneToMany
    @JoinColumn(name = "nombre_h")
    private Set<Hacha> nombre_h;

    public Forja(String nombre_f, String owner, Ciudad nombre_c) {
        this.nombre_f = nombre_f;
        this.owner = owner;
        this.nombre_c = nombre_c;
        this.nombre_e = new HashSet<>();
        this.nombre_b = new HashSet<>();
        this.nombre_h = new HashSet<>();
    }

    public Forja() {
        this.nombre_e = new HashSet<>();
        this.nombre_b = new HashSet<>();
        this.nombre_h = new HashSet<>();
    }

    public String getNombre_f() {
        return nombre_f;
    }

    public String getOwner() {
        return owner;
    }

    public Ciudad getNombre_c() {
        return nombre_c;
    }

    public void setNombre_f(String nombre_f) {
        this.nombre_f = nombre_f;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setNombre_c(Ciudad nombre_c) {
        this.nombre_c = nombre_c;
    }

    public Set<Espada> getNombre_e() {
        return nombre_e;
    }

    public Set<Baculo> getNombre_b() {
        return nombre_b;
    }

    public Set<Hacha> getNombre_h() {
        return nombre_h;
    }

    public void addNombre_e(Espada nombre_e) {
        this.nombre_e.add(nombre_e);
    }

    public void addNombre_b(Baculo nombre_b) {
        this.nombre_b.add(nombre_b);
    }

    public void addNombre_h(Hacha nombre_h) {
        this.nombre_h.add(nombre_h);
    }
}
