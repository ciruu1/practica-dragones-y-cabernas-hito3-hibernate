package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "cambiar")
public class Cambiar {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    //@Column(name = "nombre_t", nullable = false)
    @ManyToOne
    @JoinColumn(name = "nombre_t")
    private Tienda nombre_t;
    //@Column(name = "nombre_p", nullable = false)
    @ManyToOne
    @JoinColumn(name = "nombre_p")
    private Personaje nombre_p;
    //@Column(name = "nombre_d", nullable = false)
    @ManyToOne
    @JoinColumn(name = "nombre_d")
    private Daga nombre_d;

    public Cambiar(Tienda nombre_t, Personaje nombre_p, Daga nombre_d) {
        this.nombre_t = nombre_t;
        this.nombre_p = nombre_p;
        this.nombre_d = nombre_d;
    }

    public Cambiar() {

    }

    public Tienda getNombre_t() {
        return nombre_t;
    }

    public Personaje getNombre_p() {
        return nombre_p;
    }

    public Daga getNombre_d() {
        return nombre_d;
    }

    public void setNombre_t(Tienda nombre_t) {
        this.nombre_t = nombre_t;
    }

    public void setNombre_p(Personaje nombre_p) {
        this.nombre_p = nombre_p;
    }

    public void setNombre_d(Daga nombre_d) {
        this.nombre_d = nombre_d;
    }
}
