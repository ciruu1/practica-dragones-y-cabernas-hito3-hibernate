package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ciudad")
public class Ciudad {
    @Id
    @Column(name = "nombre_c", nullable = false, unique = true)
    private String nombre_c;

    @ManyToMany
    @JoinColumn(name = "nombre_f")
    private Set<Forja> nombre_f;

    @ManyToMany
    @JoinColumn(name = "nombre_t")
    private Set<Tienda> nombre_t;

    public Ciudad(String nombre_c) {
        this.nombre_c = nombre_c;
        this.nombre_f = new HashSet<>();
        this.nombre_t = new HashSet<>();
    }

    public Ciudad() {
        this.nombre_f = new HashSet<>();
        this.nombre_t = new HashSet<>();
    }

    public String getNombre_c() {
        return nombre_c;
    }

    public void setNombre_c(String nombre_c) {
        this.nombre_c = nombre_c;
    }

    public Set<Forja> getNombre_f() {
        return nombre_f;
    }

    public Set<Tienda> getNombre_t() {
        return nombre_t;
    }

    public void addNombre_f(Forja nombre_f) {
        this.nombre_f.add(nombre_f);
    }

    public void addNombre_t(Tienda nombre_t) {
        this.nombre_t.add(nombre_t);
    }
}
