package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "perteneceG")
public class PerteneceG {
    @Id
    @Column(name = "nombre_esc", nullable = false)
    private String nombre_esc;
    
    @Column(name = "id_g", nullable = false)
    private int id_g;

    public PerteneceG(String nombre_esc, int id_g) {
        this.nombre_esc = nombre_esc;
        this.id_g = id_g;
    }

    public String getNombre_esc() {
        return nombre_esc;
    }

    public int getId_g() {
        return id_g;
    }
}
