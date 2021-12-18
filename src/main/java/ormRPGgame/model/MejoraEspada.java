package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "mejora_espada")
public class MejoraEspada {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "nombre_f")
    private Forja nombre_f;

    @ManyToOne
    @JoinColumn(name = "nombre_e")
    private Espada nombre_e;

    @ManyToOne
    @JoinColumn(name = "nombre_p")
    private Personaje nombre_p;

    public MejoraEspada(Forja nombre_f, Espada nombre_e, Personaje nombre_p) {
        this.nombre_f = nombre_f;
        this.nombre_e = nombre_e;
        this.nombre_p = nombre_p;
    }

    public MejoraEspada() {

    }

    public Forja getNombre_f() {
        return nombre_f;
    }

    public Espada getNombre_e() {
        return nombre_e;
    }

    public Personaje getNombre_p() {
        return nombre_p;
    }

    public void setNombre_f(Forja nombre_f) {
        this.nombre_f = nombre_f;
    }

    public void setNombre_e(Espada nombre_e) {
        this.nombre_e = nombre_e;
    }

    public void setNombre_p(Personaje nombre_p) {
        this.nombre_p = nombre_p;
    }
}
