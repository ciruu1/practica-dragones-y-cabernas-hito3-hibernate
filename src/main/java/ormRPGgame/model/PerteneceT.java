package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "perteneceT")
public class PerteneceT {
    @Id
    @Column(name = "nombre_esc", nullable = false)
    private String nombre_esc;
    
    @Column(name = "id_t", nullable = false)
    private int id_t;

    public PerteneceT(String nombre_esc, int id_t) {
        this.nombre_esc = nombre_esc;
        this.id_t = id_t;
    }

    public String getNombre_esc() {
        return nombre_esc;
    }

    public int getId_t() {
        return id_t;
    }
}
