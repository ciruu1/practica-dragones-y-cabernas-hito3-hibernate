package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tienda")
public class Tienda {
    @Id
    @Column(name = "nombre_t", nullable = false)
    private String nombre_t;

    @ManyToOne
    @JoinColumn(name = "nombre_c")
    private Ciudad nombre_c;

    @OneToMany
    @JoinColumn(name = "nombre_d")
    private Set<Daga> nombre_d;

    public Tienda(String nombre_t, Ciudad nombre_c) {
        this.nombre_t = nombre_t;
        this.nombre_c = nombre_c;
        this.nombre_d = new HashSet<>();
    }

    public Tienda() {
        this.nombre_d = new HashSet<>();
    }

    public String getNombre_t() {
        return nombre_t;
    }

    public Ciudad getNombre_c() {
        return nombre_c;
    }

    public void setNombre_t(String nombre_t) {
        this.nombre_t = nombre_t;
    }

    public void setNombre_c(Ciudad nombre_c) {
        this.nombre_c = nombre_c;
    }

    public Set<Daga> getNombre_d() {
        return nombre_d;
    }

    public void addNombre_d(Daga nombre_d) {
        this.nombre_d.add(nombre_d);
    }
}
