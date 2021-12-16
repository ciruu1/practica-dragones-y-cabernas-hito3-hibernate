package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "tienda")
public class Tienda {
    @Id
    @Column(name = "nombre_t", nullable = false)
    private String nombre_t;
    
    @Column(name = "nombre_c", nullable = false)
    private String nombre_c;

    public Tienda(String nombre_t, String nombre_c) {
        this.nombre_t = nombre_t;
        this.nombre_c = nombre_c;
    }

    public String getNombre_t() {
        return nombre_t;
    }

    public String getNombre_c() {
        return nombre_c;
    }
}
