package ormRPGgame.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "mejora_espada")
public class MejoraEspada {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @OneToMany
    @JoinColumn(name = "nombre_f")
    private Set<Forja> nombre_f;

    @OneToMany
    @JoinColumn(name = "nombre_e")
    private Set<Espada> nombre_e;

    @OneToMany
    @JoinColumn(name = "nombre_p")
    private Set<Personaje> nombre_p;

    public MejoraEspada(Forja nombre_f, Espada nombre_e, Personaje nombre_p) {
        this.nombre_f = new HashSet<>();
        this.nombre_e = new HashSet<>();
        this.nombre_p = new HashSet<>();
        this.nombre_f.add(nombre_f);
        this.nombre_e.add(nombre_e);
        this.nombre_p.add(nombre_p);
    }

    public MejoraEspada() {
        this.nombre_f = new HashSet<>();
        this.nombre_e = new HashSet<>();
        this.nombre_p = new HashSet<>();
    }

    public Set<Forja> getNombre_f() {
        return nombre_f;
    }

    public Set<Espada> getNombre_b() {
        return nombre_e;
    }

    public Set<Personaje> getNombre_p() {
        return nombre_p;
    }

    public void setNombre_f(Forja nombre_f) {
        this.nombre_f.add(nombre_f);
    }

    public void setNombre_b(Espada nombre_e) {
        this.nombre_e.add(nombre_e);
    }

    public void setNombre_p(Personaje nombre_p) {
        this.nombre_p.add(nombre_p);
    }
}
