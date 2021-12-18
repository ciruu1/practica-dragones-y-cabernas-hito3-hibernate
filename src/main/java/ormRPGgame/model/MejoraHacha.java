package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "mejoraHacha")
public class MejoraHacha {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "nombre_f")
    private Forja nombre_f;

    @ManyToOne
    @JoinColumn(name = "nombre_h")
    private Hacha nombre_h;

    @ManyToOne
    @JoinColumn(name = "nombre_p")
    private Personaje nombre_p;

    public MejoraHacha(Forja nombre_f, Hacha nombre_h, Personaje nombre_p) {
        this.nombre_f = nombre_f;
        this.nombre_h = nombre_h;
        this.nombre_p = nombre_p;
    }

    public MejoraHacha() {

    }

    public Forja getNombre_f() {
        return nombre_f;
    }

    public Hacha getNombre_h() {
        return nombre_h;
    }

    public Personaje getNombre_p() {
        return nombre_p;
    }

    public void setNombre_f(Forja nombre_f) {
        this.nombre_f = nombre_f;
    }

    public void setNombre_h(Hacha nombre_h) {
        this.nombre_h = nombre_h;
    }

    public void setNombre_p(Personaje nombre_p) {
        this.nombre_p = nombre_p;
    }
}
