package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "tienda")
public class Tienda {
    @Id
    @Column(name = "nombre_t", nullable = false)
    private String nombre_t;

    @ManyToOne
    @JoinColumn(name = "nombre_c")
    private Ciudad nombre_c;

    public Tienda(String nombre_t, Ciudad nombre_c) {
        this.nombre_t = nombre_t;
        this.nombre_c = nombre_c;
    }

    public Tienda() {

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
}
