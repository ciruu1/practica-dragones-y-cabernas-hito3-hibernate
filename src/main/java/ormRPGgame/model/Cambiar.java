package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "cambiar")
public class Cambiar {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre_t", nullable = false)
    private String nombre_t;
    @Column(name = "nombre_p", nullable = false)
    private String nombre_p;
    @Column(name = "nombre_d", nullable = false)
    private String nombre_d;

    public Cambiar(String nombre_t, String nombre_p, String nombre_d) {
        this.nombre_t = nombre_t;
        this.nombre_p = nombre_p;
        this.nombre_d = nombre_d;
    }

    public String getNombre_t() {
        return nombre_t;
    }

    public String getNombre_p() {
        return nombre_p;
    }

    public String getNombre_d() {
        return nombre_d;
    }
}
