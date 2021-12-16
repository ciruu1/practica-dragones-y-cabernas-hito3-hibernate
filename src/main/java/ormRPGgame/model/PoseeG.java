package ormRPGgame.model;

import javax.persistence.*;

@Entity
@Table(name = "poseeG")
public class PoseeG {
    @Id
    @Column(name = "id_g", nullable = false)
    private int id_g;
    
    @Column(name = "nombre_hg", nullable = false)
    private String nombre_hg;

    public PoseeG(int id_g, String nombre_hg) {
        this.id_g = id_g;
        this.nombre_hg = nombre_hg;
    }

    public int getId_g() {
        return id_g;
    }

    public String getNombre_hg() {
        return nombre_hg;
    }
}
