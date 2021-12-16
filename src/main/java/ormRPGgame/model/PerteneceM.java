package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "perteneceM")
public class PerteneceM {
    @Id
    @Column(name = "nombre_esc", nullable = false)
    private String nombre_esc;
    
    @Column(name = "id_m", nullable = false)
    private int id_m;

    public PerteneceM(String nombre_esc, int id_m) {
        this.nombre_esc = nombre_esc;
        this.id_m = id_m;
    }

    public String getNombre_esc() {
        return nombre_esc;
    }

    public int getId_m() {
        return id_m;
    }
}
