package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "lucha")
public class Lucha {
    @Id
    @Column(name = "nombre_dr", nullable = false)
    private String nombre_dr;
    
    @Column(name = "nombre_esc", nullable = false)
    private String nombre_esc;

    public Lucha(String nombre_dr, String nombre_esc) {
        this.nombre_dr = nombre_dr;
        this.nombre_esc = nombre_esc;
    }

    public String getNombre_dr() {
        return nombre_dr;
    }

    public String getNombre_esc() {
        return nombre_esc;
    }
}
