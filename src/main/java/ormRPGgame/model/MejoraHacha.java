package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "mejora_hacha")
public class MejoraHacha {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @OneToMany
    @JoinColumn(name = "nombre_f")
    private Set<Forja> nombre_f;

    @OneToMany
    @JoinColumn(name = "nombre_h")
    private Set<Hacha> nombre_h;

    @OneToMany
    @JoinColumn(name = "nombre_p")
    private Set<Personaje> nombre_p;

    public MejoraHacha(Forja nombre_f, Hacha nombre_h, Personaje nombre_p) {
        this.nombre_f = new HashSet<>();
        this.nombre_h = new HashSet<>();
        this.nombre_p = new HashSet<>();
        this.nombre_f.add(nombre_f);
        this.nombre_h.add(nombre_h);
        this.nombre_p.add(nombre_p);
    }

    public MejoraHacha() {
        this.nombre_f = new HashSet<>();
        this.nombre_h = new HashSet<>();
        this.nombre_p = new HashSet<>();
    }

    public Set<Forja> getNombre_f() {
        return nombre_f;
    }

    public Set<Hacha> getNombre_b() {
        return nombre_h;
    }

    public Set<Personaje> getNombre_p() {
        return nombre_p;
    }

    public void setNombre_f(Forja nombre_f) {
        this.nombre_f.add(nombre_f);
    }

    public void setNombre_b(Hacha nombre_h) {
        this.nombre_h.add(nombre_h);
    }

    public void setNombre_p(Personaje nombre_p) {
        this.nombre_p.add(nombre_p);
    }
}
