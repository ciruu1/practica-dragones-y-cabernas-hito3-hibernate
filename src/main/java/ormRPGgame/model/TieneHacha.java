package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "tieneHacha")
public class TieneHacha {
    @Id
    @Column(name = "id_t", nullable = false)
    private int id_t;
    
    @Column(name = "nombre_h", nullable = false)
    private String nombre_h;

    public TieneHacha(int id_t, String nombre_h) {
        this.id_t = id_t;
        this.nombre_h = nombre_h;
    }

    public int getId_t() {
        return id_t;
    }

    public String getNombre_h() {
        return nombre_h;
    }
}
